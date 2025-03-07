package com.company.java014;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception001 {
	public static void main(String[] args) {
		int a=-1;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		
		try {
			System.out.println("숫자 1입력");
			a = scanner.nextInt();
		if(a==1) {break;}
		}	catch(InputMismatchException e) {
			scanner.next();}
		}
		
		System.out.println("결과물 : " + a);
	}
}
