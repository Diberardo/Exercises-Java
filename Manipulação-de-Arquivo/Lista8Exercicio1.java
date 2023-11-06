import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Lista8Exercicio1 
{

    static boolean login(String conta, ArrayList<String> lista) 
    {
        boolean sit = false;
        for (int i = 0; i < lista.size(); i++) 
        {
            String[] partes = lista.get(i).split(", ");
            String numConta = partes[0];

            if (numConta.equalsIgnoreCase(conta)) 
            {
                sit = true;
                break; // Não é necessário continuar procurando
            }
            else
            {
                sit = false;
            }
        }
        return sit;
    }

    static boolean senha(String senha, ArrayList<String> lista) 
    {
        boolean sit = false;
        for (int i = 0; i < lista.size(); i++) 
        {
            String[] partes = lista.get(i).split(", ");
            String numSenha = partes[1];

            if (numSenha.equalsIgnoreCase(senha)) 
            {
                sit = true;
                break; // Não é necessário continuar procurando
            }
            else
            {
                sit = false;
            }
        }
        return sit;
    }

    static void operacao(char escolha, String conta, ArrayList<String> lista) 
    {
        String nomeArquivo = "contas.txt";
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < lista.size(); i++) 
        {
            String[] partes = lista.get(i).split(", ");
            String numConta = partes[0];
            if (numConta.equalsIgnoreCase(conta)) 
            {
                double saldoInic = Double.parseDouble(partes[2]);
                double saldoAtual = 0;
                System.out.printf("\nO saldo da sua conta nº %s é: R$ %,.2f\n\n", conta, saldoInic);
                switch (escolha) 
                {
                    case '1':
                        System.out.println("Qual valor deseja sacar? ");
                        double valor = entrada.nextDouble();
                        if (saldoInic > valor) {
                            saldoAtual = saldoInic - valor;
                            System.out.printf("Saque no valor de R$ %,.2f efetuado com sucesso. Seu novo saldo é de R$ %,.2f\n\n", valor, saldoAtual );
                            partes[2] = String.valueOf(saldoAtual);
                            lista.set(i, String.join(", ", partes));
                        }
                        else
                        {
                            System.out.println("Saldo insuficiente para o saque desejado.");
                        }
                        break;
                    case '2':
                        System.out.println("\nQual valor deseja depositar? \n");
                        valor = entrada.nextDouble();
                        saldoAtual = saldoInic + valor;
                        System.out.printf("Depósito no valor de R$ %,.2f efetuado com sucesso. Seu novo saldo é de R$ %,.2f\n\n", valor, saldoAtual );
                            partes[2] = String.valueOf(saldoAtual);
                            lista.set(i, String.join(", ", partes));
                        break;
                }
            }
        }
        try{
                        BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo));
                            for (String linhaAtualizada : lista) 
                            {
                                bw.write(linhaAtualizada);
                                bw.newLine();
                            }
                            bw.close();
                    } 
                    catch (IOException e) 
                    {
                        System.err.println("Erro ao manipular o arquivo: " + e.getMessage());
        }
    }

    
    
    public static void main(String[] args) 
    {

        String nomeArquivo = "contas.txt";
        String contaBusca = "";
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> linhas = new ArrayList<>();

        try 
        {
            // Lê o arquivo e armazena as linhas em uma lista
            BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            while ((linha = br.readLine()) != null) 
            {
                linhas.add(linha);
            }
            br.close();
        } 
        catch (IOException e) 
        {
            System.err.println("Erro ao manipular o arquivo: " + e.getMessage());
        }
        
        boolean contaEncontrada = false;
        boolean senhaEncontrada = false;

        while (contaEncontrada == false)
        {
            System.out.println("\nDigite o número da sua conta com 5 dígitos: \n");
            contaBusca = entrada.nextLine();
            contaEncontrada = login(contaBusca, linhas);
            if (contaEncontrada == false)
            {
                System.out.println("\nConta não encontrada.\n");
            }
        }

        while (senhaEncontrada == false)
        {
            System.out.println("\nDigite sua senha com 4 dígitos: \n");
            String senhaBusca = entrada.nextLine();
            senhaEncontrada = senha(senhaBusca, linhas);
            if (senhaEncontrada == false){
                System.out.println("\nSenha incorreta.\n");
            }
        }
                
        boolean cond = false;
        while (cond == false)
        {
            System.out.println("\nEscolha a operação desejada: \n\n1 - Sacar\n2 - Depositar\n3 - Saldo\n4 - Sair\n");
            char operat = entrada.next().charAt(0);
            
            /*try {
                if (operat == '4'){
                    cond = true;
                }else{
                    operacao(operat, contaBusca, linhas);
                    cond = false;
                }    
            }catch (Exception e){

            }*/

            if (operat == '4')
            {
                cond = true;
            }
            else
            {
                operacao(operat, contaBusca, linhas);
                cond = false;
            }


            /*switch (operat) {
                case '1':
                case '2':
                case '3':
                    operacao(operat, contaBusca, linhas);
                    cond = false;
                    break;        
                case '4':
                    cond = true;
                    System.out.println("\nLogout efetuado com sucesso!\n");
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            }*/
            
        }
        entrada.close();
    }
}

