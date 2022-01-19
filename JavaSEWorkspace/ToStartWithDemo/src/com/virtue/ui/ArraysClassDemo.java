package com.virtue.ui;

import java.util.Arrays;

public class ArraysClassDemo {

	public static void main(String[] args) {
		int[] arr = {10,20,40,30};
		System.out.println(Arrays.toString(arr));
		int[] arr2 = {10,20,40,30};
		
		System.out.println(arr == arr2);
		System.out.println(arr.equals(arr2));
		System.out.println(Arrays.equals(arr, arr2));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 30));
		
	}

}
