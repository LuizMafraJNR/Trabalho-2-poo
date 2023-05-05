package service;

import enumareted.tipoDeGasto;
import message.MontaTelas;
import model.CadastraGastos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AdicionaGasto {
        static ValidacaoInputTela validacaoInputTela = new ValidacaoInputTela();
        static MontaTelas inicial = new MontaTelas();

    public static CadastraGastos adicionarGasto() throws Exception {
        System.out.println(inicial.telaAdicionaGasto());
        Scanner in2 = new Scanner(System.in);
        int opcaoGasto = in2.nextInt();
        Enum<tipoDeGasto> tipoGasto = validacaoInputTela.tipoGasto(opcaoGasto);
        System.out.println("Informe a data: ");
        String data = in2.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formatter.parse(data);
        Calendar dataCalendar = Calendar.getInstance();
        dataCalendar.setTime(dataFormatada);
        System.out.println("Informe o valor: ");
        double valor = in2.nextDouble();
        System.out.println(inicial.telaFormaPagamento());
        int opcaoFormaPagamento = in2.nextInt();
        String formaPagamento = validacaoInputTela.validaFormaPagamento(opcaoFormaPagamento);
        CadastraGastos gasto = new CadastraGastos(valor, dataCalendar, tipoGasto, formaPagamento);
        System.out.println(gasto.toString());
        return gasto;
    }
}
