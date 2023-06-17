package com.example.SpringRestValidation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringRestValidation.Repository.CustomerRepository;
import com.example.SpringRestValidation.dto.CustomerDTO;
import com.example.SpringRestValidation.entity.Customer;
import com.example.SpringRestValidation.exception.CustomerNotFoundException;

@Service
public class CustomerServiceImp implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(CustomerDTO customerDTO) {
		return  customerRepository.save(CustomerDTO.prepareCustomer(customerDTO));
	}

	@Override
	public List<Customer> getAllCustomers() {
		return  customerRepository.findAll();
	}

	@Override
	public Customer getCustomer(Integer customerId)throws CustomerNotFoundException {
		Customer customer= customerRepository.findByCustomerId(customerId);
		if(customer!=null)
			return customer;
		else
			throw new CustomerNotFoundException("No Customer found with id"+customerId);
	}

}
