package com.training.repository;

import java.util.List;

import com.training.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}