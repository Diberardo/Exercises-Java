import java.util.Scanner;

public class Exercicio5 
{
    public static void main(String[] args) 
    {
        String digito = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        String numero = entrada.nextLine();
        entrada.close();
        System.out.println("Os dígitos do número digitado são (por extenso):");
        for (byte i = 0; i < numero.length(); i++) 
        {
            switch (numero.charAt(i)) 
            {
                case '0':
                    digito = "zero";
                    break;
                case '1':
                    digito = "um";
                    break;
                case '2':
                    digito = "dois";
                    break;
                case '3':
                    digito = "três";
                    break;
                case '4':
                    digito = "quatro";
                    break;
                case '5':
                    digito = "cinco";
                    break;
                case '6':
                    digito = "seis";
                    break;
                case '7':
                    digito = "sete";
                    break;
                case '8':
                    digito = "oito";
                    break;
                case '9':
                    digito = "nove";
                    break;
            }
            if (i < numero.length() - 1) 
            {
                System.out.print(digito + ", ");
            } 
            else 
            {
                System.out.print(digito + "\n");
            }
        }
    }
}
