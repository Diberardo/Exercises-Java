import java.util.Scanner;

public class Exercicio2
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String nome = input.nextLine();

        for (int i = 0; i < nome.length(); i++) 
        {
            System.out.println(nome.charAt(i));
        }
        input.close();
    }
}
