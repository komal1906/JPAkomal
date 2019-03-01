package com.cg.spring.beans;

import org.springframework.beans.factory.DisposableBean;

public class Employee {
	private String firstName;
	private String lastName;
	private int age;
	Department dept;
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", dept=" + dept + "]";
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Employee(String firstName, String lastName, int age, Department dept) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dept = dept;
	}
	/*public Employee(String name, int age) {
		super();
		firstName = name.substring(0,name.indexOf(""));
		lastName = name.substring(name.indexOf(""));
		this.age = age;
	}*/
	public Employee() {
		//dept= new Department(1,"IT");
	}
	
	//for constructor auto-wiring
	public Employee(Department d1) {
		this.dept=d1;
	}
	
	public void m1()
	{
		System.out.println("m1 to work");
	}
	public void m2()
	{
		System.out.println("m2 to clean");
	}
	
	

}
