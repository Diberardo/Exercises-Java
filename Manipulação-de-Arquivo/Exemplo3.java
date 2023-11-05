import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo3 
{

    public static void main(String[] args) 
    {
        String fileName = "alunos2.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) 
        {
            String linha;
            while ((linha = br.readLine()) != null) 
            {
                String[] partes = linha.split(", ");
                String nomeAluno = partes[0];
                double nota1 = Double.parseDouble(partes[1]);
                double nota2 = Double.parseDouble(partes[2]);
                double media = (nota1 + nota2) / 2;

                System.out.print("Nome: " + nomeAluno);
                System.out.print(" Média: " + media);
                System.out.println();
            }
        } 
        catch (IOException e) 
        {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
