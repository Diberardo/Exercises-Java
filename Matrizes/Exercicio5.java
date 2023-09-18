import java.util.Scanner;

public class Exercicio5 
{
    public static void main(String[] args) 
    {

        float notas[][] = new float[10][5];
        float mediaAluno[] = new float[10];
        float somaMedias = 0, mediaClasse = 0;
        String sitAluno[] = new String[10];

        Scanner entrada = new Scanner(System.in);

        for (byte i = 0; i < notas.length; i++) 
        {
            float somaNotas = 0;

            for (byte j = 0; j < notas[i].length; j++) 
            {
                System.out.println("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
                notas[i][j] = entrada.nextFloat();
                somaNotas += notas[i][j];
            }
            mediaAluno[i] = somaNotas / notas[i].length;

            if (mediaAluno[i] >= 5) 
            {
                sitAluno[i] = "Aprovado";
            } 
            else 
            {
                sitAluno[i] = "Reprovado";
            }
            
            somaMedias += mediaAluno[i];
        }
        mediaClasse = somaMedias / notas.length;
        entrada.close();

        /*
         Método para verificar todo conteúdo da matriz em formato de String
         System.out.println(Arrays.deepToString(notas));
         */

        for (byte i = 0; i < notas.length; i++) 
        {
            System.out.println("A média do aluno " + (i + 1) + " foi: " + mediaAluno[i] + " (" + sitAluno[i] + ")");
        }
        System.out.println("\nA média da classe foi: " + mediaClasse + "\n");
    }
}


