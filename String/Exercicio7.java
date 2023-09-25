import java.util.Scanner;

public class Exercicio7
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in,"latin1");
        
        // Recebe o nome completo do usuário
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        // Encontra o índice do último espaço
        int ultimoEspaco = nomeCompleto.lastIndexOf(' ');

        // Extrai o sobrenome com base no índice do último espaço
        String sobrenome = nomeCompleto.substring(ultimoEspaco + 1);

        // Exibe o sobrenome
        System.out.println("Sobrenome: " + sobrenome);

        // Fecha o scanner
        scanner.close();
    }
} 
              