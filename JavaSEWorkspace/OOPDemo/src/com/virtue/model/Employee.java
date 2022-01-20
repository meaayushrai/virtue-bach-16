package com.virtue.model;

public class Employee extends Person {

	private double salary;
	
	public Employee() {
		/* no implementation required */
	}
	public Employee(String name, int age, double salary) {
		super(name, age);	
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
