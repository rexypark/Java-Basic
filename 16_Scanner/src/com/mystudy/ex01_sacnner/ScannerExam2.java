package com.mystudy.ex01_sacnner;

import java.util.Scanner;

public class ScannerExam2 {

	// ����, ����, ����, ���� ������ ȭ�鿡�� �Է¹޾�
	// ����, ����� ���ϰ�  ����� ȭ�鿡 ���
	/*
	 ���� : ȫ�浿
	 ���� : 100��
	 ���� : 90��
	 ���� : 81��
	 ----------
	 ���� : 271
	 ��� : 90.33
	 �� ��� : A
	 */
	private static String name, grade;
	private static int choice, kor, eng, math, sum;
	private static double avg;
	
	
	
	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("=== ���� ���� ���α׷� ===");
			System.out.println("1.�����Է�      2.��������Ʈ    3.����");
			System.out.print(">>");
			choice = scan.nextInt();
			scan.nextLine();
			
			if(choice == 1) {
			System.out.println("�̸��� �Է��ϼ���");
			System.out.print(">>");
			name = scan.nextLine();
			
			System.out.println("���������� �Է��ϼ���");
			System.out.print(">>");
			kor = scan.nextInt();
			
			System.out.println("���������� �Է��ϼ���");
			System.out.print(">>");
			eng = scan.nextInt();
			
			System.out.println("���������� �Է��ϼ���");
			System.out.print(">>");
			math = scan.nextInt();
			
			scan.nextLine();
			
			sumAvg();
			
		
		
		
			} else if (choice == 2) {
				printData();
			}else {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			
		}scan.close();
	}
	static void sumAvg() {
		sum = kor + eng + math;
		avg = sum*100 / 3 / 100.0;
	}
	
	static void printData(){
		System.out.println("�̸� : " + name + "\n" + 
				"���� : " + kor + "\n" + 
				"���� : " + eng + "\n" + 
				"���� : " + math + "\n" + 
				"-----------" + "\n" +
				"���� : " + sum + "\n" + 
				"��� : " + avg + "\n" +
				"�򰡰�� : " + grade(avg));

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
