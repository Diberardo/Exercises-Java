import java.util.Scanner;

public class Exercicio6 
{
    public static void main(String[] args) 
    {
        
        int somaDiagP = 0, somaDiagS = 0, somaLinha, somaColuna = 0;
        int matriz[][] = new int[3][3];
        int somaLin[] = new int[3];
        
        Scanner entrada = new Scanner(System.in);

        for (byte i = 0; i < matriz.length; i++) 
        {
            somaLinha = 0;
            for (byte j = 0; j < matriz[i].length; j++) 
            {
                System.out.println("Digite um número inteiro para o elemento [" + (i+1) + "][" + (j+1) + "]:");
                matriz[i][j] = entrada.nextInt();
                somaLinha += matriz[i][j];
                if (i == j) 
                {
                    somaDiagP += matriz[i][j];
                    if (i + j == matriz.length - 1) 
                    {
                        somaDiagS += matriz[i][j];
                    }
                }
                 else if (i + j == matriz.length - 1) 
                {
                    somaDiagS += matriz[i][j];
                }
                somaLin[i] = somaLinha;
            }
        }
        entrada.close();   
        
        // Para verificar na tela o conteúdo da matriz:
        System.out.print("\n");
        for (byte i = 0; i < matriz.length; i++) 
        {
            for (byte j = 0; j < matriz[i].length; j++) 
            {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.print("\n");
        }

        System.out.println("\nA soma dos elementos que estão na diagonal principal é: " + somaDiagP + "\n\nA soma dos elementos que estão na diagonal secundária é: " + somaDiagS + "\n");
        for (byte i = 0; i < matriz.length; i++) 
        {
            System.out.println("A soma dos elementos da linha " + (i + 1) + " é: " + somaLin[i]);
        }
        System.out.println("\n");
        for (byte c = 0; c < matriz[0].length; c++) 
        {
            somaColuna = 0;
            for (byte i = 0; i < matriz.length; i++) 
            {
                for (byte j = 0; j < matriz[i].length; j++) 
                {
                    if (c == j) 
                    {
                        somaColuna += matriz[i][j];
                    }
                }
            }
            System.out.println("A soma dos elementos da coluna " + (c + 1) + " é: " + somaColuna);
        } 
    }
}

