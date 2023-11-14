public class PrincipalEmpregado 
{
    public static void main(String[] args) 
    {
        
        //Criação de 2 instâncias
        Empregado empregado1 = new Empregado("Antonio", "Silva", 2000.00);
        Empregado empregado2 = new Empregado("Maria", "Souza", 5000.00);

        //Exibição do salário anual
        System.out.println("O salário anual de " + empregado1.getPrenome() + " " + empregado1.getSobrenome() + " é de R$" + empregado1.getSalario()*12 +"\n");
        System.out.println("O salário anual de " + empregado2.getPrenome() + " " + empregado2.getSobrenome() + " é de R$" + empregado2.getSalario()*12 +"\n");

        //Exibição do salário anual após aumento de 10%
        empregado1.mostraEmpregado();
        empregado2.mostraEmpregado();
    }
}
