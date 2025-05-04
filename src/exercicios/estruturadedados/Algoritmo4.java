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
    // c6 -> avaliação de expressão booleana (j < v.length) * (n+1)
    // c7 -> operação aritmética (j++) * (n)
    // c8 -> avaliação de expressão booleana (v[i] == v[j]) * (n)
    // c9 -> retorno de método (return true)
    // c10 -> retorno de método (return false)
    //
    // f(n) = c1 + c2 * (n+1) + c3 * n + c4 + c5 * (n+1) + c6 * (n) + c7 * (n) + c9
    // agrupamento:
    // f(n) = 



}
