package br.com.sinfo.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.sinfo.modelo.Conta;
import br.com.sinfo.modelo.Movimentacao;
import br.com.sinfo.modelo.TipoMovimentacao;
import br.com.sinfo.util.JPAUtil;

public class TesteJPARelacionamento
{
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setAgencia("0102");
		conta.setBanco("Banco do brasil");
		conta.setNumero("123");
		conta.setTitular("Rodrigo");
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(Calendar.getInstance());
		movimentacao.setDescricao("Pizzaaaaaaa");
		movimentacao.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		movimentacao.setValor(new BigDecimal("360"));
		movimentacao.setConta(conta);
			
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(conta);
		em.persist(movimentacao);
		
		
		em.getTransaction().commit();
		em.close();
	}

}
