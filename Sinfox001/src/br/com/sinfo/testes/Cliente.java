package br.com.sinfo.testes;

public class Cliente extends Pessoa 
{
	private double maximoCredito;
	private double divida;
	
	public double getSaldo()
	{
		return maximoCredito - divida;
	}

	public double getMaximoCredito() {
		return maximoCredito;
	}

	public void setMaximoCredito(double maximocredito) {
		this.maximoCredito = maximocredito;
	}

	public double getDivida() {
		return divida;
	}

	public void setDivida(double divida) {
		this.divida = divida;
	}
	
	

}
