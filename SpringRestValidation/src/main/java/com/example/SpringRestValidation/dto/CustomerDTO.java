package com.example.SpringRestValidation.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.example.SpringRestValidation.entity.Customer;

public class CustomerDTO {
	@NotNull(message="Customer name should not be null")
	@NotEmpty(message="Customer name should not be null")
	private String name;
	@Email
	private String email;
	@NotNull
	private String gender;
	@Min(18)
	@Max(60)
	private String age;
	@NotBlank(message="nationality should not be blank")
	private String nationality;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public static Customer prepareCustomer(CustomerDTO customerDTO) {
		Customer customer=new Customer();
		customer.setName(customerDTO.getName());
		customer.setEmail(customerDTO.getEmail());
		customer.setAge(customerDTO.getAge());
		customer.setGender(customerDTO.getGender());
		customer.setNationality(customerDTO.getNationality());
		return customer;
	}
}
