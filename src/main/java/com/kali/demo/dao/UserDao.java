package com.kali.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kali.demo.model.Users;

public interface UserDao extends JpaRepository<Users, Integer>{

}
