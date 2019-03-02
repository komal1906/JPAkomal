package com.cg.ems.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.ems.dto.Author;
import com.cg.ems.dto.Book;
import com.cg.ems.util.JPAUtil;

public class AuthorBookDaoImpl implements AuthorBookDao {
	
	EntityManager em= JPAUtil.getEntityManager();
	EntityTransaction et= em.getTransaction();
	
	public Book getBookById(int id)
	{
		Book b=em.find(Book.class, id);
		return b;
	}

	public List<Author> getAuthorBooks(int authorid)
	{
		return null;
	}

	public List<Book> getAllBooks()
	{
		TypedQuery<Book> q=em.createQuery("Select book from Book book", Book.class);
		List<Book> bl = q.getResultList();
		return bl;
	}

	public List<Book> getBooksInPriceRange(double low, double high)
	{
		return null;
		
		
	}

}
