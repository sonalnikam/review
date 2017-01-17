package com.reviewbox.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reviewbox.model.Category;
import com.reviewbox.model.Review;
import com.reviewbox.model.Userdb;
import com.reviewbox.services.ReviewService;

@Controller
@RequestMapping("review")
public class reviewController {
	
	
	@Autowired
	private ReviewService reviewSer;
	
	@Autowired
	HttpSession hs;
	
	@RequestMapping(value = "/addReview" , method=RequestMethod.POST)
	public @ResponseBody String addReviewByCat(@RequestBody Review review) {
		
		Userdb udb= (Userdb) hs.getAttribute("user");
		review.setUserid(udb.getUserid());
		reviewSer.addReviewByCat(review);
		System.out.println(review + "review controller java");
		return "hello";
	}

	
	@RequestMapping(value = "/addCategory" , method=RequestMethod.POST)
	public @ResponseBody String addCategory(@RequestBody Category category) {
		
		//Userdb udb= (Userdb) hs.getAttribute("user");
	//	category.setUserid(udb.getUserid());
		reviewSer.addCategory(category);
		System.out.println(category + "review controller jhava");
		return "hello";
	}
	
	@RequestMapping(value = "/listcat" , method=RequestMethod.POST)
	public @ResponseBody List<Category> categoryList() {
		List list = reviewSer.categoryList();
		System.out.println(list);
		return list;
	}
	
	@RequestMapping(value = "/readReview" , method=RequestMethod.POST)
	public @ResponseBody List<Review> readReview(@RequestBody String catid)
	{
		int categoryId = (Integer.parseInt(catid));
		System.out.println("Catid "+categoryId);//+catid);
		List list =	reviewSer.readAllReview(categoryId);
		System.out.println("in review controller"  +list);
		return list;
	}
	
/*	@RequestMapping(value = "/getReview")
	public void getReviewByCat() {
		System.out.println("In get review controller");
		int catid=1;
		Category cat=reviewSer.getCategoryById(catid);
		System.out.println("after getting category");
		System.out.println(reviewSer.getReviewByCat(cat));
		System.out.println("after servicing");
	}
	*/
	
	@RequestMapping(value="getCategory",
			method=RequestMethod.POST)
	public @ResponseBody ArrayList<Category> getCategory(HttpSession hs){
		Userdb userdb = (Userdb)hs.getAttribute("user");
		
		return reviewSer.getCategory((Review)hs.getAttribute("user"));
	}
}
