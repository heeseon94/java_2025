package com.company.java006_ex;

public class ArrayEx005 {
	public static void main(String[] args) {
		//var1 대문자 B가 대문자라면 갯수
		//     소문자 a가 소문자라면 갯수
		
		//ver2 if(대문자 B가 대문자라면) {갯수}
		//     if(소문자 a가 소문자라면) {갯수}
		
		//ver3 if(ch[0] == 'B') {갯수}
		//     if(ch[1] == 'a') {갯수}
		
		char [] ch = {'B' , 'a' , 'n' , 'a', 'n' , 'a'};
		int a = 0, b=0;
		
		for(char i=0; i<ch.length; i++) {
			     if(ch[i] >='A' && ch[i]<='Z' ) {a++;}
			else if(ch[i] >='a' && ch[i]<='z' ) {b++;}
		}
		
		System.out.println("대문자 갯수는 : " + a + "개");
		System.out.println("소문자 갯수는 : " + b + "개");
		
	}

}


/*연습문제5)  array
패키지명 : com.company.java006_ex
클래스명 :  ArrayEx005
    1. 배열명 : ch
    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
    3. ch 배열에서 대문자의 갯수카운트, 소문자의 갯수 카운트
*/