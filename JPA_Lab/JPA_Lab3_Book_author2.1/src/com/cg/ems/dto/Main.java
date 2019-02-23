package com.cg.ems.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.ems.util.JPAUtil;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em= JPAUtil.getEntityManager();
		EntityTransaction et= em.getTransaction();
		
		Book b1=new Book();
		b1.setBookNo(111);
		b1.setBookTitle("OCA");
		b1.setBookPrice(1500.0F);
		
		Book b2=new Book();
		b2.setBookNo(222);
		b2.setBookTitle("JAVA");
		b2.setBookPrice(250.0F);
		
		

		Set<Book> bset=new HashSet<Book>();
		bset.add(b1);
		bset.add(b2);
		
		Author a1= new Author();
		a1.setAuth_id(1);
		a1.setAuth_name("James");
		a1.setBookset(bset);
		
		Set<Author> autset= new HashSet<Author>();
		autset.add(a1);
		
		et.begin();
		em.persist(a1);
		et.commit();
		System.out.println("author inserted");
		
		
		
	}

}
