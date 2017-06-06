package com.lap.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="billingaddress")

public class BillingAdrress 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int BillingAddressid;
	private String StreetName;
	private String ApartmentNumber;
	private String City;
	private String country;
	private String zipcode;

	@OneToOne(mappedBy="billingAddress")
	private Customer customer;

	public int getBillingAddressid() {
		return BillingAddressid;
	}

	public void setBillingAddressid(int billingAddressid) {
		BillingAddressid = billingAddressid;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public String getApartmentNumber() {
		return ApartmentNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		ApartmentNumber = apartmentNumber;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
