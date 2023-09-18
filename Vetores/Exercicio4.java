package Vetores;

public class Exercicio4
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        final int n = 100; // quantidade máxima de notas
        double vetor[] = new double[n], nota = 0, soma = 0;
        int i = 0, cont = 0;
        
        System.out.println("Informe as notas ou -1 para encerrar");
        
        for (i = 0; i < n; i++) {
            System.out.println("Nota " + (i + 1) + " :");
            nota = sc.nextDouble();
            
            if (nota == -1) 
            {
                System.out.println("Processo encerrado" + "\n");
                break;
            }
            
            if (nota >= 0 && nota <= 10) 
            {
                vetor[i] = nota;
                cont++;
                soma += nota;
            } else {
                System.out.println("Digite um valor válido entre 0 e 10.");
                i--;
            }
        }
        
        double acimaMedia[] = new double[cont]; // carrega um vetor com valores acima da média
        for (i = 0; i < cont; i++) 
        {
            double am = vetor[i];
            if (am > (soma / cont)) 
            {
                acimaMedia[i] = am;
            }
        }
        
        for (i = cont - 1; i >= 0; i--) { // imprime em ordem inversa
            System.out.println(vetor[i]);
        }

        System.out.println("\n" + "Quantidade de notas lidas:" + cont);
        for (i = 0; i < cont; i++) 
        {
            System.out.print(vetor[i] + "\t");
        }
        
         System.out.println("\n" + "Soma das notas válidas: " + soma);
         System.out.println("Média das notas válidas: " + (soma / cont));
         System.out.println("Notas acima da média: ");

        for (i = 0; i < cont; i++) 
        {
            if (acimaMedia[i] > 0) 
            {
                System.out.print(acimaMedia[i] + "\t");
            }
        }
        sc.close();
    }
}


