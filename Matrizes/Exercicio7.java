import java.util.Scanner;

public class Exercicio7 
{
    public static void main(String[] args) 
    {

        int matriz[][] = new int[3][3];
        int matrizAlt[][] = new int[3][3];
        Scanner entrada = new Scanner(System.in);

        for (byte i = 0; i < matriz.length; i++) 
        {
            for (byte j = 0; j < matriz[i].length; j++) 
            {
                System.out.println("Digite um número inteiro para o elemento [" + (i + 1) + (j + 1) + "]:");
                matriz[i][j] = entrada.nextInt();
            }
        }
        entrada.close();

        for (byte i = 0; i < matrizAlt.length; i++) 
        {
            for (byte j = 0; j < matrizAlt[i].length; j++) 
            {
                matrizAlt[i][j] = matriz[matriz.length - j - 1][i];
            }
        }

        // Para verificar na tela o conteúdo da matriz:
        System.out.println("\nMatriz original:");
        for (byte i = 0; i < matriz.length; i++) 
        {
            for (byte j = 0; j < matriz[i].length; j++) 
            {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.print("\n");
        }

        System.out.println("\nMatriz modificada (90º): ");
        for (byte i = 0; i < matrizAlt.length; i++) 
        {
            for (byte j = 0; j < matrizAlt[i].length; j++) 
            {
                System.out.print(matrizAlt[i][j] + "   ");
            }
            System.out.print("\n");
        }
    }
}
