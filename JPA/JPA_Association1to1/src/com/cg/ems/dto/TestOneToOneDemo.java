package com.cg.ems.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.ems.util.JPAUtil;

public class TestOneToOneDemo {
	public static void main(String args[])
	{
		EntityManager em= JPAUtil.getEntityManager();
		EntityTransaction et= em.getTransaction();
		
		
		/*Address vAddress=new Address();
		vAddress.setCity("Mumbai");
		vAddress.setState("Maharashtra");
		vAddress.setStreet("Than Road");
		vAddress.setZipcode("411041");
		
		Address rAddress=new Address();
		rAddress.setCity("Delhi");
		rAddress.setState("Delhi");
		rAddress.setStreet("MG Road");
		rAddress.setZipcode("200731");
		
		Student vinita= new Student();
		vinita.setStudName("Komal");
		vinita.setStudAddress(vAddress);
		
		Student rahul= new Student();
		rahul.setStudName("Soanl");
		rahul.setStudAddress(rAddress);
		
		et.begin();
		em.persist(vinita);
		em.persist(rahul);
		et.commit();
		System.out.println("data inserted");
		
		*/
		System.out.println("find-----");
		Student st=em.find(Student.class,109);
		System.out.println(st);
		et.begin();
		em.remove(st);
		et.commit();
				
		
		
	}
}
