import java.util.Scanner;

public class Exercicio3 
{
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);

        int m[][] = new int[2][4];
        int l = 0, c = 0, soma = 0, contador = 0;

        for (l = 0; l < m.length; l++) 
        {
            int contpar = 0;
            System.out.println("Informe os valores da " + (l + 1) + " a. linha: ");
            for (c = 0; c < m[l].length; c++) 
            {
                System.out.println("m[" + l + "][" + c + "]");
                m[l][c] = input.nextInt();
                if (m[l][c] % 2 == 0) 
                {
                    soma += m[l][c];
                    contpar++;
                    contador++;
                }
            }
            System.out.println("Quantidade de valores pares da " + (l + 1) + "a. linha: " + contpar);
        }

        input.close();

        if (soma == 0) 
        {
            System.out.println("Não há elementos pares na matriz, não é possível calcular a média.");
        } 
        else 
        {
            System.out.println("Média dos elementos pares na matriz: " + ((double) soma / contador));
        }
    }
}
