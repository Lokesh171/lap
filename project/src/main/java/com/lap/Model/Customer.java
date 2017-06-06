package com.lap.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.catalina.User;

@Entity
@Table(name="user")

public class Customer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Customerid;
	private String CustomerName;
	private String CustomerEmail;
	private String CustomerPhone;
	private String username;
	private String password;
	
	@OneToOne
	@JoinColumn(name="userid")
	private User users;
	
	@OneToOne
	@JoinColumn(name="Billingaddressid")
	private BillingAdrress billingaddress;
	
	@OneToOne
	@JoinColumn(name="shippingaddressid")
	private ShippingAddress shippingaddress;
	

	public int getCustomerid() {
		return Customerid;
	}

	public void setCustomerid(int customerid) {
		Customerid = customerid;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerEmail() {
		return CustomerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}

	public String isCustomerPhone() {
		return CustomerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		CustomerPhone = customerPhone;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
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

	public BillingAdrress getBillingAddress() {
		return billingaddress;
	}
	public void setBillingAddress(BillingAdrress billingAddress) {
		this.billingaddress = billingAddress;
	}
	public ShippingAddress getShippingAddress() {
		return shippingaddress;
	}
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingaddress = shippingAddress;
	}


}
