package com.cg.ems.dto;

import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.ems.util.JPAUtil;

public class TestOneToManyDemo {
	public static void main(String args[])
	{
		EntityManager em= JPAUtil.getEntityManager();
		EntityTransaction et= em.getTransaction();
		
		
		Department d1= new Department();
		d1.setDeptCode(10);
		d1.setDeptName("Admin");
		
		Department d2= new Department();
		d2.setDeptCode(20);
		d2.setDeptName("Sales");
		
		Employee e1= new Employee();
		e1.setEmpId(111);
		e1.setEmpName("komal");
		e1.setEmpSal(500.0F);
		e1.setEmpDept(d1);
		
		Employee e2= new Employee();
		e2.setEmpId(222);
		e2.setEmpName("sonal");
		e2.setEmpSal(1500.0F);
		e2.setEmpDept(d1);
		
		Employee e3= new Employee();
		e3.setEmpId(333);
		e3.setEmpName("jyoti");
		e3.setEmpSal(2500.0F);
		e3.setEmpDept(d2);
		
		Employee e4= new Employee();
		e4.setEmpId(444);
		e4.setEmpName("kavita");
		e4.setEmpSal(1200.0F);
		e4.setEmpDept(d2);
		
		HashSet<Employee> adminEmpSet= new HashSet<Employee>();
		adminEmpSet.add(e1);
		adminEmpSet.add(e2);
		
		HashSet<Employee> saleEmpSet= new HashSet<Employee>();
		saleEmpSet.add(e3);
		saleEmpSet.add(e4);
		
		d1.setEmpSet(adminEmpSet);
		d2.setEmpSet(saleEmpSet);
		
		et.begin();
		em.persist(d1);
		em.persist(d2);
		et.commit();
		System.out.println("dept inserted");
		
		/*
		et.begin();
		em.persist(e1);// when we only want to add in employee table only
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		et.commit();
		System.out.println("emp inserted");
		*/
		
		
		
		
	}
}
