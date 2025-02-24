package com.company.java005_ex;

import java.util.Scanner;

public class ForEx006_2 {
	public static void main(String[] args) {
		//변수
		int num1 = -1;
		int num2 = -1;
		double total = 0;
		char ch = ' ';
		Scanner scanner = new Scanner (System.in);
		//입력
		/* break (빠져나오기) / continue (밑에꺼 skip)
		//for(;;){ // 1-1 무한반복
		//#todt1 if(잘못썻으면){숫자1입력받기}  → if(!(0<= num1 && num1 <=100)) {숫자1입력받기}
		//#todt2 else if(잘못썻으면){숫자2입력받기}
		//#todt3 else if(잘못썻으면){연산자입력받기}
		//1-2 빠져나올 조건 - 빠져나오기 break
		//
		 }*/
		for(;;) {
			if(!(0<= num1 && num1 <=100)) {System.out.print("숫자1입력");
			num1 = scanner.nextInt();}
			//continue; 잘못입력받았으면 아래꺼 진행하면 안됨.
			
			else if(0>num2 || num2>100) {System.out.print("숫자2입력");
			num2 = scanner.nextInt();}
			
			else if (!(ch == '+' || ch == '-' || ch == '*' || ch == '/' )) 
				{ System.out.print("연산자 입력");
				ch = scanner.next().charAt(0); continue;}
			else {break;}
			}
		
	
		//처리
		//ch가 +라면 +계산, -라면 -계산, *라면 *계산, /라면 /계산
		     if (ch == '+') {total = num1 + num2;}
		else if (ch == '-') {total = num1 - num2;}
		else if (ch == '*') {total = num1 * num2;}
		else if (ch == '/') {total = num1 / num2;}
		
		//출력
		
	    System.out.println("" +  num1 + ch + num2 + "=" + 
	    		(ch!='/' ? "" + (int)total : String.format("%.2f",total)));
//		System.out.println("" +  num1 + ch + num2 + "=" + total);
//		System.out.printf( "%d %s %d = %d",num1,ch,num2,total );
		
				
		
		
		
	}

}
