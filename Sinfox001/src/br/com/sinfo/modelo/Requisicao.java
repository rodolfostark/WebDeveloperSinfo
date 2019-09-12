package br.com.sinfo.modelo;

import java.util.ArrayList;
import java.util.Date;

import br.com.sinfo.Pessoa;

public class Requisicao
{
	private Pessoa pessoa;
	private Date dataDeCadastro;
	private int numero;
	private ArrayList<ItemRequisicao> colecaoDeItens = new ArrayList<ItemRequisicao>();
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}
	public void setDataDeCadastro(Date dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
