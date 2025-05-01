package exercicios.basicos;
import java.util.Scanner;

public class Wally {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String entrada;
        
        while(!(entrada = sc.nextLine()).equals("wally")) {
            String[] nomes = entrada.split(" ");

            String possivelNome = "?";
            for(String nome : nomes) {
                if(nome.length() == 5) {
                    possivelNome = nome;
                }
            }

            System.out.println(possivelNome);
        }
        
        sc.close();
    }
}