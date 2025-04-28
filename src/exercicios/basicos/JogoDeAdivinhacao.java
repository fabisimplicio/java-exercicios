import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        
        Random random = new Random ();
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(1, 100);
        int numero;
        
        int cont = 0;
        do {
            System.out.println("Tente adivinhar o número (entre 1 e 100): ");
            numero = sc.nextInt();
            if(numeroAleatorio > numero) {
                System.out.println("O número é maior!");
            } else if (numeroAleatorio < numero) {
                System.out.println("O número é menor!");
            }
            cont++;
        } while(numero != numeroAleatorio);

        System.out.printf("Parabéns! Você acertou o número em %d tentativa(s).", cont);
        
        sc.close();
    }
}
