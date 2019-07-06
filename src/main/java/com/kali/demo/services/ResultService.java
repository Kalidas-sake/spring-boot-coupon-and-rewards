package com.kali.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kali.demo.dao.ResultsDao;
import com.kali.demo.dao.ResultsServicesDao;
import com.kali.demo.dao.UserDao;
import com.kali.demo.model.Results;
import com.kali.demo.model.Users;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

@Component
public class ResultService implements ResultsServicesDao {

	@Value("${correct_answer}")
	private String correctAns;
	
	@Autowired
	private ResultsDao rdao;
	
	@Autowired
	SendMail sendMail;
	
	@Autowired
	private UserDao udao;
	
	@Override
	@Scheduled(cron = "0 59 16 * * ?")
	public void checkAnswer() {
		
		List<Users> ulist = new ArrayList<Users>();
		ulist = udao.findAll();
		Iterator<Users> iterate = ulist.iterator();
		while(iterate.hasNext()) {
			final Users user = iterate.next();
			final Results result;
			if(user.getUans().equals(correctAns)) {
				result = new Results();
				result.setUsers(user);
				rdao.save(result);
				new Thread(() -> {
					sendMail.correctAnsMail(user.getUmail());
				}).start();
			}
			else
			{
				new Thread(() -> {
					sendMail.incorrectAnsMail(user.getUmail());
				}).start();
			}
		}
	}

	
	@Override
	@Scheduled(cron = "0 15 11 * * ?")
	public void sendCoupons() {
		//System.out.println("scheduled");
		List<Results> lst = new ArrayList<Results>();
		lst = rdao.findAll();
		
		
		if(rdao.findBySelected(true).isEmpty()) {
		
		Random rand = new Random();
		if(lst.size()>5) {
			for(int i=0;i<5;i++) {
				Results result;
				int random_result = rand.nextInt(lst.size());
				result = lst.get(random_result);
				while(result.isSelected()) {
					random_result = rand.nextInt(lst.size());
					result = lst.get(random_result);
				}
				String coupon = GenerateCoupon.getCoupon();
				result.setSelected(true);
				rdao.save(result);
				String mail = result.getUsers().getUmail();
				System.out.println( mail+" >>>> "+ coupon);
				new Thread( () ->{
				sendMail.couponMail(mail, coupon);
				}).start();
			}
		}
		else
		{
			for (Results results : lst) {
				String coupon = GenerateCoupon.getCoupon();
				results.setSelected(true);
				rdao.save(results);
				String mail = results.getUsers().getUmail();
				System.out.println( mail+" >>>> "+ coupon);
				new Thread( () ->{
				sendMail.couponMail(mail, coupon);
				}).start();
			}
		}
	}
		System.out.println("already iterated");
	}
	
}
