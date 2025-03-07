package com.company.java013;

class Parent1 extends Object{
 	int i, j;
 	public Parent1(){super();}  //1) 누구 호출한것인지 작성 : Object
 	public Parent1(int i, int j){ super(); this.i=i; this.j=j;}
 	//2) 누구 호출한것인지 작성 : Object
 	} // end Parent
class Child1 extends Parent1{
 	int k;
 	public Child1(){super();} //3) 누구 호출한것인지 작성 : Parent
 	public Child1(int i, int j, int k){ super(i,j); this.k=k; }
 	//4) 누구 호출한것인지 작성 : Parent
 	} // end Child
 	
public class Repeat005_OOP {
	public static void main(String[] args){
 		
 		Child1 child = new Child1(10,20,30);
 		System.out.println(child.i); //5) 결과출력
 		System.out.println(child.j); //5) 결과출력
 		System.out.println(child.k); //5) 결과출력
 		
 		
 		} // end main
}
