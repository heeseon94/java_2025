package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx004 {
	
	public static void main(String[] args) {
		
		//변수
		String name  = ""; 
	    int kor, eng, math, total ;
	    float avg = 0.0f; 
	    String pass = "";
	    String jang = "";
	    String star= ""; 
	    String level_kor="" , level_eng="" , level_math="";
	    String re = "";
	    Scanner scanner = new Scanner(System.in);
	    
	    //입력
	    System.out.print("이름을 입력하세요 :");
	    name = scanner.next();
	    System.out.print("국어점수를 입력하세요 :");
	    kor = scanner.nextInt();
	    System.out.print("영어점수를 입력하세요 :");
	    eng = scanner.nextInt();
	    System.out.print("수학점수를 입력하세요 :");
	    math = scanner.nextInt();
	    
	    //처리
	    total = kor + eng + math; 
	    avg = (float) (total/3.0);
	    
	    	 if(avg >= 60 && kor >=40 && eng >= 40 && math >=40) {
	            	System.out.println("합격");}
	    else if(avg > 40) {
	    			System.out.println("불합격");}
	    else if(kor > 40 && eng > 40 && math > 40) {
					System.out.println("재시험");}
	    	 
	    	 if(avg>=95) {System.out.println("장학생");}
	    	 
	         if(avg>=100) {System.out.println("★★★★★★★★★★");}
	    else if(avg>=90) {System.out.println("★★★★★★★★★");}
	    else if(avg>=80) {System.out.println("★★★★★★★★");}
	    else if(avg>=70) {System.out.println("★★★★★★★");}
		
        //출력
	    System.out.print(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
	    		+ "이름      국어   영어   수학   총점  평균    합격여부   장학생   랭킹 \r\n"
	    		+ "--------------------------------------------------------------------------------------------");
//	    System.out.printf("%s\t ");
		
	}// end main
	

}

/*연습문제4)  method
패키지명 : com.company.java008_ex
클래스명 :  MethodEx004

public class MethodEx004{ 
   public static void main(String[] args) {
      /////////////////////(1)  변수
      String name  = ""; 
      int kor, eng, math, total ;
      float avg = 0.0f; 
      String pass = "";
      String jang = "";
      String star= ""; 
      String level_kor="" , level_eng="" , level_math="";
      String re = "";
      Scanner scanner = new Scanner(System.in);
      
      /////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
   
      /////////////////////(3) 처리 : 
      total = process_total(kor , eng, math);    // 1. 총점처리
      
      avg = process_avg(total);    //2.  평균처리
      
      ////////3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
      pass = process_pass(avg , kor, eng, math);  
      
      //////// 4. 평균이 95점이상이면 장학생
      jang = process_scholar(  avg  ); 
      
      //////// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
      star = process_star(avg);  
      
      
      /////////////////////(4) 출력
      process_show(name, kor, eng, math, total, avg, pass, jang, star);
    
      
   }// end main
 
   
}// end class

 
      ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
      이름      국어   영어   수학   총점  평균    합격여부   장학생   랭킹
      --------------------------------------------------------------------------------------------
      아이언맨   100   100   100   300    100.0    합격      장학생   **********
      --------------------------------------------------------------------------------------------
      */