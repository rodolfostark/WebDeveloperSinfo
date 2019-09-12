package br.com.sinfo;
import java.util.ArrayList;
import java.util.Iterator;

public class Banco 
{
	private int codigo;
	private String descricao;
	private String endereco;
	private ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();
	
	public int getCodigo()
	{
		return codigo;
	}
	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
	}
	public String getDescricao()
	{
		return descricao;
	}
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}
	public String getEndereco()
	{
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void abrirConta(ContaCorrente novaConta)
	{
		if(contas.contains(novaConta))
		{
			System.out.println("Essa conta já existe e ela está na posição: " + contas.indexOf(novaConta));
		}
		else
		{
			contas.add(novaConta);
		}
		
	}
	public void fecharConta(ContaCorrente conta)
	{
		contas.remove(contas.indexOf(conta));
	}
	public double saque(ContaCorrente conta, double valor)
	{
		conta.setSaldoAnterior(conta.getSaldoAtual());
		conta.setSaldoAtual(conta.getSaldoAtual() - valor);
		return conta.getSaldoAtual();
	}
	public double deposito(ContaCorrente conta, double valor)
	{
		conta.setSaldoAnterior(conta.getSaldoAtual());
		conta.setSaldoAtual(conta.getSaldoAtual() + valor);
		return conta.getSaldoAtual();
	}
	public void transferencia(ContaCorrente contaOrigem, ContaCorrente contaDestino, double valor)
	{
		contaOrigem.setSaldoAnterior(contaOrigem.getSaldoAtual());
		contaOrigem.setSaldoAtual(contaOrigem.getSaldoAtual() - valor);
		contaDestino.setSaldoAnterior(contaDestino.getSaldoAtual());
		contaDestino.setSaldoAtual(contaDestino.getSaldoAtual() + valor);
	}
	public void exibirNumeroContas()
	{
		System.out.println("Existe " + contas.size() + " contas cadastradas.");
	}
	public void exibirInfoContas()
	{
		Iterator<ContaCorrente> it = contas.iterator();
		while(it.hasNext())
		{
			ContaCorrente conta = (ContaCorrente) it.next();
			System.out.println("Conta: ");
			System.out.println(conta.getNumero());
			System.out.println(conta.getSaldoAnterior());
			System.out.println(conta.getSaldoAtual());
			System.out.println(conta.getDataAbertura());
			System.out.println("Correntista: ");
			System.out.println(conta.getTitular().getNome());
			System.out.println(conta.getTitular().getCpf());
			System.out.println(conta.getTitular().getRg());
			System.out.println(conta.getTitular().getEndereco());
			System.out.println(conta.getTitular().getTelefone());
			System.out.println(conta.getTitular().getSexo());
		}
	}
	public void exibirInfo() 
	{
		for(ContaCorrente conta : contas)
		{
			System.out.println("Conta: ");
			System.out.println(conta.getNumero());
			System.out.println(conta.getSaldoAnterior());
			System.out.println(conta.getSaldoAtual());
			System.out.println(conta.getDataAbertura());
			System.out.println("Correntista: ");
			System.out.println(conta.getTitular().getNome());
			System.out.println(conta.getTitular().getCpf());
			System.out.println(conta.getTitular().getRg());
			System.out.println(conta.getTitular().getEndereco());
			System.out.println(conta.getTitular().getTelefone());
			System.out.println(conta.getTitular().getSexo());
		}
	}

}
