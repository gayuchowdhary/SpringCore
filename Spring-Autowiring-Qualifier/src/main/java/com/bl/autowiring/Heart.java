package com.bl.autowiring;

public class Heart {
	
	private String nameOfAnimal;
	private int noOfHearts;
	
	
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}


	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}


	public int getNoOfHearts() {
		return noOfHearts;
	}


	public void setNoOfHearts(int noOfHearts) {
		this.noOfHearts = noOfHearts;
	}


	void pump() {
		System.out.println("heart is pumping");
	}

}
