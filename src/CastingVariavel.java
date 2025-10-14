import java.util.Scanner;

public class CastingVariavel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double primeiraVar;
        int segundaVar;

        System.out.println("Digite um número: ");
        primeiraVar = sc.nextDouble();

        segundaVar = (int) primeiraVar;

        System.out.printf("Resultado do número real %.2f para inteiro: %d", primeiraVar, segundaVar);
    }
}
