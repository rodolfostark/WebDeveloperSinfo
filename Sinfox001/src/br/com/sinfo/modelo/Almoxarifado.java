package br.com.sinfo.modelo;

import java.util.ArrayList;

public class Almoxarifado
{
	private int codigoIdentificador;
	private String nome;
	private ArrayList<Produto> colecaoDeProdutos = new ArrayList<Produto>();
	
	public int getCodigoIdentificador() {
		return codigoIdentificador;
	}
	public void setCodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void adicionarProdutos(Produto produto)
	{
		if(colecaoDeProdutos.contains(produto))
		{
			System.out.println("Já existe no estoque um produto com esse código.");
		}
		else
		{
			colecaoDeProdutos.add(produto);
			System.out.println("Produto adicionado com sucesso!");
		}
	}
	public void removerProdutos(Produto produto)
	{
		colecaoDeProdutos.remove(colecaoDeProdutos.indexOf(produto));
		System.out.println("Produto removido com sucesso!");
	}
	public void listarProdutos()
	{
		System.out.println("Lista de produtos");
		for(Produto produto : colecaoDeProdutos)
		{
			System.out.println("Produto: " + produto.getDenominacao() + 
					", quantidade em estoque: " + produto.getQuantidade());
		}
	}
	public int quantidadeDeProdutosEmEstoque()
	{
		return colecaoDeProdutos.size();
	}
	public Produto buscarProduto(int codigo)
	{
		for(Produto produto : colecaoDeProdutos)
		{
			if(produto.getCodigo() == codigo)
			{
				return produto;
			}
		}
		return null;
	}
	public int buscarProdutoIndice(int codigo)
	{
		for(Produto produto : colecaoDeProdutos)
		{
			if(produto.getCodigo() == codigo)
			{
				return colecaoDeProdutos.indexOf(produto);
			}
		}
		return -1;
	}
	

}
