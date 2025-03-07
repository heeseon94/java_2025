package com.company.java013;

/*Q6. 컴파일에러
				기본값			명시적초기화			초기화블록			생성자
	classValue	1) 0 			2) 20				3) 20 			4) X
instanceValue	1) 0 			2) 10				3) 10 			4) 10	
*/

class MemberCall001 {
	static int instanceValue = 10;        // 인스턴스변수, heap area, new O, this
	static int classValue = 20;    // 클래스변수, method area, new X, 공유, 클래스명.변수명
	
	int instanceValue2 = classValue; // 인스턴스변수(5) = 클래스변수(1)
	
	static int classValue2 = instanceValue; // #1 error - static은 instance 사용불가
	// static jvm 로딩시 메모리 할당받음(바로사용), instance는 new를 사용해 메모리할당받고 객체생성후 사용
	
	
	static void staticMethod1() {
		System.out.println(classValue);
		System.out.println(instanceValue);
	}
//	
//	void instanceMethod1() {
//		System.out.println(classValue);
//		System.out.println(instanceValue);
//		
//	}
//	
//	static void staticMethod2() {
//		System.out.println(classValue);
//		instanceMethod1();
//	}
//	
//	void instanceMethod2() {
//		staticMethod1();
//	}
}

public class Repeat002 {
	public static void main(String[] args) {
		
	}

}
/*
 Q7. 접근제어자 사용범위를 작은순에서 → 큰순서로 적으시오.
 	 private(클래스내부) - package(default : 폴터내부) - protected - public
 	 
 
 	 
 
 */
