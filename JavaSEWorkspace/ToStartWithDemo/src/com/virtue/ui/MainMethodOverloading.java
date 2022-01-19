package com.virtue.ui;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("in main method ...");
		main(125);
	}
	
	static void main(int num) {
		System.out.println(num);
	}

}
