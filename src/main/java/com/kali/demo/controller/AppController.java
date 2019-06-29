package com.kali.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kali.demo.dao.ResultsDao;
import com.kali.demo.dao.UserDao;
import com.kali.demo.model.Users;

@Controller
public class AppController {

	@Autowired
	UserDao dao;
	
	@Autowired
    private JavaMailSender javaMailSender;
	
	@Autowired
	private ResultsDao rdao;
	
	@Value("${correct_answer}")
	private String correctAns;
	
	@RequestMapping("/")
	public String home()
	{
		System.out.println(correctAns);
		return "index";
	}
	
	@RequestMapping("/answer")
	public String answer(Users user)
	{
		dao.save(user);
		
	    SimpleMailMessage msg = new SimpleMailMessage();
	    msg.setTo(user.getUmail());

	    msg.setSubject("Welcome to Rewards and Coupons. ");
	    msg.setText("Hello "+user.getUmail() +" \nWe got your response. We will get back to you with the result. Stay tuned. \nThank You \nTeam R&C");

	    javaMailSender.send(msg);


		return "index";
	}
	
	public void result()
	{
		
	}
}
