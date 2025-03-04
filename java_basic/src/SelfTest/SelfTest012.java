package SelfTest;

import java.util.Scanner;

public class SelfTest012 {
	public static void main(String[] args) {
		int num=0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요. ");
			num = scanner.nextInt();
			if(num >=0 && num <=100) { break; }
		}
	}

}
