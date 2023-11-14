public class Invoice 
{
    private int Numero;
    private String Descricao;
    private int Quantidade;
    private double preco;

    public Invoice(int numeroItem, String descricaoItem, int Quantidade, double preco) 
    {
        this.Numero = numeroItem;
        this.Descricao = descricaoItem;

        // Verifica se a quantidade é positiva, senão, configura como 0
        if (Quantidade > 0) 
        {
            this.Quantidade = Quantidade;
        } 
        else 
        {
            this.Quantidade = 0;
        }

        // Verifica se o preço unitário é positivo, senão, configura como 0.0
        if (preco > 0.0) 
        {
            this.preco = preco;
        } 
        else 
        {
            this.preco = 0.0;
        }
    }


     // Métodos de acesso (getters e setters)
     public int getNumeroItem() 
     {
        return Numero;
    }

    public void setNumeroItem(int numeroItem) 
    {
        this.Numero = numeroItem;
    }

    public String getDescricaoItem() 
    {
        return Descricao;
    }

    public void setDescricaoItem(String descricaoItem) 
    {
        this.Descricao = descricaoItem;
    }

    public int getQuantidade() 
    {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) 
    {
        // Verifica se a quantidade é positiva, senão, configura como 0
        if (Quantidade > 0) 
        {
            this.Quantidade = quantidade;
        } 
        else 
        {
            this.Quantidade = 0;
        }
    }

    public double getPrecoUnitario() 
    {
        return preco;
    }

    public void setPrecoUnitario(double precoUnitario) 
    {
        // Verifica se o preço unitário é positivo, senão, configura como 0.0
        if (preco > 0.0)
        {
            this.preco = precoUnitario;
        } 
        else 
        {
            this.preco = 0.0;
        }
    }

    // Método para calcular o valor da fatura
    public double getInvoiceAmount() 
    {
        return Quantidade * preco;
    }

    // Mostrar na GUI
    public String Mostrar() 
    {
        return "Id: " + this.Numero + ", Descrição: " + this.Descricao + ", Quantidade: " + this.Quantidade
                + ", Preço: " + this.preco + ", Media: " + getInvoiceAmount();
    }

    public static void main(String[] args) 
    {
        Invoice Produto1 = new Invoice(1, "Cheio", 10, 100);
        Invoice Produto2 = new Invoice(2, "Cheio", 10, 200);
        Invoice Produto3 = new Invoice(3, "Cheio", 10, 300);
        Invoice Produto4 = new Invoice(4, "Cheio", 10, 400);
        Invoice Produto5 = new Invoice(5, "Cheio", 10, 500);

        System.out.println(Produto1.Mostrar());
        System.out.println(Produto2.Mostrar());
        System.out.println(Produto3.Mostrar());
        System.out.println(Produto4.Mostrar());
        System.out.println(Produto5.Mostrar());
    }

}