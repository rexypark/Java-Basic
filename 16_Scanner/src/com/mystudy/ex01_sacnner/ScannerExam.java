package com.mystudy.ex01_sacnner;

import java.util.Scanner;

public class ScannerExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		
//		System.out.println("�Է��ϼ���");
//		String str1 = scan.nextLine();
//		System.out.println(">>> " + str1);
//		
//		
//		System.out.println();
//		System.out.print("���ڿ��Է�2 : ");
//		str1 = scan.nextLine();
//		System.out.println(">>> " + 
//		str1);
//		
//		System.out.println("=====================");
//		System.out.println("������ 2���� �Է��ϸ� ���� ��� ���");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		System.out.println("�հ� : " + (num1 + num2));
//		
//		
//		
		
		System.out.println("=====================");
		System.out.println("���� �Է� : ");
		int num = scan.nextInt();
		scan.nextLine();
		System.out.println("���� �Է�");
		String txt = scan.nextLine();
		
		System.out.println();
		System.out.println("num : " + num);
		System.out.println("txt : " + txt);
		
		
		int num4 = Integer.parseInt(scan.nextLine());
		System.out.println(num4);
		
		scan.close();
	}
}
