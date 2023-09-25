import java.util.Scanner;

public class Lista5Exercicio5 
{
      public static int forma1(int h)
      {
         int seg;
         seg = h * 3600;
         return seg;
      }
      public static int forma2(int h,int m)
      {
         int seg;
         seg = h * 3600 + m * 60;
         return seg;
      }
      public static int forma3(int h,int m,int s)
      {
         int seg;
         seg = h * 3600 + m * 60 + s;
         return seg;
      }
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);
        int n;
        int h,m,s;
        int td = 01;
        System.out.println("Digite o formato do tempo:  (1) hora (2) hora e min (3) hora, min e seg" );
        n = scanf.nextInt();
        switch (n) 
        {
            case 1:
                System.out.println("Digite a hora:");
                h = scanf.nextInt();
                td = forma1(h);
                break;
            case 2:
                System.out.println("Digite a hora: ");
                h = scanf.nextInt();
                System.out.println("Digitar os minutos:");
                m = scanf.nextInt();
                td = forma2(h, m);
                break;
            case 3:
                System.out.println("Digite as hora:");
                h = scanf.nextInt();
                System.out.println("Digitar os minutos:");
                m = scanf.nextInt();
                System.out.println("Digitar os segundos:");
                s = scanf.nextInt();
                td = forma3(h, m , s);
                break;
        }
        
        System.out.println("Total de segundo:" + td);
        
    }
}
