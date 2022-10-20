package com.valtech.account.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.account.entity.Customer;
import com.valtech.account.service.CustomerService;

@RestController
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/api/customer/")
	public Customer createCustomer(@RequestBody Customer cus) {
		return customerService.createCustomer(cus);
	}
	
	@PutMapping("/api/customer/{id}")
	public Customer updateCustomer(@RequestBody Customer cus, @PathVariable("id") int id) {
		return customerService.updateCustomer(cus);
	}
	
	@GetMapping("/api/customer/{id}")
	public Customer getCustomer(@PathVariable("id") int id) {
		return customerService.getCustomer(id);
	}
	
	@GetMapping("/api/customer/")
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}
	
	
	

}
