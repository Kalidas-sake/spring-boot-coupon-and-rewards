package com.kali.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kali.demo.dao.ResultsDao;
import com.kali.demo.dao.ResultsServicesDao;
import com.kali.demo.dao.UserDao;
import com.kali.demo.model.Results;
import com.kali.demo.model.Users;
import com.kali.demo.services.SendMail;

@Controller
public class AppController {

	@Autowired
	SendMail sendMail;
	
	@Autowired
	UserDao udao;
	
	@Autowired
	ResultsServicesDao resultsServices;
	
	@Autowired
	ResultsDao rdao;
	
	@Autowired
	Optional<Results> results;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/answer")
	public ModelAndView answer(Users user)
	{	
		ModelAndView mv = new ModelAndView("index");
		try {
		udao.save(user);
		System.out.println(user);
		}
		catch(DataIntegrityViolationException e) {
			mv.addObject("ex", "You Can response only once.");
			
			
		}
		new Thread(() -> {
			sendMail.responseMail(user.getUmail());
		}).start();
		
		
	
		return mv;
	}
	
	@RequestMapping("/results")
	public String results(Results results)
	{
		
		return "success";
		
	}
	
	@RequestMapping("/about")
	public String about()
	{
		//resultsServices.checkAnswer();
		return "about";
	}
	
	@RequestMapping("/services")
	public ModelAndView services()
	{
		ModelAndView  mv = new ModelAndView("services"); 
		//resultsServices.sendCoupons();
//		results = rdao.findById(1);
//		mv.addObject("obj", results);
		return mv;
		
	}
	
}
