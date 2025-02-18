package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx002 {
	public static void main(String [] args) {
		//GIGO
		//변수
		int like;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("좋아하는 수(정수) 입력하시오 > ");
		like = scanner.nextInt();
		
		//처리

		//출력
		System.out.printf("제가 좋아하는 숫자는 %d입니다.", like);
	}

}
