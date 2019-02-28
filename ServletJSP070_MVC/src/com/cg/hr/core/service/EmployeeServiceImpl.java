package com.cg.hr.core.service;

import java.util.ArrayList;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.daos.EmployeeDao;
import com.cg.hr.core.daos.EmployeeDaoImpl;
import com.cg.hr.core.exceptions.EmpException;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao dao;
	public EmployeeServiceImpl() throws EmpException
	{
	 dao=new EmployeeDaoImpl();
	}
	public ArrayList<Employee> fetchAllEmp() throws EmpException
	{
		return dao.fetchAllEmp();
	}
	
	

}
