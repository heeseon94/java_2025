package com.company.java005;

import java.util.Scanner;

public class Repeat001_For2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//무한반복
		for(;;) {// 조건이 없으며 무한반복
			System.out.print("숫자를 입력하시오.");
			int a = scanner.nextInt();
			if(a==1) {break;}//end if
			//a가 1이라면 나가기 #2. 나갈조건			
			
		}//end for
		
		//for - break 해당 숫자부터 사라짐
		for(int i=1; i<=10; i++) {
			if(i==3) {break;}
			System.out.println(i+"\t");
		}
		
		System.out.println();
		
		// for - continue - skip  해당 숫자만 빠짐
		for(int i=1; i<=10; i++) {
			if(i==3) {continue;}
			System.out.println(i+"\t");
		}
		
		
		////////// 메뉴판 만들기
		//RepeatEx006 - 무한반복을 하는데 9를 입력받으면 종료
		
		for(int i = 1; i<=10; i++) {
			if(i==9) { break; }//end if
			System.out.println(i+"\t");
		}//end for

	}//end main

}
