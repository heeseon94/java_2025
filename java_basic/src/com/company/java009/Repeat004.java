package com.company.java009;

import java.util.Arrays;

public class Repeat004 {
	public static void main(String[] args) {
	
		char [] arr = new char [3]; 
		
		char data = 'a';
		for(int i=0; i<arr.length; i++) {arr[i] = data; data++;}
		System.out.println(Arrays.toString(arr));
	}

}

/*4) 클래스명 : Repeat004
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr
2. 값     : a  b   c
3. for + length 를 이용하여  배열안의 a,b,c을 출력하시오.
*/