package SelfTest;

import java.util.Scanner;

public class SelfTest016 {

	public static void main(String[] args) {
		int [][] arr = {{100,101,102},{200,201,202}};
		Scanner scanner = new Scanner(System.in);

		for(int ch=0; ch<arr.length; ch++){
			for(int kan=0; kan<arr[ch].length; kan++) {
				System.out.print(arr[ch][kan]+ "\t");}
			System.out.println();
		}
	}

}
