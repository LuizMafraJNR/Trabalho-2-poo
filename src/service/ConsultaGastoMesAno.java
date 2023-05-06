package service;

import model.CadastraGanho;
import model.CadastraGastos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class ConsultaGastoMesAno {
    public static String consultaGastoMesAno(List<CadastraGastos> listaGastos, List<CadastraGanho> listaGanhos) {
        double gastosMes = 0;
        double ganhosMes = 0;
        double saldoMes = 0;

        System.out.println("Informe o mês: ");
        Scanner in4 = new Scanner(System.in);
        int mes = 0;
        mes = in4.nextInt();
        System.out.println("Informe o ano: ");
        int ano = 0;
        ano = in4.nextInt();
        Calendar calendarioJava = Calendar.getInstance();
        calendarioJava.set(Calendar.MONTH, mes-1);
        calendarioJava.set(Calendar.YEAR, ano);
        StringBuilder body = new StringBuilder();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\n\n--- Lista de gastos do mes selecionado ---");
        for (int x = 0; x < listaGastos.size(); x++){
            // adicionar validação de ano tmb
            if (listaGastos.get(x).getData().get(Calendar.MONTH) == calendarioJava.get(Calendar.MONTH) && listaGastos.get(x).getData().get(Calendar.YEAR) == calendarioJava.get(Calendar.YEAR)){
                gastosMes += listaGastos.get(x).getValor();
            }
        }
        for (int x = 0; x < listaGanhos.size(); x++){
            if (listaGanhos.get(x).getDataGanho().get(Calendar.MONTH) == calendarioJava.get(Calendar.MONTH) && listaGanhos.get(x).getDataGanho().get(Calendar.YEAR) == calendarioJava.get(Calendar.YEAR)){
                ganhosMes += listaGanhos.get(x).getValor();
            }
        }
        saldoMes = ganhosMes - gastosMes;
        body.append("\n\n--- Lista de gastos do mes "+mes+" no ano "+ano+"---\n");
        body.append("Ganhos: "+ganhosMes+"\n");
        body.append("Gastos: "+gastosMes+"\n");
        body.append("Saldo: "+saldoMes+"\n");
        return body.toString();
    }
}
