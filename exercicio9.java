import java.util.Scanner;

public class exercicio9 
{
    public static void main(String[] args) 
    {
      Scanner scanf = new Scanner (System.in);
      int Can1 = 0,Can2 = 0,Can3 = 0,Can4 = 0,nulo = 0,branco = 0,total = 0;
      do
      {
        System.out.print("Digite quantos Eletores:");
        total = scanf.nextInt();
      } while( total <= 0 );
      System.out.print("Codigos sao: 1,2,3,4,Branco e Nulo ");
      for( int i = 0; i < total; i++ )
      {
        System.out.println("Digite o codigo do Candidato:");
        int CanEscolido = scanf.nextInt();
        switch(CanEscolido)
        {
            case 1:
                 Can1 = Can1 + 1;
                 break;
            case 2:
                 Can2 = Can2 + 1;
                 break;
            case 3:
                 Can3 = Can3 + 1;
                 break;
            case 4:
                 Can4 = Can4 + 1;
                 break;
            case 5:
                 branco = branco + 1;
                 break;
            case 6:
                 nulo = nulo + 1;
                 break;            
        }
      }
    System.out.print("Candidato 1:" + Can1);
    System.out.print("Candidato 2:" + Can2);
    System.out.print("Candidato 3:" + Can3);
    System.out.print("Candidato 4:" + Can4);
    System.out.print("Nulo:" + nulo);
    System.out.print("branco:" + branco);
    
    System.out.print("Finalizar a Seção digite 0");
    int finali = scanf.nextInt();
    scanf.close();
    if ( finali == 0) return;
    
    }
    
}
