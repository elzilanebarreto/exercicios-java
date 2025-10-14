import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe um número inteiro: ");
        int numero = sc.nextInt();

        int fatorial = 1;

        for (int i  = 1; i <= numero; i++){
            fatorial *= i;
        }

        System.out.printf("%d! = %d", numero, fatorial);

        sc.close();
    }
}
