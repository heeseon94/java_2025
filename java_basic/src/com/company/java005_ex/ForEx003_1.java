package com.company.java005_ex;

public class ForEx003_1 {
	public static void main (String [] args) {
		
		//변수
		int hap=0;   // hap [0]

		//입력
				
		//처리
		//현재 합을 구하는곳에 1을 더하고
		//현재 합을 구하는곳에 2를 더하고
		//hap = hap + 1;  // 2) hap[1]  =  1)0+1       
		//hap = hap + 2;  // 2) hap[3]  =  1)1+2
		//hap = hap + 3;
		for(int i=1; i<=10; i++) {hap = hap + i;}
		//출력
		System.out.println("1~10까지의 합 : " + hap);
		
		
		
	}

}
