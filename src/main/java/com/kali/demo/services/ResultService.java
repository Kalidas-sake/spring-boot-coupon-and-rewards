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
import java.util.Optional;
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
	//@Scheduled(cron = "0 13 22 * * ?")
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
	//@Scheduled(cron = "0 13 22 * * ?")
	public void sendCoupons() {
		//System.out.println("scheduled");
		List<Results> lst = new ArrayList<Results>();
		lst = rdao.findAll();
		
		//Iterator<Results> iterate = lst.iterator();
		while(!lst.isEmpty())
		{
			final Users user;
			final Results result;
			
			final int size = lst.size();
			Random rand = new Random();
			result = lst.get(rand.nextInt(size-1));
			System.out.println(result);
			
			rdao.deleteById(result.getRid());
		}
	}
	
}
