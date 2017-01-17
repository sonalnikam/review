package com.reviewbox.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.reviewbox.model.Userdb;
import com.reviewbox.services.UserService;

@Controller
//@RequestMapping(value = "user")
public class UserController {

	@Autowired
	private UserService userSer;

	@Autowired
	HttpSession httpSession;

	@RequestMapping(value = "/register" , method=RequestMethod.POST)
	public String register(String email , String password , String name) {
		Userdb userdb=new Userdb(email, password, name);
		userSer.registerUser(userdb);
		System.out.println(email + password);
		return "thankyou";
	}

/*	@RequestMapping(value = "/listcat")
	public void categoryList() {

		System.out.println(userSer.categoryList());
	}
	*/
	
	

	/*
	 * @RequestMapping(value = "/validateUser") public String
	 * validateUser(String email, String password, HttpSession hs,Model map) {
	 * Userdb user = userSer.validateUser(email, password); //if
	 * (user.getEmail()=="adil@gmail.com" && user.getPassword()=="welcome@080")
	 * { {
	 * 
	 * //hs.setAttribute("user",userSer.validateUser(user.getEmail(),user.
	 * getPassword())); return "main_page"; } }else {
	 * 
	 * return "index"; }
	 */
	
	
	@RequestMapping(value = "/validateUser"  , method = RequestMethod.POST)
	public  String validateUser( String email,  String password) {
		Userdb dto = userSer.validateUser(email, password);
		System.out.println(dto);
		if(dto==null)
			return "redirect:failure.jsp";
		httpSession.setAttribute("user", dto);
		return "redirect:home.jsp";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		httpSession.invalidate();
		return "redirect:index.jsp";
	}

}
