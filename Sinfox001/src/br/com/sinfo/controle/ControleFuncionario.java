package br.com.sinfo.controle;

import java.sql.Date;
import java.text.SimpleDateFormat;
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
			leitura = JOptionPane.showInputDialog("Ele é um funcionário temporário?");
			
			if(leitura.equals("sim"))
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
				leitura = JOptionPane.showInputDialog("Ele exerce algum cargo de chefia?");
				if(leitura.equals("sim"))
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
					novoFuncionario.setGratificacaoChefia(gratificacaoChefia);
					folhaDePagamento.add(novoFuncionario);
					//A folha de pagamento não está adicionando um novo funcionário O.o
				}
			}
			JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!"
					+ "Nome: " + nome);
			break;
		case 2:
			break;
		case 3:		
			break;
		default:
			System.out.println("Opção inválida!");
		}
		System.out.println(folhaDePagamento.size());
	}

}
