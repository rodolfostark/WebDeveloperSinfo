package br.com.sinfo.controle;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.sinfo.modelo.Chefe;
import br.com.sinfo.modelo.Funcionario;
import br.com.sinfo.modelo.Temporario;

public class ControleFuncionario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Funcionario> folhaDePagamento = new ArrayList<Funcionario>();
		System.out.println("=-=-=-=-=-=-=-MENU-=-=-=-=-=-=-");
		System.out.println("Cadastrar funcionário - 1");
		System.out.println("Remover funcionário - 2");
		System.out.println("Folha de pagamento - 3");
		int menu = ler.nextInt();
		switch(menu)
		{
		case 1:
			String leitura = JOptionPane.showInputDialog("Digite o cpf do funcionário");
			long cpf = Long.parseLong(leitura);		
			leitura = JOptionPane.showInputDialog("Digite o nome do funcionário");
			String nome = leitura;
			leitura = JOptionPane.showInputDialog("Digite o salário base");
			double salarioBase = Double.parseDouble(leitura);
			leitura = JOptionPane.showInputDialog("Informe a gratificação geral");
			double gratificacaoGeral = Double.parseDouble(leitura);
			leitura = JOptionPane.showInputDialog("Ele é um funcionário temporário?[S/N]");
			
			if(leitura.toLowerCase().equals("s"))
			{
				leitura = JOptionPane.showInputDialog("Informe a data do fim do contrato (dd/mm/aaa)");
				Temporario novoFuncionario = new Temporario();
				novoFuncionario.setCpf(cpf);
				novoFuncionario.setNome(nome);
				novoFuncionario.setSalarioBase(salarioBase);
				novoFuncionario.setGratificacaoGeral(gratificacaoGeral);
				folhaDePagamento.add(novoFuncionario);
				
			}
			else
			{
				leitura = JOptionPane.showInputDialog("Ele exerce algum cargo de chefia? [S/N]");
				if(leitura.toLowerCase().equals("s"))
				{
					leitura = JOptionPane.showInputDialog("Qual o cargo?");
					String funcao = leitura;
					leitura = JOptionPane.showInputDialog("Quanto é a sua gratificação de de chefia?");
					double gratificacaoChefia = Double.parseDouble(leitura);
					Chefe novoFuncionario = new Chefe();
					novoFuncionario.setCpf(cpf);
					novoFuncionario.setNome(nome);
					novoFuncionario.setSalarioBase(salarioBase);
					novoFuncionario.setGratificacaoGeral(gratificacaoGeral);
					novoFuncionario.setFuncao(funcao);
					novoFuncionario.setGratificacaoChefia(gratificacaoChefia);
					folhaDePagamento.add(novoFuncionario);
					
				}
			}
			JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
			break;
		case 2:
			leitura = JOptionPane.showInputDialog("Digite o cpf do funcionário que deseja remover");
			cpf = Long.parseLong(leitura);
			for(Funcionario funcionario : folhaDePagamento)
			{
				if(funcionario.getCpf() == cpf)
				{
					folhaDePagamento.remove(folhaDePagamento.indexOf(funcionario));
					JOptionPane.showMessageDialog(null, "Funcionario removido com sucesso!");
				}
			}
			break;
		case 3:
			double somaTotalFolhaDePagamento = 0;
			for(Funcionario funcionario : folhaDePagamento)
			{
				System.out.println("cpf: " + funcionario.getCpf() + ", nome: " + funcionario.getNome() + ", salário: " + funcionario.calculaSalario());
				somaTotalFolhaDePagamento += funcionario.calculaSalario();
			}
			System.out.println("Valor total da folha de pagamento: " + somaTotalFolhaDePagamento);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
		}
		ler.close();
	}
}
