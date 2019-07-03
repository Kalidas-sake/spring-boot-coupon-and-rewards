package com.kali.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coupon {
	
	@Id
	private int cid;
	@Column(unique = true)
	private String code;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Coupon [cid=" + cid + ", code=" + code + "]";
	}
	
	
}
