package exercicios.estruturadedados;

public class Algoritmo2 {

    public double precisaNaFinal(double nota1, double nota2, double nota3) {
        
        double media = (nota1 + nota2 + nota3) / 3;

        if(media <= 7 || media < 4) {
            return 0;
        } else {
            double mediaFinal = 5;
            double pesoFinal = 0.4;
            double pesoMedia = 0.6;
            double precisa = (mediaFinal - pesoMedia * media) / pesoFinal;

            return precisa;
        }
    }


    // cálculo de custo do algoritmo
    // c1 -> atribuição (media =)
    // c2 -> operação aritmética (c1 + c2 + c3)
    // c3 -> operação aritmética(.../3)
    // c4 -> avaliação de expressão booleana (media <= 7 || media < 4)
    // c5 -> retorno de método (return 0)
    // c6 -> atribuição (mediaFinal =)
    // c7 -> atribuição (pesoFinal =)
    // c8 -> pesoMedia (pesoMedia =)
    // c9 -> atribuição (precisa =)
    // c10 -> operação aritmética (pesoMedia * media)
    // c11 -> operação aritmética (mediaFinal - ...)
    // c12 -> operação aritmética
    // c13 -> retorno de método (return precisa)
    //
    // f(n) = c1 + c2 + c3 + c4 + c6 + c7 + c8 + c9 + c10 + c11 + c12 + c13
    // f(n) = 12c
    // obs.: não inclui c5, pois considera apenas o pior caso

    
}
