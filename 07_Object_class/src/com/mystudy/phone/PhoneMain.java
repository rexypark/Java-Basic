package com.mystudy.phone;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	
Phone myPhone = new Phone("iPhone", "01057171668");
	
	System.out.println(myPhone.name);
	Phone myPhone2 = new Phone("iPhone", "01057171668",true);
	System.out.println(myPhone2.name);
	
	
	
	System.out.println("=======================");
	System.out.println("1. 전화걸기    2. 전화받기    3. 문자보내기");
    System.out.println("4. 받은문자   5. 정보보기   0. 종료");
    System.out.print(" >> ");
    
	int num = scan.nextInt();
	while (true) {
		if (num == 1) {
			// 전화걸기 버튼
			System.out.println();
			myPhone.call();
			System.out.println();
			
			System.out.println("=======================");
			System.out.println("1. 전화걸기    2. 전화받기    3. 문자보내기");
		    System.out.println("4. 받은문자   5. 정보보기   0. 종료");
			System.out.print(" >> ");
		    num = scan.nextInt();
			
			
			
		} else if (num == 2) { 
			// 전화받기 버튼
			System.out.println();
			myPhone.receiveCall();
			System.out.println();
			
			System.out.println("=======================");
			System.out.println("1. 전화걸기    2. 전화받기    3. 문자보내기");
		    System.out.println("4. 받은문자   5. 정보보기   0. 종료");
		    System.out.print(" >> ");
		    num = scan.nextInt();
		    
		    
		} else if (num == 3) {
			// 보낼문자 적기 및 출력
			
			System.out.println();
			System.out.println("보낼 문자를 입력하세요.");
			System.out.print(">>");
			scan.nextLine();
			String txt = scan.nextLine();
			myPhone.sendSms(txt);
			System.out.println();
			
			
			System.out.println("=======================");
			System.out.println("1. 전화걸기    2. 전화받기    3. 문자보내기");
		    System.out.println("4. 받은문자   5. 정보보기   0. 종료");
		    System.out.print(" >> ");
		    num = scan.nextInt();
		    
		
		} else if (num == 4) {
			
			// 받을문자 적기 및 출력
			System.out.println();
			System.out.println("받은문자보기");
			System.out.print(">>");
			scan.nextLine();
			String txtRec = scan.nextLine();
			myPhone.receiveSms(txtRec);
			System.out.println();
			
			
			System.out.println("=======================");
			System.out.println("1. 전화걸기    2. 전화받기    3. 문자보내기");
		    System.out.println("4. 받은문자   5. 정보보기   0. 종료");
		    System.out.print(" >> ");
		    
		    num = scan.nextInt();
			
		} else if (num == 5) {
			
			System.out.println();
			// 정보 출력
			myPhone.viewInfo();
			
			System.out.println();
			System.out.println("=======================");
			System.out.println("1. 전화걸기    2. 전화받기    3. 문자보내기");
		    System.out.println("4. 받은문자   5. 정보보기   0. 종료");
		    System.out.print(" >> ");
		    num = scan.nextInt();
			
			
		} else if (num == 0){
			System.out.println("종료");
			break;
		}
		
		
	}
	
	
	
//	// 생성자 다른 주소값 확인
//	System.out.println(myPhone);
//	System.out.println(myPhone2);
//	System.out.println();
	

	
	
	
	scan.close();
	
	
	}
	
}
