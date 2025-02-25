package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex004 {
	public static void main(String[] args) {
		char [][] arr = new char [2][3];
		
		char ch = 'A';
		for(int ch1=0; ch1<arr.length; ch1++) {
			for (int kan=0; kan<arr[ch1].length; kan++) {
				arr[ch1][kan] = ch++;
			}
		}
		System.out.println(Arrays.deepToString(arr));

		for(int ch1=0; ch1<arr.length; ch1++) {
			for (int kan=0; kan<arr[ch1].length; kan++) {
				System.out.print(arr[ch1][kan]+"\t");
			}
			System.out.println();
		}
			
	}
}

/*연습문제12)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex004
배열을 이용하여 다음의 프로그램을 작성하시오.   
1. new 연산자 이용하여 다차원배열만들기
2. for + length 이용해서 대입   
3. for + length 이용해서 출력 
   A   B   C
   B   C   D*/