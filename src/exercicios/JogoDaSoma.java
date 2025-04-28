import java.util.Scanner;
import java.util.Random;

public class JogoDaSoma {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        int soma = 0;
        for(int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.print("Números gerados: ");
        for(int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        int resposta;

        do {
            System.out.print("Qual é a soma dos números? ");
            resposta = sc.nextInt();
            if(resposta == soma) {
                System.out.println("Parabéns! Você acertou a soma.");
            } else {
                System.out.println("Errado! A diferença é de " + (soma - resposta) + ". Tente novamente.");
            }
        } while(resposta != soma);

        sc.close();

    }
}