package com.kali.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kali.demo.dao.ResultsServicesDao;
import com.kali.demo.dao.UserDao;
import com.kali.demo.model.Results;
import com.kali.demo.model.Users;
import com.kali.demo.services.GenerateCoupon;
import com.kali.demo.services.ResultService;
import com.kali.demo.services.SendMail;

@Controller
public class AppController {

	@Autowired
	SendMail sendMail;
	
	@Autowired
	UserDao udao;
	
	@Autowired
	ResultsServicesDao resultsServices;
	
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/answer")
	public String answer(Users user)
	{	
		udao.save(user);
		System.out.println(user);
		
		new Thread(() -> {
			sendMail.responseMail(user.getUmail());
		}).start();
	
		return "index";
	}
	
	@RequestMapping("/results")
	public String results(Results results)
	{
		
		return "success";
		
	}
	
	@RequestMapping("/about")
	public String about()
	{
		resultsServices.checkAnswer();
		return "about";
	}
	
	@RequestMapping("/services")
	public String services()
	{
		resultsServices.sendCoupons();
		return "services";
		
	}
	
}
