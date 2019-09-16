package br.com.sinfo.testes;

public class Fornecedor extends Pessoa
{
	private double credito;
	private double divida;
	
	public double getCredito() {
		return credito;
	}
	public void setCredito(double credito) {
		this.credito = credito;
	}
	public double getDivida() {
		return divida;
	}
	public void setDivida(double divida) {
		this.divida = divida;
	}
	public double getsaldo()
	{
		return credito - divida;
	}
}
