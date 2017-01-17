package com.reviewbox.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the USERDB database table.
 * 
 */
@Entity
//@NamedQuery(name="Userdb.findAll", query="SELECT u FROM Userdb u")
public class Userdb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userid;

	private String email;

	private String password;

	private String name;

	

	public Userdb() {
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	public Userdb( String email, String password, String name) {
		
		this.email = email;
		this.password = password;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Userdb [userid=" + userid + ", email=" + email + ", password=" + password + ", name=" + name
				+  "]";
	}
	
	
	

}