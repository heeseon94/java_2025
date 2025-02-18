package com.company.java002_ex;

public class VarEx002 {
	public static void main (String [] args) {
		// 정수형은 소수점 없는 숫자. %d
		int a = 0;
		a = 10;
		int b = 3;
		
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / b));
		
		System.out.printf("%d + %d = %d\n", a, b , a+b);
		System.out.printf("%d - %d = %d\n", a, b , a-b);
		System.out.printf("%d * %d = %d\n", a, b , a*b);
		System.out.printf("%d / %d = %d\n", a, b , a/b);

		System.out.printf("%d / %d = %f\n", a, b , a/(float)b);
		// 정수 %d 1,2,3   실수 %f 1.1
		// 정수/정수 = 정수  10/3=3       /       정수/실수, 실수/정수
	}
	

}
