package com.training.service;


import java.util.List;

import com.training.model.Customer;

public interface CustomerService {

	String hello(String name);
	List<Customer> findAll();

	

}