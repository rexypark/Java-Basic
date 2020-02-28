package com.mystudy.ex02_vo;

import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		/* 3명의 성적처리
		   - 홍길동 : 100, 90, 80
		   - 이순신 : 95, 88, 92
		   - 김유신 : 96, 86, 77
		   ===================
		      결과출력(탭만큼 간격처리) disp1Data
		      홍길동	100	90	81	271	90.33
		      이순신	 95	88	92	275	91.66
		      광개토	 90	87	77	254	84.66
		      
		 */
		String result = "";
		
		Scanner scan = new Scanner(System.in);
		
		// 클래스 변수 정의
		// 클래스명[] 변수명 = new 클래스명[배열의크기];
		// 배열의 크기만큼의 객체가 생성된다.
		StudentV0[] students = new StudentV0[3];
		
		for (int i = 0; i < students.length; i++) {
			
			String name;
			int kor,math,eng;

			System.out.println("이름을 입력하세요.");
			System.out.print(">>");
			name = scan.nextLine();
			System.out.println("국어점수를 입력하세요.");
			System.out.print(">>");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			System.out.print(">>");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			System.out.print(">>");
			math = scan.nextInt();
			scan.nextLine();
			students[i] = new StudentV0(name,kor,eng,math);
			result = result + students[i].printData() + "\n" + "\n";
			
		}
		System.out.println("==============================================");
		System.out.println();
		System.out.println("이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
		System.out.println();
		System.out.println(result);
		scan.close();
//		StudentV0 students1 = new StudentV0("홍길동", 100, 90, 81);
//		students1.printData();
//		
		
	}
}
