package br.com.sinfo.testes;

public class Pessoa
{
	private String nome;
	private int cpf;
	private int idade;
	private CodigoPostal codigoPostal;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public CodigoPostal getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(CodigoPostal codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
}
