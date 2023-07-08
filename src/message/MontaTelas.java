package message;


import model.CadastraGanho;
import model.CadastraGastos;

import java.util.Calendar;
import java.util.List;

public class MontaTelas
{
	public String telaConsulta(){

		StringBuilder bodybuilder = new StringBuilder();
		bodybuilder.append(" -------- GESTÃO FINANCEIRA -------");
		bodybuilder.append("\n1 - Adicionar gasto");
		bodybuilder.append("\n2 - Adicionar ganho");
		bodybuilder.append("\n3 - Realizar Carga de ganho");
		bodybuilder.append("\n4 - Relatorio de gastos");
		bodybuilder.append("\n5 - Relatorio de ganhos");
		bodybuilder.append("\n6 - Relatorio mensal");
		bodybuilder.append("\n7 - Sair");
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

	public String mostraGastos(List<CadastraGastos> listaGastos){
		StringBuilder bodybuilder = new StringBuilder();
		bodybuilder.append(" -------- RELATÓRIO DE GASTOS -------");
		for (int x = 0; x < listaGastos.size(); x++){

			String dataFormatada = String.format("%02d/%02d/%04d",
					listaGastos.get(x).getData().get(Calendar.DAY_OF_MONTH),
					listaGastos.get(x).getData().get(Calendar.MONTH) + 1,
					listaGastos.get(x).getData().get(Calendar.YEAR));

			bodybuilder.append("\n\nGasto nº "+ (x+1));
			bodybuilder.append("\nValor: "+ listaGastos.get(x).getValor());
			bodybuilder.append("\nData: "+ dataFormatada);
			bodybuilder.append("\nTipo de gasto: "+ listaGastos.get(x).getTipoDeGasto());
			bodybuilder.append("\nForma de pagamento: "+ listaGastos.get(x).getFormaDePagamento());
		}

		return bodybuilder.toString();
	}

	public String mostraGanhos(List<CadastraGanho> listaGanhos){
		StringBuilder bodybuilder = new StringBuilder();
		bodybuilder.append(" -------- RELATÓRIO DE GANHOS -------");
		for (int x = 0; x < listaGanhos.size(); x++){

			bodybuilder.append("\n\nGanho nº "+ (x+1));
			bodybuilder.append("\nNome: "+ listaGanhos.get(x).getNome());
			bodybuilder.append("\nValor: "+ listaGanhos.get(x).getValor());
		}

		return bodybuilder.toString();
	}

	public String digiteLink(){
		StringBuilder bodyBuilder= new StringBuilder();
		bodyBuilder.append("\nEscreva o diretiorio do arquivo CSV completo.");
		bodyBuilder.append("\nLembre-se de passar o arquivo CSV.");
		bodyBuilder.append("\nIrei deixar um exemplo de como deverá ser feito");
		bodyBuilder.append("\nDigite aqui: ");
		return bodyBuilder.toString();
	}

}
