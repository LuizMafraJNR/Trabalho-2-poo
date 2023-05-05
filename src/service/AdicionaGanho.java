package service;

import message.MontaTelas;
import model.CadastraGanho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AdicionaGanho {

    public static CadastraGanho adicionaGanhoUser() throws ParseException {
        Scanner in3 = new Scanner(System.in);
        MontaTelas inicial2 = new MontaTelas();
        System.out.println(inicial2.adicionaGanho());
        System.out.println("Informe o nome do ganho: ");
        String nome = in3.next();
        System.out.println("Informe o valor: ");
        double valorGanho = in3.nextDouble();
        System.out.println("Informe a data: ");
        String data = in3.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formatter.parse(data);
        Calendar dataCalendar = Calendar.getInstance();
        dataCalendar.setTime(dataFormatada);

        CadastraGanho ganho = new CadastraGanho(nome, valorGanho, dataCalendar);
        System.out.println(ganho.toString());

        return ganho;
    }
}
