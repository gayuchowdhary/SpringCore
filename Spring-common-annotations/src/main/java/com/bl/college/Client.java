package com.bl.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
			college CollegeBean = context.getBean("CollegeBean", college.class);
			System.out.println("object created by spring using component annotation" + " " + CollegeBean);
			CollegeBean.show();
			context.close();
			
		}
	}