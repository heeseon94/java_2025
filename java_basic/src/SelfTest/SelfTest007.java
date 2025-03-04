package SelfTest;

import java.util.Scanner;

public class SelfTest007 {
	public static void main(String[] args) {
		char ch=0;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("a,b,c중에 입력해주세요 ");
		ch = scanner.next().charAt(0);
		
		switch(ch) {
		case 'a' : case 'A' 
		: System.out.println("apple"); break;
		case 'b' : case 'B' 
		: System.out.println("banana"); break;
		case 'c' : case 'C' 
		: System.out.println("coconut"); break;
		default :
			System.out.println("대소문자 관계없이 a,b,c만 입력가능합니다");
		
		}
	}

}
