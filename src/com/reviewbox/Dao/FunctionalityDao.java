package com.reviewbox.Dao;

import java.util.List;

import com.reviewbox.model.Category;
import com.reviewbox.model.Userdb;

public interface FunctionalityDao {
	
	public String registerUser(Userdb user);
	
	public Userdb validateUser(String email,String password);
	
	public boolean emailExists(String email);

	/*public  List<Category> categoryList();*/

}
