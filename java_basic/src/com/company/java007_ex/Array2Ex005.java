package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex005 {
	public static void main(String[] args) {
		int [][] arr = {
				   { 1, 1, 1,},   //00 01 02
				   { 2, 2, 2,},   //10 11 12
				   { 3, 3, 3,},   //20 21 22
				   { 4, 4, 4,},   //30 31 32
				 };
		int total = 0; double avg = 0.0;
//		ver-1                     
//		total += arr[0][0];
//		total += arr[0][1];
//		total += arr[0][2];
		
//		for(int kan=0; kan<arr[0].length; kan++) {total += arr[0][kan];}
//		for(int kan=0; kan<arr[1].length; kan++) {total += arr[1][kan];}
//		for(int kan=0; kan<arr[2].length; kan++) {total += arr[2][kan];}
//		for(int kan=0; kan<arr[3].length; kan++) {total += arr[3][kan];}
		for(int ch=0; ch<arr.length; ch++)
			{for(int kan=0; kan<arr[ch].length; kan++) {
				total += arr[ch][kan];
			}
		}		
		avg=(double)total/(arr.length*arr[0].length);  //평균 = total/갯수(층갯수*칸갯수)
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		

	}

}

/*연습문제13)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex005
배열을 이용하여 다음의 프로그램을 작성하시오.   
1. 다음의 주어진조건을 이용하여 총점과 평균을 구하시오.

 int[][] arr = {
   { 1, 1, 1,},
   { 2, 2, 2,},
   { 3, 3, 3,},
   { 4, 4, 4,},
 };
 int total=0;  double avg=0.0;

출력내용:
총점 : 30
평균 : 2.5*/