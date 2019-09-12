package br.com.sinfo.modelo;

import java.util.Scanner;
import br.com.sinfo.Data;
import br.com.sinfo.Pessoa;

public class Teste 
{
	public static void main(String[] args) 
	{
		int menu = 1;
		Scanner opcoes = new Scanner(System.in);
		Almoxarifado almoxarifado = new Almoxarifado();
		Produto produto = new Produto();
		Requisicao requisicao = new Requisicao();
		Pessoa pessoa = new Pessoa();
		ItemRequisicao itens = new ItemRequisicao();
		Data data = new Data();
		while(menu != 0)
		{
			System.out.println("=-=-=-=-=-=-=-=-=-=-Menu-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Adicionar produtos - 1");
			System.out.println("Remover produtos - 2");
			System.out.println("Listar produtos - 3");
			System.out.println("Lista quantidade de produtos no estoque - 4");
			System.out.println("Criar uma requisição - 5");
			System.out.println("Sair - 0");
			menu = opcoes.nextInt();

			switch(menu) {
			case 1:
				System.out.println("Informe as caracteristicas do produto que  será adicionado: ");
				System.out.print("Informe o código do produto: ");
				produto.setCodigo(opcoes.nextInt());
				System.out.print("Informe a denominação do produto: ");
				produto.setDenominacao(opcoes.next());
				System.out.print("Informe a quantidade desse produto: ");
				produto.setQuantidade(opcoes.nextInt());
				System.out.print("Informe a unidade de medida: ");
				produto.setUnidadeDeMedida(opcoes.next());
				System.out.print("Digite o valor de cada unidade desse produto: ");
				produto.setValor(opcoes.nextDouble());
				almoxarifado.adicionarProdutos(produto);
				break;
			case 2:
				System.out.print("Digite o código do produto que deseja remover do estoque: ");
				int code = opcoes.nextInt();
				produto = almoxarifado.buscarProduto(code);
				almoxarifado.removerProdutos(produto);
				break;
			case 3:
				almoxarifado.listarProdutos();
				break;
			case 4:
				System.out.println("Existem " + almoxarifado.quantidadeDeProdutosEmEstoque() + " produtos no estoque do almoxarifado.");
				break;
			case 5:
				 System.out.println("Para criar uma requisição, informe os dados de quem irá realizar a requisição");
				 System.out.print("Digite o nome: ");
				 pessoa.setNome(opcoes.next());
				 System.out.print("Digite a data no formato DD/MM/AAA: ");
				 data.setData(opcoes.next());
				 
				break;
			}
		}
		opcoes.close();
	}

}
