package com.bl.valurerequiredannotation;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	
	@Value("${student.name}")
	private String studentName;
	
	
	@Value("${student.hobby}")
	private String hobby;
	
	@Value("${student.intrestedCourse}")
	private String intrestedCourse;
	

	

	
	
	public void displayStudentInfo() {

		System.out.println("The Student name is " + studentName);
		System.out.println("Student's hobby is " + hobby);
		System.out.println("Student's intrested course is " + intrestedCourse);
	}
}