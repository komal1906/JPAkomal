package com.cg.ems.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity 
@Table(name="emp19")// if we don't write then it will create automatically by class name
public class Employee {
	@Id//map when we want with primary key and identity and also it is mandatory
	@GeneratedValue(strategy=GenerationType.AUTO)// auto ,table ,sequence ,identity - for generating  primary key
	@Column(name="emp_id", length=20)// if we don't write then it will create automatically by table  name
	private int empId;
	@Column(name="emp_name", length=30)
	private String empName;
	@Column(name="emp_sal", length=10)
	private float empSal;
	@Transient// when we don't want mapping
	private LocalDate empDOJ;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	public LocalDate getEmpDOJ() {
		return empDOJ;
	}
	public void setEmpDOJ(LocalDate empDOJ) {
		this.empDOJ = empDOJ;
	}
	public Employee(int empId, String empName, float empSal, LocalDate empDOJ) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDOJ = empDOJ;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDOJ=" + empDOJ + "]";
	}
	

}
