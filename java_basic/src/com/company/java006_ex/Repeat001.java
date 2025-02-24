package com.company.java006_ex;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 한개 입력 : ");
		num = scanner.nextInt();
		
		
		     if (num == 10) { System.out.println("10이다."); }
		else if (num == 20) { System.out.println("20이다."); }
		else if (num == 30) { System.out.println("30이다."); }
		else                { System.out.println("잘못입력하셨습니다."); } 
	}

}
