package mini_projecet;

import java.util.Scanner;

public class Bank {
	public static void main (String [] args) {
		/*
		 * 변수 id, pw, age, mon 설정
		 * */
		Scanner scanner = new Scanner(System.in);
		
		int num = 0, age = 0, mon=0;
		String pw = null;
		String id = null;

		for(;;) {   
			System.out.println("\n==========BANK==========");                            
			System.out.println("1.추가");
			System.out.println("2.조회");
			System.out.println("3.입급");
			System.out.println("4.출금");
			System.out.println("5.삭제");
			System.out.println("9.종료");
			
			num = scanner.nextInt();
			
			switch(num) { // id, pw, age, mon 설정
			case 1 :{ //추가
				System.out.println("아이디를 입력하세요."); //입력
				String inputid = scanner.next();
				System.out.println("비밀번호를 입력하세요.");
				String inputpw = scanner.next();
				System.out.println("나이를 입력하세요.");
				int inputage = scanner.nextInt();
				System.out.println("잔액을 입력하세요.");
				int inputmon = scanner.nextInt();
				
				id = inputid;
				pw = inputpw;
				age = inputage;
				mon = inputmon;
			}break;
			case 2 : {//조회
				//변수 
				//입력
				System.out.println("아이디를 입력하세요."); //입력
				String inputid = scanner.next();
				System.out.println("비밀번호를 입력하세요.");
				String inputpw = scanner.next();
				//처리+출력
				//
			if (inputid.equals(id)&& inputpw.equals(pw)) {
				System.out.println("==계좌조회");
				System.out.printf("ID : %s \nPASS : %s \n나이 : %d \n잔액 : %d",id,pw,age,mon);
				System.out.println(pw);
				
			}
			else {System.out.println("잘못입력하셨습니다.");}
				
			}break;
			case 9: //종료 
				break;
			}

		}//end for
	
		
	}//end main
}
