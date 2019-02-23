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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//salve
@Entity
@Table(name= "book")
public class Book {
	
	@Id
	@Column(name="book_no", length=10)
	private int bookNo;
	@Column(name="book_title", length=20)
	private String bookTitle;
	@Column(name="book_price", length=5)
	private float bookPrice;
	
	
	@ManyToMany(mappedBy="bookset")
	Set<Author> authorset= new HashSet<Author>();
	
	
	public Set<Author> getAuthorset() {
		return authorset;
	}
	public void setAuthorset(Set<Author> authorset) {
		this.authorset = authorset;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Book(int bookNo, String bookTitle, float bookPrice) {
		super();
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}
	public Book() {
		super();
	
	}
	
	public Book(int bookNo, String bookTitle, float bookPrice, Set<Author> authorset) {
		super();
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.authorset = authorset;
	}
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", bookTitle=" + bookTitle + ", bookPrice=" + bookPrice + "]";
	}
	
	

}
