package com.bl.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
private Heart heart;
	
	public Human() {
		
	}
	
//	@Autowired
//	public Human(Heart heart) {
//		this.heart = heart;
//	}
	
	@Autowired
	@Qualifier("octopusHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	void pumping() {
		if(heart != null) {
		   heart.pump();
		   System.out.println("name of the animal is  " + heart.getNameOfAnimal() + "no of hearts is " + heart.getNoOfHearts());
		} else {
			System.out.println("dead");
		}
	}

}