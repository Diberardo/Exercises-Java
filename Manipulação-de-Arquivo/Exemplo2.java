import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo2 
{

    public static void main(String[] args) 
    {
        String nomeArquivo = "alunos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) 
        {
            String linha;
            while ((linha = br.readLine()) != null) 
            {
                String[] partes = linha.split(", ");
                String nomeAluno = partes[0];
                double nota1 = Double.parseDouble(partes[1]);
                double nota2 = Double.parseDouble(partes[2]);

                System.out.print("Nome: " + nomeAluno);
                System.out.print(" Nota 1: " + nota1);
                System.out.print(" Nota 2: " + nota2);
                System.out.println();
            }
        } 
        catch (IOException e) 
        {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
