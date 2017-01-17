package com.reviewbox.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reviewbox.Dao.ReviewDao;
import com.reviewbox.model.Category;
import com.reviewbox.model.Review;

@Service
@Transactional
public class ReviewServiceimpl implements ReviewService {
	
	
	@Autowired
	private ReviewDao rdao;

	@Override
	@Transactional
	public ArrayList<Review> getReviewList(Review review) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public ArrayList<Review> getReviewByCat(Category cat) {
	return rdao.getReviewByCat(cat);
		
	}

	@Override
	@Transactional
	public String addReviewByCat(Review review) {
		//rdao.addReviewByCat(review);
		if(rdao.addReviewByCat(review)== "success")
			return "success";
		else
		return "error";
	}

	@Override
	public List<Category> categoryList() {
		return rdao.categoryList();
		
	}

	@Override
	public Category getCategoryById(int catid) {
		return rdao.getCategoryById(catid);
	}

	@Override
	public ArrayList<Category> getCategory(Review review) {
		ArrayList<Category> list = new ArrayList<Category>();
		ArrayList<Category> daolist = rdao.getCategory(review, Review.class);
		for (Category p : daolist) {
			list.add(p);
		}
		return list;
	}

	@Override
	public ArrayList<Review> readAllReview(int catid) {
	
		return rdao.readAllReview(catid);
	}

	@Override
	public String addCategory(Category category) {
		
		return rdao.addCategory(category);
	}


	
	
	

}
