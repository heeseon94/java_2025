package com.company.java015_ex;

import java.util.ArrayList;
import java.util.Arrays;

public class ListEx001 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println(colors);
		System.out.println(colors.get(0));
		System.out.println(colors.get(1));
		System.out.println(colors.get(2));
		
		System.out.println();
		System.out.println();
		for(int i=0; i<colors.size(); i++) {System.out.println(colors.get(i));}
	}
}
/*
다음과 같이 코드를 작성하시오.
1. ArrayList이용해서 colors만들기
2. red, green, blue 데이터 추가
3. 출력
 */
