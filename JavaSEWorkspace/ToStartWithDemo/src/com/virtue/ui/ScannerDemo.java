package com.virtue.ui;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = scan.next();
		System.out.print("Enter your age : ");
		int age = scan.nextInt();
		System.out.println("Your name is " + name + " and you are " + age + " old.");
		

	}

}
