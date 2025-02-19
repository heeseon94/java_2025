package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx002 {
	public static void main (String [] args) {
		int kor,eng,math,total,level;
		double avg;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하세요 >");
		kor = scanner.nextInt();
		System.out.print("영어점수를 입력하세요 >");
		eng = scanner.nextInt();
		System.out.print("수학점수를 입력하세요 >");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		avg = total/3.0;   // (double)total/3;
		level = (int)avg/10;
		System.out.println("GOOD IT SCORE \r\n"
				           + "국어\t영어\t수학\t총점\t평균\t레벨");
		
		System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%d\t",kor,eng,math,total,avg,level);
		
//		level = 
//		System.out.printf("평균 레벨 %s", level);
		
		
	}

}
