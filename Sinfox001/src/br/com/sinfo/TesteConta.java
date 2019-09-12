package br.com.sinfo;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco banco = new Banco();
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.setNome("João");
		pessoa2.setNome("Pedro");
		
		ContaCorrente conta1 = new ContaCorrente(200, pessoa1);
		ContaCorrente conta2 = new ContaCorrente(400, pessoa2);
		ContaCorrente conta3 = new ContaCorrente(6000, pessoa2);
		conta1.setNumero(1);
		
		banco.abrirConta(conta1);
		banco.abrirConta(conta2);
		banco.abrirConta(conta3);
		
		System.out.println("Saldo da conta 1: " + conta1.getSaldoAtual());
		System.out.println("Saldo da conta 2: " + conta2.getSaldoAtual());
		System.out.println("Saldo da conta 3: " + conta3.getSaldoAtual());
		
		banco.deposito(conta1, 100);
		banco.saque(conta3, 1000);
		banco.transferencia(conta2, conta3, 50);

		System.out.println("Saldo da conta 1: " + conta1.getSaldoAtual());
		System.out.println("Saldo da conta 2: " + conta2.getSaldoAtual());
		System.out.println("Saldo da conta 3: " + conta3.getSaldoAtual());
		
		banco.exibirInfoContas();
		banco.exibirInfo();
		
	}

}
