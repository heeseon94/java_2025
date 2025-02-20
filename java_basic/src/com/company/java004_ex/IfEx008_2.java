package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008_2 {

	public static void main(String[] args) {
		// 교수님 방식
		
		String stdid = "";
		int kor, eng, math, total;
		float avg = 0.0f;
		String pass = "";
		String jang = "";
		String level = "";
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("학번을 입력하세요 : ");
		stdid = scanner.next();
		System.out.print("국어점수를 입력하세요 : ");
		kor = scanner.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		eng = scanner.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		avg = total/3.0f;
		
		if (avg >= 60 && kor >=40 && eng >=40 && math >= 40) { pass = "합격";}
		if(avg >= 95) {jang = "장학생";}
		
//		level = (avg >= 90)? "수" : 
//			                 (avg >= 80)? "우" :
//			                	           (avg >= 70)? "미" :
//			                	        	            (avg >= 60)? "양" : "가";  ※참고용
			     if (avg >= 90) {level = "수";}
			else if (avg >= 80) {level = "우";}
			else if (avg >= 70) {level = "미";}
			else if (avg >= 60) {level = "양";}
		
		System.out.println("============================================================================\r\n"
				+ "학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t장학생\r\n"
				+"============================================================================");
		
		System.out.println(stdid + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + String.format("%.2f", avg) + "\t" + pass + "\t" + level + "\t" + jang);

	}

}
