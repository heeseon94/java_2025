package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex003 {
	public static void main(String[] args) {
		int [][] arr = new int [2][3];
		
		int data = 101;
		for(int ch=0; ch<arr.length; ch++) {//#1 층
			for(int kan=0; kan<arr[ch].length; kan++) {//#2칸
				arr[ch][kan] = data++;
			}// #3 층이 바뀌었을때 해야할 일
		}
		System.out.println(Arrays.deepToString(arr));
		
		for(int ch=0; ch<arr.length; ch++) {//#1 층
			for(int kan=0; kan<arr[ch].length; kan++) {//#2칸
				System.out.print(arr[ch][kan] + "\t");
			}// #3 층이 바뀌었을때 해야할 일
			System.out.println();
		}
	}

}
/*연습문제11)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex003
배열을 이용하여 다음의 프로그램을 작성하시오.   
1. new 연산자 이용하여 다차원배열만들기
2. for + length 이용해서 대입   
3. for + length 이용해서 출력 
   101   102   103
   104    105    106*/