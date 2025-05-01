package exercicios.basicos;

import java.time.LocalDateTime;

public class DataHorario {

    public static void main(String[] args) {
        

        LocalDateTime dataHora = LocalDateTime.now();

        System.out.println(dataHora);
        System.out.println(dataHora.getDayOfMonth());
        System.out.println(dataHora.getMinute());

    }
    
}
