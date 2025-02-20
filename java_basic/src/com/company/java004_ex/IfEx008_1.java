package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008_1 {

	public static void main(String[] args) {
		int num, kor, eng, math, total;
		double avg;
		String lev = "가";
		String pa = "불합격";
		String good = "";
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("학번을 입력하세요 : ");
		num = scanner.nextInt();
		System.out.print("국어점수를 입력하세요 : ");
		kor = scanner.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		eng = scanner.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		avg = (double)total/3.0;
		
		if (avg >= 60 && kor >= 40 && eng >= 40 && math >= 40) {
			pa = "합격";
		}
		if(avg >= 95) {good = "장학생";}
			
		if (avg >= 90 ) {lev = "수";}
		else if (avg >= 80) {lev = "우";}
		else if (avg >= 70) {lev = "미";}
		else if (avg >= 60) {lev = "양";}
		
		System.out.println("============================================================================\r\n"
				+ "학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t장학생\r\n"
				+"============================================================================");
		
		System.out.println(num + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + String.format("%.2f", avg) + "\t" + pa + "\t" + lev + "\t" + good);
		

	}

}
