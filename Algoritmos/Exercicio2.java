package Algortimo;

import java.util.Scanner;

public class Exercicio2 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);

      System.out.print("Informe o valor original: ");
      double valor = sc.nextDouble();

      System.out.print("Informe o valor da taxa: ");
      double taxa = sc.nextDouble();

      System.out.print("Informe tempo em atraso: ");
      int tempo = sc.nextInt();

      double prest = valor+(valor*(taxa/100)*tempo);
      System.out.println("Prestação: " + prest);

      sc.close();; 
    }
}
