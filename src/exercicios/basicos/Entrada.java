package excecoes;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Entrada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try {
            int numero = sc.nextInt();
            System.out.println(numero);
        } catch (InputMismatchException e) {
            System.out.println("Digite um número válido.");
        }

        sc.close();
        
    }
}
