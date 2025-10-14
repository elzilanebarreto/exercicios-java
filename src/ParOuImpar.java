/*Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se
o número é par ou ímpar e exiba uma mensagem correspondente.
 */

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe um número inteiro: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("Número é par.");
        } else {
            System.out.println("Número é ímpar.");
        }

        sc.close();
    }
}
