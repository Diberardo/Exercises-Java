package Algortimo;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio5 
{
    public static void main(String[] args) 
    {
        double p_ideal;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite sua altura em metros (m): ");
        float h = sc.nextFloat();
        
        System.out.println("Digite seu peso em quilos (Kg): ");
        float p = sc.nextFloat();
        
        System.out.println("Informe o seu sexo (M/F): ");
        String sexo = sc.next().toUpperCase();
        sc.close();

        switch (sexo) 
        {
            case "M":
                p_ideal = (72.7 * h) - 58;
                if (p_ideal > p) 
                {
                    System.out.printf("Seu peso ideal é: %.1f Kg. Você precisa ganhar: %.1f Kg", p_ideal, Math.abs((p - p_ideal)));
                } 
                else 
                {
                    System.out.printf("Seu peso ideal é: %.1f Kg. Você precisa perder: %.1f Kg", p_ideal, Math.abs((p - p_ideal)));
                }
                break;

            case "F":
                p_ideal = (62.1 * h) - 44.7;
                if (p_ideal > p) 
                {
                    System.out.printf("Seu peso ideal é: %.1f Kg. Você precisa ganhar: %.1f Kg", p_ideal, Math.abs((p - p_ideal)));
                } 
                else 
                {
                    System.out.printf("Seu peso ideal é: %.1f Kg. Você precisa perder: %.1f Kg", p_ideal, Math.abs((p - p_ideal)));
                }
                break;

            default:
                System.out.println("ERRO: opção inválida!");
        }
    }
}

