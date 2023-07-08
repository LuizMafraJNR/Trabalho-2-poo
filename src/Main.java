import CargaGanho.LerGanho;
import java.text.SimpleDateFormat;
import java.util.*;

import message.MontaTelas;
import model.CadastraGanho;
import model.CadastraGastos;
import service.AdicionaGanho;
import service.AdicionaGasto;
import service.ConsultaGastoMesAno;

public class Main
{
	public static void main(String[] args) throws Exception {

		LerGanho.lerGarnho("C:\\Users\\Mafra\\Documents\\ArquivoMilhao\\CargaGastos.csv");

		List<CadastraGanho> listaGanhos = new ArrayList<>();
		List<CadastraGastos> listaGastos = new ArrayList<>();

		boolean continuar = true;
		do {
			// Iniciadores
			Scanner in = new Scanner(System.in);
			MontaTelas inicial = new MontaTelas();
			System.out.println(inicial.telaConsulta());
			int opcaoCoonsulta = in.nextInt();

			if (opcaoCoonsulta == 1){
				CadastraGastos gasto = AdicionaGasto.adicionarGasto();
				listaGastos.add(gasto);
			}

			if (opcaoCoonsulta == 2){
				CadastraGanho ganho = AdicionaGanho.adicionaGanhoUser();
				listaGanhos.add(ganho);
			}
			if (opcaoCoonsulta == 3){
				System.out.println(inicial.digiteLink());
				String link = in.next();
				List<CadastraGanho> listaGanhosImport = LerGanho.lerGarnho(link);
				for (CadastraGanho ganho : listaGanhosImport){
					listaGanhos.add(ganho);
				}
			}

			if (opcaoCoonsulta == 4){
				System.out.println(inicial.mostraGastos(listaGastos));
			}

			if(opcaoCoonsulta == 5){
				System.out.println(inicial.mostraGanhos(listaGanhos));
			}

			if (opcaoCoonsulta == 6) {
				System.out.println(ConsultaGastoMesAno.consultaGastoMesAno(listaGastos, listaGanhos));
			}

			if (opcaoCoonsulta == 7){
				continuar = false;
			}
		} while (continuar);

		System.out.println("Saindo...");
	}
}
