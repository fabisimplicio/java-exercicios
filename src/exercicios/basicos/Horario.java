package exercicios.basicos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Horario {

    public static void main(String[] args) {

        LocalTime horaAtual = LocalTime.now();

        System.out.println(horaAtual);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SS");

        System.out.println(horaAtual.format(formatter));

        System.out.println(horaAtual.plusMinutes(100));
        System.out.println(horaAtual.minusMinutes(60));
        
    }
    
}
