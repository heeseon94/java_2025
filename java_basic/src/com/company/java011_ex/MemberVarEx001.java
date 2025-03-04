package com.company.java011_ex;


/*연습문제1)  멤버변수
패키지명 : com.company.java010_ex
클래스명 :  MemberVarEx001
-- class Sawon3작성해주세요 
1. 인스턴스변수, 클래스변수, 지역변수 를 구분하시오.
2. 인스턴스메서드, 클래스메서드 구분하시오.
3. 오류나는 이유는?
*/


//클래스는 부품객체
//상태와 행위
class Sawon3{ 
	//상태(멤버변수) - 클래스변수/인스턴스변수/지역변수
    int pay      =10000;      //인스턴스변수 - heap - new(관련있음) - this, 생성자
    static int su=10;         //클래스변수  - method - new(관련없음) - 공유하는 목적으로 올라와있음   
//    static int basicpay=pay;  //클래스변수 = 인스턴스변수 (클래스변수, 클래스메서드 - this, 인스턴스사용불가)   
    static int basicpay2;   
    
    //행위(멤버함수)   - 클래스함수 / 인스턴스함수
    public static void showSu()  {   System.out.println(su);  }          //클래스함수 - method - new X - 공유 
//    public static void showPay() {   System.out.println(this.pay);  }    //X
  
    public  void  showAll001() {   // 인스턴스변수 - heap - new O - this, 생성자
       System.out.println(su);  
       System.out.println(this.pay);  
    } 
    /*public static  void  showAll002() {   //클래스함수 - method - new X - 공유
        showAll001();    //인스턴스 사용불가 - htap - new O - this, 생성자
       System.out.println(this.pay);
    } */
} 
public class MemberVarEx001{
  public static void main(String[] args) {  // 지역변수
   Sawon3   sola = new Sawon3();  // 지역변수  sola
   sola.showAll001();
  }
}
