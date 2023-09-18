import java.util.Scanner;

public class Exercicio8 
{
  public static void main(String[] args) 
  {
    int[][] v1 = new int[4][4]; 
    int [][] v2 = new int[4][4];
    int[][] v3 = new int[4][4];

    Scanner scanf = new Scanner(System.in);

    for ( int i = 0; i < v1.length; i++ )
    {
        for ( int j = 0; j < v1.length; j++ )
        {
           System.out.print("Digite uns numero" + "[" + i + "][" + j + "]\t");
           v1[i][j] = scanf.nextInt();
        }
    }
    for ( int i = 0; i < v1.length; i++ )
    {
        for ( int j = 0; j < v1.length; j++ )
        {
           System.out.print(" segunda matriz Digite uns numero:" + "[" + i + "][" + j + "]\t");
           v2[i][j] = scanf.nextInt();
        }
    }
    for ( int i = 0; i < v1.length; i++ )
    {
        for ( int j = 0; j < v1.length; j++ )
        {
           v3[i][j]  = v1[i][j] + v2[i][j];
        }
    }
    for ( int i = 0; i < v3.length; i++ )
    {
        for ( int j = 0; j < v3.length; j++ )
        {
           System.out.println(v3[i][j]);
        }
    }
    scanf.close();
  }
}
