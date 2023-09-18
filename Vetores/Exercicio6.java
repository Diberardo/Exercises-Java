package Vetores;

import java.util.Scanner;

public class Exercicio6
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);

        double[] v1 = new double[3];
        double[] v2 = new double[3];
        double[] v3 = new double[6];
        double m1 = 0, m2 = 0;
        int i;

        for (i = 0; i < 3; i++) 
        {
            System.out.println("Digite o primeiro vetor em números reais:");
            v1[i] = scanf.nextDouble();
            m1 += v1[i];
        }

        for (i = 0; i < 3; i++) 
        {
            System.out.println("Digite o segundo vetor em números reais:");
            v2[i] = scanf.nextDouble();
            m2 += v2[i];
        }

        scanf.close();

        if (m1 < m2) 
        {
            for (i = 0; i < 3; i++) 
            {
                v3[i] = v2[i];
                v3[i + 3] = v1[i];
            }
        } 
        else 
        {
            for (i = 0; i < 3; i++) 
            {
                v3[i] = v1[i];
                v3[i + 3] = v2[i];
            }
        }

        System.out.print("Vetor resultante: ");

        for (double num : v3) 
        {
            System.out.print("\t" + num);
        }
    }
}


