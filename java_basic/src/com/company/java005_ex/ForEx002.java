package com.company.java005_ex;

import java.util.Scanner;

public class ForEx002 {

	public static void main(String[] args) {
		//변수
		int dan;
		Scanner scanner = new Scanner(System.in);
				
		//입력
		System.out.print("단을 입력하세요 : ");
		dan = scanner.nextInt();
		
		//처리
//		System.out.println(2 + "*" + 1 + "=" + 2*1);
//		System.out.println(2 + "*" + 2 + "=" + 2*2);
//		System.out.println(2 + "*" + 3 + "=" + 2*3);
		//출력
		for(int i=1; i<=9; i++) 
		{ System.out.println(dan + "*" + i + "=" + (dan*i)); }

	}

}
