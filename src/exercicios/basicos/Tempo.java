package exercicios.basicos;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Tempo {
    public static void main(String[] args) {

        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);

        DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println(dataAtual.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        LocalDate dataDeNascimento = LocalDate.of(2000, 5, 17);
        System.out.println(dataFormato.format(dataDeNascimento));
        System.out.println(dataDeNascimento);

        String data = "2025-05-01";
        LocalDate dataHoje = LocalDate.parse(data);
        System.out.println(dataHoje);

        //manipulação de datas

        LocalDate dataNascimentoMae = LocalDate.of(1974, Month.JUNE, 30);
        LocalDate dataQueTera70Anos = dataNascimentoMae.plusYears(70);
        System.out.println(dataQueTera70Anos);

        LocalDate diaAtual = LocalDate.now();
        System.out.println(diaAtual.plusDays(5000));

        LocalDate dia2 = LocalDate.of(2025, 5, 17);

        System.out.println(diaAtual.isAfter(dia2));

    }

    
}
