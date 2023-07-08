package Tests;

import enumareted.tipoDeGasto;
import java.util.Calendar;
import java.util.GregorianCalendar;
import model.CadastraGanho;
import model.CadastraGastos;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class TestClasses
{

	@Test
	public void testGanhoValor(){

		CadastraGanho cadastraGanho = new CadastraGanho("Salario", 2988.80, new GregorianCalendar());
		Assert.assertEquals(2988.80, cadastraGanho.getValor(), 0.00);
	}

	@Test
	public void testToString() {
		double valor = 100.0;
		Calendar data = Calendar.getInstance();
		data.set(2023, Calendar.FEBRUARY, 19);
		Enum<tipoDeGasto> tipoDeGasto = enumareted.tipoDeGasto.ALIMENTACAO;
		String formaDePagamento = "Cartão de crédito";

		CadastraGastos gasto = new CadastraGastos(valor, data, tipoDeGasto, formaDePagamento);

		String expected = "\n\n\n" +
			"Gasto cadastrado!" +
			"\nValor: " + valor +
			"\nData: 19/02/2023" +
			"\nTipo de Gasto: ALIMENTACAO" +
			"\nForma de Pagamento: Cartão de crédito" +
			"\n\n";

		Assert.assertEquals(expected, gasto.toString());
	}
}
