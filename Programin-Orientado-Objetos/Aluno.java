public class Aluno
{
    private String nome;
    private String Curso;
    private int serie;
    private int RA;
    private double n1;
    private double n2;
    

    // Construtor
    public Aluno (String nome, String Curso, int serie, int RA, double n1, double n2) 
    {
        this.nome = nome;
        this.Curso = Curso;
        this.serie = serie;
        this.RA = RA;
        this.n1 = n1;
        this.n2 = n2;
    }

    // Métodos para definir o nome e a idade
    public void definirNome(String novoNome) 
    {
        this.nome = novoNome;
    }
    public void definirCurso(String novoCurso) 
    {
        this.Curso = novoCurso;
    }
    public void definirSerie(int novaserie) 
    {
        this.serie = novaserie;
    }
    public void definirRA(int novoRA) 
    {
        this.RA = novoRA;
    }
    public void definirN1(int novoN1) 
    {
        this.n1 = novoN1;
    }
    public void definirN2(int novoN2) 
    {
        this.n2 = novoN2;
    }
    // Método para calcular a média de notas
    public double calcularMedia() 
    {
        return (this.n1 + this.n2) / 2.0;
    }

    // Método para obter informações
    public String obterInformacoes() 
    {
        return "Nome: " + this.nome + ", Curso: " + this.Curso + ", Serie: " + this.serie + ", RA: " + this.RA
                + ", N1: " + this.n1 + ", N2: " + this.n2 + ", Média: " + calcularMedia();
    }

    public static void main(String[] args) 
    {
        // Exemplo de uso da classe Aluno
        Aluno aluno1 = new Aluno("João", "ADS", 2, 49, 10, 9);
        Aluno aluno2 = new Aluno("Maria", "GAM", 4, 16, 7.5, 10);

        System.out.println(aluno1.obterInformacoes());
        System.out.println(aluno2.obterInformacoes());
    }
}


