import java.util.Scanner;

public class Lista6Exercicio2 
{
    static void somaMatriz(double [][] m)
    {
        double soma = 0;
        int i, j;
        for (i=0; i<m.length; i++)
        {
            for (j=0; j<m[i].length;j++)
            {
                soma = soma + m[i][j];
            }
        }
        System.out.println("A soma dos elementos da matriz digitada é: " + soma + ".");
    }
    public static void main(String[] args) 
    {
        int c, l;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade desejada de linhas da matriz de números reais: ");
        l = entrada.nextInt();

        System.out.println("Agora, digite a quantidade de colunas dessa matriz:");
        c = entrada.nextInt();

        double matriz [][]= new double [l][c];
        for (int i=0; i<matriz.length; i++)
        {
            for (int j=0; j<matriz[i].length; j++)
            {
                System.out.println("Digite o elemento [" + i + "] [" + j + "]: ");
                matriz[i][j] = entrada.nextDouble();
            }
        }
        entrada.close();
        somaMatriz(matriz);
    }
}
