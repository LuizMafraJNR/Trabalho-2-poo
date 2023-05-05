package service;

import model.CadastraGastos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class ConsultaGastoMesAno {
    public static String consultaGastoMesAno(List<CadastraGastos> listaGastos) {
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
                String data = formatter.format(listaGastos.get(x).getData().getTime());
                body.append("\n\nGasto nº "+ (x+1));
                body.append("\nValor: "+ listaGastos.get(x).getValor());
                body.append("\nData: "+ data);
                body.append("\nTipo de gasto: "+ listaGastos.get(x).getTipoDeGasto());
                body.append("\nForma de pagamento: "+ listaGastos.get(x).getFormaDePagamento());
            }
        }
        return body.toString();
    }
}
