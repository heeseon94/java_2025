package com.company.java008_ex;

public class MethodEx003 {
	

	public static int return_num(){return 1;}
	public static double return_float(){return (double)10/3.0;}
	public static String mycolor(){return "PURPLE";}
	public static String jangsu(){return "★★★★★";}
	public static int myadd(int a, int b){return a + b ;}
	public static String myban(char a){ if(a=='A') {return "노랑조";} else if(a=='B') {return "주황조";} else {return "";}}
	public static String stdId(int i){return "G" + i;}
	public static char stdAvg(int a){if (a>=90) {return 'A';} else if(a>=80) {return 'B';} else if(a>=70) {return 'C';} else {return 'D';}}
	
	public static void main(String[] args) {
		
		//	public static 리턴값 메서드명(){}
		//	public static int return_num(){return_num;}
		System.out.println("1. 내가 좋아하는 숫자    :" + return_num());	
		
		//	public static 리턴값 메서드명(){}
		//	public static double return_float(){return (double)10/3.0;}
		System.out.println("2. 10/3.0을 실수로 표현 :" + return_float());
		
		//	public static String mycolor(){return PURPLE;}
		System.out.println("3. BEST COLOR        :" + mycolor());
		
		//	public static String jangsu(){return ★★★★★}
		System.out.println("4. 장수돌침대 별이       :" + jangsu());
		
		//	public static int myadd(int a, int b){return a + b ;}
		System.out.println("5. 10+20= " + myadd(10,20));
		
		//	public static 리턴값 메서드명(){}
		//	public static 주황조 myban(char a){} 
		//	public static String myban(char a){ return ( a=='A')? "노랑조" : ( a=='B')? "주황조":""; }
		System.out.println("6. 반(노랑조/주황조)=" + myban('B'));
		
		//	public static String stdId(int i){return "G" + i;}
		System.out.println("7. 당신의 학번은?" + stdId(1111));
		
		//	public static char stdAvg(int a){if (90점이상이면) {A} else if( 80점이상이면) {B} else if(70점이상이면) {C} else {D}}
		System.out.println("8. 당신의 평균은?" + stdAvg(88));
		
		
		
	}

}

/*연습문제3)  method
패키지명 : com.company.java008_ex
클래스명 :  MethodEx003

System.out.println("1. 내가 좋아하는 숫자    :" + return_num());    // 1을 결과값으로 줌
System.out.println("2. 10/3.0을 실수로 표현 :" + return_float());  // 3.3333을 결과값으로 줌
System.out.println("3. BEST COLOR        :" + mycolor());      // PURPLE을 결과값으로 줌
System.out.println("4. 장수돌침대 별이       :" + jangsu());        // ★★★★★을 결과값으로 줌  
System.out.println("5. 10+20= " + myadd(10,20));       // 두숫자를 더한값을 결과값으로 줌  
System.out.println("6. 반(노랑조/주황조)=" + myban('B'));  // A이면 노랑조 ,  B이면 주황조
System.out.println("7. 당신의 학번은?" + stdId(1111));   // G하고 넣어준 학번 나오게
System.out.println("8.당신의 평균은?" + stdAvg(88));    
// 90점이상이면 A ,  80점이상이면 B ,  70점이상이면 C , 아니라면  D

출력결과 :
1. 내가 좋아하는 숫자    : 1
2. 10/3.0을 실수로 표현 : 3.3333
3. BEST COLOR        : PURPLE
4. 장수돌침대 별이       : ★★★★★
5. 10+20= 30
6. 반(노랑조/주황조)= 나는 노랑조
7. 당신의 학번은? G1111
8. 당신의 평균은? B
*/