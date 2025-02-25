package com.company.java007_ex;

public class Array2Ex001 {
	public static void main(String[] args) {
		int [][] arr2 = {{100,200,300},{400,500,600}};
		
		//System.out.println("층의 갯수: " + arr2.length);
		//System.out.println("칸의 갯수: " + arr2[0].length);
		
//		for(int i=0; i<3; i++) {System.out.print(arr2[0][i]+"\t");}
//		for(int i=0; i<3; i++) {System.out.print(arr2[1][i]+"\t");}
		
		for(int ch=0; ch<arr2.length; ch++) {
		 	for(int kan=0; kan<arr2[ch].length; kan++) {
		 	 	System.out.print(arr2[ch][kan]+ "\t");}   
			System.out.println();
		}
	}

}

/*연습문제9)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex001
배열을 이용하여 다음의 프로그램을 작성하시오.   
  
   int[][] arr2={{100,200,300},{400,500,600}};

   이중for 이용해서 출력하기*/