package com.company.java015_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx002 {
	public static void main(String[] args) {
		
		//1. numbers ArrayList 만들기
		ArrayList<String> numbers = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		//one, two, three 데이터추가
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		
		//사용자에게 1,2,3 입력받기
		System.out.println("숫자 1,2,3 입력 : ");
		int num = scanner.nextInt();
		
		     if(num == 1) {System.out.println(numbers.get(0));}
		else if(num == 2) {System.out.println(numbers.get(1));}
		else if(num == 3) {System.out.println(numbers.get(2));}
		else 			  {System.out.println("잘못입력하셨습니다.");}
	}
}
/*
 1. numbers ArrayList 만들기
2. one, two, three 데이터추가
3. 사용자에게 1,2,3 입력받기
4. 1을 입력받으면 one 출력
   2를 입력받으면 two 출력
   3을 입력받으면 three 출력
 */