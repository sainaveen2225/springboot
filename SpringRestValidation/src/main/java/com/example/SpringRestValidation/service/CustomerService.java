package com.example.SpringRestValidation.service;

import java.util.List;

import com.example.SpringRestValidation.dto.CustomerDTO;
import com.example.SpringRestValidation.entity.Customer;
import com.example.SpringRestValidation.exception.CustomerNotFoundException;

public interface CustomerService {
	public Customer saveCustomer(CustomerDTO customerDTO);
	public List<Customer>getAllCustomers();
	public Customer getCustomer(Integer customerId)throws CustomerNotFoundException;
}
