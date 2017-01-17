package com.reviewbox.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.reviewbox.Dao.FunctionalityDao;
import com.reviewbox.model.Category;
import com.reviewbox.model.Userdb;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private FunctionalityDao fundao;
	
	@Override
	public String registerUser(Userdb user) {
		  fundao.registerUser(user);
		  return "success";
	}

	/*@Override
	public List<Category> categoryList() {
		return fundao.categoryList();
	}
*/
	@Override
	@Transactional(readOnly = true)
	public Userdb validateUser(String email, String password) {
		return fundao.validateUser(email, password);
	}

	@Override
	@Transactional(readOnly = true)
	public boolean emailExists(String email) {
		return fundao.emailExists(email);
	}
}
