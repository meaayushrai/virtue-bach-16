package com.virtue.ui;

import com.virtue.model.Employee;
import com.virtue.model.Manager;
import com.virtue.model.Person;
import com.virtue.model.Student;

public class InheritanceApp {

	public static void main(String[] args) {
//		Person person = new Person("srinivas", 55);
//		System.out.println(person.getName() + ", " + person.getAge());
		
		Employee employee = new Employee("deepa", 44, 23000);
		System.out.println(employee.getName() + ", " + employee.getAge() + ", " + employee.getSalary());
		
		Student student = new Student("raghu", 21, 56000);
		System.out.println(student.getName() + ", " + student.getAge() + ", " + student.getFee());
		
		Manager manager = new Manager("vamsy", 36, 125000, 12500);
		System.out.println(manager.getName() + ", " + manager.getAge() + ", " + manager.getSalary() + ", " + manager.getBonus());
	}

}
