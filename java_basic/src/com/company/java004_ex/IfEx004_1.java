package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004_1 {
	public static void main (String [] args) {
		char ch = ' ';
		Scanner scanner = new Scanner(System.in);
		String result = "알파벳만 입력가능합니다.";
		
		System.out.print("문자를 입력하세요 : ");
		ch = scanner.next().charAt(0);
		
		
		     if(ch >= 'A' && ch <= 'Z') {result = ("대문자");}
		else if(ch >= 'a' && ch <= 'z') {result = ("소문자");}
		
		System.out.println(result);
	}

}
