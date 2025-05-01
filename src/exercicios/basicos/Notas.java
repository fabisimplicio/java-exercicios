package exercicios.basicos;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        String entrada;

        double maiorNota = 0;
        double menorNota = 1000;
        double somaNotas = 0;
        int acimaDaMedia = 0;
        int abaixoDaMedia = 0;
        int numAlunos = 0;


        while (!(entrada = sc.nextLine()).equals("-")) {
            String[] nomeNota = entrada.split(" ");

            int nota = Integer.parseInt(nomeNota[1]);
            somaNotas += nota;

            if(nota > maiorNota) {
                maiorNota = nota;
            }
            
            if (nota < menorNota) {
                menorNota = nota;
            }

            if(nota >= 700) {
                acimaDaMedia++;
            } else {
                abaixoDaMedia++;
            }

            numAlunos++;

        }

        double media = somaNotas / numAlunos;

        System.out.printf("Maior nota: %.1f\nMenor nota: %.1f\nMédia: %.1f\nQuantidade de alunos acima da média: %d\nQuantidade de alunos abaixo da média: %d", maiorNota, menorNota, media, acimaDaMedia, abaixoDaMedia);
        
        sc.close();
    }
}
