package com.cg.hr.core.beans;
import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;


	@Entity 
	@Table(name="emp19")// if we don't write then it will create automatically by class name
	public class Employee {
		@Id
		@Column(name="emp_id", length=20)// if we don't write then it will create automatically by table  name
		private int empId;// property name-empId
		@Column(name="emp_name", length=30)
		private String empName;
		@Column(name="emp_sal", length=10)
		private float empSal;
		//create table emp19(emp_id Number(5),emp_name VARCHAR(20), emp_sal NUMBER(7));
		//INSERT INTO EMP19 VALUES(111,'KOMAL',450);
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
		public Employee(int empId, String empName, float empSal) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empSal = empSal;
		}
		public Employee() {
			super();
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
		}
		

	}
