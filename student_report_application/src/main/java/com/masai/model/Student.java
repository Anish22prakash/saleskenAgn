package com.masai.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "details")
public class Student {
	
	// This Entity class only contains the basic details of students (roll and name)
	
	@Id
	private Integer StudentRoll;
	private String studentName;

}
