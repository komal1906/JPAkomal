package com.cg.author.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import com.cg.author.dto.Author;
import com.cg.author.util.JPAUtil;


public class AuthorDaoImpl implements AuthorDao {
	EntityManager em=null;
	EntityTransaction entityTran= null;
	
	public AuthorDaoImpl()
	{
		
		em= JPAUtil.getEntityManager();
		entityTran= em.getTransaction();
		
	}
	public Author addAut(Author aut)
	{
		entityTran.begin();
		em.persist(aut);
		entityTran.commit();
		return aut;
		
	}
	public ArrayList<Author> fetchAllAut()
	{
		String selAllQry="SELECT auts FROM Author auts";
		TypedQuery<Author> tq= em.createQuery(selAllQry,Author.class);
		ArrayList<Author>  autList= (ArrayList) tq.getResultList();
		
		return autList;
	}
	public Author deleteAut (int autId)
	{
		Author  a1=em.find(Author.class, autId);
		entityTran.begin();
		em.remove(a1);
		entityTran.commit();
		return a1;
	}
	public Author getAutbyEid(int autId)
	{
		Author a1= em.find(Author.class, autId);
		return a1;
	}
	public Author updateAut(int autId, String autFirstName, String autMiddleName, String autLastName, String autPhoneNo)
	{
		Author a1=em.find(Author.class, autId);
		a1.setAutFirstName(autFirstName);
		a1.setAutMiddleName(autMiddleName);
		a1.setAutLastName(autLastName);
		a1.setAutPhoneNo(autPhoneNo);
		entityTran.begin();
		em.merge(a1);
		entityTran.commit();
		return a1;
	}


}
