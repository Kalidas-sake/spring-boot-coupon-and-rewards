package com.kali.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kali.demo.dao.ResultsDao;
import com.kali.demo.dao.ResultsServicesDao;
import com.kali.demo.model.Results;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

@Component
public class ResultService implements ResultsServicesDao {

	@Value("${correct_answer}")
	private String correctAns;
	
	@Autowired
	private ResultsDao rdao;
	
	@Override
	public boolean checkAnswer(String ans) {
		if(correctAns.equals(ans))
		{
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void addUserToResults(Results results) {
		rdao.save(results);
	}
	
	
	@Scheduled(cron = "0 5 21 * * ?")
	public void sendCoupons() {
		//System.out.println("scheduled");
		List<Results> lst = new ArrayList<Results>();
		lst = rdao.findAll();
		
		Iterator<Results> lstit = lst.iterator();
		while(lstit.hasNext())
		{
			System.out.println(lstit.next().getUid());
			
		}
	}

	
	
}
