import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo1 
{

    public static void main(String[] args) 
    {
        String nomeArquivo = "alunos.txt";
        String novaLinha = "João, 8.5, 10.0";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo, true))) 
        {
            bw.write(novaLinha);
            bw.newLine();
            System.out.println("Linha adicionada com sucesso.");
        } 
        catch (IOException e) 
        {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
