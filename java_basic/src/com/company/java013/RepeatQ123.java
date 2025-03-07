//package com.company.java013;
//
//class A11{
//	int a; //(1) 클래스변수
//	A11(){}
//	A11(int a){this.a = a;} //(2) 인스턴스변수
//	//(3) void show() 지역변수
//	void show() {this.a=11; System.out.println(this.a);}
//	//(4) static void classMethod()  클래스메서드
//	void classMethod() {this.a=12;}
//	//(5) int showz()  인스턴스메서드
//	int showz() {return a;}
//}
//
//public class RepeatQ123 {
//	public static void main(String[] args) {
//		A11 a1 = new A11(); //(b)
//	}
//}

/*
 Q1. 위의 문제에서 (1), (2), (3), (4), (5)를
 	 [클래스변수, 인스턴스변수, 지역변수, 클래스메서드, 인스턴스메서드]에서 고르시오.
 
 Q2. 클래스 A11에서 오류나는 곳을 수정하고 그 이유를 적으시오.

 Q3. (b)번위치에서
 	 메모리 빌려오고, 객체 생성하는 역활 : ( a1 )
 	 String은 null, int는 0으로 초기화하는 역할 : ( new A11() )
 	 new A11()한 주소를 갖고 있는 것은 : ( A11 )

 Q4. 기본생성자를 반드시 선언해야하는 경우를 적으시오.
 
 Q5. 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)
 	 a. 메서드의 이름이 같아야 한다.
 	 b. 매개변수의 개수나 타입이 달라야 한다.
 	 c. 리턴타입이 달라야한다.
 	 d. 매개변수의 이름이 달라야 한다.
 	 
 Q6. 
 
 Q7. 접근제어자 사용범위를 작은순에서 → 큰순서로 적으시오.
 	 private - package - protected - public
 	 
 Q8. 
 
 Q9. 다음은 오루가 나는 코드이다. 해결하시오.
 	 public class A011_Car4{
 	 	public static void main(String[] args){
 	 		Car4 c1 = new Car4();
 	 		c1.color = "red";
 	 		System.out.println(c1); // Car4 [color = red]
 	 	} // end main
 	 } // end class
 
 Q10. 클래스를 상속하는 이유를 적으시오.
 
 Q11. 상속의 형식을 적으시오.
 
 Q12~13. 다음의 결과가 나오도록 코드를 작성하시오.
 
 	□ 출력된화면 					//Q12. Dto의 역활을하는 ClassA를 작성하시오.
 	A[name=null]                       class A{private String name;}
 	A[name=null]
 	A[name=null]
 	
 	□ 주어진옵션 : main에서 사용하는 클래스
 	class TestArr{
 		public static void main(String [] args){
 			A[]arr = new A[3];
 			arr[0] = new A(); arr[1] = new A(); arr[2] = new A();
 			
 			//Q13. 위와 같이 코드를 출력되게 코드를 작성하시오.
 		}
 	}
 
 Q14. 메소드의 재정의 : 상속시 부모메서드와 같은 메서드를 무엇이라고 하는가?
 
 Q15. 1), 2), 3), 4)를 채우시오.
 	class Parent{
 	int i, j;
 	public Parent(){super();}  //1) 누구 호출한것인지 작성 : 
 	public Parent(int i, int j){
 	 	super();  //2) 누구 호출한것인지 작성 : 
 	 	this.i=i;
 	 	this.j=j;
 		}
 	} // end Parent
 	class Child extends Parent{
 	int k;
 	public Child(){super();} //3) 누구 호출한것인지 작성 :
 	public Child(int i, int j, int k){
 		super(i,j); //4) 누구 호출한것인지 작성 : 
 		this.k=k;
 		}
 	} // end Child
 	public class ExtendsBasic007_Super{
 		public static void main(String[] args){
 		
 		Child child = new Child(10,20,30);
 		System.out.println(child.i); //5) 결과출력
 		System.out.println(child.j); //5) 결과출력
 		System.out.println(child.k); //5) 결과출력
 		
 		} // end main	
 	} // end class
 
 */
 