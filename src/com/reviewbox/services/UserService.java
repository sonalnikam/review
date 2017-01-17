package com.reviewbox.services;

import java.util.List;

import com.reviewbox.model.Category;
import com.reviewbox.model.Userdb;


public interface UserService {

	public String registerUser(Userdb user);
	
/*	public List<Category>categoryList();*/
	
	public Userdb validateUser(String email,String password);
	
	public boolean emailExists(String email);
		

}
