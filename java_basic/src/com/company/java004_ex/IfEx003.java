package com.company.java004_ex;

import java.util.Scanner;

public class IfEx003 {
	public static void main (String [] args) {
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		a = scanner.nextInt();
		
		if(a == 1)       { System.out.println("one"); }
		else if (a == 2) { System.out.println("two"); }
		else if (a == 3) { System.out.println("three"); }
		else            { System.out.println("1, 2, 3이 아니다."); }
		
	}
	

}
