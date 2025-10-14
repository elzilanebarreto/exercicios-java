import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.printf("Informe a nota 1: ");
        nota1 = sc.nextDouble();

        System.out.printf("Informe a nota 2: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.printf("Resultado da média das notas\nMédia: %.2f", media);

        sc.close();
    }
}
