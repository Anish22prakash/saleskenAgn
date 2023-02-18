package com.masai.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.masai.model.Semester;

public interface SemesterRepo extends ElasticsearchRepository<Semester, Integer> {
	
	
   List<Semester> findBySemesterNo(Integer semesterNo);
   
   
   
}
