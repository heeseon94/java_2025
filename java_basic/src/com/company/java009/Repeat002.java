package com.company.java009;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String[] args) {
		
		char ch = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자한개 입력 :");
		ch = scanner.next().charAt(0);
		
		switch (ch) {
		case 'j' : System.out.println("java"); break;
		case 'h' : System.out.println("html"); break;
		case 'c' : System.out.println("css");  break;
		}
	}

}

/*2) 클래스명 : Repeat002
문자를 한개입력받아
switfh ver-   'j'이면  java,  'h'이면   html,   'c'이면 css
*/