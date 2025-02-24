package com.company.java006_ex;

public class Repeat007 {
	public static void main(String[] args) {
		
		
		for (int i=1; i<=5; i++) { System.out.print(i + "\t"); }
		System.out.println();
		for (int i=5; i>=1; i--) { System.out.print(i + "\t"); }
		System.out.println();
		for (int i=1; i<=5; i++) { System.out.print("java" + i + "\t"); }
		System.out.println("\n");
		
		System.out.println();
		
		int i=1; while (i<=5) { System.out.print(i+"\t"); i++;}
		System.out.println();
		    i=5; while (i>=1) { System.out.print(i+"\t"); i--;}
		System.out.println();
		i=1; while (i<=5) { System.out.print("java" +i+"\t"); i++;}
		System.out.println("\n");
		
		
		i=1; do {System.out.print(i+"\t");i++;} while(i<=5);
		System.out.println();
		i=5; do {System.out.print(i+"\t");i--;} while(i>=1);
		System.out.println();
		i=1; do {System.out.print("java" +i+"\t");i++;} while(i<=5);
		System.out.println();
	}

}
