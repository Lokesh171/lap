package com.lap.Dao;

import com.lap.Model.Customer;

public interface CustomerDao {
	void addCustomer(Customer customer);
    Customer getCustomerByUsername(String username);
}
