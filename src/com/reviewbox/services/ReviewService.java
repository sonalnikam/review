package com.reviewbox.services;

import java.util.ArrayList;
import java.util.List;

import com.reviewbox.model.Category;
import com.reviewbox.model.Review;

public interface ReviewService {
	
	ArrayList<Review> getReviewList(Review review);

	ArrayList<Review> getReviewByCat(Category cat);

	String addReviewByCat(Review review);
	
	public List<Category>categoryList();

	Category getCategoryById(int catid);

	

	ArrayList<Category> getCategory(Review review);

	public ArrayList<Review> readAllReview(int catid);

	String addCategory(Category category);

}
