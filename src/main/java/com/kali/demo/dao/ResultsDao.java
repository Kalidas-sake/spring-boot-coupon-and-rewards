package com.kali.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kali.demo.model.Results;

public interface ResultsDao extends JpaRepository<Results, Integer>{

	
}
