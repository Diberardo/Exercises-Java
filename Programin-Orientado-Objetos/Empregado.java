public class Empregado 
{
    
    //Atributos sa classe
    private String prenome;
    private String sobrenome;
    private double salario;

    //método construtor
    public Empregado(String prenome, String sobrenome, double salario)
    {
        this.prenome = prenome;
        this.sobrenome = sobrenome;
        if (salario < 0) 
        {
            this.salario = 0.0;
        }
        else
        {
            this.salario = salario;
        }
    }

    //métodos da classe
    
    //métodos getter
    public String getPrenome()
    {
        return this.prenome;
    }

    public String getSobrenome()
    {
        return this.sobrenome;
    }

    public double getSalario()
    {
        return this.salario;
    }

    //métodos setter
    public void setPrenome(String novoPrenome)
    {
        this.prenome = novoPrenome;
    }

    public void setSobrenome(String novoSobrenome)
    {
        this.sobrenome = novoSobrenome;
    }

    public void setSalario(double novoSalario)
    {
        this.salario = novoSalario;
    }

    private void aumentaSalario()
    {
        this.salario *= 1.1;
    }

    public void mostraEmpregado()
    {
        aumentaSalario();
        System.out.println("O salário anual de "+ this.prenome +" "+ this.sobrenome + " é de R$ " + 12*this.salario + "\n");
    }
}
