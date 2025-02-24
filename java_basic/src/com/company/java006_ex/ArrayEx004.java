package com.company.java006_ex;

public class ArrayEx004 {
	public static void main(String[] args) {
		char [] ch = {'B' , 'a' , 'n' , 'a', 'n' , 'a'};
		int cnt = 0;
		
		//var-1 대문자B가 소문자 a라면 갯수
		//      소문자a가 소문자 a라면 갯수
		
		//var-2 if(대문자B가 소문자 a라면) {갯수}
		//      if(소문자a가 소문자 a라면) {갯수}
		
		//var-3 if(ch[0] == 'a' ) {갯수}
		//      if(ch[1] == 'a' ) {갯수}
		
		//ver-4 for() {} ....
		for(char i=0; i<ch.length; i++) {
			           if(ch[i] == 'a') { cnt++; }
			      
			
		}
		System.out.println("소문자 a의 개수는 : "+ cnt + "개");
	}

}


/*연습문제4)  array
패키지명 : com.company.java006_ex
클래스명 :  ArrayEx004
    1. 배열명 : ch
    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
    3. ch 배열에서 a의 갯수 세기
    */