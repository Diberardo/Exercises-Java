import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lista8Exercicio2 
{

    static List<String> criarLista (String arq) { //Função para leitura do arquivo e armazenamento dos dados em estrutura de lista
        List<String> list = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(arq));
            String linha;
            while ((linha = br.readLine()) != null) 
            {
                list.add(linha);
            }
            br.close();
        } 
        catch (IOException e) 
        {
            System.err.println("Erro ao manipular o arquivo: " + e.getMessage());
        }
        return list;
    }

    static void relatorio(List<String> list)
    {
        System.out.println("\nRA    |               Nome               |    P1   |    P2   |    P3   |  Média  |   Conceito");
        System.out.println("-------------------------------------------------------------------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            String[] partes = list.get(i).split(", ");
            String ra = partes[0];
            String nomeAluno = partes[1];
            Double nota1 = Double.parseDouble(partes[2]);
            Double nota2 = Double.parseDouble(partes[3]);
            Double nota3 = Double.parseDouble(partes[4]);
            Double media = ((nota1)+(nota2)+(nota3))/3;
            String conceito = " ";
            if (media >= 8.5)
            {
                conceito = "excelente";
            }
            if (media < 8.5 && media >= 7)
            {
                conceito = "bom";
            }
            if (media < 7 && media >= 5)
            {
                conceito = "regular";
            }
            if (media < 5)
            {
                conceito = "precupante";
            }
            System.out.printf("%4s  |  %-30s  |  %5.2f  |  %5.2f  |  %5.2f  |  %5.2f  |  %-10s  |\n", ra, nomeAluno, nota1, nota2, nota3, media, conceito);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) 
    {
            
            String nomeArquivo = "notas.txt";
            List<String> listaNotas = new ArrayList<>();

            listaNotas = criarLista(nomeArquivo);
            relatorio(listaNotas);
    }
}
