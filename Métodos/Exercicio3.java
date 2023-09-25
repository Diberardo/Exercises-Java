import java.util.Scanner;
public class Exercicio3 
{
    public static double imc(double p, double al)
    {
      double m = p / (al * al);
      return m;
    }
    public static void mostrar(char sexo, double imc)
    {
      if ( sexo == 'M')
      {
        if (imc < 20.7)
        System.out.println("Abaixo do peso");
        else if (imc < 26.4)
        System.out.println("peso normal");
        else if (imc < 27.8)
        System.out.println("marginalmente aciama do peso");
        else if (imc < 32.3)
        System.out.println("acima peso normal");
        else if (imc > 32.3)
        System.out.println("obeso");
      }
      if ( sexo == 'F')
      {
        if (imc < 19.1)
        System.out.println("Abaixo do peso");
        else if (imc < 25.8)
        System.out.println("peso normal");
        else if (imc < 27.3)
        System.out.println("marginalmente aciama do peso");
        else if (imc < 31.1)
        System.out.println("acima peso normal");
        else if (imc > 31.1)
        System.out.println("obeso");
      }
    }
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);
        char sexo;
        double peso, altura,IMC;
        System.out.println("Digite se é M/F");
        sexo = scanf.next().charAt(0);
        System.out.println("Digite o peso");
        peso = scanf.nextDouble(); 
        System.out.println("Digite a altura");
        altura = scanf.nextDouble(); 
        IMC = imc(peso,altura);
        System.out.println("Seu IMC é:" + IMC);
        mostrar(sexo,IMC);
        scanf.close();
    }
}
