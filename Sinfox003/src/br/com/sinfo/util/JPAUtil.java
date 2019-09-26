package br.com.sinfo.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil 
{
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Sinfox003");
	
	public EntityManager getEntityManager()
	{
		return emf.createEntityManager();
	}
}
