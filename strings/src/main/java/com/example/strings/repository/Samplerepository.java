package com.example.strings.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.strings.entity.Sample;

@Repository
public interface Samplerepository extends JpaRepository<Sample, Integer>  {
	
	@Query("SELECT s FROM Sample s WHERE s.strDept=?1")
	public List<Sample> findByDept(String strDept);

	
//	@Query(value = "SELECT * FROM sample s Where s.str_dept=?1",nativeQuery=true)
//	public List<Sample>findByDept(String str_dept);
}


