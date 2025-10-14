//Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10


import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe um número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", numero, i, numero * i);
        }

        sc.close();
    }
}
