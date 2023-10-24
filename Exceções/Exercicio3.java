import java.util.Scanner;

public class Exercicio3 
{
    public static void main(String[] args) 
    {
    Scanner entrada = new Scanner(System.in); 

    int num; 
    String str; 

    System.out.print("Digite um número: "); 
    str = entrada.nextLine(); 

      if (str.isEmpty()) 
      {
         System.out.println("Erro: A entrada está vazia. Por favor, digite um número inteiro.");
      } 
      else 
      {
      try 
      {
        num = Integer.parseInt(str);
        System.out.println("Num: " + num);
       } 
      catch (NumberFormatException e) 
      {
        System.out.println("Erro: Entrada inválida. Certifique-se de digitar um número inteiro.");
      }
      finally
      {
        System.out.println("\nEsse Scripti Terminou");
        entrada.close();
      }
   }
}
}


