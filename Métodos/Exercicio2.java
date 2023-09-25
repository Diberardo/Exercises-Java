import java.util.Scanner;

public class Lista5Exercicio2 {

    public static void imc(char s, double a, double p) {
        double indice;
        indice = p / (a * a);
        System.out.printf("\nO seu Índice de Massa Corpórea (IMC) é: %.2f\n\n", indice);
        if (s == 'M'){
            if (indice < 20.7) {
                System.out.println("Você está abaixo do peso.\n");
            } else if (20.7 <= indice && indice < 26.4) {
                System.out.println("Você está no peso normal.\n");
            } else if (26.4 <= indice && indice < 27.8) {
                System.out.println("Você está marginalmente acima do peso.\n");
            } else if (27.8 <= indice && indice < 32.3) {
                System.out.println("Você está acima do peso ideal.\n");
            } else if (32.3 <= indice) {
                System.out.println("Você está obeso.\n");
            }
        }
        if (s == 'F'){
            if (indice < 19.1) {
                System.out.println("Você está abaixo do peso.\n");
            } else if (19.1 <= indice && indice < 25.8) {
                System.out.println("Você está no peso normal.\n");
            } else if (25.8 <= indice && indice < 27.3) {
                System.out.println("Você está marginalmente acima do peso.\n");
            } else if (27.3 <= indice && indice < 31.1) {
                System.out.println("Você está acima do peso ideal.\n");
            } else if (31.1 <= indice) {
                System.out.println("Você está obeso.\n");
            }
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o seu sexo (M/F)? ");
        char sexo = entrada.next().toUpperCase().charAt(0);
        System.out.println("Qual é a sua altura em metros? ");
        double alt = entrada.nextDouble();
        System.out.println("Qual é o seu peso em Kg? ");
        double peso = entrada.nextDouble();
        entrada.close();
        imc(sexo, alt, peso);

    }

}
