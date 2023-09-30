import java.util.Scanner;

public class Exercicio3
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in, "latin1");

        int vogais = 0, backspace = 0;
        char caractere;

        System.out.println("Qual o seu nome completo? ");
        String nome = input.nextLine();
        nome = nome.toLowerCase(); // passar string tudo para minúsculo

        for (int i = 0; i < nome.length(); i++) 
        {
            caractere = nome.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') 
            {
                vogais++;
            } 
            else if (caractere == ' ') 
            {
                backspace++;
            }
            System.out.println(nome.charAt(i));
        }
        System.out.println("\n" + "Quantidade de vogais = " + vogais + "\n" + "Quantidade de espacos = " + backspace);
        input.close();
    }
}