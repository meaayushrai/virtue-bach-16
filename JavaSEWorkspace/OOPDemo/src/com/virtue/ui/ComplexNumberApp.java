package com.virtue.ui;

import com.virtue.model.ComplexNumber;

public class ComplexNumberApp {

	public static void main(String[] args) {
		ComplexNumber first;
		first = new ComplexNumber(10, -20);
		System.out.println(first);
		
		ComplexNumber second = new ComplexNumber(10, -20);
		System.out.println(second);
		
		System.out.println(first == second);
		System.out.println(first.equals(second));
		
//		first.setRealPart(5);
//		first.setImaginaryPart(6);
		
	
//		System.out.println(first.getRealPart() + ", " + first.getImaginaryPart());
//		
//		ComplexNumber second = new ComplexNumber(-2, -4);
//		second.setRealPart(5);
//		second.setImaginaryPart(6);
//		
//		System.out.println(second);
//		System.out.println(second.toString());
//		System.out.println(second.hashCode());
//		
//		System.out.println(second.getRealPart() + ", " + second.getImaginaryPart());
//		
//		ComplexNumber third = new ComplexNumber();
//		System.out.println(third.getRealPart() + ", " + third.getImaginaryPart());
		
		

	}

}
