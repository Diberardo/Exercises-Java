package Algortimo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        boolean cond = true;
        float soma = 0;
        List<Float> listaPositivos = new ArrayList<Float>();

        while (cond == true) 
        {
            System.out.println("Digite um valor numérico: ");
            float num = sc.nextFloat();

            if (num <= 0) 
            {
                cond = false;
            } 
            else 
            {
                listaPositivos.add(num);
                soma = soma + num;
            }
        }
        sc.close();

        System.out.println(listaPositivos);
        int quantLista = listaPositivos.size();
        float media = soma / quantLista;

        System.out.printf("Você digitou %d valores positivos.%nO somatório desses valores é igual a %f.%nA média dos valores digitados é igual a %f.", quantLista, soma, media);
    }
}

