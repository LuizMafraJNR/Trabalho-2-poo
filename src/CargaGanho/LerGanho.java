package CargaGanho;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import model.CadastraGanho;

public class LerGanho
{
	public static List<CadastraGanho> lerGarnho(String caminho) throws IOException, ParseException
	{
		try (BufferedReader reader = new BufferedReader(new FileReader(caminho)))
		{
			String linha = null;
			int contador = 0;

			String separadorCSV = ";";
			Map<Integer, String> map = new HashMap<>();

			while ((linha = reader.readLine()) != null)
			{
				String colunasLidas[] = linha.split(separadorCSV);
				// Nome // Valor // Data
				for (String linhaCSV : colunasLidas) {
					contador++;
					map.put(contador, linhaCSV);
				}

				System.out.println(colunasLidas.toString());
			}

			String nome = null;
			Double valor = 0.0;
			String data = null;
			Calendar dataoRIGINA = null;

			List<CadastraGanho> ganhos = new ArrayList<>();
			int contador2 = 0;
			for (String  map1 : map.values()){
				contador2 ++;
				if (contador2 == 1){
					nome = map1.toString();
				}
				else if (contador2 == 2)
				{
					valor = Double.valueOf(map1.toString());

				} else if(contador2 == 3){
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					data = map1.toString();
					Date dataOfi = dateFormat.parse(data);
					Calendar calendar = Calendar.getInstance();
					calendar.setTime((Date) dataOfi);
					dataoRIGINA = calendar;
					CadastraGanho ganho = new CadastraGanho(nome, valor, dataoRIGINA);
					ganhos.add(ganho);
					contador2 = 0;
				}
			}
			System.out.println("Teste");
			return ganhos;
//			CadastraGanho ganhaoExcel = new CadastraGanho();
		}
	}
}