package com.company.java012;
//1. 클래스는 부품객체
//2. 상태(멤버변수)와 행위(멤버함수)
/*3. 상속 - 재활용
			
					Object
			↑					↑
	Grand(one(), two())		Aunt(name, toString())
	↑			↑
 Father		  Uncle
 (three())   (four()/ one()/ two())
*/
class Grand extends Object{
	public void one() { System.out.println("Grand : one"); }
	public void two() { System.out.println("Grand : two"); }
}//end GRand
class Aunt extends Object{
	String name="MiMi";
	@Override public String toString() { return name + "옆집이모클래스"; } 
}//end Aunt
class Father extends Grand{
	public void three() { System.out.println("Father : three"); }
}//end Father
class Uncle extends Grand{
	public void fore() { System.out.println("Uncle : one"); }
	public void one() { System.out.println("Uncle : one"); }
	public void two() { System.out.println("Uncle : two"); }
}//end Uncle

public class Extends004 {
	public static void main(String[] args) {
		Father father = new Father(); father.three();  father.two(); father.one();
		System.out.println(); System.out.println();
		
		Uncle uncle = new Uncle(); uncle.one(); uncle.two(); uncle.fore();
		System.out.println(); System.out.println();
		
		Aunt aunt =  new Aunt();
		System.out.println(aunt);
		
	}

}
