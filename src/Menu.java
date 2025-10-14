/*Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado"
e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo
da área com base na opção selecionada.*/

import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean situacao = true;
        int escolha;

        while (situacao){
            System.out.println("----------------Menu----------------");
            System.out.println("1 - Calcular área do quadrado");
            System.out.println("2 - Calcular área do círculo");
            System.out.println("0 - Sair");

            System.out.println("Informe o número da sua escolha: ");
            escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    System.out.printf("Digite o valor da medida do lado do quadrado (cm): ");
                    double lado = sc.nextDouble();

                    double areaDoQuadrado = Math.pow(lado, 2);

                    System.out.printf("A área do quadrado é: %.2f cm²\n", areaDoQuadrado);
                    break;

                case 2:
                    System.out.printf("Digite o valor do raio do círculo: ");
                    double raio = sc.nextDouble();

                    double areaDoCirculo = Math.PI * Math.pow(raio, 2);

                    System.out.printf("A área do círculo é: %.2f\n", areaDoCirculo);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    situacao = false;
                    break;

                default:
                    System.out.println("Dado inválido!");

            }

        }

        sc.close();
    }
}
