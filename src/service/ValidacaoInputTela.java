package service;

import enumareted.tipoDeGasto;

public class ValidacaoInputTela
{

	public static String validaFormaPagamento(int numero){
		try {
			if (numero == 1) {
				return "Cheque";
			} else if (numero == 2) {
				return "Pix";
			} else if (numero == 3) {
				return "Débito";
			} else {
				return "Forma de pagamento inválida";
			}
		} catch (Exception e) {
			return "Forma de pagamento inválida";
		}
	}

	public static Enum<tipoDeGasto> tipoGasto(int numero) {
		if (numero > 0 && numero < 10) {
			switch (numero) {
				case 1:
					return tipoDeGasto.ALIMENTACAO;
				case 2:
					return tipoDeGasto.TRANSPORTE;
				case 3:
					return tipoDeGasto.SAUDE;
				case 4:
					return tipoDeGasto.EDUCACAO;
				case 5:
					return tipoDeGasto.LAZER;
				case 6:
					return tipoDeGasto.CARTAO;
				case 7:
					return tipoDeGasto.INTERNET;
				case 8:
					return tipoDeGasto.CASA;
				case 9:
					return tipoDeGasto.OUTROS;

				default:
					break;
			}
		} else {
			return null;
		}
		return null;
	}
}
