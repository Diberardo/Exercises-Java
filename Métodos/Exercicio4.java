import java.util.Scanner;

public class Exercicio4 
{
  public static int Fatorial(int fat)
  {
    int gar = 1; // Inicialize gar com 1
    if (fat == 1)
    {
        return 1; // O fatorial de 1 é 1
    }
    else
    {
        for (int i = fat; i >= 1; i--) // Altere a condição do loop
        {
            gar *= i; // Multiplique os valores para calcular o fatorial
        }
        return gar; // Retorne o resultado do fatorial
    }
  }

  public static void main(String[] args) 
  {
    Scanner scanf = new Scanner(System.in);

    int f, valor;
    do
    {
      System.out.println("Digite um Numero para saber o fatorial:");
      f = scanf.nextInt();
    } while (f <= 0);

    valor = Fatorial(f);

    System.out.println("O fatorial é: " + valor);
    scanf.close();
  }
}
