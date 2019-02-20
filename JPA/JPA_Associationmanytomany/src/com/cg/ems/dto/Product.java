package com.cg.ems.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product_master")
public class Product {
	@Id
	@Column(name="prod_code", length=10)
	private int productCode;
	@Column(name="prod_name", length=15)
	private String prodName;
	@Column(name="prod_price" ,length=5)
	private int productPrice;
	
	@ManyToMany(mappedBy="productSet")
	
	
	Set<Supplier> supSet= new HashSet<Supplier>();
	
	
	public Set<Supplier> getSupSet() {
		return supSet;
	}
	public void setSupSet(Set<Supplier> supSet) {
		this.supSet = supSet;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public Product(int productCode, String prodName, int productPrice) {
		super();
		this.productCode = productCode;
		this.prodName = prodName;
		this.productPrice = productPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(int productCode, String prodName, int productPrice, Set<Supplier> supSet) {
		super();
		this.productCode = productCode;
		this.prodName = prodName;
		this.productPrice = productPrice;
		this.supSet = supSet;
	}
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", prodName=" + prodName + ", productPrice=" + productPrice
				+ ", supSet=" + supSet + "]";
	}
	
	

}
