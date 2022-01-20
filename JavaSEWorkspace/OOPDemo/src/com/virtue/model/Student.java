package com.virtue.model;

public class Student extends Person {
	private double fee;
	
	public Student() {
		/* no implementation required */
	}

	public Student(String name, int age, double fee) {
		super(name, age);
		this.fee = fee;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	

}
