package mini_projecet;

import java.util.Scanner;

public class Bank_1 {
	public static void main (String [] args) {
		/*
		 * 변수 id, pw, age, mon 설정
		 * */
		Scanner scanner = new Scanner(System.in);
		
		int num ; char id = ' ', pass = ' '; int balance=0;

		for(;;) {   
			System.out.println("\n\n==========BANK==========\r\n" + "1.추가\r\n" + "2.조회\r\n"
								+ "3.입금\r\n" + "4.출금\r\n" + "5.삭제\r\n" + "9.종료\r\n" + "입력>>>");                            
			num = scanner.nextInt();
			
			if(num ==9) {System.out.println("종료기능입니다."); break;}
			
			switch(num) {
			case 1 :System.out.println("1.추가기능입니다.");
				// .... step3
				// *id : _입력받기 first
				// *pass: _입력받기 1111
				// *balance : _입력받기 10000
					System.out.println("*ID : "); //입력
					id = scanner.next().charAt(0);
					System.out.println("*PASS : ");
					pass = scanner.next().charAt(0);
					System.out.println("*BALANCE : ");
					balance = scanner.nextInt();
			break;  //end case1
			case 2 :System.out.println("2.조회기능입니다.");
				//.... step4
				//변수 - 임시변수 temp_id, 임시변수 temp_pass
				//입력 - 임시변수 temp_id, temp_pass 입력받기
				//처리 - if(temp_id 와 id가 같고 temp_pass 와 pass가 같다면){ 사용자정보출력 }
				//      else {아니라면 비밀번호 확인해주세요.}
					char temp_id=' ', temp_pass=' ';
					System.out.println("*ID : ");
					id = scanner.next().charAt(0);
					System.out.println("*PASS : ");
					pass = scanner.next().charAt(0);
					if (temp_id == id && temp_pass == pass) {
						System.out.println("ID : " + id + "\nPASS : " + pass + "\nBALANCE : " + balance);}
					else { System.out.println("정보를 확인해주세요."); }
			break;  //end case2
			case 3 :System.out.println("3.입급");
			
			break;  //end case3
			case 4 :System.out.println("4.출금");
			
			break;  //end case4
			case 5 :System.out.println("5.삭제");
			
			break;  //end case5
			case 9 :System.out.println("9.종료");
			
			break;  //end case9
			
			}

		}//end for
	
		
	}//end main
}
