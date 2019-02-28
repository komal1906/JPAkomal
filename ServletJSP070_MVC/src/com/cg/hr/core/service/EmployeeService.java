package com.cg.hr.core.service;

import java.util.ArrayList;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.exceptions.EmpException;

public interface EmployeeService {
	public ArrayList<Employee> fetchAllEmp() throws EmpException;
	
}
