import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("************************Convertendo a temperatura***********************");
        System.out.printf("Digite a temperatura em °Celsius: ");
        double temperatura = sc.nextDouble();

        double temperaturaEmFahrenheit = (int) (temperatura * 1.8) + 32;

        System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("Temperatura em Fahrenheit: " + temperaturaEmFahrenheit);
    }
}
