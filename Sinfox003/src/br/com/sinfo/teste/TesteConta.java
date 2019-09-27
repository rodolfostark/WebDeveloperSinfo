package br.com.sinfo.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sinfo.modelo.Conta;
import br.com.sinfo.util.JPAUtil;

public class TesteConta 
{
	public static void main(String[] args) 
	{
		Conta conta = new Conta();
		conta.setTitular("Beltrano");
		conta.setBanco("Caixa");
		conta.setAgencia("123");
		conta.setNumero("456");
		conta.setId(1);
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		conta = em.find(Conta.class, 1);
		em.remove(conta);
		em.getTransaction().commit();
		
		em.close();
	}

}
