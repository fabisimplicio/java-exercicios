package exercicios.estruturadedados;

public class Algoritmo4 {

    public boolean contemDuplicacao(int[] v) {
        for(int i = 0; i < v.length; i++) {
            for(int j = i + 1; j < v.length; j++) {
                if(v[i] == v[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //cálculo de custo do algoritmo
    // c1 -> atribuição (i = 0)
    // c2 -> avaliação de expressão booleana (i < v.length) * (n+1)
    // c3 -> operação aritmética (i++) * (n)
    // c4 -> atribuição (j =) * (n)
    // c5 -> operação aritmética (... = i + 1) * (n)
    // c6 -> avaliação de expressão booleana (j < v.length) * (n + n^2)/2
    // c7 -> operação aritmética (j++) * (n^2 - n)/2
    // c8 -> avaliação de expressão booleana (v[i] == v[j]) * (n^2 - n)/2
    // c9 -> retorno de método (return true) // não será executada no pior caso
    // c10 -> retorno de método (return false)
    //
    // f(n) = c1 + c2 * (n+1) + c3 * n + c4 * n + c5 * n + c6 * (n + n^2)/2 + c7 * (n^2 - n)/2 + c8 * (n^2 - n)/2 + c10
    // agrupamento:
    // f(n) = (c3 + c4 + c5) * n + c2 * (n+1) * c6 * (n + n^2)/2 + (c7 + c8) * (n^2 - n)/2 + (c1 + c10) 
    // simplificação:
    // f(n) = 3 * c * n + c * (n+1) + c * (n + n^2)/2 + 2 * c * (n^2 - n)/2 + 2 * c
    // f(n) = (3/2) cn^2 + (7/2) cn + 3c
    // O(n^2)
}
