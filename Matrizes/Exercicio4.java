import java.util.Scanner;

public class Exercicio4 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int m[][] = new int[3][6];
        int l = 0, c = 0, menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE, contmaxl = 0, contmaxc = 0, contminl = 0, contminc = 0;

        for (l = 0; l < m.length; l++) // preenchimento das linhas
        {  
            System.out.println("Informe os valores da " + (l + 1) + "a. linha: ");
            for (c = 0; c < m[l].length; c++) // preenchimento das colunas
            {  
                System.out.println("m[" + l + "][" + c + "]");
                m[l][c] = input.nextInt();
                if (m[l][c] > maior) 
                {
                    maior = m[l][c];
                    contmaxl = l;
                    contmaxc = c;
                }
                if (m[l][c] < menor) 
                {
                    menor = m[l][c];
                    contminl = l;
                    contminc = c;
                }
            }
        }

        System.out.println("O maior elemento da matriz é: " + maior + ". Na posição [" + contmaxl + "][" + contmaxc + "]");
        System.out.println("O menor elemento da matriz é: " + menor + ". Na posição [" + contminl + "][" + contminc + "]");

        input.close();
    }
}
