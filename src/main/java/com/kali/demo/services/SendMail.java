package com.kali.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.kali.demo.model.Users;

@Component
public class SendMail {

	@Autowired
    private JavaMailSender javaMailSender;
	
	@Autowired
	Users user;
	
	
	public void responseMail(String umail) {
		try {
		SimpleMailMessage msg = new SimpleMailMessage();
	    msg.setTo(umail);

	    msg.setSubject("Welcome to Rewards and Coupons. ");
	    msg.setText("Hello "+umail +" \nWe got your response. We will get back to you with the result. Stay tuned. //Ignore if found irrelevant.//  \nThank You \nTeam R&C");

	    javaMailSender.send(msg);
		}
		catch( MailException e) {
			System.out.println("mail exception");
		}
	}
	public void resultMail(String mailId) {
		
	}
	
	
	public void couponMail(String umail, String coupon) {
		SimpleMailMessage msg = new SimpleMailMessage();
	    msg.setTo(umail);

	    msg.setSubject("You got the lucky coupon. ");
	    msg.setText("Hello "+umail +" \nCongratulations..!\nYou got lucky PayTM coupon. \n Redeem this coupon in PayTM : "+coupon+"  \nThank You \nTeam R&C");

	    javaMailSender.send(msg);
	}
	
	
	public void correctAnsMail(String umail) {
		SimpleMailMessage msg = new SimpleMailMessage();
	    msg.setTo(umail);

	    msg.setSubject("Congratulations..! ");
	    msg.setText("Hello "+umail +" \nYour answer is correct.\nWait for our mail to get lucky PayTM coupon.  \nThank You \nTeam R&C");

	    javaMailSender.send(msg);
		
	}
	
	
	public void incorrectAnsMail(String umail) {
		SimpleMailMessage msg = new SimpleMailMessage();
	    msg.setTo(umail);

	    msg.setSubject("Sorry..! ");
	    msg.setText("Hello "+umail +" \nYour answer is wrong.\nTry tommarow to get lucky PayTM coupon.  \nThank You \nTeam R&C");

	    javaMailSender.send(msg);
		
	}
}
