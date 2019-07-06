package com.kali.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kali.demo.model.Results;

public interface ResultsDao extends JpaRepository<Results, Integer>{

	public List<Results> findBySelected(boolean istrue);
}
