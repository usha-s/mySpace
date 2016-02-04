package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.model.Customer;
import com.training.repository.CustomerRepository;
import com.training.repository.HibernateCustomerRepositoryImpl;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(){
		System.out.println("using default constructor injection");
	}
	
	public CustomerServiceImpl(String name){
		System.out.println("using name constructor injection");
	}
	

	
	public CustomerServiceImpl(CustomerRepository customerRepository){
		System.out.println("using constructor injection");
		this.customerRepository = customerRepository;
		
	}
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("using setter injection");
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.training.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	@Override
	public String hello(String name){
		 System.out.println( "Hello, " + name );
		 return "Hello My Spring Integration"+name;
	}



}
