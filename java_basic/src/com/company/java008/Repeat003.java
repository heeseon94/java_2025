package com.company.java008;

public class Repeat003 {
	public static void main(String[] args) {
		int [] arr = new int [3];
		
		int a = 10;
		
//		arr [0] = a; a += 10;
//		arr [1] = a; a += 10;
//		arr [2] = a; a += 10;
		
		for(int i=0; i<arr.length; i++){arr[i] = a; a += 10;}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + "\t");}

	}

}

/*3) 클래스명 : Repeat003
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr
2. 값     : 10,20,30
3. for + length 를 이용하여  배열안의 10,20,30을 출력하시오.
*/