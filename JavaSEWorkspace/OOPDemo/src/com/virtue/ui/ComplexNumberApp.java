package com.virtue.ui;

import com.virtue.model.ComplexNumber;

public class ComplexNumberApp {

	public static void main(String[] args) {
		ComplexNumber first;
		first = new ComplexNumber();
		
		first.realPart = 5;
		first.imaginaryPart = 10;
		
		System.out.println(first.realPart + ", " + first.imaginaryPart);
		

	}

}