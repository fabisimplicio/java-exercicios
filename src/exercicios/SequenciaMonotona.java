import java.util.Scanner;

public class SequenciaMonotona {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();


        if(num1 < num2 && num2 < num3 && num3 < num4) {
            System.out.println("SEQUÊNCIA ESTRITAMENTE CRESCENTE");
        } else if(num1 > num2 && num2 > num3 && num3 > num4) {
            System.out.println("SEQUÊNCIA ESTRITAMENTE DECRESCENTE");
        } else if(num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("SEQUÊNCIA CONSTANTE");
        } else {
            System.out.println("SEQUÊNCIA NÃO ESTRITAMENTE CRESCENTE, DECRESCRENTE OU CONSTANTE.");
        }

        sc.close();

    }
}
