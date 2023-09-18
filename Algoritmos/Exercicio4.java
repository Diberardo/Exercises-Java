package Algortimo;

import java.util.Scanner;

public class Exercicio4 
{
    public static void main (String[] args)
    {

      Scanner sc=new Scanner(System.in);

      System.out.print ("Digite o primeiro valor: ");
      double n1 = sc.nextDouble();

      System.out.print ("Digite o segundo valor: ");
      double n2 = sc.nextDouble();

      System.out.print ("Escolha uma das opções: 1-média; 2-diferença; 3-produto  ");
     
      int op = sc.nextInt();
      switch(op)
      {
        case 1:
         System.out.println((n1+n2)/2);
         break;
 
         case 2:
          if (n1>n2)
          {
            System.out.println(n1-n2);
          }
          else
          {
            System.out.println(n2-n1);
          }
           break;

           case 3:
           System.out.println(n1*n2);
           default:
           System.out.println ("Erro: opção inválida");
      }
        sc.close();
    }
}
    
