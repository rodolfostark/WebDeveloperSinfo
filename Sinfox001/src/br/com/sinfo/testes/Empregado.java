package br.com.sinfo.testes;

public class Empregado extends Pessoa 
{
	private int codigo;
	private double salarioBase;
	private double impostos;
	
	public void calcularSalario()
	{
		System.out.println(salarioBase - impostos);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImpostos() {
		return impostos;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}
	

}
