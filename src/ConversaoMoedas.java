/*
Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em
dólares para reais e imprima o resultado formatado.
*/

import java.util.Scanner;

public class ConversaoMoedas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valorEmDolares, valorEmReais, taxaDeConversao = 4.94;

        System.out.printf("Informe o valor em dólar: ");
        valorEmDolares = sc.nextDouble();

        valorEmReais = taxaDeConversao * valorEmDolares;

        System.out.printf("Valor em Dólar: U$%.2f\nValor em Reais: R$%.2f", valorEmDolares, valorEmReais);
    }
}
