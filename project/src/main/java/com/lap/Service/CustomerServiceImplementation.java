package com.lap.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lap.Dao.CustomerDao;
import com.lap.Model.Customer;
@Service
public class CustomerServiceImplementation implements CustomerService {
@Autowired
private CustomerDao customerDao;

      public CustomerDao getCustomerDao() {
    	  return customerDao;
      }
      
      public void setCustomerDao(CustomerDao customerDao) {
    	  this.customerDao = customerDao;  
      }
      
      
      public void addCustomer(Customer customer) {
    	  customerDao.addCustomer(customer);
      }
      
      public Customer getCustomerByUsername (String username) {
    	  return customerDao.getCustomerByUsername(username);
      }
}
