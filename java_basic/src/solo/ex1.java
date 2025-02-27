package solo;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int num=0;
		Scanner scnner = new Scanner(System.in);
		
		System.out.print("숫자입력 : ");
		num = scnner.nextInt();
		
		for (int i=1; i<=9; i++) {
			System.out.println(num + "*" + i + "=" + (num*i));
			
		}// for
		

	}// main

}// class
