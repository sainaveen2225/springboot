package com.example.strings.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sampledetails")
public class SampleDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="personId")
	private Integer personId;
	
	@Column(name="personLocation")
	private String personLocation;
	
	@Column(name="personSalary")
	private int personSalary;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonLocation() {
		return personLocation;
	}

	public void setPersonLocation(String personLocation) {
		this.personLocation = personLocation;
	}

	public int getPersonSalary() {
		return personSalary;
	}

	public void setPersonSalary(int personSalary) {
		this.personSalary = personSalary;
	}

	public SampleDetails(Integer personId, String personLocation, int personSalary) {
		super();
		this.personId = personId;
		this.personLocation = personLocation;
		this.personSalary = personSalary;
	}

	public SampleDetails() {
		super();

	}	
}
	