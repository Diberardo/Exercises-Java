import java.util.Scanner;

public class Lista6Exercicio3 
{
    static void opMatriz(double [][] m)
    {
        double somaDiag = 0;
        int i, j;
        for (i=0; i<m.length; i++)
        {
            double somaLinha = 0;
            for (j=0; j<m[i].length;j++)
            {
                somaLinha += m[i][j];
                
                if (i==j)
                {
                    somaDiag += m[i][j];
                }
            }
            System.out.println("A soma dos elementos da linha " + (i+1) + " é igual a: " + somaLinha + ".\n");
        }
        System.out.println("A soma dos elementos da diagonal principal é: " + somaDiag + ".\n");
    }
    public static void main(String[] args) 
    {
        int l;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade desejada de linhas da matriz quadrada: ");
        l = entrada.nextInt();

        double matriz [][]= new double [l][l];
        for (int i=0; i<matriz.length; i++)
        {
            for (int j=0; j<matriz[i].length; j++){
                System.out.println("Digite o elemento [" + i + "] [" + j + "]: ");
                matriz[i][j] = entrada.nextDouble();
            }
        }
        entrada.close();
        System.out.println("");
        for (int i=0; i<matriz.length; i++)
        {
            for (int j=0; j<matriz[i].length; j++)
            {
                System.out.print(matriz[i][j] + "    ");
            }
            System.out.println("");
        }
        System.out.println("");
        opMatriz(matriz);
    }    
}
