import java.util.Scanner;

public class PrecoProduto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double preco;
        int quantidade;

        System.out.printf("Informe o preço do produto: ");
        preco = sc.nextDouble();

        System.out.printf("Informe a quantidade de produto: ");
        quantidade = sc.nextInt();

        double total = preco * quantidade;

        System.out.printf("\nPreço total de produto R$ %.2f", total);
    }
}
