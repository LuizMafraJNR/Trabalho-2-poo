import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import enumareted.tipoDeGasto;
import message.montaTelas;
import model.CadastraGanho;
import model.CadastraGastos;

public class Main
{
	public static void main(String[] args) throws ParseException {
		List<CadastraGanho> listaGanhos = new ArrayList<>();
		List<CadastraGastos> listaGastos = new ArrayList<>();

		boolean continuar = true;
		do {
			// Iniciadores
			Scanner in = new Scanner(System.in);
			montaTelas inicial = new montaTelas();
			System.out.println(inicial.telaConsulta());

			int opcaoCoonsulta = in.nextInt();
			if (opcaoCoonsulta == 6){
				continuar = false;
			}

			if (opcaoCoonsulta == 1){

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
				listaGastos.add(gasto);
			}

			if (opcaoCoonsulta == 2){
				Scanner in3 = new Scanner(System.in);
				montaTelas inicial2 = new montaTelas();
				System.out.println(inicial2.adicionaGanho());
				System.out.println("Informe o nome do ganho: ");
				String nome = in3.next();
				System.out.println("Informe o valor: ");
				double valorGanho = in3.nextDouble();

				CadastraGanho ganho = new CadastraGanho(nome, valorGanho);
				System.out.println(ganho.toString());
				listaGanhos.add(ganho);
			}

			if (opcaoCoonsulta == 3){
				StringBuilder body = new StringBuilder();
				System.out.println("Consultando...");
				System.out.println("\n\n--- Lista de gastos ---");
				for (int x = 0; x < listaGastos.size(); x++){

					body.append("\n\nGasto nº "+ (x+1));
					body.append("\nValor: "+ listaGastos.get(x).getValor());
					body.append("\nData: "+ listaGastos.get(x).getData());
					body.append("\nTipo de gasto: "+ listaGastos.get(x).getTipoDeGasto());
					body.append("\nForma de pagamento: "+ listaGastos.get(x).getFormaDePagamento());
				}
				System.out.println(body.toString());
			}

			if(opcaoCoonsulta == 4){
				StringBuilder body = new StringBuilder();
				System.out.println("\n\n--- Lista de ganhos ---");
				for (int x = 0; x < listaGanhos.size(); x++){

					body.append("\n\nGanho nº "+ (x+1));
					body.append("\nNome: "+ listaGanhos.get(x).getNome());
					body.append("\nValor: "+ listaGanhos.get(x).getValor());
				}
			}

			if (opcaoCoonsulta == 5) {
				System.out.println("Informe o mês: ");
				Scanner in4 = new Scanner(System.in);
				int mes = 0;
				mes = in4.nextInt();
				Calendar calendarioJava = Calendar.getInstance();
				calendarioJava.set(Calendar.MONTH, mes-1);
				StringBuilder body = new StringBuilder();
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				System.out.println("\n\n--- Lista de gastos do mes selecionado ---");
				for (int x = 0; x < listaGastos.size(); x++){
					if (listaGastos.get(x).getData().get(Calendar.MONTH) == calendarioJava.get(Calendar.MONTH)){
						String data = formatter.format(listaGastos.get(x).getData().getTime());
						body.append("\n\nGasto nº "+ (x+1));
						body.append("\nValor: "+ listaGastos.get(x).getValor());
						body.append("\nData: "+ data);
						body.append("\nTipo de gasto: "+ listaGastos.get(x).getTipoDeGasto());
						body.append("\nForma de pagamento: "+ listaGastos.get(x).getFormaDePagamento());
					}
				}
				System.out.println(body.toString());
			}
		} while (continuar);

		System.out.println("Saindo...");
	}
}
