package com.company.java005_ex;

public class ForEx001 {
	public static void main (String [] args) {
		//q1  for문을 이용해서 다음과 같이 출력하시오 :  1 2 3 4 5 
		System.out.println("q1 : ");
		for (int i=1; i<=5; i++ ) 
		{ System.out.print(i+"\t"); } 
		
		//q2  for문을 이용해서 다음과 같이 출력하시오 :  5 4 3 2 1
		System.out.println("\nq2 : ");
		for (int i=5; i>=1; i-- ) 
		{ System.out.print(i+"\t"); } 
		
		//q3  for문을 이용해서 다음과 같이 출력하시오 :  JAVA1   JAVA2  JAVA3
		System.out.println("\nq3 : ");
		for (int i=1; i<=3; i++ ) 
		{ System.out.print("JAVA"+i+"\t"); } 
		
		//q4  for문을 이용해서 다음과 같이 출력하시오 :  HAPPY3   HAPPY2  HAPPY1 
		System.out.println("\nq4 : ");
		for (int i=3; i>=1; i-- ) 
		{ System.out.print("HAPPY"+i+"\t"); } 
		
		//q5  for문을 이용해서 다음과 같이 출력하시오 :  0,1,2  
		System.out.println("\nq5  : ");
		System.out.print(" "+0);
		System.out.print(","+1);
		System.out.print(","+2);
		for (int i=0; i<=2; i++ ) 
		{ System.out.print(i+"\t"); } 
		
		//q6  for문을 이용해서 다음과 같이 출력하시오 :  0,1,2, ,,,중간생략 ,,, 99	
		System.out.println("\nq6 : ");
		for (int i=0; i<=99; i++ ) 
		{ System.out.print((i==0 ?" ":",")+i); } 
		
		//q7  for문을 이용해서 다음과 같이 출력하시오 :  10, 9,,,,중간생략 ,,, , 1
		System.out.println("\nq7 : ");
		for (int i=10; i>=1; i-- ) 
		{ System.out.print((i==10 ?" ":",")+i); } 
		
		//q8  for문을 이용해서 다음과 같이 출력하시오 :  0, 2, 4, 6, 8 
		System.out.println("\nq8 : ");
		for (int i=0; i<=8; i++ ) 
		{ System.out.print(((i==0)?"":"," )+i); } 
		
		//q9  for문을 이용해서 다음과 같이 출력하시오 :  0, 2, 4, 6, 8 ,,,중간생략 ,,, 18 
		System.out.println("\nq9 : ");
		for (int i=0; i<=18; i+=2 ) 
		{ System.out.print(i+"\t"); } 
	}
}
