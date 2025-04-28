package exercicios.basicos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String operacao = sc.nextLine();

        switch(operacao) {
            case "+", "-", "*", "/":
                double num1 = sc.nextDouble();
                double num2 = sc.nextDouble();
                    
                switch(operacao) {
                    case "+":
                        System.out.println(num1 + num2);
                        break;
                    case "-":
                        System.out.println(num1 - num2);
                        break;
                    case "*":
                        System.out.println(num1 * num2);
                        break;
                    case "/":
                        if(num2 != 0) {
                            System.out.println(num1 / num2);
                        } else {
                            System.out.println("ERRO: Divisão por zero.");
                        }
                        break;
                }
                break;
            default:
                System.out.println("ENTRADA INVÁLIDA");
        }

        sc.close();

    }
}
