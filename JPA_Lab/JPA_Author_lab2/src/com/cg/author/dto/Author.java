package com.cg.author.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Author {
	
	@Id
	@Column(name="author_id",length = 10)
	private int autId;
	@Column(name="First_Name",length = 10)
	private String autFirstName;
	@Column(name="Middle_Name",length = 10)
	private String autMiddleName;
	@Column(name="Last_Name",length = 10)
	private String autLastName;
	@Column(name="Phone_Num",length = 11)
	private String autPhoneNo;
	
	
	public int getAutId() {
		return autId;
	}
	public void setAutId(int autId) {
		this.autId = autId;
	}
	public String getAutFirstName() {
		return autFirstName;
	}
	public void setAutFirstName(String autFirstName) {
		this.autFirstName = autFirstName;
	}
	public String getAutMiddleName() {
		return autMiddleName;
	}
	public void setAutMiddleName(String autMiddleName) {
		this.autMiddleName = autMiddleName;
	}
	public String getAutLastName() {
		return autLastName;
	}
	public void setAutLastName(String autLastName) {
		this.autLastName = autLastName;
	}
	public String getAutPhoneNo() {
		return autPhoneNo;
	}
	public void setAutPhoneNo(String autPhoneNo) {
		this.autPhoneNo = autPhoneNo;
	}
	public Author(int autId, String autFirstName, String autMiddleName, String autLastName, String autPhoneNo) {
		super();
		this.autId = autId;
		this.autFirstName = autFirstName;
		this.autMiddleName = autMiddleName;
		this.autLastName = autLastName;
		this.autPhoneNo = autPhoneNo;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Author [autId=" + autId + ", autFirstName=" + autFirstName + ", autMiddleName=" + autMiddleName
				+ ", autLastName=" + autLastName + ", autPhoneNo=" + autPhoneNo + "]";
	}
	
	

}
