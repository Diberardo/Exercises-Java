package Vetores;

import java.util.Scanner;

public class Exercicio10 
{
    public static void main(String[] args) 
    {

        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[10];
        int menor = 0, maior = 0;

        for (byte i = 0; i < 10; i++) 
        {
            System.out.println("\nDigite o elemento de índice " + i + " do vetor: ");
            vetor[i] = entrada.nextInt();
        }

        for (byte i = 0; i < 10; i++) 
        {
            if (i == 0) 
            {
                menor = maior = vetor[i];
            } 
            else 
            {
                if (vetor[i] < menor) 
                {
                    menor = vetor[i];
                }
                if (vetor[i] > maior) 
                {
                    maior = vetor[i];
                }
            }
        }
        System.out.println("\nO vetor digitado é formado pelos seguintes elementos: ");

        for (byte i = 0; i < 10; i++) 
        {
            System.out.print(vetor[i] + "\t");
        }

        System.out.println("\nO maior valor desse vetor é: " + maior);
        System.out.println("O menor valor desse vetor é: " + menor);
    }
}

