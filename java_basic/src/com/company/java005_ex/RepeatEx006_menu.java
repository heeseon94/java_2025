package com.company.java005_ex;

import java.util.Scanner;

public class RepeatEx006_menu {
	public static void main(String[] args) {
		//1.변수
		int num = -1;
		Scanner scanner = new Scanner(System.in);
		//기능1) 2.입력 3.처리 4.출력
		
		for(;;) {
			System.out.println("메뉴판입니다 9. 종료> ");
			num = scanner.nextInt();
			if(num==9) {break;} //#1-2 빠져나올조건
			
		}//end for
						
	}//end main
}
