package com.company.java006_ex;

public class RepeatEx009 {
	public static void main(String[] args) {
		//ver-1 눈에 보이는 대로 출력
		
		//System.out.print('A');System.out.print('B');System.out.print('C');.......
		
		
		//var-2
		// System.out.print('A'); 알파벳 A~Z  System.out.print(); 1) 줄바꿈 - 5번째마다 
		// System.out.print('A'); 2) 알파벳이랑 연결? A(65) F(70) K(75)
		
//		if('A'%5==0) {System.out.println();} System.out.println('A');
//		if('B'%5==0) {System.out.println();} System.out.println('B');
//		if('C'%5==0) {System.out.println();} System.out.println('C');
//		if('D'%5==0) {System.out.println();} System.out.println('D');
//		if('E'%5==0) {System.out.println();} System.out.println('E');
//		if('F'%5==0) {System.out.println();} System.out.println('F');
		
		for(char ch='A'; ch<='Z'; ch++) {if(ch%5==0) {System.out.println();} System.out.print(ch);}
		
		char ch='A'; while( ch<='Z') {if(ch%5==0) {System.out.println();} System.out.print(ch); ch++;}
		
		ch='A'; do {if(ch%5==0) {System.out.println();} System.out.print(ch); ch++;}while( ch<='Z');
	}

}


/*
 * 연습문제9)  for/while/do while
패키지명 : com.company.java006_ex
클래스명 :  RepeatEx009
for , while , do while 3가지 버젼으로 
ABCDE   
FGHIJ
KLMNO
PQRST
UVWXY
Z
*/
