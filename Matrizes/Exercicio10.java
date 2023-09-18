import java.util.Scanner;

class Exercicio10
{
   public static void main(String[] args) 
   {
      int[][] v1 = new int[3][4];
      int i,j;

      Scanner scanf = new Scanner(System.in); 

      for ( i = 2; i >= 0; i-- )
      {
        for ( j = 3; j >= 0; j-- )
        {
            System.out.print("Digite uns numero ai[" + i + "][" + j + "]\t" );
            v1[i][j] = scanf.nextInt();
        }
      }
      scanf.close();
      for ( i = 0; i < v1.length; i++ )
      {
        System.out.println("\n");
        for ( j = 0; j < 4; j++ )
        {
            System.out.print("\t" + v1[i][j] + "" + "[" + i + "][" + j + "]" );
        }
      } 
  }
}
