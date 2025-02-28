package com.company.java010_ex;

import java.util.Scanner;

class Calc{
	int num1, num2; char op; double result;

	public Calc() {}
	public Calc(int i, int j, char c) {
		this.num1 = i;
		this.num2 = j;
		this.op = c;
	}
	void input() { 
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 1 : ");
		num1 = scanner.nextInt();
		System.out.print("숫자 2 : ");
		num2 = scanner.nextInt();
		System.out.print("연산자 : ");
		op = scanner.next().charAt(0);
	}
	void opcalc() {
		     if(op=='+') { result = num1 + num2; }
		else if(op=='-') { result = num1 - num2; }
		else if(op=='*') { result = num1 * num2; }
		else if(op=='/') { result = num1 / (double)num2; }
	}
	void show() {opcalc(); System.out.println("" + num1 + op + num2 + "=" + 
					(op !='/'?("" +result) : String.format("%.2f",result)) ); }
}

public class ClassEx007 {
	public static void main(String[] args) {
		Calc c1 = new Calc(10,3,'+');
		c1.show();
		
		Calc c2 = new Calc();
		c2.input();
		c2.show();
	}

}
/*연습문제4)  class
패키지명 : com.company.java010_ex
클래스명 :  ClassEx007
-- 생성자 작성하시오.
class Calc{
   //상태-멤버변수  :  int num1, num2;  char op;  double result;
   //행위-멤버함수  :  void input()   입력받기
   //               void opcalc() +더하기계산, -라면 -계산  , *라면 *계산 , /라면 /계산 
   //                      void show()    연산출력   
}
public class ClassEx007{
   public static void main(String[] args) {
   Calc  c1= new Calc(10,3,'+');  
   c1.show();
   
   Calc  c2= new Calc();  
   c2.input();   
   c2.show(); 
    
   }
}
출력내용)
10+3=3

숫자1> 10
숫자2> 3
연산자> /
10/3=3.33
*/