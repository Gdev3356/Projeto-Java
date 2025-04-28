package fiap.com.br.main;

import javax.swing.*;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Datas {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data1 = JOptionPane.showInputDialog("Digite uma data aqui:");
        LocalDate data = LocalDate.parse(data1);
        String data3 = JOptionPane.showInputDialog("Digite novamente uma data aqui:");
        LocalDate dataFinal = LocalDate.parse(data3);
        Period periodo = Period.between(data, dataFinal);
        JOptionPane.showMessageDialog(null, String.format("Data Inicial: %s  \nData Final: %s \nDesde o fim dos tempos, passaram-se: %d ano(s), %d mês(es) e %d dias(s)", data.format(dtf), dataFinal.format(dtf), periodo.getYears(), periodo.getMonths(), periodo.getDays()));
    }
}
