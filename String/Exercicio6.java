import java.util.Scanner;

public class Exercicio6 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();

        System.out.print("Digite uma letra: ");
        char letra = entrada.next().charAt(0);
        entrada.close();
        
        for (byte i = 0; i < frase.length(); i++) 
        {
            if (frase.charAt(i) == letra) 
            {
                System.out.println("Letra " + letra + " na posição " + i);
            }
        }
    }
}
