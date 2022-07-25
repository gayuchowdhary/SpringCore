package com.bl.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class college {
	
	@Component("collegeBean")
	public class College {
		
		 @Value("${college.Name}") 
		private String collegeName;
		
		@Autowired
		private Principle principle;
		
		@Autowired
		@Qualifier("mathTeacher")
		private Teacher teacher;
		
//		@Value("${college.Name}")
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}


		public void setPrincipal(Principle principle) {
			this.principle = principle;
		}


		public void setTeacher(Teacher teacher) {
			this.teacher = teacher;
		}


		void show() {
			principle.display();
			teacher.teach();
			System.out.println("college name is" + collegeName);
			System.out.println("this method calling");
		}

	}

	public void show() {
		// TODO Auto-generated method stub
		
	}
}