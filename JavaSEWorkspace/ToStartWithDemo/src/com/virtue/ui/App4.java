package com.virtue.ui;

import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string : ");
		String str = scan.nextLine();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		if (str.equals(sb.toString()))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		scan.close();
	}

}
