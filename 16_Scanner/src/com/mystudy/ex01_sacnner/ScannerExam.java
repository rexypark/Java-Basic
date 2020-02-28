package com.mystudy.ex01_sacnner;

import java.util.Scanner;

public class ScannerExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		
//		System.out.println("입력하세요");
//		String str1 = scan.nextLine();
//		System.out.println(">>> " + str1);
//		
//		
//		System.out.println();
//		System.out.print("문자열입력2 : ");
//		str1 = scan.nextLine();
//		System.out.println(">>> " + 
//		str1);
//		
//		System.out.println("=====================");
//		System.out.println("정수값 2개를 입력하면 더한 결과 출력");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		System.out.println("합계 : " + (num1 + num2));
//		
//		
//		
		
		System.out.println("=====================");
		System.out.println("숫자 입력 : ");
		int num = scan.nextInt();
		scan.nextLine();
		System.out.println("문자 입력");
		String txt = scan.nextLine();
		
		System.out.println();
		System.out.println("num : " + num);
		System.out.println("txt : " + txt);
		
		
		int num4 = Integer.parseInt(scan.nextLine());
		System.out.println(num4);
		
		scan.close();
	}
}
