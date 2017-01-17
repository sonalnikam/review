package com.reviewbox.Dao;

import java.util.ArrayList;
import java.util.List;

import com.reviewbox.model.Category;
import com.reviewbox.model.Review;;

public interface ReviewDao {
	
	
	
	public ArrayList<Review> getReviewList(Review review);

	public ArrayList<Review> getReviewByCat(Category cat);

	public String addReviewByCat(Review review);
	
	public  List<Category> categoryList();

	public Category getCategoryById(int catid);

	public ArrayList<Category> getCategory(Review review, Class<Review> class1);
	
	
	public ArrayList<Review> readAllReview(int catid);

	public String addCategory(Category category);
}
