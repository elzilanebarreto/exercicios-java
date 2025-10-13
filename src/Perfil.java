import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.printf("Olá, %s!\nTudo bem?", nome);
    }
}