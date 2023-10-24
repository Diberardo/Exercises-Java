import java.util.Scanner;

public class Exercicio2 
{
  public static void Verificar(double is, double js) throws Exception
  {
    if ( is > 2 || js > 2 )
    {
        throw new Exception ("Indice Invalido");
    }
  }
  public static void main(String[] args) 
  {
    Scanner scanf = new Scanner(System.in);
    int m1[][] = new int[2][2];
    int is = 0, js = 0;
    
    for ( int i = 0; i < m1.length; i++ )
    {
        System.out.println("\n");
        for ( int j = 0; j < m1[i].length; j++ )
        {
            System.out.println("Digite a posição [" + i + "][" + j + "]");
            m1[i][j] = scanf.nextInt();
        }
    }
    System.out.println("\n");
    System.out.println("Agora digite Um indice para ver I:");
    is = scanf.nextInt();
    System.out.println("Agora digite Um indice para ver J:");
    js = scanf.nextInt();
    try
    {
        Verificar(is,js);
        System.out.println("I e J: " + m1[is][js]);
    }
    catch (Exception e )
    {
        System.out.println(e);
    }
    finally
    {
        System.out.println("\n");
      System.out.println("Esse Script terminou");   
      scanf.close();
    }
    
  }   

}