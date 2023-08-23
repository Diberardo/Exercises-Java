import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int a = 0, b = 0, r = 0 ;
        
        Scanner sc = new Scanner (System.in);
            do
            {
            System.out.print("Digite o Dividendo = ");
            a = sc.nextInt();
            System.out.print("Digite o Divisor = ");
            b = sc.nextInt();
            sc.close();
            } while (  a < b ); 

        while (a % b != 0) 
        {
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println("Valor MDC: " + b);
    }
}
