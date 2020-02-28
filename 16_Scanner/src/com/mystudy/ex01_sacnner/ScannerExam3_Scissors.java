package com.mystudy.ex01_sacnner;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerExam3_Scissors {
	/*
	 * 
	 * Scanneer�� �̿��� ����, ����, �� ���� ��ǻ�Ϳ� �Բ� �ϴ� ����, ����, �� ���� 0. ��ǻ�Ͱ� ����, ���� , ����
	 * ����(Math.random()) 1. ����, ����, �� ���� �޴� ��� 2. ����� ���� �� �Է� 3. ��� Ȯ�� �� ����, ���� ���
	 * (�ݺ�) ���� �ݺ� ���� - 0 ���ý� ����
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int choice, user, computer;
		int cnt = 0;
		String name;
		// 0 - ����
		// 1 - ����
		// 2 - ��
		Scanner scan = new Scanner(System.in);
		// ArrayList�� ���� ���� �� ���ڿ� �ֱ�
		ArrayList<String> sBox = new ArrayList();
		sBox.add("����");
		sBox.add("����");
		sBox.add("��");

		while (true) {
			System.out.println("===================================");
			System.out.println("���������� ������ �Ͻðڽ��ϱ�?" + "\n" + "1.���� ����     2. ��������");
			System.out.print(">>");
			choice = scan.nextInt();
			scan.nextLine();

			if (choice == 1) {

				computer = (int) (Math.random() * 3) + 1;
				System.out.println();
				System.out.println("�̸��� ������");
				System.out.print(">>");
				name = scan.nextLine();

				System.out.println();
				System.out.println("�����ϼ��� ���� ���� ��!!!");
				System.out.println("1. ����    2. ����    3. ��");
				System.out.print(">>");
				user = scan.nextInt();

				if (user == computer) {
					//
					System.out.println();
					System.out.println("�����ϴ� !");
					System.out.println("===================================");
					System.out.println(name + " : " + sBox.get(user - 1));
					System.out.println("computer : " + sBox.get(computer - 1));

				} else if (user == 1 && computer == 2 || user == 2 && computer == 3 || user == 3 && computer == 2) {
					System.out.println();
					System.out.println("��ǻ�Ͱ� �̰���ϴ�!�Ф�");
					System.out.println("===================================");
					System.out.println(name + " : " + sBox.get(user - 1));
					System.out.println("computer : " + sBox.get(computer - 1));

				} else {
					System.out.println();
					System.out.println(name + "���� �̰���ϴ�.");
					System.out.println("===================================");
					System.out.println(name + " : " + sBox.get(user - 1));
					System.out.println("computer : " + sBox.get(computer - 1));

				}
			} else {
				System.out.println("������ ����Ǿ����ϴ�.");
				break;
			}

		}

	}
}
