package Algortimo;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);
        double[] n1 = new double[10];
        double[] n2 = new double[10];
        double[] n3 = new double[10];
        double[] m = new double[10];
        double[] fre = new double[10];
        double[] frequenciatotal = new double[10];
        double mediageral = 0, maior = 0, menor = 0;
        int aulasto = 0, i, repro = 0, apro = 0;
        int[] numerodamatri = new int[10];

        for (i = 0; i < 10; i++) 
        {
            System.out.print("Digite o número da matrícula:\t");
            numerodamatri[i] = scanf.nextInt();

            System.out.print("Digite a primeira nota do aluno " + (i + 1) + ":\t");
            n1[i] = scanf.nextDouble();

            System.out.print("Digite a segunda nota do aluno " + (i + 1) + ":\t");
            n2[i] = scanf.nextDouble();

            System.out.print("Digite a terceira nota do aluno " + (i + 1) + ":\t");
            n3[i] = scanf.nextDouble();

            if (i == 0) 
            {
                System.out.print("Digite o total de aulas:\t");
                aulasto = scanf.nextInt();
            }

            System.out.print("Digite a frequência do aluno " + (i + 1) + ":\t");
            fre[i] = scanf.nextDouble();

            m[i] = (n1[i] + n2[i] + n3[i]) / 3; // Média do aluno
            frequenciatotal[i] = fre[i] / aulasto; // Frequência do aluno

            if (m[i] < 6 || frequenciatotal[i] < 0.75) 
            {
                System.out.println("Aluno " + (i + 1) + ": Reprovado");
                repro++;
            } 
            else 
            {
                System.out.println("Aluno " + (i + 1) + ": Aprovado");
                apro++;
            }
        }

        for (i = 0; i < 10; i++) 
        {
            mediageral += m[i];
            if (maior < m[i]) maior = m[i];
            if (menor > m[i]) menor = m[i];
        }
        
        mediageral /= 10; // Média geral

        System.out.println("Média da sala: " + mediageral);
        System.out.println("Maior nota da sala: " + maior);
        System.out.println("Menor nota da sala: " + menor);
        System.out.println("Aprovados: " + apro);
        System.out.println("Reprovados: " + repro);

        scanf.close();
    }
}
