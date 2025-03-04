package SelfTest;

import java.util.Scanner;

public class SelfTest013 {
	public static void main(String[] args) {
		int dan = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("단을입력하세요 :");
		dan = scanner.nextInt();
		
		for(int i=1; i<=9; i++) 
		{ System.out.println(dan + "*" + i + "=" + (dan*i)); }
	}

}
