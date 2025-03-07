package com.company.java013;

//Q8 DTO
// 8-1 private(클래스내부)      - getters/setters
// 8-2 객체의 상태를 표현하는 출력 - toString


//Q9-1 오류해결
class Car4 extends Object{
	private String color;
	
	public Car4() {super();}

	@Override public String toString() { return "Car4 [color=" + color + "]"; }

	public void setColor(String string) {
		
	} 
	
}

public class Repeat003 {
	public static void main(String[] args) {
		Car4 c1 = new Car4();
		//c1.color="red";				//9-2
		c1.setColor("red");
		System.out.println(c1);
	}
}


/*
 Q10. 클래스를 상속하는 이유를 적으시오.
 		- 클래스의 재사용
 
 Q11. 상속의 형식을 적으시오.
 		class 자식클래스  extends 부모클래스
  
 */
