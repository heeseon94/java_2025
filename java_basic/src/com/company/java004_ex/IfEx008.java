package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {
	public static void main (String [] args) {
		int num, kor, eng, math, total;
		double avg = 0.00;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학번을 입력하세요 : ");
		num = scanner.nextInt();
		System.out.print("국어점수를 입력하세요 : ");
		kor = scanner.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		eng = scanner.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		math = scanner.nextInt();
		String fa = "" ;
		String good = "";
		String lev = "";
		total = kor + eng + math;
		avg = (double)total / 3.0;
		
		if (avg >= 60 && kor>=40 && eng >=40 && math >=40) {
			fa="합격";
			if (avg >= 95 ) { good = "장학생"; lev = "수";}
			else if (90 >= avg) {lev = "수";}
			else if (80 >= avg) {lev = "우";}
			else if (70 >= avg) {lev = "미";}
			else if (60 >= avg) {lev = "양";}
			}
		else{ fa = "불합격";lev = "가";}
		
		
		
		     
		
		System.out.println( "========================================================================== \r\n"
				+ "학번\t국어\t영어\t수학\t총첨\t평균\t합격여부\t레벨\t장학생 \r\n"
				+ "=========================================================================="
				);
		System.out.println(num + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + String.format("%.2f", avg) + "\t" + fa + "\t" + lev + "\t" + good + "\t");
//		System.out.println(num + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg + "\t" + fa + "\t" + lev + "\t" +good + "\t");
//		System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s\t\n", num, kor, eng, math, total, avg, fa, lev, good);

		
		
	}

}
