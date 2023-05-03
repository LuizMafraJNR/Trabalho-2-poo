package model;

import enumareted.tipoDeGanho;
import enumareted.tipoDeGasto;

import java.util.Calendar;
import java.util.Date;

public class CadastraGastos
{
	private Long codigo;
	private String nome;
	private double valor;
	private Calendar data;
	private Enum<tipoDeGasto> tipoDeGasto;
	private String formaDePagamento;

	public CadastraGastos(double valor, Calendar data,Enum<tipoDeGasto> tipoDeGasto, String formaDePagamento)
	{

		this.valor = valor;
		this.data = data;
		this.tipoDeGasto = tipoDeGasto;
		this.formaDePagamento = formaDePagamento;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public Long getCodigo()
	{
		return codigo;
	}

	public void setCodigo(Long codigo)
	{
		this.codigo = codigo;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public double getValor()
	{
		return valor;
	}

	public void setValor(double valor)
	{
		this.valor = valor;
	}

	public Calendar getData()
	{
		return data;
	}

	public void setData(Calendar data)
	{
		this.data = data;
	}
	public Enum<enumareted.tipoDeGasto> getTipoDeGasto()
	{
		return tipoDeGasto;
	}

	public void setTipoDeGasto(Enum<enumareted.tipoDeGasto> tipoDeGasto)
	{
		this.tipoDeGasto = tipoDeGasto;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("\n\n\n");
		builder.append("Gasto cadastrado!");
		builder.append("\nValor: " +getValor());
		builder.append("\nData: " +getData());
		builder.append("\nTipo de Gasto: " +getTipoDeGasto());
		builder.append("\nForma de Pagamento: " +getFormaDePagamento());
		builder.append("\n\n");
		return builder.toString();
	}
}
