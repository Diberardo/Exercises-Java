import java.util.Scanner;

public class exercicio5 
{

    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);
        int v1[] = new int[5];
        int v2[] = new int[5];
        int i,j;

        for ( i = 0, j = 4; i < v1.length; i++, j-- )
        {
            System.out.print("Digites os valores para ser invertido: " + i + " = ");
            v1[i] = scanf.nextInt();
            v2[j] = v1[i]; 
        } 
        scanf.close();
        for ( int v : v1 ) 
        {
            System.out.println("Primeiro vetor:" + v);
        }
        for ( int v : v2 )
        { 
            System.out.println("Segundo vetor:" + v);
        } 
    }
}
