import java.util.Scanner;

public class Exercicio9 
{  
    public static void main(String[] args) 
    {
        
        Scanner entrada = new Scanner(System.in);
        char matriz [][] = new char [2][2];
        char aux;

        for (byte i = 0; i < matriz.length; i++) {
            for (byte j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o elemento [" + i + "][" + j + "]:");
                matriz[i][j] = entrada.next().charAt(0);
            }
        }
        System.out.println("digite uma letra para ves se tem na matriz");
        aux = entrada.next().charAt(0);

        for (byte i = 0; i < matriz.length; i++) 
        {
            for (byte j = 0; j < matriz[i].length; j++) 
            {
                if ( aux == matriz[i][j])
                {
                    System.out.println("posição[" + i + "][" + j + "]:");
                }
            }
        }
        entrada.close();
    }
}