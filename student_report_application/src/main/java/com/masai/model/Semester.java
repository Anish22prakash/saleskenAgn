package com.masai.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "report")
public class Semester {
	
	// This entity contains the all the subject name(3 subject on each semester) and the marks obtain in that subject

	
	@Id
	private Integer id;
	
	private Integer semesterNo;
	private Integer studentId;
	
	private String subject1Name;
	private String subject2Name;
	private String subject3Name;
	
	
	private Double subject1Mark;
	private Double subject2Mark;
	private Double subject3Mark;
	


}
