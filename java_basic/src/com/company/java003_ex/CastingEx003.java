package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx003 {
	public static void main (String [] args) {
		char ch = ' '; //ch = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("대문자를 입력하세요");
		ch = scanner.next().charAt(0);
		// "A(0)B(1)C(2)"
		
		
		// a(97) = A(65) + 32
		//ch += 32;  //1) + 더하기 (ch + 32) ,  2) = 대입 ch = (ch+32)
		
		ch = (char) (ch+32);
		System.out.println(ch);
		
		//Q 실수에 정수 대입시 실수로
		float fl = 1+1.0f;
		System.out.println(fl);
		
	}

}
