package br.com.sinfo.modelo;

public class Produto
{
	private int codigo;
	private String denominacao;
	private int quantidade;
	private String unidadeDeMedida;
	private double valor;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDenominacao() {
		return denominacao;
	}
	public void setDenominacao(String denominacao) {
		this.denominacao = denominacao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getUnidadeDeMedida() {
		return unidadeDeMedida;
	}
	public void setUnidadeDeMedida(String unidadeDeMedida) {
		this.unidadeDeMedida = unidadeDeMedida;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean equals(Produto produto) {
		if (this == produto)
			return true;
		if (produto == null)
			return false;
		if (getClass() != produto.getClass())
			return false;
		Produto other = (Produto) produto;
		if (codigo != other.codigo)
			return false;
		if (denominacao == null) {
			if (other.denominacao != null)
				return false;
		} else if (!denominacao.equals(other.denominacao))
			return false;
		return true;
	}
	
	

}
