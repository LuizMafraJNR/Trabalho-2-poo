package model;

public class CadastraGanho {
    private String nome;
    private double valor;


    public CadastraGanho(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
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

        StringBuilder builder = new StringBuilder();
        builder.append("\n\n\nGanho cadastrado: ");
        builder.append("\nNome: " + getNome());
        builder.append("\nValor: " + getValor()+ "\n\n\n");
        return builder.toString();
    }
}
