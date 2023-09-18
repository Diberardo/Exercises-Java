package Vetores;

import java.util.Scanner;

public class Exercicio1
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valores[] = new int[15];
        int i = 0;
        double soma = 0;

        for (i = 0; i < valores.length; i++) {
            System.out.println("Informe o valor da posição " + (i + 1) + " :");
            valores[i] = sc.nextInt();
            soma += valores[i];
        }

        double media = soma / valores.length;
        System.out.println("Soma dos valores: " + (soma) + "\n" + "Média dos valores: " + (media));
        sc.close();
    }
}
