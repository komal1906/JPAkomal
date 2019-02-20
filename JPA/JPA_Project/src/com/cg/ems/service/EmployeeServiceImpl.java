package com.cg.ems.service;

import java.util.ArrayList;

import com.cg.ems.dao.EmployeeDao;
import com.cg.ems.dao.EmployeeDaoImpl;
import com.cg.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao empDao=null;
	public EmployeeServiceImpl()
	{
		 empDao=new EmployeeDaoImpl();
	}
	public Employee addEmp(Employee emp)
	{
		return empDao.addEmp(emp);
	}
	public ArrayList<Employee> fetchAllEmp()
	{
		return empDao.fetchAllEmp();
	}
	public Employee deleteEmp (int empId)
	{
		return empDao.deleteEmp(empId);
	}
	public Employee getEmpbyEid(int empId)
	{
		return empDao.getEmpbyEid(empId);
	}
	public Employee updateEmp(int empId, String newName, float NewSal)
	{
		return empDao.updateEmp(empId, newName, NewSal);          
	}
	

}
