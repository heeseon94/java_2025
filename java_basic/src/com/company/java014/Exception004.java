package com.company.java014;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception004 {
		
	public static int nextInt() throws InputMismatchException{
		
		int a=-1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 1입력");
		a = scanner.nextInt();
		return a;
		}
		
	public static void main(String[] args) {
		int a=-1;
		while(true) {
		try {
			a=nextInt();
			if (a==1)break;
			}catch(Exception e) { System.out.println("오류났어!"); }
		}
		System.out.println("결과물 : " + a);
	}
}
