package com.mystudy.ex01_sacnner;

import java.util.Scanner;

public class ScannerExam2 {

	// 성명, 국어, 영어, 수학 점수를 화면에서 입력받아
	// 총점, 평균을 구하고  결과를 화면에 출력
	/*
	 성명 : 홍길동
	 국어 : 100점
	 영어 : 90점
	 수학 : 81점
	 ----------
	 총점 : 271
	 평균 : 90.33
	 평가 결과 : A
	 */
	private static String name, grade;
	private static int choice, kor, eng, math, sum;
	private static double avg;
	
	
	
	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("=== 성적 관리 프로그램 ===");
			System.out.println("1.성적입력      2.성적프린트    3.종료");
			System.out.print(">>");
			choice = scan.nextInt();
			scan.nextLine();
			
			if(choice == 1) {
			System.out.println("이름을 입력하세요");
			System.out.print(">>");
			name = scan.nextLine();
			
			System.out.println("국어점수를 입력하세요");
			System.out.print(">>");
			kor = scan.nextInt();
			
			System.out.println("영어점수를 입력하세요");
			System.out.print(">>");
			eng = scan.nextInt();
			
			System.out.println("수학점수를 입력하세요");
			System.out.print(">>");
			math = scan.nextInt();
			
			scan.nextLine();
			
			sumAvg();
			
		
		
		
			} else if (choice == 2) {
				printData();
			}else {
				System.out.println("종료되었습니다.");
				break;
			}
			
		}scan.close();
	}
	static void sumAvg() {
		sum = kor + eng + math;
		avg = sum*100 / 3 / 100.0;
	}
	
	static void printData(){
		System.out.println("이름 : " + name + "\n" + 
				"국어 : " + kor + "\n" + 
				"영어 : " + eng + "\n" + 
				"수학 : " + math + "\n" + 
				"-----------" + "\n" +
				"총점 : " + sum + "\n" + 
				"평균 : " + avg + "\n" +
				"평가결과 : " + grade(avg));

	}
	
	
	static String grade(double avg) {
		if (avg >= 90) {grade = "A";}
		else if (avg >= 80) {grade = "B";}
		else if (avg >= 70) {grade = "C";}
		else if (avg >= 60) {grade = "D";}
		else if (avg >= 50) {grade = "F";}
		
		return grade;
	}
}
