package com.company.java007;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {

		char ch = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 : ");
		ch = scanner.next().charAt(0);
		
		     if (ch == 'a') {System.out.println("apple");}	
		else if (ch == 'b') {System.out.println("banana");}
		else if (ch == 'c') {System.out.println("coconut");}
		
		
	}

}
