package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {
	public static void main(String [] args) {
//		int a;
//		float b;
//		a = 0;
//		b = 0;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("숫자입력 >");
//		a = scanner.nextInt();
//		System.out.print("숫자입력 >");
//		b = scanner.nextInt();
//		
//		float avg;
//		avg = a / b;
//		System.out.printf(a + "/" + (int)b + "=" + "%.2f", avg);
		
		int num1, num2; double result;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자입력 >");
		num1 = scanner.nextInt();
		System.out.print("숫자입력 >");
		num2 = scanner.nextInt();
		
		result = (double)num1/num2;
		
		//String.format("출력서식", 처리할값);
		System.out.println(num1 + "/" + num2 + "=" + String.format("%.2f",result));
		
		
	}

}
