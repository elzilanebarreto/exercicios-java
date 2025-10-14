import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if(numero > 0){
            System.out.println("Número positivo");
        } else if (numero == 0) {
            System.out.println("O número é zero");
        } else {
            System.out.println("Número negativo");
        }

        sc.close();
    }
}
