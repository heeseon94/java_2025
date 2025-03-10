package com.company.java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx001 {
	public static void main(String[] args) {
		//1.  Hash이용해서 colors 만들기
		Set<String> set = new HashSet<>();
		
		//2. red, green, blue ,green 데이터 추가
		set.add("red");
		set.add("green");
		set.add("blue");
		set.add("green");
		
		//3. 출력
		System.out.println(set);
		
		for(String c: set) { System.out.print(c); } System.out.println();
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next());
		} System.out.println();
		
		//4. 갯수출력 
		System.out.println(set.size());
		
	}

}
/*연습문제1)  Collection  Framework
패키지명 : com.company.java015_ex
클래스명 : SetEx001
다음과 같이 코드를 작성하시오.
 1.  Hash이용해서 colors 만들기
 2. red, green, blue ,green 데이터 추가
 3. 출력
 4. 갯수출력  
*/