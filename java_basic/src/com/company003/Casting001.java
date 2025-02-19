package com.company003;

public class Casting001 {
	public static void main (String [] args) {
		//#1. 형변환 - 자동타입변환
		byte  by = 1;
		short sh = 2;
		int   in = 4;
		long  l  = 8L;
		float f  = 3.14f;
		double d = 3.14;
		
		sh = by;  // 정수(2바이트) - 정수(1바이트)    
		in = by;  // 정수(4바이트) - 정수(1바이트)
		l  = by;  // 정수(8바이트) - 정수(1바이트)
		
//		l  = f;   // 정수(8바이트) - 실수(4바이트)  실수는 정수보다 크다
				  // Type mismatch: cannot convert from float to long
		f  = l;   // 실수(4바이트) - 정수(8바이트)
		
		//boolean 1byte
		//boolean bl = true;
		//in    = bl;  boolean은 형변환 불가.
		
		//#2. 형변환 - 강제타입변환
		by = (byte) in;  // 정수(1바이트) - 정수(4바이트)
		
		int in2 = (int) 1.2;     // 정수(4바이트) - 실수 (double : 8바이트)
		float f12=(float) 3.14;    
		// 실수(4바이트) - 실수 (double : 8바이트)
		// float : 소수점 7자리 , double : 소수점 15자리
		
		System.out.println(in2); //1
		System.out.println(f12); //3.1411111

		
		//Q1) System.out.println( 1.5 + 2.7); 3으로 나오게 만들기
		System.out.println( (int)1.5 + (int)2.7);  //결과 : 3
		
		
		
	}//end main
}// end class
