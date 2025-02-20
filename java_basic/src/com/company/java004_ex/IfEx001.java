package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001 {
	public static void main (String [] args) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("평균점수를 입력하세요 : ");
		num = scanner.nextInt();
		
		if(num >= 60)     { System.out.println("합격"); }
		else if(num < 60 ){ System.out.println("불합격"); }
		
		
		
	}

}

// 1. 소수점 입력시 오류 : int 를 float로 변경
// 2. 자료형 확인