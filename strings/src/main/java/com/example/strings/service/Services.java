package com.example.strings.service;

import java.util.List;
import java.util.Optional;
import com.example.strings.entity.Sample;
import com.example.strings.entity.SampleDetails;

public interface Services {
	
	public Sample post(Sample sample);										//@PostMapping
	
	public Optional<Sample> getDetails(int id);								//@GetMapping
	
	public List<Sample> getDetails();										//@GetMapping

	
	public String deleteId(int id);											//@DeleteMapping
	
	
	public void deleteAll();												//@DeleteMapping

	
	public Sample updateSampleDetails(Sample sample,int id);				//@UpdateMapping
	
	
	public Sample patchDetails(Sample sample, int id);						//@PatchMapping
	
	
	public List<Sample> findByDept(String strDept);							//Query Method
	
	
	public List<Sample> postAll(List<Sample> sample);						//@PostMapping
		
	public SampleDetails sampleDetails(SampleDetails sampledeatils);		//@PostMapping
	
	}