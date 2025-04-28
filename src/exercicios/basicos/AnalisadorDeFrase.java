import java.util.Scanner;

public class AnalisadorDeFrase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        char letra = 'a';
        String[] palavras = frase.split(" ");

        int cont = 0;
        for(int i = 0; i < frase.length(); i++) {
            if(Character.toLowerCase(frase.charAt(i)) == letra) {
                cont++;
            }
        }

        System.out.printf("Número de palavras na frase: %d\nA letra \"a\" aparece %d vez(es) na frase", palavras.length, cont);
        
        sc.close();
    }
}
