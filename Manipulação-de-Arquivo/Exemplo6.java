import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exemplo6 
{

    public static void main(String[] args) 
    {
        String nomeArquivo = "alunos.txt";
        String nomeBusca = "João";
        double novaNota1 = 10.0;
        double novaNota2 = 10.0;

        try 
        {
            List<String> linhas = new ArrayList<>();

            // Lê o arquivo e armazena as linhas em uma lista
            BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            while ((linha = br.readLine()) != null) 
            {
                linhas.add(linha);
            }
            br.close();

            boolean alunoEncontrado = false;

            // Percorre as linhas e atualiza as notas do aluno se encontrado
            for (int i = 0; i < linhas.size(); i++) 
            {
                String[] partes = linhas.get(i).split(", ");
                String nomeAluno = partes[0];

                if (nomeAluno.equalsIgnoreCase(nomeBusca)) 
                {
                    partes[1] = String.valueOf(novaNota1);
                    partes[2] = String.valueOf(novaNota2);
                    linhas.set(i, String.join(", ", partes));
                    alunoEncontrado = true;
                    break; // Não é necessário continuar procurando
                }
            }

            if (alunoEncontrado) 
            {
                // Escreve as linhas atualizadas no arquivo
                BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo));
                for (String linhaAtualizada : linhas) 
                {
                    bw.write(linhaAtualizada);
                    bw.newLine();
                }
                bw.close();

                System.out.println("Notas do aluno atualizadas com sucesso.");
            } 
            else 
            {
                System.out.println("O aluno não foi encontrado no arquivo.");
            }

        } 
        catch (IOException e) 
        {
            System.err.println("Erro ao manipular o arquivo: " + e.getMessage());
        }
    }
}
