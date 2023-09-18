package Algortimo;

import java.util.Scanner;

public class Exercicio1 
{
    public static void main (String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite o raio da esfera: ");
    double r = sc.nextDouble();

    final double pi = 3.1416;
    double c = 2 * pi * r;
    double a = pi * r * r;
    double v = (4 *pi * r * r * r)/3;

    System.out.println("Comprimento da circunferência= " + c);
    System.out.println("Área= " + a);
    System.out.println("Volume= " + v);

    sc.close();
    }
}


