package com.training.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.training.model.Customer;


@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.training.repository.CustomerRepository#findAll()
	 */
	
	public HibernateCustomerRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Customer> findAll(){ 
	
		List<Customer> customers = new ArrayList();
		Customer customer = new Customer();
		customer.setFirstName("Usha");
		customer.setLastName("Seetharaman");
		customers.add(customer);
		return customers;
		
	}
}

