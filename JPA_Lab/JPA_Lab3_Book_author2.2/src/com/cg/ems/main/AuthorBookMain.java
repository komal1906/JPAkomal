package com.cg.ems.main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.cg.ems.dto.Author;
import com.cg.ems.dto.Book;
import com.cg.ems.service.AuthorBookService;
import com.cg.ems.service.AuthorBookServiceImpl;
import com.cg.ems.util.JPAUtil;

public class AuthorBookMain {

	public static void main(String[] args) {
		
		AuthorBookService service = new AuthorBookServiceImpl();
		System.out.println("Enter 1 for Find book by id");
		System.out.println("Enter 2 for Fetch All books");
		System.out.println("Enter 3 for Find book Author");
		System.out.println("Enter 4 for books within Price");
		System.out.println("Enter 5 for Exit");
		Scanner sc= new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
	
			System.out.println(" Enter book id");
			Scanner sc1= new Scanner(System.in);
			int i=sc.nextInt();
			System.out.println("Details"+service.getBookById(i));
			break;
		}
		
		case 2:
		{
			for(Book book:service.getAllBooks()) 
			{
				System.out.println(book);
			
			}
			break;
		}
		
		case 3:
		{
		
			System.out.println("book by author");
			for(Author book:service.getAuthorBooks(1) ) 
			{
				System.out.println(book);
			}
		break;
		}
		
		case 4:
		{
		/*

		System.out.println("books within price");
		for(Book book:service.getBooksInPriceRange(100, 600) ) {
			System.out.println(book);
		}
		
		*/
		break;
		}
		case 5:
		{
			System.exit(0);
			break;
		}

}
}	
}