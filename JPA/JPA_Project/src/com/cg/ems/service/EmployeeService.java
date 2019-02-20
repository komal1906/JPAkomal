package com.cg.ems.service;

import java.util.ArrayList;

import com.cg.ems.dto.Employee;

public interface EmployeeService {

	public Employee addEmp(Employee emp);
	public ArrayList<Employee> fetchAllEmp();
	public Employee deleteEmp (int empId);
	public Employee getEmpbyEid(int empId);
	public Employee updateEmp(int empId, String newName, float NewSal);
}
