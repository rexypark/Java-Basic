package com.mystudy.ex02_vo;

import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		/* 3���� ����ó��
		   - ȫ�浿 : 100, 90, 80
		   - �̼��� : 95, 88, 92
		   - ������ : 96, 86, 77
		   ===================
		      ������(�Ǹ�ŭ ����ó��) disp1Data
		      ȫ�浿	100	90	81	271	90.33
		      �̼���	 95	88	92	275	91.66
		      ������	 90	87	77	254	84.66
		      
		 */
		String result = "";
		
		Scanner scan = new Scanner(System.in);
		
		// Ŭ���� ���� ����
		// Ŭ������[] ������ = new Ŭ������[�迭��ũ��];
		// �迭�� ũ�⸸ŭ�� ��ü�� �����ȴ�.
		StudentV0[] students = new StudentV0[3];
		
		for (int i = 0; i < students.length; i++) {
			
			String name;
			int kor,math,eng;

			System.out.println("�̸��� �Է��ϼ���.");
			System.out.print(">>");
			name = scan.nextLine();
			System.out.println("���������� �Է��ϼ���.");
			System.out.print(">>");
			kor = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.");
			System.out.print(">>");
			eng = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.");
			System.out.print(">>");
			math = scan.nextInt();
			scan.nextLine();
			students[i] = new StudentV0(name,kor,eng,math);
			result = result + students[i].printData() + "\n" + "\n";
			
		}
		System.out.println("==============================================");
		System.out.println();
		System.out.println("�̸�" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "���");
		System.out.println();
		System.out.println(result);
		scan.close();
//		StudentV0 students1 = new StudentV0("ȫ�浿", 100, 90, 81);
//		students1.printData();
//		
		
	}
}
