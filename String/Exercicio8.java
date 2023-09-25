import java.util.Scanner;

public class Exercicio8
{
  public static void main(String[] args) 
  {
    Scanner scanf = new Scanner(System.in,"latin1");

    for ( ;; )
    {
       System.out.println("Digite uma disciplina: ");
       String dis = scanf.nextLine();

       if ( dis.startsWith("Programação") == true)
       {
        System.out.println("essa disciplina é de programação");
       } 
       else
       {
        System.out.println("essa disciplina nao é de programação");
       }

       System.out.println("deseja sair do loop == 0");
       int sair = scanf.nextInt();

       if (sair == 0 )
       {
        return;
       }
    }
  }    
}
