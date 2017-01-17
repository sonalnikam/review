package com.reviewbox.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reviewbox.Dao.FunctionalityDao;
import com.reviewbox.model.Category;
import com.reviewbox.model.Userdb;

@Repository
public class functionalityDaoImpl implements FunctionalityDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public String registerUser(Userdb user) {
		sessionFactory.getCurrentSession().save(user);
		return "success";
		
	}

/*	@Override
	public List<Category> categoryList() {
		
		List<Category> list = sessionFactory.getCurrentSession().createQuery("from Category").list();
		
		return list;
	}*/
	@Override
	public Userdb validateUser(String email, String password) {
		
		Query myQuery = sessionFactory.getCurrentSession().createQuery("Select c from Userdb c where c.email=:email and c.password=:password");
		myQuery.setString("email", email);
		myQuery.setString("password",password);
		return (Userdb) myQuery.uniqueResult();
	}

	@Override
	public boolean emailExists(String email) {
		
		Query myQuery =sessionFactory.getCurrentSession().createQuery("Select c from Userdb c where c.email=:email");
		myQuery.setString("email", email);
		if(myQuery.uniqueResult()!=null){
			return true;
		}
		return false;
	}
	
	

}
