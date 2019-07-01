package com.kali.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	
	@Column(unique=true)
	private String umail;
	private String uans;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUmail() {
		return umail;
	}
	public void setUmail(String umail) {
		this.umail = umail;
	}
	
	
	public String getUans() {
		return uans;
	}
	public void setUans(String uans) {
		this.uans = uans;
	}
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", umail=" + umail + ", uans=" + uans + "]";
	}
	
	
	
}
