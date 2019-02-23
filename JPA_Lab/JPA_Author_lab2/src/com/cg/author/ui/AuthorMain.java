package com.cg.author.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.author.dto.Author;
import com.cg.author.service.AuthorService;
import com.cg.author.service.AuthorServiceImpl;

public class AuthorMain {

	public static void main(String[] args) {
		AuthorService autser= new AuthorServiceImpl();
		System.out.println("Enter 1 for Add Author");
		System.out.println("Enter 2 for Fetch All Author");
		System.out.println("Enter 3 for Delete an Author");
		System.out.println("Enter 4 for Get Detail of an Author");
		System.out.println("Enter 5 for Update Author Detail");
		System.out.println("Enter 6 for Exit");
		Scanner sc= new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			Author a1= new Author();
			System.out.println("enter the id");
			Scanner s= new Scanner(System.in);
			int i=s.nextInt();
			a1.setAutId(i);
			System.out.println("Enter first name");
			String fn=s.next();
			a1.setAutFirstName(fn);
			System.out.println("Enter Middle name");
			String mn=s.next();
			a1.setAutMiddleName(mn);
			System.out.println("Enter Last name");
			String ln=s.next();
			a1.setAutLastName(ln);
			System.out.println("Enter Mobile Number");
			String mob=s.next();
			a1.setAutPhoneNo(mob);
			Author aut1=autser.addAut(a1);
			System.out.println("Author is Inserted");
			break;
		}
		case 2:
		{
			ArrayList<Author> a1= autser.fetchAllAut();
			for(Author aut:a1)
			{
				System.out.println(aut.getAutId()+"\t"+aut.getAutFirstName()+"\t"+aut.getAutMiddleName()+"\t"+aut.getAutLastName()+"\t"+aut.getAutPhoneNo());
			}
			break;
		}
		case 3:
		{
			System.out.println("Enter the Id to delete all records");
			Scanner s= new Scanner(System.in);
			int i=s.nextInt();
			Author a1=autser.deleteAut(i);
			System.out.println("Author is Deleted");
			break;
		}
		case 4:
		{
			System.out.println("Enter the Id to find a detail");
			Scanner s= new Scanner(System.in);
			int i=s.nextInt();
			Author aut=autser.getAutbyEid(i);
			System.out.println(aut.getAutId()+"\t"+aut.getAutFirstName()+"\t"+aut.getAutMiddleName()+"\t"+aut.getAutLastName()+"\t"+aut.getAutPhoneNo());
			break;
		}
		case 5:
		{	
			Author a1= new Author();
			System.out.println("enter the id which we want to change details");
			Scanner s= new Scanner(System.in);
			int i=s.nextInt();
			a1.setAutId(i);
			System.out.println("Enter new first name");
			String fn=s.next();
			a1.setAutFirstName(fn);
			System.out.println("Enter new Middle name");
			String mn=s.next();
			a1.setAutMiddleName(mn);
			System.out.println("Enter new Last name");
			String ln=s.next();
			a1.setAutLastName(ln);
			System.out.println("Enter new Mobile Number");
			String mob=s.next();
			a1.setAutPhoneNo(mob);
			Author updateqry=autser.updateAut(i, fn, mn, ln, mob);
			System.out.println("Author is Updated  ");
			break;
		}
		case 6:
		{
			System.exit(0);
			
		}
		default:
		{
			System.out.println("Wrong Choice");
		}
		}
	}

}
