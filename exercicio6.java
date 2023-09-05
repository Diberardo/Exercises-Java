import java.util.Scanner;

public class exercicio6 
{
   public static void main(String[] args) 
   {
    Scanner scanf = new Scanner(System.in);
     double[] v1 = new double[3];
     double[] v2 = new double[3];
     double[] v3 = new double[6];
     double m1 = 0,m2 = 0;
     int i;
      
     for ( i = 0; i < 3; i++ )
     {
        System.out.println("Digite o Primeiro vertor em Numeros reais");
        v1[i] = scanf.nextDouble();
        m1 += v1[i];
     }
     for ( i = 0; i < 3; i++ )
     {
        System.out.println("Digite o Segundo vertor em Numeros reais");
        v2[i] = scanf.nextDouble();
        m2 += v2[i];
     }
     scanf.close();
     if (m1 < m2) {
        for ( i = 0; i < 3; i++) {
            v3[i] = v2[i];
            v3[i + 3] = v1[i];
        }
    } else {
        for ( i = 0; i < 3; i++) {
            v3[i] = v1[i];
            v3[i + 3] = v2[i];
        }
   } 
   for (double num : v3 )
   {
       System.out.print("\t" + num);
   }
   scanf.close();
}
}
