package com.cg.ems.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.ems.dto.Employee;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImpl;

public class TestEmpJpaDemo {

	public static void main(String[] args) {
		EmployeeService empSer= new EmployeeServiceImpl();
		
		/*this all for insert 
		Employee e1= new Employee(111,"sonal", 4500.0F, null);
		Employee e2= new Employee(444,"krishna", 5500.0F, null);
		
		//Employee e1= new Employee(); 
		//Employee e2= new Employee();
		//e1.setEmpName("aaa");
		//e1.setEmpSal(8520.0F);
		//e2.setEmpName("bbb");
		//e2.setEmpSal(4850.0F);
		Employee ee1=empSer.addEmp(e1);
		Employee ee2=empSer.addEmp(e2);
		System.out.println(ee1 +"\nand" + ee2 +"\n are inserted into table");
		
		*/
		
		/*this is for get details by id
		Employee ee1=empSer.getEmpbyEid(111);
		System.out.println(ee1);
		*/
		
		/*this is for fetching all the details from the table
		System.out.println("fetch all records\n");
		ArrayList<Employee> eList= empSer.fetchAllEmp();
		for(Employee tempE :eList)
		{
			System.out.println(tempE.getEmpId()+"\t"+tempE.getEmpName()+"\t"+tempE.getEmpSal());
		}
		*/
		
		/*this is for delete an employee details
		System.out.println("delete\n");
		Employee ee1=empSer.deleteEmp(111);
		System.out.println(ee1+"deleted");
		*/
		 
		System.out.println("----Updated---");
		Employee updateqry=empSer.updateEmp(61, "Jyoti", 78940);
		System.out.println("updated "+updateqry.getEmpId());
		
	
		
	}

}

















/*System.out.println("Enter 1 for Add Employee");
System.out.println("Enter 2 for Fetch All Employees ");
System.out.println("Enter 3 for Delete an Employee");
System.out.println("Enter 4 for Get Detail of an Employee");
System.out.println("Enter 5 for Update Employee Detail");
System.out.println("Enter 6 for Exit");
Scanner sc= new Scanner(System.in);
while(true)
{
	int choice= sc.nextInt();
	switch(choice)
	{
	case 1:
	{
		Employee e1= new Employee(555,"nidhi", 5500.0F, null);
		Employee e2= new Employee(666,"umesh", 6500.0F, null);
		
		Employee e1= new Employee(); 
		Employee e2= new Employee();
		e1.setEmpName("aaa");
		e1.setEmpSal(8520.0F);
		e2.setEmpName("bbb");
		e2.setEmpSal(4850.0F);
		
		Employee ee1=empSer.addEmp(e1);
		Employee ee2=empSer.addEmp(e2);
		System.out.println(ee1 +"\nand" + ee2 +"\n are inserted into table");
		break;
	}
	}
}*/
