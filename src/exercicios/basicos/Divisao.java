package exercicios.basicos;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            double resultado = num1 / num2;

            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        }

        sc.close();
        
    }
}
