package com.virtue.ui;

public class ReturnArray {

	static int[] minMax(int[] arr) {
		int[] result = new int[2];
		int min = arr[0], max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		result[0] = min;
		result[1] = max;
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] a = {10,20,50,30,15,-6,70,65};
		int[] res = minMax(a);
		System.out.println("Minimum = " + res[0]);
		System.out.println("Maximum = " + res[1]);

	}

}
