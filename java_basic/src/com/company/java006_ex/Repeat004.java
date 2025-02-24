package com.company.java006_ex;

import java.util.Scanner;

public class Repeat004 {
	public static void main(String[] args) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.println("숫자 1을 입력하세요");
			num = scanner.nextInt();
			
			if (num==1) {System.out.println(num); break; } 
		}
	}

}
