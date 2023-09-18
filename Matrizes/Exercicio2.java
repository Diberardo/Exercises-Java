import java.util.Scanner;

public class Exercicio2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int m[][] = new int[3][3];
        int l = 0, c = 0;

        for (c = 0; c < 3; c++) 
        {
            System.out.println("Informe os valores da " + (c + 1) + "a. coluna: ");
            for (l = 0; l < 3; l++) 
            {
                System.out.println("m[" + c + "][" + l + "]");
                m[l][c] = input.nextInt();
            }
        }

        for (l = 0; l < m.length; l++) 
        {
            System.out.print("\n");
            
            for (c = 0; c < m[l].length; c++) 
            {
                System.out.print(m[l][c] + "\t");
            }
        }
    }
}

