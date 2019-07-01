package com.kali.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kali.demo.model.Users;

public interface UserDao extends JpaRepository<Users, Integer>{

	List<Users> findAllByUans(String correctAns);

}
