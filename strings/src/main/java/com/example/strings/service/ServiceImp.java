package com.example.strings.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.strings.entity.Sample;
import com.example.strings.entity.SampleDetails;
import com.example.strings.repository.SampleDetalisRepository;
import com.example.strings.repository.Samplerepository;

@Service
public class ServiceImp implements Services {

	@Autowired
	private Samplerepository repo;
	
	@Autowired
	private  SampleDetalisRepository sampleDetailsRepo;

	@Override
	public Sample post(Sample sample) {

		return repo.save(sample);
	}
	@Override
	public List<Sample> getDetails() {
		return repo.findAll();
		
	}
	@Override
	public Optional<Sample> getDetails(int id) {
		
		return repo.findById(id);
	}
	@Override
	public String deleteId(int id) {
		repo.deleteById(id);
		return "Deleted";
		
		
	}
	@Override
	public void deleteAll() {
		repo.deleteAll();
		
	}
	@Override
	public Sample updateSampleDetails(Sample sample, int id) {
		Sample temp=repo.findById(id).get();
		temp.setStrName(sample.getStrName());
		temp.setStrDept(sample.getStrDept());
		return repo.save(temp);		
	}
	@Override
	public Sample patchDetails(Sample sample, int id) {
		Sample value=repo.findById(id).get();
		value.setStrDept(sample.getStrDept());
		return repo.save(value);
	}
	@Override
	public List<Sample> findByDept(String strDept) {
		
		return repo.findByDept(strDept);
	}
	@Override
	public List<Sample> postAll(List<Sample> sample) {
		return repo.saveAll(sample);
	}
	@Override
	public SampleDetails sampleDetails(SampleDetails sampledetails) {
		return sampleDetailsRepo.save(sampledetails);
		
	}
	}
