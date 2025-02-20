package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006 {
	public static void main (String [] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		num = scanner.nextInt();
				
		      if(num%2 == 0) { System.out.println("여자"); }
		else if (num%2 == 1) { System.out.println("남자"); }

		
	}

}
