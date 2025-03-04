package SelfTest;

import java.util.Scanner;

public class SelfTest006 {
	public static void main(String[] args) {
		int kor;
		String lev="가";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수를 입력해주세요 : ");
		kor = scanner.nextInt();
		
		     if (kor >=90) {lev = "수";}
		else if (kor >=80) {lev = "우";}
		else if (kor >=70) {lev = "미";}
		else if (kor >=60) {lev = "양";}
		else if (kor >=50) {lev = "가";}
		     
		     System.out.println(lev);
	}
}
