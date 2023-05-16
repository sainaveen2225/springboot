package com.example.strings.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sample")
public class Sample {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "strId")
	private Integer strId;
	
	@Column(name="strName")
	private String strName;
	
	@Column(name="strDept")
	private String strDept;
	
	@OneToOne(targetEntity = SampleDetails.class,cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "exid")
    private SampleDetails details;

	public Integer getStrId() {
		return strId;
	}

	public void setStrId(Integer strId) {
		this.strId = strId;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrDept() {
		return strDept;
	}

	public void setStrDept(String strDept) {
		this.strDept = strDept;
	}

	public SampleDetails getDetails() {
		return details;
	}

	public void setDetails(SampleDetails details) {
		this.details = details;
	}

	public Sample() {
		super();
	}
}
		