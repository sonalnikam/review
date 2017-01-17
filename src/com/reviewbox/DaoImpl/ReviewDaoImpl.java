package com.reviewbox.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reviewbox.Dao.ReviewDao;
import com.reviewbox.model.Category;
import com.reviewbox.model.Review;
import com.reviewbox.model.Userdb;

@Repository
public class ReviewDaoImpl implements ReviewDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public ArrayList<Review> getReviewList(Review review) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Review> getReviewByCat(Category cat) {
		ArrayList<Review> review =  (ArrayList<Review>) sessionFactory.getCurrentSession().createQuery("Select c from Review c where c.category=:cat ").setParameter("cat",cat);
		System.out.println(review);
		return review;
	}
/*
	@Override
	public String addReviewByCat(Review review) {
		System.out.println("In add review");
		Category category =new Category();
		category.setCatid(1);
		Userdb userdb = new Userdb();
		userdb.setUserid(1);
		review=new Review("goods", 8, "springs", category,userdb);
		sessionFactory.getCurrentSession().save(review);
		return "success";
	}
*/
	@Override
	public String addReviewByCat(Review review) {
		sessionFactory.getCurrentSession().save(review);
		return "success";
	}
	
	
	@Override
	public List<Category> categoryList() {
		
		List<Category> list = sessionFactory.getCurrentSession().createQuery("from Category").list();
		
		return list;
	}

	@Override
	public Category getCategoryById(int catid) {
		System.out.println("in category");
		return (Category) sessionFactory.getCurrentSession().createQuery("select b from Category b where b.catid= :catid")
				.setParameter("catid", catid).uniqueResult();
		
	
	}

	@Override
	public ArrayList<Category> getCategory(Review review, Class<Review> class1) {
		Session mySession = sessionFactory.getCurrentSession();
		Query query = mySession.createQuery("select d from Category d where d.review = :review");
		query.setEntity("review", review);
		
		return new ArrayList<Category>(query.list());
	}

	@Override
	public ArrayList<Review> readAllReview(int catid) {
		System.out.println("inside daoimpl"+catid);
		ArrayList<Review> list=(ArrayList<Review>) sessionFactory.getCurrentSession().createQuery("select c from Review c where c.catid= :catid").setParameter("catid", catid).list();
		
		System.out.println(list);
		return list;
	}

	public String addCategory(Category category) {
		sessionFactory.getCurrentSession().save(category);
		return "success";
	}


}