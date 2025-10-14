import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, subt;

        System.out.println("Digite um número: ");
        num1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        num2 = sc.nextInt();

        subt = num1 - num2;

        System.out.printf("Subtração de %d - %d = %d", num1, num2, subt);

        sc.close();

    }
}