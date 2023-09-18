import java.util.Scanner;

public class Exercicio1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int m[][] = new int[3][5];
        int l = 0, c = 0, soma = 0;

        // carrega o vetor com dados fornecidos pelo usuário
        for (l = 0; l < m.length; l++) 
        {
            System.out.println("Informe os elementos da " + (l + 1) + "a. linha");
            for (c = 0; c < m[l].length; c++) 
            {
                System.out.println("m[" + l + "][" + c + "]= ");
                m[l][c] = input.nextInt();
                soma += m[l][c];
            }
        }

        System.out.println("Soma dos elementos da matriz= " + soma);
    }
}




