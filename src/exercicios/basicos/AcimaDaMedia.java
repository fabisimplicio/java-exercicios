package exercicios.basicos;
import java.util.Scanner;
import java.util.HashSet;

public class AcimaDaMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] numeros = sc.nextLine().split(" ");
        
        HashSet<Integer> listaDeNumeros= new HashSet<>();

        double soma = 0;

        for(int i = 0; i < numeros.length; i++) {
            soma += Integer.parseInt(numeros[i]);
            listaDeNumeros.add(Integer.parseInt(numeros[i]));
        }

        double media = soma / numeros.length;

        for(int num : listaDeNumeros) {
            if (num > media) {
                System.out.print(num + " ");
            }

        }   

        sc.close();
    }
}
