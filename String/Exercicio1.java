import java.util.Scanner;

public class Exercicio1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String frase;
        int tamanho;

        System.out.println("Escreva uma frase: ");
        frase = input.nextLine();

        tamanho = frase.length();
        System.out.println("Quantidade de caracteres na frase: " + tamanho);
        input.close();
    }
}