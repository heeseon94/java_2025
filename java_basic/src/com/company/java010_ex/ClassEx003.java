package com.company.java010_ex;

//1. 클래스는 부품객체
//2. 클래스 속성(멤버변수)과 행위(멤버함수) - 특징
class Coffee{
	//멤버변수
	String name; int price, num;
	//멤버함수
	void show(){
		System.out.println("=====커피\r\n"
				+ "커피명 : name\r\n"
				+ "커피잔수 : num \r\n"
				+ "커피가격 : num * price");
	} //커피정보출력
	//생성자 - 사용자가 넣어준 값
	public Coffee(String name, int price, int num) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
	}
	public Coffee() {
		name="아메리카노"; num=1; price=2000;
	}
	
}

public class ClassEx003 {
	public static void main(String[] args) {
		 Coffee a1 = new Coffee("까페라떼" ,2 , 4000);  a1.show();
		 Coffee a2 = new Coffee();                   a2.show();
	}

}
