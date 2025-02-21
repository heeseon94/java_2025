package com.company.java005_ex;

public class ForEx005 {
	public static void main (String [] args) {
		int con = 0;
		
		for(char eng = 'a'; eng<='z'; eng++) {
			if(eng == 'a' || eng == 'e' || eng ==  'i' || eng == 'o' || eng == 'u' ) {
				con++;
			}
		}//end for
		System.out.println("모음의 갯수는 : "+ con);
		
	}

}
