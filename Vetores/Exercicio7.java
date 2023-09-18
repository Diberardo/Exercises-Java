package Vetores;

import java.util.Scanner;

public class Exercicio7
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);

        int[] v1 = new int[8];
        int i, j, aux;

        System.out.println("Digite os números dentro do vetor:");
        for (i = 0; i < v1.length; i++) {
            System.out.print("Posição " + (i + 1) + ": ");
            v1[i] = scanf.nextInt();
        }

        scanf.close();

        for (i = 0, j = 7; i < 4; i++, j--) {
            aux = v1[i];
            v1[i] = v1[j];
            v1[j] = aux;
        }

        System.out.print("Vetor após a inversão: ");

        for (int num : v1) 
        {
            System.out.print(num + "\t");
        }
    }
}
