import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo5 
{

    public static void main(String[] args) 
    {
        String nomeArquivo = "alunos2.txt";
        String nomeBusca = "Maria";

        try 
        {
            // Cria um arquivo temporário
            File arqTemp = new File("temp.txt");
            FileWriter fw = new FileWriter(arqTemp, true);
            BufferedWriter bw = new BufferedWriter(fw);

            FileReader fr = new FileReader(nomeArquivo);
            BufferedReader br = new BufferedReader(fr);

            String linha;
            boolean alunoEncontrado = false;

            while ((linha = br.readLine()) != null) 
            {
                String[] parts = linha.split(", ");
                String nomeAluno = parts[0];

                // Verifica se o nome do aluno corresponde à busca
                if (nomeAluno.equalsIgnoreCase(nomeBusca)) 
                {
                    alunoEncontrado = true;
                } 
                else 
                {
                    bw.write(linha);
                    bw.newLine();
                }
            }

            br.close();
            bw.close();

            // Remove o arquivo original
            File arq = new File(nomeArquivo);
            arq.delete();

            // Renomeia o arquivo temporário para o nome original
            arqTemp.renameTo(arq);

            if (alunoEncontrado) 
            {
                System.out.println("Linha deletada com sucesso.");
            } 
            else 
            {
                System.out.println("O nome buscado não foi encontrado no arquivo.");
            }

        } 
        catch (IOException e) 
        {
            System.err.println("Erro ao manipular o arquivo: " + e.getMessage());
        }
    }
}
