package exercicios.estruturadedados;

public class Algoritmo5 {

    public int somaArray(int[] array) {
        int soma = 0;
        for(int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        return soma;
    }
    
}
