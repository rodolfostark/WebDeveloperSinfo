package br.com.sinfo.teste;

import javax.persistence.EntityManager;

import br.com.sinfo.modelo.Conta;
import br.com.sinfo.util.JPAUtil;

public class TesteBuscaConta {
	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Conta conta = em.find(Conta.class, 4);
		
		conta.setTitular("Pedro");
		
		System.out.println(conta.getTitular());
		
		
		em.getTransaction().commit();
	}

}
