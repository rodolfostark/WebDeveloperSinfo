package br.com.sinfo.modelo;

public class Chefe extends Funcionario 
{
	private double gratificacaoChefia;
	private String funcao;
	
	public double calculaSalario()
	{
		return super.calculaSalario() + gratificacaoChefia;
	}

	public double getGratificacaoChefia() {
		return gratificacaoChefia;
	}

	public void setGratificacaoChefia(double gratificacaoChefia) {
		this.gratificacaoChefia = gratificacaoChefia;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
}
