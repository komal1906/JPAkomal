package com.cg.ems.service;

import java.util.List;

import com.cg.ems.dto.Author;
import com.cg.ems.dto.Book;

public interface AuthorBookService {
	
	public Book getBookById(int id);

	public List<Author> getAuthorBooks(int authorid);

	public List<Book> getAllBooks();

	public List<Book> getBooksInPriceRange(double low, double high);


}
