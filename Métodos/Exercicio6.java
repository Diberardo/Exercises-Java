import java.util.Scanner;

public class Lista6Exercicio1 
{
    static int somaVetor(int [] v)
    {
        int soma = 0;
        int i;
        for (i=0; i<v.length; i++)
        {
            soma = soma + v[i];
        }
        return soma;
    }
    public static void main(String[] args) 
    {
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade desejada de elementos do vetor de inteiros: ");
        n = entrada.nextInt();

        int vet []= new int [n];
        for (int i=0; i<vet.length; i++)
        {
            System.out.println("Digite o elemento " + (i+1) + ": ");
            vet[i] = entrada.nextInt();
        }
        entrada.close();
        int soma = somaVetor(vet);
        System.out.println("A soma dos elementos do vetor digitado é: " + soma + ".");
    }
}
