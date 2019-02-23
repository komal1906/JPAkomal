package com.cg.author.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/*For CRUD operation we need connection
entityManager will give connection
entitymanagerfactory is 
//Entity manager will take care of all the 	CRUD operation
*/
public class JPAUtil 
{
	private static EntityManagerFactory emf=null;
	private static EntityManager em= null;
	
	public static EntityManager getEntityManager()
	{
		emf=Persistence.createEntityManagerFactory("Oracle-JPA-PU");
		em= emf.createEntityManager();
		return em;
	}

}
