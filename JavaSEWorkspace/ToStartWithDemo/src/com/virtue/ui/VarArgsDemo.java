package com.virtue.ui;

public class VarArgsDemo {

	static double getAverage(int ... values) {
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		return sum/values.length;
	}
 
	public static void main(String[] args) {
		System.out.println(getAverage(10,20,30));
		System.out.println(getAverage(40,50,60,70,80));
		System.out.println(getAverage(1,2));
	}

}
