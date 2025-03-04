package SelfTest;

import java.util.Scanner;

public class SelfTest005 {
	public static void main(String[] args) {
		int age=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("당신의 나이를 입력하세요 ");
		age = scanner.nextInt();
		
		if(age <= 19) {System.out.println("당신은 미성년자입니다.");}
		if(age > 19) {System.out.println("당신은 성인입니다.");}
		
	}

}
