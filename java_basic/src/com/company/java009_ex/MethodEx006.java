package com.company.java009_ex;

import java.util.Arrays;

public class MethodEx006 {
	
	public static void main(String[] args) {
		
		char [] ch = {'a', 'b', 'c'};
		
		upper(ch);
		System.out.println("main. 배열값 : " + Arrays.toString(ch));
				
	}
	public static void upper(char [] ch) { 
		//97 소문자 a - 32
//		ch[0] -=32; ch[1] -=32; ch[2] -=32;
		for(int i=0; i<3; i++) {ch[i] -=32; }
	}
	
}

/*연습문제5)  method
패키지명 : com.company.java008_ex
클래스명 :  MethodEx005

public class MethodEx005{ 
    char[] ch = {'a','b','c'};
    upper(ch);   
    System.out.println("main. 배열값 : "      +  Arrays.toString(ch)          );
}
*/