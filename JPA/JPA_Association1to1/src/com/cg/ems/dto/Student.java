package com.cg.ems.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="roll_no",length=10)
	private int rollNo;
	
	@Column(name="stu_name",length=25)
	private String studName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address studAddress;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public Address getStudAddress() {
		return studAddress;
	}
	public void setStudAddress(Address studAddress) {
		this.studAddress = studAddress;
	}
	public Student(int rollNo, String studName, Address studAddress) {
		super();
		this.rollNo = rollNo;
		this.studName = studName;
		this.studAddress = studAddress;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studName=" + studName + ", studAddress=" + studAddress + "]";
	}
	

}
