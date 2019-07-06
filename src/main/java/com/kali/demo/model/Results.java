package com.kali.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Results {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rid;
	
	private boolean selected;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="uid", referencedColumnName = "uid")
	private Users users;
	
	public Results() {
		
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Results [rid=" + rid + ", selected=" + selected + ", users=" + users + "]";
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}



	
	
}
