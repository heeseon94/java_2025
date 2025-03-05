package com.company.java012;
//1. 클래스는 부품객체
//2. 상태와 행위
/*
 Object
 ↑
 Color   name(private)
 ↑
 GReen   num (private)    / void show(){}
 */

class Color extends Object {
	String name;
	public Color() { super();  }
}

class Green extends Color {
	int num;
	public Green() { super();  }
	public void show() {
		System.out.print(":::::GREEN\r\n"
				+"= NAME : "+ name+"\r\n"
				+"= NUM  : "+ num);
		
	}
}

public class Extends002 {
	public static void main(String[] args) {
		Green mygreen = new Green();
		mygreen.name = "LIGHT_GREEN"; mygreen.num=5;
		mygreen.show();
	}

}
