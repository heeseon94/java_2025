package SelfTest;

import java.util.Scanner;

public class SelfTest011 {
	public static void main(String[] args) {
		int num=0;
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.print("숫자를 입력하세요. ");
			num = scanner.nextInt();
			if(num >=0 && num <=100) { break; }
		}
	}

}
