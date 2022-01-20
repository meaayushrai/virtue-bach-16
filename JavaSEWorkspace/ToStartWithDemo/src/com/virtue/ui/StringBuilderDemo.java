package com.virtue.ui;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());	
		
		sb.append(1.8);
		System.out.println(sb);
		sb.insert(4, " ");
		System.out.println(sb);
		sb.replace(5, 8, "11");
		System.out.println(sb);
		sb.delete(4, 7);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
		StringBuilder sb2 = new StringBuilder("java");
		System.out.println(sb == sb2);
		System.out.println(sb.equals(sb2));
	}

}
