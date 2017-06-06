package com.lap.Model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class user {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userid;
	private String username;
	private String password;
	private boolean enabled;
	
	@OneToOne(mappedBy="users")
	private Customer customer;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
