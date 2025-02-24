package com.company.java005_ex;

import java.util.Scanner;

public class ForEx006 {
	public static void main(String[] args) {
		//변수
		int num1 = 10;
		int num2 = 3;
		double total = 0;
		char ch;
		Scanner scanner = new Scanner (System.in);
		//입력
		for(;;) {
			System.out.print("정수1을 입력하세요 : ");
			num1 = scanner.nextInt();
			//(num1이 0~100 사이라면) {빠져나오기}
			if(0 <= num1 && num1 <=100) { break; }
		}
		
		for (;;) {
			System.out.print("정수2을 입력하세요 : ");
			num2 = scanner.nextInt();
			//(num1이 0~100 사이라면) {빠져나오기}
			if(0 <= num2 && num2 <=100) { break; }
		}
			
		for(;;) {
			System.out.print("연산자를 입력하세요 : ");
			ch = scanner.next().charAt(0);
			//(ch가 연산자라면) {빠져나온다}
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/' ) 
			{ break;}
		}
	
		//처리
		//ch가 +라면 +계산, -라면 -계산, *라면 *계산, /라면 /계산
		     if (ch == '+') {total = num1 + num2;}
		else if (ch == '-') {total = num1 - num2;}
		else if (ch == '*') {total = num1 * num2;}
		else if (ch == '/') {total = num1 / num2;}
		
		//출력
		
		System.out.println("" +  num1 + ch + num2 + "=" +
				(ch!='/' ? "" + (int)total : String.format("%.2f",total)));
//		System.out.println("" +  num1 + ch + num2 + "=" + total);
//		System.out.printf( "%d %s %d = %d",num1,ch,num2,total );
		
				
		
		
		
	}

}
