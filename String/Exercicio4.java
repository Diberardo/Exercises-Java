import java.util.Scanner;

public class Exercicio4 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a palavra1: ");
        String palavra1 = entrada.nextLine();

        System.out.println("Digite a palavra2: ");
        String palavra2 = entrada.nextLine();
        entrada.close();
        if (palavra1.length() == palavra2.length())
         {
            if (palavra1.equalsIgnoreCase(palavra2)) 
            {
                if (palavra1.equals(palavra2)) 
                {
                    System.out.println("As palavras digitadas são idênticas, mesmo considerando as maiúsculas/minúsculas.");
                } 
                else 
                {
                    System.out.println("As palavras digitadas possuem os mesmos caracteres (sem considerar maiúsculas/minúsculas), mas não são idênticas.");
                }
            } 
            else 
            {
                System.out.println("As palavras digitadas possuem o mesmo tamanho mas são diferentes.");
            }
        } 
        else 
        {
            System.out.println("As palavras digitadas não possuem o mesmo tamanho.");
        }
    }
}
