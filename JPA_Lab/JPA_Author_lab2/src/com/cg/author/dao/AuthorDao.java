package com.cg.author.dao;

import java.util.ArrayList;

import com.cg.author.dto.Author;

public interface AuthorDao {
	public Author addAut(Author aut);
	public ArrayList<Author> fetchAllAut();
	public Author deleteAut (int autId);
	public Author getAutbyEid(int autId);
	public Author updateAut(int autId, String autFirstName, String autMiddleName, String autLastName, String autPhoneNo);


}
