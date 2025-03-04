package SelfTest;

import java.util.Scanner;

public class SelfTest003 {
	public static void main(String[] args) {
		String str = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요. ");
		str = scanner.next();
		
		System.out.println("당신의 이름은"+ str +"입니다." );
	}
}
