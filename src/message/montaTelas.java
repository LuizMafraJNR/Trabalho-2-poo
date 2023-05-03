package message;

import model.CadastraGanho;

import java.util.Scanner;


public class montaTelas
{
	public String telaConsulta(){

		StringBuilder bodybuilder = new StringBuilder();
		bodybuilder.append(" -------- GESTÃO FINANCEIRA -------");
		bodybuilder.append("\n1 - Adicionar gasto");
		bodybuilder.append("\n2 - Adicionar ganho");
		bodybuilder.append("\n3 - Relatorio de gastos");
		bodybuilder.append("\n4 - Relatorio de ganhos");
		bodybuilder.append("\n5 - Relatorio mensal");
		bodybuilder.append("\n6 - Sair");
		bodybuilder.append("\n");
		bodybuilder.append("\nSelecione uma opção: ");

		return  bodybuilder.toString();
	}

	public String telaAdicionaGasto() {

		StringBuilder bodybuilder = new StringBuilder();
		bodybuilder.append(" -------- ADICIONAR GASTO -------");
		bodybuilder.append("\n1 - Alimentação");
		bodybuilder.append("\n2 - Transporte");
		bodybuilder.append("\n3 - Saúde");
		bodybuilder.append("\n4 - Educação");
		bodybuilder.append("\n5 - Lazer");
		bodybuilder.append("\n6 - Cartão");
		bodybuilder.append("\n7 - Internet");
		bodybuilder.append("\n8 - Casa");
		bodybuilder.append("\n9 - Outros");
		bodybuilder.append("\n");
		bodybuilder.append("\nSelecione o tipo de gasto: ");
		return bodybuilder.toString();
	}

	public String telaFormaPagamento() {
		StringBuilder bodybuilder = new StringBuilder();
		bodybuilder.append(" -------- FORMA DE PAGAMENTO -------");
		bodybuilder.append("\n1 - Cheque");
		bodybuilder.append("\n2 - Pix");
		bodybuilder.append("\n3 - Débito");

		return bodybuilder.toString();

	}
	public String adicionaGanho() {
		StringBuilder bodybuilder = new StringBuilder();
		bodybuilder.append(" -------- ADICIONAR GANHO -------");

		return bodybuilder.toString();
	}

	public String mostraGastos() {
		return "s";
	}

}
