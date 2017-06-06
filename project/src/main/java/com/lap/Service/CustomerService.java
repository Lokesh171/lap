package com.lap.Service;

import java.util.List;

import com.lap.model.Customer;

public interface CustomerService {
void saveCustomer(Customer customer);
List<Customer> getCustomers();
}