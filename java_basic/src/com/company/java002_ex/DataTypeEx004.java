package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx004 {
	public static void main (String [] args) {
		int kor, eng, math, total; double avg;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하세요 >");
		kor = scanner.nextInt();
		System.out.print("영어점수를 입력하세요 >");
		eng = scanner.nextInt();
		System.out.print("수학점수를 입력하세요 >");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		avg = total/3.0;
		
		System.out.printf("총점 : %d \n평균 : %.2f", total,avg);
		
		
//		float kor, eng, math;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("국어점수를 입력하세요 >");
//		kor = scanner.nextFloat();
//		System.out.print("영어점수를 입력하세요 >");
//		eng = scanner.nextFloat();
//		System.out.print("수학점수를 입력하세요 >");
//		math = scanner.nextFloat();
//		
//		System.out.printf("총점 : %.0f\n", kor + eng + math);
//		System.out.printf("평균 : %.2f", (kor + eng + math)/3);
		
	}

}
