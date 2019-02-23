package com.cg.author.service;

import java.util.ArrayList;

import com.cg.author.dao.AuthorDao;
import com.cg.author.dao.AuthorDaoImpl;
import com.cg.author.dto.Author;


public class AuthorServiceImpl implements AuthorService {
	AuthorDao autDao=null;
	public AuthorServiceImpl()
	{
		 autDao=new AuthorDaoImpl();
	}
	public Author addAut(Author aut) 
	{
		return autDao.addAut(aut);
	}
	public ArrayList<Author> fetchAllAut()
	{
		return autDao.fetchAllAut();
	}
	public Author deleteAut (int autId)
	{
		return autDao.deleteAut(autId);
	}
	public Author getAutbyEid(int autId)
	{
		return autDao.getAutbyEid(autId);
	}
	public Author updateAut(int autId, String autFirstName, String autMiddleName, String autLastName, String autPhoneNo)
	{
		return autDao.updateAut(autId, autFirstName, autMiddleName, autLastName, autPhoneNo);
	}

}
