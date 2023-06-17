package com.example.SpringRestValidation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringRestValidation.dto.CustomerDTO;
import com.example.SpringRestValidation.entity.Customer;
import com.example.SpringRestValidation.exception.CustomerNotFoundException;
import com.example.SpringRestValidation.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/signup")
	public ResponseEntity<Customer> saveCustomer(@RequestBody @Valid CustomerDTO customerDTO) {
		return new ResponseEntity<Customer> (customerService.saveCustomer(customerDTO),HttpStatus.CREATED);
	}
	
	@GetMapping("fetchAll")
	public ResponseEntity <List<Customer>> getAllCustomer(){
		return new ResponseEntity <List<Customer>> (customerService.getAllCustomers(),HttpStatus.CREATED);
	}
	
	@GetMapping("fetch/{customerId}")
	public  ResponseEntity<Customer> fetchCustomer(@PathVariable Integer customerId)throws CustomerNotFoundException {
		return new  ResponseEntity<Customer> (customerService.getCustomer(customerId),HttpStatus.CREATED);
	}
}
