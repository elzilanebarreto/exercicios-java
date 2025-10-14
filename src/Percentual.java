/*
Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
representando o preço original de um produto. Em seguida, declare uma variável do tipo double
percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para
10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço
com desconto.
*/

import java.util.Scanner;

public class Percentual {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double precoOriginal, percentualDesconto, valorComDesconto, novoPreco;

        System.out.printf("Informe o preço original: ");
        precoOriginal = sc.nextDouble();

        System.out.printf("Informe o percentual: ");
        percentualDesconto = sc.nextDouble();

        valorComDesconto = precoOriginal * (percentualDesconto / 100);

        novoPreco = precoOriginal - valorComDesconto;

        System.out.printf("Preço original: R$ %.2f\nDesconto: %.2f\nNovo preço: R$%.2f", precoOriginal, valorComDesconto, novoPreco);

        sc.close();
    }
}
