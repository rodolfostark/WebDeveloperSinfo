package br.com.sinfo.modelo;

public class Funcionario
{
	private long cpf;
	private String nome;
	private double salarioBase;
	private double gratificacaoGeral;
	
	
	public Funcionario() {
		
	}

	public double calculaSalario()
	{
		return salarioBase*0.7 + gratificacaoGeral;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getGratificacaoGeral() {
		return gratificacaoGeral;
	}

	public void setGratificacaoGeral(double gratificacaoGeral) {
		this.gratificacaoGeral = gratificacaoGeral;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cpf != other.cpf)
			return false;
		return true;
	}
	
	
}
