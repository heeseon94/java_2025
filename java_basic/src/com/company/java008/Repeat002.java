package com.company.java008;

public class Repeat002 {
	public static void main(String[] args) {
		
		int [] arr = {100, 200, 300};
		
		for(int i=0; i<arr.length; i++) { System.out.print(arr[i]+"\t"); }
		System.out.println();
		int i=0; while(i<arr.length) { System.out.print(arr[i]+"\t"); i++;}
		System.out.println();
		i=0; do { System.out.print(arr[i]+"\t"); i++;} while(i<arr.length);
		
	}

}


/*
 * 2) 클래스명 : Repeat002
for, while, do while 3가지 버젼으로    100 200 300  출력
*/
