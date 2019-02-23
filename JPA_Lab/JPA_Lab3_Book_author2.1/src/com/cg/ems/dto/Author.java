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
import javax.persistence.OneToMany;
import javax.persistence.Table;
//master
@Entity
@Table(name="author")
public class Author {
	
	@Id
	@Column(name="author_id", length=6)
	private int auth_id;
	@Column(name="author_name" , length=25)
	private String auth_name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="author_book",joinColumns= {@JoinColumn(name="author_id")},inverseJoinColumns= {@JoinColumn(name="book_no")})
	
	Set<Book> bookset= new HashSet<Book>();
	
	public Set<Book> getBookset() {
		return bookset;
	}
	public void setBookset(Set<Book> bookset) {
		this.bookset = bookset;
	}
	public int getAuth_id() {
		return auth_id;
	}
	public void setAuth_id(int auth_id) {
		this.auth_id = auth_id;
	}
	public String getAuth_name() {
		return auth_name;
	}
	public void setAuth_name(String auth_name) {
		this.auth_name = auth_name;
	}
	public Author(int auth_id, String auth_name) {
		super();
		this.auth_id = auth_id;
		this.auth_name = auth_name;
	}
	
	
	public Author(int auth_id, String auth_name, Set<Book> bookset) {
		super();
		this.auth_id = auth_id;
		this.auth_name = auth_name;
		this.bookset = bookset;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
