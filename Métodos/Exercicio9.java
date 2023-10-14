import java.util.Scanner;

public class Exercicio4 
{
  public static void localizar (int[] v1, int pro)  
  {
   int po = 0;
   for ( int j = 0; j < v1.length; j++ )
   {
    if ( pro == v1[j])
    {
      po = j;
    }
   }
   if ( po > 0 )
   System.out.println("Aparece na posição: " + po);
   else
   {
    System.out.println("Nao aparece");
   }
  }
  public static void main(String[] args) 
  {
     Scanner scanf = new Scanner(System.in);
     int v1[] = new int[10];
     int pro;
     
     for ( int i = 0; i < v1.length; i++ )
     {
        System.out.println("Digite os valores:");
        v1[i] = scanf.nextInt();
     }
     System.out.println("Digite um numero para procurar:");
     pro = scanf.nextInt();
     scanf.close();
     localizar(v1, pro);
  }
}