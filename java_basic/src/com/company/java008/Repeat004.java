package com.company.java008;

import java.util.Arrays;

public class Repeat004 {
	public static void main(String[] args) {
		
		int [][] arr = new int [2][3];
		
//		ver-1
//		int data=10;
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
//		
//		arr[1][0] = 50;
//		arr[1][1] = 60;
//		arr[1][2] = 70;
		
//		ver-2
//		int data = 10;
//		arr[0][0] = data; data += 10;
//		arr[0][1] = data; data += 10;
//		arr[0][2] = data; data += 10;
//		
//		data = 50; //한층이 끝나고나면 해야할일
//		arr[1][0] = data; data += 10;
//		arr[1][1] = data; data += 10;
//		arr[1][2] = data; data += 10;
		
//		ver-3
//		int data=10;
//		for(int kan=0; kan<3; kan++) {arr[0][kan]=data; data+=10;}
//		data=50;
//		for(int kan=0; kan<3; kan++) {arr[1][kan]=data; data+=10;}
		
		int data = 10;
		for(int ch=0; ch<2; ch++) {
			for(int kan=0; kan<3; kan++) 
			{arr[ch][kan]=data; data+=10;}
			data=50;
		}
		
		for(int ch=0; ch<arr.length; ch++) {
			for(int kan=0; kan<arr[ch].length; kan++) {
				System.out.print(arr[ch][kan] + "\t");
			}
		}
	}

}

/*4) 클래스명 : Repeat004
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr2
2. 값     :  {10,20,30}, {50,60,70}
3. for + length 를 이용하여  배열안의 값을을 출력하시오.
*/