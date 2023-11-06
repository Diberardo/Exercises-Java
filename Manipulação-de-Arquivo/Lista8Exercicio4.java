import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.StringJoiner;

public class Lista8Exercicio4 
{

    static List<String> criarLista (String arq) { //Função para leitura do arquivo e armazenamento dos dados em estrutura de lista
        List<String> list = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(arq));
            String linha;
            while ((linha = br.readLine()) != null) 
            {
                list.add(linha);
            }
            br.close();
        } 
        catch (IOException e) 
        {
            System.err.println("Erro ao manipular o arquivo: " + e.getMessage());
        }
        return list;
    }

    static void inserirContato(String arq)
    {
        Scanner entrada = new Scanner (System.in);
        String nome = "", telefone = "";
        
        boolean valid = false;
        while (valid == false) {
            System.out.println("\nDigite o nome da pessoa: ");
            String n = entrada.nextLine();
            nome = n.toUpperCase();
            if (nome.length() <= 30) 
            {
                valid = true;
            }
            else
            {
                System.out.println("\nFormato inválido! O nome deve ter no máximo 30 caracteres.\n");
            }
        }
        
        valid = false;
        while (valid == false) 
        {
            System.out.println("\nDigite o número de telefone, com o ddd, no formato xx-xxxxx-xxxx(celular) ou no formato xx-xxxx-xxxx(fixo): \n");
            String t = entrada.nextLine();
            try 
            {
                telefone = t.replaceAll("\\D", ""); //REMOVE CARACTERES NÃO NUMÉRICOS
                if (telefone.length() <= 11 && telefone.length() >= 10) 
                {
                    valid = true;
                }
            } 
            catch (NumberFormatException e)
            {
                System.out.println("\nFormato inválido!\n");
            }
        }
                        
        StringJoiner sj = new StringJoiner(", ");
        sj.add(nome);
        sj.add(telefone);
        String novaLinha = sj.toString();
                
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arq, true))) 
        {
            bw.write(novaLinha);
            bw.newLine();
            System.out.println("\nLinha adicionada com sucesso.");
        } 
        catch (IOException e) 
        {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
        ordenarContatos(arq);
    }

    static void deletarContato(String arq)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa que deseja deletar da lista: ");
        String nomeBusca = entrada.nextLine();
        List<String> lista = criarLista(arq);

        try
        {
            boolean valid = false;
            for (int i = 0; i < lista.size(); i++) 
            {
                String[] partes = lista.get(i).split(", ");
                String nome = partes[0];

                if (nome.equalsIgnoreCase(nomeBusca)) 
                {
                    lista.remove(i);
                    valid = true;
                    break; // Não é necessário continuar procurando
                }
            }
            if (valid == true) 
            {
                // Escreve as linhas atualizadas (após a remoção) no arquivo
                BufferedWriter bw = new BufferedWriter(new FileWriter(arq));
                for (String linhaAtualizada : lista) 
                {
                    bw.write(linhaAtualizada);
                    bw.newLine();
                }
                bw.close();

                System.out.println("\nContato apagado com sucesso.\n");
            }
             else
            {
                System.out.println("\nO contato não foi encontrado na lista telefônica.\n");
            }
        } 
        catch (IOException e) 
        {
            System.err.println("Erro ao manipular o arquivo: " + e.getMessage());
        }
    }

    static void buscarContato(String arq)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nDigite o a primeira letra do nome dos contatos que deseja consultar: \n");
        char letraBusca = Character.toUpperCase(entrada.next().charAt(0));
        List<String> lista = criarLista(arq);
        List<String> listaConsultada = new ArrayList<>();;

        boolean valid = false;
        try{
        for (int i = 0; i < lista.size(); i++) 
        {
            String[] partes = lista.get(i).split(", ");
            char letra = partes[0].charAt(0);

            if (letra == letraBusca) 
            {
                String lineToCopy = lista.get(i);
                listaConsultada.add(lineToCopy);
                valid = true;
            }
        }
        }catch (InputMismatchException e)
        {
            System.out.println("Nome não encontrado na lista.");
        }
        if (valid == true)
        {
            relatorio(listaConsultada); //* Chama função para gerar relatório? usando como argumento a listaConsultada
        } 
        else 
        {
            System.out.println("\nNome não encontrado na lista.\n");    
        }
    }


    static void relatorio(List<String> list){
        System.out.println("\n               Nome             |    Telefone  ");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            String[] partes = list.get(i).split(", ");
            String nome = partes[0];
            String telefone = partes[1];
            System.out.printf("%-30s  |  %-11s\n", nome, telefone);
        }
        System.out.println("\n");
    }

    public static String [][] criarMatriz(String arq) 
    {
        
        List<String> lista = new ArrayList<String>();
        
        // Lê o arquivo e armazena as linhas em uma lista
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(arq));
            String linha;
            while ((linha = br.readLine()) != null) 
            {
                lista.add(linha);
            }
            br.close();
        } 
        catch (IOException e) 
        {
            System.err.println("Erro ao manipular o arquivo: " + e.getMessage());
        }
        
        // Convertendo a lista bidimensional em uma matriz bidimensional
        String[][] matriz = new String[lista.size()][];
        for (int i = 0; i < lista.size(); i++) 
        {
            String linha = lista.get(i);
            String[] vetor = linha.split(", ");
            matriz[i] = vetor;
        }
        return matriz;
    }

    public static void ordenarContatos(String arquivo) 
    {
        
        String y [][] = criarMatriz(arquivo);
                        
        //Ordenar matriz pelo primeiro elemento de cada linha (método Insertion Sort)
        int i, j;
        String key [];
        for (j=1; j<y.length; j++)
        {
            key = y[j];
            for (i=(j-1); i>=0 && (y[i][0].compareTo(key[0]) > 0) ; i--)
            {
                y[i+1] = y[i];
            }
            y[i+1] = key;
        }
        try 
        {

            // Cria um arquivo temporário
            File arqTemp = new File("temp.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(arqTemp, true));
            
            // Transforma as linhas da matriz y em uma String usando ", " como separador
            for (i = 0; i < y.length; i++) 
            {
                String str = String.join(", ", y[i]);
                bw.write(str);
                bw.newLine();
            }
            bw.close();
        
            // Remove o arquivo original
            File arq = new File(arquivo);
            arq.delete();

            // Renomeia o arquivo temporário para o nome original
            arqTemp.renameTo(arq);

            //Remove o arquivo temporário
            arqTemp.delete();

        } 
        catch (IOException e) 
        {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    
    public static void main(String[] args)
    {
        
        String nomeArquivo = "telefones.txt";
        Scanner entrada = new Scanner(System.in); 
        
        
        boolean valid = false;
        while (valid == false)
        {
            System.out.println("\nQual opção desejada? \n1- Inserir contato\n2- Deletar contato\n3- Buscar contatos pela primeira letra\n4- Listar todos contatos\n5- Sair\n");
            int opcao = entrada.nextInt();
            if (opcao == 1)
            {
                inserirContato(nomeArquivo);
            }
            else if (opcao == 2)
            {
                deletarContato(nomeArquivo);
            }
            else if (opcao == 3)
            {
                buscarContato(nomeArquivo);
            }
            else if (opcao == 4)
            {
                List <String> lista = criarLista(nomeArquivo);
                relatorio(lista);
            }
            else if (opcao == 5)
            { 
                //Opçãp para sair
                valid = true;
            }
            else
            {
                System.out.println("\nOpção inválida!\n");
            }
        }
    }
}