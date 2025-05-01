package exercicios.basicos;
import java.util.Scanner;

public class DobroTriplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        int dobro = 2 * numero;
        int triplo = 3 * numero;

        System.out.printf("dobro: %d; triplo: %d", dobro, triplo);

        sc.close();
    }
}
