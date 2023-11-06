import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Lista8Exercicio3 
{

    static List<String> criarLista (String arq) 
    { 
        //Função para leitura do arquivo e armazenamento dos dados em estrutura de lista
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

    static void relatorio(List<String> list){
        System.out.println("\nRA    |               Nome               |    P1   |    P2   |    P3   |  Média  |   Conceito");
        System.out.println("-------------------------------------------------------------------------------------------------");
        for (int i = 0; i < list.size(); i++) 
        {
            String[] partes = list.get(i).split(", ");
            String ra = partes[0];
            String nomeAluno = partes[1];
            Double nota1 = Double.parseDouble(partes[2]);
            Double nota2 = Double.parseDouble(partes[3]);
            Double nota3 = Double.parseDouble(partes[4]);
            Double media = ((nota1)+(nota2)+(nota3))/3;
            String conceito = " ";
            if (media >= 8.5)
            {
                conceito = "excelente";
            }
            if (media < 8.5 && media >= 7)
            {
                conceito = "bom";
            }
            if (media < 7 && media >= 5)
            {
                conceito = "regular";
            }
            if (media < 5)
            {
                conceito = "precupante";
            }
            System.out.printf("%4s  |  %-30s  |  %5.2f  |  %5.2f  |  %5.2f  |  %5.2f  |  %-10s  |\n", ra, nomeAluno, nota1, nota2, nota3, media, conceito);
        }
        System.out.println("\n");
    }

    static List<String> inserirNovo(String arq){
        Scanner entrada = new Scanner (System.in);
        String ra = "", nome = "", p1 = "", p2 = "", p3 = "";
        List<String> sublist = new ArrayList<String>();

        boolean valid = false;
        while (valid == false) 
        {
            System.out.println("\nDigite o RA no formato 'nnnn', onde 'n' é um caracter numérico: ");
            ra = entrada.nextLine();
            try 
            {
                int num = Integer.parseInt(ra);
                if (ra.length() == 4) 
                {
                    sublist.add(ra);
                    valid = true;
                }
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("\nFormato inválido!\n");
            }
        }
        
        valid = false;
        while (valid == false) 
        {
            System.out.println("\nDigite o nome do aluno: ");
            nome = entrada.nextLine();
            if (nome.length() <= 30) 
            {
                sublist.add(nome);
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
            System.out.println("\nDigite a nota da P1: ");
            p1 = entrada.nextLine();
            try {
                double num = Double.parseDouble(p1);
                if (num >=0 && num <=10) 
                {
                    sublist.add(p1);
                    valid = true;
                }
            } 
            catch (NumberFormatException e)
            {
                System.out.println("\nFormato inválido! A nota deve ser um número real entre 0 e 10.\n");
            }
        }

        valid = false;
        while (valid == false) 
        {
            System.out.println("\nDigite a nota da P2: ");
            p2 = entrada.nextLine();
            try 
            {
                double num = Double.parseDouble(p2);
                if (num >=0 && num <=10) 
                {
                    sublist.add(p2);
                    valid = true;
                }
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("\nFormato inválido! A nota deve ser um número real entre 0 e 10.\n");
            }
        }    
        
        valid = false;
        while (valid == false) 
        {
            System.out.println("\nDigite a nota da P3: ");
            p3 = entrada.nextLine();
            try 
            {
                double num = Double.parseDouble(p3);
                if (num >=0 && num <=10) 
                {
                    sublist.add(p3);
                    valid = true;
                }
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("\nFormato inválido! A nota deve ser um número real entre 0 e 10.\n");
            }
        }
        
        StringJoiner sj = new StringJoiner(", ");
        sj.add(ra);   
        sj.add(nome);
        sj.add(p1);
        sj.add(p2);
        sj.add(p3);
        String novaLinha = sj.toString();
                
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arq, true))) 
        {
            bw.write(novaLinha);
            bw.newLine();
            System.out.println("Linha adicionada com sucesso.");
        } 
        catch (IOException e) 
        {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
        List<String> listaNova = criarLista(arq);
        return listaNova;
    }

    public static void main(String[] args) 
    {
            
        Scanner entrada = new Scanner(System.in);
        String nomeArquivo = "notas.txt";
        List<String> listaNotas = new ArrayList<>();

        listaNotas = criarLista(nomeArquivo);
                       
        boolean valid = false;
        while (valid == false)
        {
            System.out.println("\nQual opção desejada? \n1- Imprimir relatório\n2- Inserir novo aluno\n3- Sair\n");
            int opcao = entrada.nextInt();
            if (opcao == 1)
            {
                relatorio(listaNotas);
            }
            else if (opcao == 2)
            {
                listaNotas = inserirNovo(nomeArquivo);
            }
            else if (opcao == 3)
            {
                valid = true;
            }
            else
            {
                System.out.println("\nOpção inválida!\n");
            }
        }
            entrada.close();
    }
}
