package exercicios.estruturadedados;

public class Algoritmo3 {
    
    public static boolean contains(int[] v, int k) {
        for(int i = 0; i < v.length; i++) {
            if(v[i] == k) {
                return true;
            }
        }
        return false;
    }

    // cálculo de custo do algoritmo
    // c1 -> atribuição (i = 0) 
    // c2 -> avaliação de expressão booleana (i < v.length) x (n+1)
    // c3 -> operação aritmética (i++) x n
    // c4 -> avaliação de expressão booleana (v[i] == k) x n
    // c5 -> retorno de um método (return true) (não é executada no pior caso)
    // c6 -> retorno de um método (return false)
    //
    // f(n) = c1 + c2 * (n+1) + c3 * n + c4 * n + c6
    // agrupando:
    // f(n) = (c2 + c3 + c4) * n +  (c1 + c2 + c6)
    // simplificação:
    // f(n) = 3 * c * n + 3 * c

}
