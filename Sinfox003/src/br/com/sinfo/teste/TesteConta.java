package br.com.sinfo.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sinfo.modelo.Conta;

public class TesteConta 
{
	public static void main(String[] args) 
	{
		Conta conta = new Conta();
		conta.setTitular("Fulano");
		conta.setBanco("Caixa");
		conta.setAgencia("123");
		conta.setNumero("456");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Sinfox003");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
