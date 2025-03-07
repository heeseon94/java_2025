package com.company.java013;
//1. 클래스 부품객체
/* Q1. 위의 문제에서 (1), (2), (3), (4), (5)를
 [클래스변수, 인스턴스변수, 지역변수, 클래스메서드, 인스턴스메서드]에서 고르시오.*/

class A11{
	int a; //(1) 클래스변수 - heap atea - new O - this 각각
	
	public A11(){}
	public A11(int a){this.a = a;} //(2) 지역변수 - stack area

	void show() {this.a=11; System.out.println(this.a);}
	//(3) void show() 인스턴스메서드 - heap area - new O - this 각각
	
	void classMethod() {this.a=12;}
	//(4) static void classMethod()  클래스메서드 - method area - new X - 공유영역
	// static이 jvm로딩시 제일먼저 메모리상에 올라감. this는 new를 이용해 사용해야함. 순서가 안맞음.
	// static은 instance 사용불가
	
	int show2() {return a;}
	//(5) int showz()  인스턴스메서드 - heap area - new O - this 각각
	// int show2() { int a; return a; } show2 메서드 안에 있는 int a는 지역변수
	// int a 는 stack - 임시공간 - 변수초기화가 안됨.  주의)
}

public class Repeat001 {
	public static void main(String[] args) {
		A11 a1 = new A11(); // 지역변수 - stack 영역
	}
}

/*
 Q3. (b)번위치에서
 메모리 빌려오고, 객체 생성하는 역활 : ( new )
 String은 null, int는 0으로 초기화하는 역할 : ( A11() )
 new A11()한 주소를 갖고 있는 것은 : ( a1 )
 
 Q4. 기본생성자를 반드시 선언해야하는 경우를 적으시오.
  		 - 생성자 오버로딩, 상속할때
  
 Q5. 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)
	(비슷한 기능의 메서드들의 이름을 같게 만들고, 알규먼트의 자료형과 갯수로 구분)
 
    c. 리턴타입이 달라야한다.
    d. 매개변수의 이름이 달라야 한다.
 
*/