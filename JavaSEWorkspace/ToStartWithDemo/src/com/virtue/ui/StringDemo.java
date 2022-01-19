package com.virtue.ui;

public class StringDemo {

	public static void main(String[] args) {
		String str = "JaVa";
		str.toUpperCase();
		System.out.println(str);
		str.toLowerCase();
		System.out.println(str);
		
		String str2 = "srinivas";
		String str3 = "srinivas";
		System.out.println(str2 == str3);
		System.out.println(str2.equals(str3));
		
		String str4 = new String("srinivas");
		String str5 = new String("srinivas");
		System.out.println(str4 == str5);
		System.out.println(str4.equals(str5));
		
		System.out.println("------------------------------------------------------");
		
		String str6 = "java is strictly, but partially object-oriented programming/language";
		String[] words = str6.split("[- /]");
		for(String word : words) {
			System.out.println(word);
		}

	}

}




