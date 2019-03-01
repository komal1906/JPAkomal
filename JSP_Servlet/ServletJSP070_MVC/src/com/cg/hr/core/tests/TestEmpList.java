package com.cg.hr.core.tests;

import java.util.ArrayList;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.exceptions.EmpException;
import com.cg.hr.core.service.EmployeeService;
import com.cg.hr.core.service.EmployeeServiceImpl;

public class TestEmpList {

	public static void main(String[] args) throws EmpException {
		EmployeeService empSer= new EmployeeServiceImpl();
		try
		{
		
		System.out.println("fetch all records\n");
		ArrayList<Employee> empList= empSer.fetchAllEmp();
		for(Employee emp :empList)
		{
			System.out.println(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getEmpSal());
		}
		}
		catch(EmpException e)
		{
			e.printStackTrace();
		}

	}

	

}


