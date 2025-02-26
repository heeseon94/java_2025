package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx004_2 {
	
	public static int process_total(int kor , int eng, int math){return kor + eng + math;}
	public static float process_avg(int total){return (float) (total/3.0) ;}
	public static String process_pass(float avg , int kor,  int eng, int math){ 
//		String result = "";
//	   	 	if(avg >= 60 && kor >=40 && eng >= 40 && math >=40) {
//	     	 result=("합격");}
//	   else if(avg > 40) {
//			 result=("불합격");}
//	   else if(kor > 40 && eng > 40 && math > 40) {
//			 result=("재시험");}
//	   return result;
	 return avg<60? "불합격" : kor<40 || eng<40 || math<40? "재시험" : "합격";
	}
	public static String process_scholar(float avg) { return avg>=95?"장학생":""; }
	/*
	public static String process_star(float avg) { 
			     if(avg>=100) {System.out.println("★★★★★★★★★★");}
		    else if(avg>=90) {System.out.println("★★★★★★★★★");}
		    else if(avg>=80) {System.out.println("★★★★★★★★");}
		    else if(avg>=70) {System.out.println("★★★★★★★");} return null;}*/
	public static String process_star(float avg) { 
	  String result=""; 
	  //92/10 =9  83/10=8
	  for (int i=0; i<(int) avg/10; i++){result += "★"; }
	  return result;
	 }
	
	public static void process_show( String name, int kor, int eng, int math, int total, float avg, String pass, String jang, String star){

	    System.out.print(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
	    		+ "이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹\r\n"
	    		+ "--------------------------------------------------------------------------------------------\r\n");
	    System.out.printf("%s\t %d\t %d\t %d\t %d\t %.2f\t %s\t %s\t %s\t",name, kor, eng, math, total, avg, pass, jang, star);
	  }
	
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
	    //public static 리턴값 메서드명(파라미터){해야할일}
	    //public static int process_total(int kor , int eng, int math){return kor + eng + math;}
	    total = process_total(kor , eng, math);
	    //total = kor + eng + math; 
	    //public static 리턴값 메서드명(파라미터){해야할일}
	    //public static flort process_avg(total){return (float) (total/3.0) ;}
	    avg = process_avg(total);   
	    //avg = (float) (total/3.0);
	    
	    
	    //합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면 
	    // public static String process_pass(avg , kor, eng, math){ }
	      pass = process_pass(avg , kor, eng, math);
	      /*
	    	 if(avg >= 60 && kor >=40 && eng >= 40 && math >=40) {
	            	System.out.println("합격");}
	    else if(avg > 40) {
	    			System.out.println("불합격");}
	    else if(kor > 40 && eng > 40 && math > 40) {
					System.out.println("재시험");}*/
	    	 
	      
	     // 평균이 95점이상이면 장학생
	     // public static float process_scholar(  avg  ){ if(avg>=95) {System.out.println("장학생");} } 
	      	jang=	process_scholar(avg);
	    	 //if(avg>=95) {System.out.println("장학생");}
	    	 
	    	 
	    	 // public static String process_star(float avg) {  }
	    	// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
	    	 star = process_star(avg);

		
        //출력
	  process_show(name, kor, eng, math, total, avg, pass, jang, star);
	    //	public static void process_show(name, kor, eng, math, total, avg, pass, jang, star){출력}	 
	    
		
	}// end main
	

}

