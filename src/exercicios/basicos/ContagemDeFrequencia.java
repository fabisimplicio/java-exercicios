package exercicios.basicos;
import java.util.Scanner;

public class ContagemDeFrequencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        boolean[] jaImpressos = new boolean[10];

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        
        for(int i = 0; i < numeros.length; i++) {
            if(jaImpressos[i]) {
                continue;
            } 
            
            int cont = 1;
            for(int j = i + 1; j < numeros.length; j++) {
                if(numeros[i] == numeros[j]) {
                    jaImpressos[j] = true;
                    cont++;
                }
            }

            jaImpressos[i] = true;

            System.out.printf("O número %d aparece %d vez(es).\n", numeros[i], cont);
        }

        sc.close();
    }
}
