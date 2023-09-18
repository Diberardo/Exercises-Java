package Vetores;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int qp = 0;
        int qi = 0;

        System.out.println("Digite a quantidade de valores no vetor: ");
        j = sc.nextInt();
        int vetor[] = new int[j];

        for (i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posição " + (i + 1) + " :");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) {
                qp++;
            } else {
                qi++;
            }
        }

        System.out.println("Quantidade de valores pares: " + qp + "\n" + "Quantidade de valores ímpares: " + qi);
        sc.close();
    }
}
