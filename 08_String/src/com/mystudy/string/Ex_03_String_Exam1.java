package com.mystudy.string;

import java.util.Scanner;

public class Ex_03_String_Exam1 {

	public static void main(String[] args) {
		
		/*  
		 String 클래스의 메소드를 사용
		 String str = "900108-11111112";
		 1. 정확히 입력된 데이터인지 확인
		  > 전체 자리수가 14자리인지
		  > -위치:7째인지 확인
		 2. 생년월일 출력(1~2번째 : 년도,3-4번재 : 월, 5-6번째 : 일
		  > 900108 - > 90년 01월 08일 도는 98년 1월 8일
		 3. 성별확인(8째 숫자가 1과 3이면 남자 2이와 4이면 여자)
		 4. 데이터 값 검증(월 : 1-12, 일 : 1-31)
		  > Integer.parseIn
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("주민등록번호를 90xxxx-1xxxxxxx형식으로 입력하세요");
		System.out.println(">>");
		String str = scan.nextLine();
		//자리수가 14자리인지
		
		
		String sex = null;
		int len = str.length();
		//-위치가 7째자리인지
		String barLoc = str.substring(6,7);
		
		//생년월일 출력
		String year = str.substring(0,2);
		String month = str.substring(2,4);
		String day = str.substring(4,6);
		
		// 성별확인 1,3 남성 / 2,4 여성
		String sexNo = str.substring(7,8);
		
		// 월, 일 유효성검사

		
				
		while (true) {
			
			if (len != 14) {
				
				System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요.");
				System.out.println(">>");
				str = scan.nextLine();
				
			} else if (!barLoc.equals("-")) {
				
				System.out.println("주민등록 형식이 맞지 않습니다. 93xxxx-1xxxxxx형식으로 입력하세요.");
				System.out.println(">>");
				str = scan.nextLine();
				
			} else if (!(Integer.parseInt(month)<13 && Integer.parseInt(month)>0 && Integer.parseInt(day)>0 && Integer.parseInt(day)<32)) {
				
				System.out.println("날짜 형식이 맞지 않습니다. 다시입력하세요.");
				System.out.println(">>");
	
				str = scan.nextLine();
				// 사용하던 변수를 다시 업데이트 시켜줘야한다.
				month = str.substring(2,4);
				day = str.substring(4,6);
				
			} else {
				break;
			}
		}
		
		
		
		if (month.substring(0,1).equals("0")) month = month.substring(1,2);
		if (day.substring(0,1).equals("0")) day = day.substring(1,2);
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		if (Integer.parseInt(sexNo) == 1 || Integer.parseInt(sexNo) == 3) sex = "남";
		if (Integer.parseInt(sexNo) == 2 || Integer.parseInt(sexNo) == 4) sex = "여";
		System.out.println("귀하의 성별은 " + sex + "입니다");
		
		scan.close();
		
	}
}
