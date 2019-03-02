package com.cg.ems.service;

import java.util.List;

import com.cg.ems.dao.AuthorBookDao;
import com.cg.ems.dao.AuthorBookDaoImpl;
import com.cg.ems.dto.Author;
import com.cg.ems.dto.Book;

public class AuthorBookServiceImpl implements AuthorBookService{
	AuthorBookDao abdao= new AuthorBookDaoImpl();
	
	public Book getBookById(int id)
	{
		return abdao.getBookById(id);
		
	}

	public List<Author> getAuthorBooks(int authorid)
	{
		return abdao.getAuthorBooks(authorid);
	}

	public List<Book> getAllBooks()
	{
		return abdao.getAllBooks();
	}

	public List<Book> getBooksInPriceRange(double low, double high)
	{
		return abdao.getBooksInPriceRange(low, high);
	}

}
