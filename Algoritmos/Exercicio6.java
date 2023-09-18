package Algortimo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio6 
{
    public static void main(String[] args) 
    {
        int somaIdades = 0;
        int quantMenores = 0;

        Scanner sc = new Scanner(System.in);

        List<Integer> listaTodos = new ArrayList<Integer>();
        List<Integer> listaMenores = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) 
        {
            System.out.printf("Digite a idade da pessoa nº %d: %n", i);
            int idade = sc.nextInt();
            somaIdades = somaIdades + idade;
            listaTodos.add(idade);

            if (idade <= 18) 
            {
                quantMenores = quantMenores + 1;
                listaMenores.add(idade);
            }
        }
        sc.close();

        float media = somaIdades / 10;
        int menores = listaMenores.size();

        System.out.printf("A média de idade do grupo é: %.2f anos.%n", media);
        System.out.printf("A quantidade de pessoas com idade menor ou igual a 18 é de %d pessoa(s).", quantMenores);
    }
}
