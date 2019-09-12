package br.com.sinfo;

import java.util.Date;

public class ContaCorrente 
{
	private int numero;
	private double saldoAtual;
	private double saldoAnterior;
	private Date dataAbertura;
	private Pessoa titular;
	
	public ContaCorrente()
	{
		
	}
	public ContaCorrente(double saldoAtual, Pessoa titular) 
	{
		this.saldoAtual = saldoAtual;
		this.titular = titular;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldoAtual() {
		return saldoAtual;
	}
	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}
	public double getSaldoAnterior() {
		return saldoAnterior;
	}
	public void setSaldoAnterior(double saldoAnterior) {
		this.saldoAnterior = saldoAnterior;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Pessoa getTitular() {
		return titular;
	}
	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}
	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", saldoAtual=" + saldoAtual + ", saldoAnterior=" + saldoAnterior
				+ ", dataAbertura=" + dataAbertura + ", titular=" + titular.getNome() + "]";
	}
	public void saque(double valor)
	{
		this.saldoAnterior = this.saldoAtual;
		this.saldoAtual -= valor;
	}
	

}
