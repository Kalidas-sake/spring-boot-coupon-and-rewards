package com.kali.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kali.demo.dao.UserDao;
import com.kali.demo.model.Users;

@Controller
public class AppController {

	@Autowired
	UserDao dao;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/answer")
	public String answer(Users user)
	{
		dao.save(user);
		return "index";
	}
}
