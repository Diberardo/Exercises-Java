import java.util.Scanner;

public class Lista7Exercicio1 {

    public static void verifOp(String s) throws Exception
    {
        if(s.compareTo("+") != 0 && s.compareTo("-") != 0 && s.compareTo("*") != 0 && s.compareTo("/") != 0)
        {
            throw new Exception("\nOperador inválido.\nDigite o símbolo da operação desejada (+, -, * ou /): ");
        }
    }     
    
    public static void main(String[] args) 
    {
        
        Scanner scanf = new Scanner(System.in);
        boolean concluido = false; // variável criada para verificar se pode finalizar a execução do código
        int res = 0, n1 = 0, n2 = 0;
        String simbol = "";
        String s;
        
        while (!concluido)
        {
            System.out.println("Digite o primeiro operando: ");
            s = scanf.nextLine();
            try
            {
                n1 = Integer.parseInt(s);
                concluido = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("\nValor inválido, digite novamente.\n");
            }
        }
        concluido = false;
             
        while (!concluido)
        {
            System.out.println("\nDigite o segundo operando: ");
            s = scanf.nextLine();
            try
            {
                n2 = Integer.parseInt(s);
                concluido = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("\nValor inválido, digite novamente.\n");
            }
        }
        concluido = false;
        while(!concluido)
        {
            while (!concluido)
            {

                System.out.println("\nDigite o símbolo da operação desejada (+, -, * ou /): ");
                simbol = scanf.nextLine();
                try
                {
                    verifOp(simbol); 
                }
                catch (Exception e)
                {   
                    System.out.println(e.getMessage());
                }
                if(simbol.compareTo("+") == 0 || simbol.compareTo("-") == 0 || simbol.compareTo("*") == 0 || simbol.compareTo("/") == 0)
                {
                        concluido = true;
                }
            }
            concluido = false;
            
            switch (simbol)
            {
                case "+":
                    res = n1 + n2;
                    concluido = true;
                    break;
                case "-":
                    res = n1 - n2;
                    concluido =true;
                    break;
                case "*":
                    res = n1 * n2;
                    concluido = true;
                    break;
                case "/":
                    try
                    {
                        res = n1/n2;
                        concluido = true;
                    }
                    catch(ArithmeticException e)
                    {
                        System.out.println("\nNão é permitida divisão por zero. Tente outro operador: \n");
                    }
                    break;
            }    
            if (!(n2 == 0 && simbol != "/")){
                    concluido = true;
            }
        }
        scanf.close();    
        System.out.println("\nO resultado da operação é: " + res + "\n");
    }    
}
