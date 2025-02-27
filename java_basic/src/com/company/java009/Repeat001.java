package com.company.java009;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {
		
		char ch = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		ch = scanner.next().charAt(0);
		
		if (ch == 'j') {System.out.println("java");}
		else if (ch == 'h') {System.out.println("html");}
		else if (ch == 'c') {System.out.println("css");}
		else {System.out.println("잘못입력하셨습니다.");}
	}

}


/*1) 클래스명 : Repeat001
문자를 한개 입력받아
if ver - 가   'j'이면  java,  'h'이면   html,   'c'이면 css
*/