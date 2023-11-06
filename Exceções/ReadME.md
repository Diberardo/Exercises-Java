# Programa de Exercícios em Java

Este repositório contém um conjunto de exercícios em Java para fins de prática. Cada exercício é detalhado abaixo.

## Exercício 1 - Soma

**Descrição:**
Faça um programa que simule a entrada de uma calculadora com as operações básicas. Caso a expressão esteja correta, a operação é realizada e o resultado será mostrado. Caso a expressão esteja errada, deverá ter o tratamento de exceção adequado. Exemplos: 
```
Digite um número: 3 
Operação: + 
Digite um número: 2 
Resultado: 5 
Digite um número: 3 
Operação: & 
Digite um número: 2 
Operador inválido! 
Digite um número: 3 
Operação: + 
Digite um número: a 
Número inválido 
```
## Exercício 2 - Indice de Vetor

**Descrição:**
Faça um programa que tenha um método imprimePosicao(matriz,índice_linha, índice_coluna), que tem como função imprimir o valor de uma posição de uma matriz. Faça o tratamento específico para o caso de o índice não ser válido para a matriz. 

## Exercício 3 - Erros Possiveis 

**Descrição:**
Analise o código abaixo e veja quais são os possíveis erros que podem ocorrer, em relação de entrada de dados. Depois, faça o tratamento de exceção necessário. 

    Scanner entrada = new Scanner(System.in); 
    int num; 
    String str; 
    System.out.print("Digite um número: "); 
    str = entrada.nextLine(); 
    num = Integer.parseInt(str); 
    System.out.println("Num: "+num);

