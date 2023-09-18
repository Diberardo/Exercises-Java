package Vetores;

import java.util.Scanner;

public class Exercicio8 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        int vetOrig[] = new int[9];
        int vetInv[] = new int[9];

        for (byte i = 0; i < vetOrig.length; i++) 
        {
            System.out.println("Insira o elemento (número inteiro) " + (i + 1) + " do vetor: ");
            vetOrig[i] = entrada.nextInt();
        }

        entrada.close();

        System.out.print("O vetor original contém os seguintes elementos: ");

        for (byte j = 0; j < vetOrig.length; j++) 
        {
            System.out.print(vetOrig[j] + " ");
        }

        for (byte i = 0; i < vetOrig.length; i++) 
        {
            vetInv[i] = vetOrig[vetOrig.length - 1 - i];
        }

        System.out.print("\n\nO mesmo vetor com a ordem invertida: ");

        for (byte i = 0; i < vetOrig.length; i++) 
        {
            System.out.print(vetInv[i] + " ");
        }
    }
}

