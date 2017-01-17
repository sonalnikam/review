package com.reviewbox.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CATEGORIES database table.
 * 
 */
@Entity
@Table(name="CATEGORIES")
//@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int catid;

	private String catname;

	//bi-directional many-to-one association to Review
//	@OneToMany(mappedBy="category", fetch=FetchType.EAGER)
//	private List<Review> reviews;

	
	public Category() {
	}

	public long getCatid() {
		return this.catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public String getCatname() {
		return this.catname;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}

//	public List<Review> getReviews() {
//		return this.reviews;
//	}
//
//	public void setReviews(List<Review> reviews) {
//		this.reviews = reviews;
//	}

//	public Review addReview(Review review) {
//		getReviews().add(review);
//		review.setCategory(this);
//
//		return review;
//	}
//
//	public Review removeReview(Review review) {
//		getReviews().remove(review);
//		review.setCategory(null);
//
//		return review;
//	}

	public Category(int catid, String catname) {
		super();
		this.catid = catid;
		this.catname = catname;
//		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Category [catid=" + catid + ", catname=" + catname + "]";
	}

}