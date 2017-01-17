package com.reviewbox.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the REVIEW database table.
 * 
 */
@Entity
//@NamedQuery(name="Review.findAll", query="SELECT r FROM Review r")
public class Review implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int revid;

	private String description;

	private int rating;

	private String title;
	
	private int catid;
	
	private int userid;

/*	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="CATID")
	private Category category;

	//bi-directional many-to-one association to Userdb
	@ManyToOne
	@JoinColumn(name="USERID")
	private Userdb userdb;*/

	public Review() {
	}

	public long getRevid() {
		return this.revid;
	}

	public void setRevid(int revid) {
		this.revid = revid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/*public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Userdb getUserdb() {
		return this.userdb;
	}

	public void setUserdb(Userdb userdb) {
		this.userdb = userdb;
	}

	public Review(int revid, String description, int rating, String title, Category category, Userdb userdb) {
		super();
		this.revid = revid;
		this.description = description;
		this.rating = rating;
		this.title = title;
		this.category = category;
		this.userdb = userdb;
	}
*/
	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	
/*
	public Review(String description, int rating, String title, Category category, Userdb userdb) {
		super();
		this.description = description;
		this.rating = rating;
		this.title = title;
		this.category = category;
		this.userdb = userdb;
	}*/

	public Review(int revid, String description, int rating, String title, int catid, int userid) {
		super();
		this.revid = revid;
		this.description = description;
		this.rating = rating;
		this.title = title;
		this.catid = catid;
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Review [revid=" + revid + ", description=" + description + ", rating=" + rating + ", title=" + title
				+ ", catid=" + catid + ", userid=" + userid + "]";
	}


}