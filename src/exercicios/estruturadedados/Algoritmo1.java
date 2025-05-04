package exercicios.estruturadedados;

public class Algoritmo1 {

    public int multiplicaRestoPorParteInteira(int i, int j) {
        int resto = i % j;
        int pInteira = i / j;
        int resultado = resto * pInteira;
        return resultado;
    }

    //cálculo de custo do algoritmo
    // c1 -> atribuição (resto =)
    // c2 -> operação aritmética (i % j)
    // c3 -> atribuição (pInteira =)
    // c4 -> operação aritmética (i / j)
    // c5 -> atribuição (resultado =)
    // c6 -> operação aritmética (resto * pInteira)
    // c7 -> retorno de método (return resultado)
    //
    // f(n) = c1 + c2 + c3 + c4 + c5 + c6 + c7
    // f(n) = 7c 
    // função constante; não depende de n, ou seja, independe do tamanho da entrada

}
