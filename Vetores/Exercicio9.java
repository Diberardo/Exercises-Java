package Vetores;

import java.util.Scanner;

public class Exercicio9 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        float vetOrig[] = new float[10];
        float vetDeriv[] = new float[3];
        boolean cond = true;

        System.out.println("Preencha dez valores reais em um vetor");

        for (byte i = 0; i < vetOrig.length; i++) 
        {
            System.out.println("Insira um número real para preencher o elemento com índice " + i + " do vetor: ");
            vetOrig[i] = entrada.nextFloat();
        }

        System.out.println("\nO vetor digitado é composto pelos seguintes elementos: ");

        for (byte i = 0; i < vetOrig.length; i++) 
        {
            System.out.print(vetOrig[i] + " ");
        }

        while (cond == true) 
        {
            System.out.println("\n\nEscolha um índice do vetor original (de 0 a 6): ");
            byte indice = entrada.nextByte();
            if (indice < 0 || indice >= 7) 
            {
                System.out.println("\n\nO índice deve ser um número inteiro de 0 a 6!");
            } 
            else 
            {
                for (byte i = 0; i < 3; i++) 
                {
                    vetDeriv[i] = vetOrig[indice + i + 1];
                }
                break;
            }
        }

        System.out.println("\nO vetor formado pelos 3 elementos seguintes ao índice escolhido é composto pelos seguintes números: ");

        for (byte i = 0; i < 3; i++) 
        {
            System.out.print(vetDeriv[i] + " ");
        }
    }
}

