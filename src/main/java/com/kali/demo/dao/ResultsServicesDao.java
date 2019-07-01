package com.kali.demo.dao;

import com.kali.demo.model.Results;

public interface ResultsServicesDao {
	
	public boolean checkAnswer(String ans);
	
	public void addUserToResults(Results results);

}
