package com.company.java009;

public class Method004 {
	
	public static void show(int a) {System.out.println(a*10);}
	public static void show(int a, int b, int c) {
		System.out.println(a*10 + "\t" + b*10 + "\t" + c*10 + "\t");}
	
	public static void main(String[] args) {
		int []a = {1,2,3};
		
		show(a[0]);    //10출력
		//public static 리턴값 메서드명(파라미터){해야할일}
		//public static void show(int a) {System.out.println(a*10);}
		
		show(a[0], a[1], a[2]);
		//public static 리턴값 메서드명(파라미터){해야할일}
		//public static void show(int a, int b, int c) {System.out.println(a*10);}
		
		//Q1. 위에 메서드 작성
		//Q2. 메서드 이름이 같고 파라미터가 다르면?(오버로딩)
		
	}
}
