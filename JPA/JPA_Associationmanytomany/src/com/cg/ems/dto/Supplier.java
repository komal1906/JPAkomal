package com.cg.ems.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="supplier_master") 
public class Supplier {
	@Id
	@Column(name="supp_Id", length=5)
	private int supplierId;
	
	@Temporal(TemporalType.DATE)
	private Date supplyDate;
	
	
	@ManyToMany(cascade=CascadeType.ALL)//ManyToMany - it is bi-directional
	@JoinTable(name="prod_supply",joinColumns= {@JoinColumn(name="supp_Id")},inverseJoinColumns= {@JoinColumn(name="prod_code")})             
	
	
	
	Set<Product> productSet= new HashSet<Product>();
	

	public Set<Product> getProductSet() {
		return productSet;
	}

	public void setProductSet(Set<Product> productSet) {
		this.productSet = productSet;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public Date getSupplyDate() {
		return supplyDate;
	}

	public void setSupplyDate(Date supplyDate) {
		this.supplyDate = supplyDate;
	}

	public Supplier(int supplierId, Date supplyDate) {
		super();
		this.supplierId = supplierId;
		this.supplyDate = supplyDate;
	}

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplyDate=" + supplyDate + ", productSet=" + productSet + "]";
	}

	public Supplier(int supplierId, Date supplyDate, Set<Product> productSet) {
		super();
		this.supplierId = supplierId;
		this.supplyDate = supplyDate;
		this.productSet = productSet;
	}

	
	

}
