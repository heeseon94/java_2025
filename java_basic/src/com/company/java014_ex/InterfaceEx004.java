package com.company.java014_ex;

import java.util.Arrays;
import java.util.Calendar;

/*
 			Launch
 		  ↑		   ↑
 		Burger	 KimchiStew
 		
 User		
 */

interface Launch{int MONEY=10000; void eat();}
class Burger implements Launch{
	int price;
	public Burger() {this.price = 3900;}
	@Override public String toString() {return "Burger";}
	@Override public void eat() { System.out.println("Burger 냠냠!"); }	 
 }
class KimchiStew implements Launch{
	int price;
	public KimchiStew() {this.price = 3900;}
	@Override public String toString() {return "KimchiStew";}
	@Override public void eat() { System.out.println("KimchiStew 냠냠!"); }
	
}
class User{
	int money;
	int cnt;
	Launch [] plate;
	public User() { this.money = Launch.MONEY; plate = new Launch[3]; cnt = 0; }
	
	void order(Launch a) { // Launch a = new Burger(); / Launch a = new KimchStew();
		int temp=0;
			//1. 주문한 메뉴의 값 확인
		     if( a instanceof Burger )    { System.out.println("버거하나요~"); temp = ((Burger)a).price;}
		else if( a instanceof KimchiStew ) { System.out.println("김치찌개하나요~"); temp = ((KimchiStew)a).price; }
		
		     //2. 내가 가진돈 확인
		if(money<temp) { System.out.println(">> 잔액부족 주문불가능"); return; }
		money-=temp;
		
		//3. plate에 주문받은거 넣기
		plate[cnt++] = a;  // System.out.println(money + "-" + Arrays.toString(plate));
	} //주문   버거하나요~ 김치찌개하나요~ 버거하나요~ / 잔액부족 주문불가능
	
	void  show() {
		String order="주문 : ";
		for( int i=0; i<cnt; i++ ) { order += ((i!=0)?",":" ") + plate[i]; }
		System.out.println("\n\n" + order);
		System.out.println("주문금액 : " + (Launch.MONEY - money));
		System.out.println("잔액    : " + money);
		
		Calendar today = Calendar.getInstance();
		System.out.println( today.get(1) + "년 " + //년
						(today.get(2)+1) + "월 " + //월 0~11 (0:11)
							today.get(5) + "일 "); //일
		
		//for(Launch a : plate) { a.eat(); }  //부모에서 메서드호출시 @Override - 자식메서드 호출
		for(int i=0; i<cnt; i++) { plate[i].eat(); }
	}//출력
	//주문 :
	//주문금액 :
	//잔액
	//날짜 :
	//eat()
}

public class InterfaceEx004 {
	public static void main(String[] args) {
		User launch_order = new User();
		launch_order.order(new Burger());
		launch_order.order(new KimchiStew());
		launch_order.order(new Burger());

		launch_order.show();
	}
}
