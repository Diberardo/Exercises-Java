import java.util.Scanner;

public class Exercicio3
{
    public static void main(String[] args)
    {
        
      Scanner scanf = new Scanner (System.in);
      double[] n1 = new double[10];
      double[] n2 = new double[10];
      double[] n3 = new double[10];
      double[] m = new double[10];
      double[] fre = new double[10];
      double[] frequenciatotal = new double[10];
      double mediageral = 0,maior = 0,menor = 0,aux = 0;
      int aulasto = 0,i,repro = 0,apro = 0 ;
      int[] numerodamatri = new int[10];

      for ( i = 0; i < 10; i++ )
      {
        System.out.print("Digite numero da matricula:\t");
        numerodamatri[i] = scanf.nextInt();
        System.out.print("Digite sua primeira nota:\t" + i);
        n1[i] = scanf.nextDouble();
        System.out.println("Digite sua primeira segunda:\t" + i);
        n2[i] = scanf.nextDouble();
        System.out.println("Digite sua primeira terceira:\t" + i);
        n3[i] = scanf.nextDouble();
        scanf.close();
        if ( i == 0)
        {
        System.out.print("Digite sua aulas totais:\t" + i);
        aulasto = scanf.nextInt();
        }
        System.out.print("Digite sua frequencia:\t" + i);
        fre[i] = scanf.nextDouble();
          mediageral = n1[i] + n2[i] + n3[i]; // calcula a media geral
      }
         mediageral += mediageral * 3; //acumula com as notas geral
         mediageral = mediageral / 3; //calcula a media geral
      for ( i = 0; i < 10; i++ )
      {
        m[i] = (n1[i] + n2[i] + n3[i]) / 3; //media aluno
        frequenciatotal[i] = fre[i] / aulasto; //frequncia  aluno
        maior = m[0];
        menor = maior;
        if (maior < m[i]) maior = m[i]; // maior nota
        if ( menor > m[i]) menor = m[i]; // menor nota
      }
      for ( i = 0; i < 10; i++ )
      {
         System.out.println("Media da sala\t" + mediageral);
          System.out.println("Numero da inscisao do aluno\t" + numerodamatri[i]);
           System.out.println("Media do Aluno\t" + m[i]);
             System.out.println("Frequncia do aluno:\t" + frequenciatotal);
              aux = (n1[i] + n2[i] + n3[i]) / 3;
              if (aux < 6 || frequenciatotal[i] < 0.75)
              {
                System.out.println("reprovado");
                repro++;
              }
              else 
              {
                  System.out.println("Aprovado");
                  apro++;
              }
      } 
        System.out.println("Maior nota da sala:\t" + maior);
        System.out.println("Menor nota da sala:\t" + menor);
        System.out.println("Aprovados:\t" + apro);
        System.out.println("Reprovado\t" + repro);
    }
}
