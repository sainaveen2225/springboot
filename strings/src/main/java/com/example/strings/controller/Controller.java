package com.example.strings.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.strings.entity.Sample;
import com.example.strings.entity.SampleDetails;
import com.example.strings.service.Services;

@RestController                    
public class Controller {
	
	@Autowired
	private Services service;
	
	
	@PostMapping("/add")									//data method transfer the Sample Object to service Layer
	public Sample data(@RequestBody Sample value) {
		
		  return service.post(value);
	}
	
	@GetMapping("/getDetails/{id}")
	public Optional<Sample> fetchDetails(@PathVariable ("id")int id) {
		return service.getDetails(id);
	}
	@GetMapping("/getAllDetails")
	public List<Sample> fetchAllDetails() {
		return service.getDetails();
		
	}
	@DeleteMapping("/deleteId/{id}")
	public String deleteById(@PathVariable int id) {
		return service.deleteId(id);
	}
	@DeleteMapping("/deleteAll")
	public void deleteAll() {
		service.deleteAll();
	}
	
	@PutMapping("updateId/{id}")																	//update Sample
	public Sample updateSampleDetails(@RequestBody Sample sample,@PathVariable("id") int id) {
		
		return service.updateSampleDetails(sample, id);
		
	}
	@PatchMapping("patch/{id}")																	//update partial details
	public Sample patchDetails(@RequestBody Sample sample,@PathVariable int id) {
		return service.patchDetails(sample,id);
		
	}
	
	@GetMapping("/query/{strDept}")																//Get the details by Custom Query
	public List<Sample> query(@PathVariable String strDept) {
		return service.findByDept(strDept);
	}
	
	@PostMapping("/postAll")
	public List<Sample> details(@RequestBody List<Sample> sample) {
		return service.postAll(sample);
		
	}
	
	@PostMapping("/post")
	public SampleDetails data(@RequestBody SampleDetails sampledetails) {
		
		  return service.sampleDetails(sampledetails);
	}
}

	
