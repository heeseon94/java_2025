package com.company.java007;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String[] args) {
		char ch = 0;
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("입력 : ");
		ch = scanner.next().charAt(0);
		
		switch (ch) {
		case 'a' : System.out.println("apple");  break;
		
		case 'b' : System.out.println("banana"); break;
		
		case 'c' : System.out.println("coconut"); break;
		}
				
	}

}
