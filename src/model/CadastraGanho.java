package model;

import java.util.Calendar;

public class CadastraGanho {
    private String nome;
    private double valor;
    private Calendar dataGanho;


    public CadastraGanho(String nome, double valor, Calendar data) {
        this.dataGanho = data;
        this.nome = nome;
        this.valor = valor;
    }

    public Calendar getDataGanho() {
        return dataGanho;
    }

    public void setDataGanho(Calendar dataGanho) {
        this.dataGanho = dataGanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        String dataFormatada = String.format("%02d/%02d/%04d", getDataGanho().get(Calendar.DAY_OF_MONTH), getDataGanho().get(Calendar.MONTH) + 1, getDataGanho().get(Calendar.YEAR));
        StringBuilder builder = new StringBuilder();
        builder.append("\n\n\nGanho cadastrado: ");
        builder.append("\nNome: " + getNome());
        builder.append("\nValor: " + getValor()+ "\n\n\n");
        builder.append("\nData: "+ dataFormatada);
        return builder.toString();
    }
}
