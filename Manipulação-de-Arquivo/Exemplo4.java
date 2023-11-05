import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo4 {

    public static void main(String[] args) 
    {
        String nomeArquivo = "alunos.txt";
        String alunoMaiorNota = "";
        double maiorNota = 0.0;

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) 
        {
            String linha;
            while ((linha = br.readLine()) != null) 
            {
                String[] partes = linha.split(", ");
                String nomeAluno = partes[0];
                double nota1 = Double.parseDouble(partes[1]);
                double nota2 = Double.parseDouble(partes[2]);
                double media = (nota1 + nota2) / 2;

                if (media > maiorNota) 
                {
                    maiorNota = media;
                    alunoMaiorNota = nomeAluno;
                }
            }

            if (!alunoMaiorNota.isEmpty()) 
            {
                System.out.println("Aluno com a maior nota: " + alunoMaiorNota);
                System.out.println("Média: " + maiorNota);
            } 
            else 
            {
                System.out.println("Nenhum aluno encontrado.");
            }

        } 
        catch (IOException e) 
        {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
