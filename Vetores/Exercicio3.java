package Vetores;

import java.util.Scanner;

public class Exercicio3 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int vetor1[] = new int[5];
        int vetor2[] = new int[5];
        int vetor3[] = new int[5];
        int i, j, k;

        for (i = 0; i < vetor1.length; i++) 
        {
            System.out.println("Vetor 1 - Digite o valor da posição " + (i + 1) + " :");
            vetor1[i] = sc.nextInt();
        }

        for (j = 0; j < vetor2.length; j++) 
        {
            System.out.println("Vetor 2 - Digite o valor da posição " + (j + 1) + " :");
            vetor2[j] = sc.nextInt();
        }

        for (i = 0, j = 0, k = 0; k < vetor3.length; i++, j++, k++) 
        {
            vetor3[k] = vetor1[i] + vetor2[j];
        }

        for (int visor1 : vetor3) 
        {
            System.out.print((visor1) + "\t");
        }

        sc.close();
    }
}

