package SelfTest;

import java.util.Scanner;

public class SelfTest014 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int a=2; a<=4; a++) {
			for(int i=1; i<=9; i++) 
			{ System.out.println(a + "*" + i + "=" + (a*i)); }
		}
	}
}
