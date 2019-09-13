package br.com.sinfo.modelo;

import java.util.ArrayList;
import br.com.sinfo.Data;
import br.com.sinfo.Pessoa;

public class Requisicao
{
	private Pessoa pessoa;
	private Data dataDeCadastro;
	private int numero;
	private ArrayList<ItemRequisicao> colecaoDeItens = new ArrayList<ItemRequisicao>();
	
	public Requisicao() {
		
	}
	public Requisicao(Pessoa pessoa, Data dataDeCadastro, int numero, ArrayList<ItemRequisicao> colecaoDeItens)
	{
		this.pessoa = pessoa;
		this.dataDeCadastro = dataDeCadastro;
		this.numero = numero;
		this.setColecaoDeItens(colecaoDeItens);
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Data getDataDeCadastro() {
		return dataDeCadastro;
	}
	public void setDataDeCadastro(Data dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public ArrayList<ItemRequisicao> getColecaoDeItens() {
		return colecaoDeItens;
	}
	public void setColecaoDeItens(ArrayList<ItemRequisicao> colecaoDeItens) {
		this.colecaoDeItens = colecaoDeItens;
	}
	public void listarItensDaRequisicao()
	{
		for(ItemRequisicao itens : colecaoDeItens)
		{
			System.out.println("Produto: " + itens.getProduto().getDenominacao()
					+ ", quantidade: " + itens.getQuantidade() + ", valor: " + itens.getValor());
		}
	}
	
}
