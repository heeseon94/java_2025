package com.company.java007;

public class Repeat003 {
	public static void main(String[] args) {
		int [] arr = {10, 20, 30};
		
		for (int i=0; i<arr.length; i++) { System.out.println(arr[i]); }
		System.out.println();
		int i=0; while (i<arr.length) { System.out.println(arr[i]); i++;}
		System.out.println();
		i=0; do { System.out.println(arr[i]); i++;} while (i<arr.length);
		
		
	}

}
