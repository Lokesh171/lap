package com.lap.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lap.Model.BillingAdrress;
import com.lap.Model.Customer;
import com.lap.Model.ShippingAddress;
import com.lap.Service.CustomerService;

@Controller
public class RegistrationController {

	@Autowired
    private CustomerService customerService;

public CustomerService getCustomerService() {
	return customerService;
}
public void setCustomerService(CustomerService customerService) {
	this.customerService = customerService;
}

@RequestMapping("/registration")
public ModelAndView getRegistrationForm(){
	Customer customer=new Customer();
	BillingAdrress billingAddress = new BillingAdrress();
    ShippingAddress shippingAddress = new ShippingAddress();
    customer.setBillingAddress(billingAddress);
    customer.setShippingAddress(shippingAddress);
	return new ModelAndView("signup","customer",customer);
	
}
@RequestMapping(value="/registration",method=RequestMethod.POST)
public String registerCustomer(@Valid @ModelAttribute(value="customer")Customer customer,Model model,BindingResult result){
	if(result.hasErrors())
		return "signup";
	
	customerService.AddCustomer(customer);
	model.addAttribute("registrationSuccess","Registered Successfully. Login using username and password");
	return "login";
}
}
