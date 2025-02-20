package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007_1 {
	public static void main (String [] args) {
		// 교수님 방식
		int num1, num2; char op = ' '; String result="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		num1 = scanner.nextInt();
		System.out.print("정수를 입력해주세요 : ");
		num2 = scanner.nextInt();
		System.out.print("연산자를 입력해주세요 : ");
		op = scanner.next().charAt(0);
				
		     if (op == '+') { System.out.printf("%d %c %d = %d\n",num1,op,num2,num1+num2); }
		else if (op == '-') { System.out.printf("%d %c %d = %d\n",num1,op,num2,num1-num2); }
		else if (op == '*') { System.out.printf("%d %c %d = %d\n",num1,op,num2,num1*num2); }
		else if (op == '/') { System.out.printf("%d %c %d = %.2f\n",num1,op,num2,num1/(float)num2); }
		
		     if (op == '+') { System.out.println("" + num1 + op + num2 + "=" + (num1+num2)); }
		else if (op == '-') { System.out.println("" + num1 + op + num2 + "=" + (num1-num2)); }
		else if (op == '*') { System.out.println("" + num1 + op + num2 + "=" + (num1*num2)); }
		else if (op == '/') { System.out.println("" + num1 + op + num2 + "=" + String.format("%.2f",(num1/(float)num2))); }     

		     if (op == '+') { result = "" + (num1+num2); }
		else if (op == '-') { result = "" + (num1-num2); }
		else if (op == '*') { result = "" + (num1*num2); }
		else if (op == '/') { result = String.format("%.2f",(num1/(float)num2)); }     
		
		
	}
}
