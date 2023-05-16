package com.example.strings.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.strings.entity.SampleDetails;

@Repository
public interface SampleDetalisRepository extends JpaRepository<SampleDetails, Integer> {

}
