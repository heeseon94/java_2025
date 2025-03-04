package SelfTest;

import java.util.Scanner;

public class SelfTest004 {
	public static void main(String[] args) {
		int kor, eng;
		String str="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수를 입력해주세요 : ");
		kor = scanner.nextInt();
		System.out.println("영어점수를 입력해주세요 : ");
		eng = scanner.nextInt();
		
		if (kor<40) { System.out.println("국어 과락"); }
		if (eng<40) { System.out.println("영어 과락"); }
	}
}
