/*Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório
entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou
menor do que o número gerado.

- Dicas:
    Para gerar um número aleatório em Java: new Random().nextInt(100);
    Utilize o Scanner para obter os dados do usuário;
    Utilize uma variável para contar as tentativas;
    Utilize um loop para controlar as tentativas;
    Utilize a instrução break; para interromper o loop.
*/

import java.util.Random;
import java.util.Scanner;

public class jogoDeAdivinhacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeroDaSorte = new Random().nextInt(10);
        int tentativas = 0, numeroDeEscolha = 0;

        while (tentativas < 5){
            System.out.printf("Informe o número escolhido: ");
            numeroDeEscolha = sc.nextInt();

            if(numeroDeEscolha > numeroDaSorte){
                System.out.println("É número menor");
            }
            else if (numeroDeEscolha < numeroDaSorte) {
                System.out.println("É número maior");
            }
            else {
                System.out.println("Parabéns! Você acertou o número era " + numeroDaSorte);
                break;
            }

            tentativas++;

            if (tentativas == 5 && numeroDeEscolha != numeroDaSorte) {
                System.out.printf("Você não conseguiu acertar o número em 0%d tentativas. O número era: %d", tentativas, numeroDaSorte);
            }
        }

        sc.close();
    }
}
