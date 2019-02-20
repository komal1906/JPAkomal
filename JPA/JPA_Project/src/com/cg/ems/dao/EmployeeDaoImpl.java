package com.cg.ems.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.ems.dto.Employee;
import com.cg.ems.util.JPAUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	
	EntityManager em=null;
	EntityTransaction entityTran= null;
	
	public EmployeeDaoImpl()
	{
		
		em= JPAUtil.getEntityManager();
		entityTran= em.getTransaction();
		
	}
	public Employee addEmp(Employee emp)
	{
		
		entityTran.begin();
		em.persist(emp);//(persist-insert) (merge -update) (find- search) (remove-delete)
		entityTran.commit();
		
		return emp;
	}
	public ArrayList<Employee> fetchAllEmp()
	{
	
		String selAllQry="SELECT emps FROM Employee emps";
		TypedQuery<Employee> tq= em.createQuery(selAllQry,Employee.class);
		ArrayList<Employee>  empList= (ArrayList) tq.getResultList();
		
		return empList;
	}
	public Employee deleteEmp (int empId)
	{
		
		Employee  e1=em.find(Employee.class, empId);
		entityTran.begin();
		em.remove(e1);
		entityTran.commit();
		return e1;
	}
	public Employee getEmpbyEid(int empId)
	{
		Employee ee= em.find(Employee.class, empId);
		return ee;
	}
	public Employee updateEmp(int empId, String newName, float NewSal)
	{
		Employee ee=em.find(Employee.class, empId);
		ee.setEmpName(newName);
		ee.setEmpSal(NewSal);
		entityTran.begin();
		em.merge(ee);
		entityTran.commit();
		return ee;
		
		
	}

}
