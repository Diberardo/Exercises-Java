package Algortimo;

import java.util.Scanner;

public class Exercicio3 {
        public static void main (String[] args)
        {

        Scanner sc = new Scanner(System.in);

        System.out.print ("Informe a nota 1: ");
        double n1 = sc.nextDouble();
        
        System.out.print ("Informe a nota 2: ");
        double n2 = sc.nextDouble();

        double media = (n1+n2)/2;

          if (media <= 3.9)
            {
              System.out.println("Reprovado. Média= " + media);
            } 
          else if (media == 4 || media <= 6.9)
            {
             System.out.println("Exame. Média= " + media);
            }
            else
            { 
              System.out.println("Aprovado. Média= " + media);
             }
        sc.close();
    }
}
