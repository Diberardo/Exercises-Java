import java.util.Scanner;

/**
 * Lista5.Exercicio1
 */

public class Lista5Exercicio1 {
    
    public static void verificar(int valor) {
        if (valor == 0) {
            System.out.println("O número é nulo.");
        } else if (valor%2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = entrada.nextInt();
        entrada.close();
        verificar(num);
    }
}
