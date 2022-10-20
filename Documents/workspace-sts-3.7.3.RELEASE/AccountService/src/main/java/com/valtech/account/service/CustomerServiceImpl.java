package com.valtech.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.valtech.account.entity.Customer;
import com.valtech.account.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public Customer createCustomer(Customer cus){
		return customerRepository.save(cus);
	}
	
	@Override
	public Customer updateCustomer(Customer cus){
		return customerRepository.save(cus);
	}
	
	@Override
	public Customer getCustomer(int id){
		return customerRepository.findById(id).get();
	}
	
	@Override
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
}
