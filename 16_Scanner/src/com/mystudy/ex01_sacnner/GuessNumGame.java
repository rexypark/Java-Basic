package com.mystudy.ex01_sacnner;

import java.util.Scanner;

public class GuessNumGame {
	Scanner scan = new Scanner(System.in);

	public void gameStrat() {

		int comNo, user;
		int cnt = 1;
		int max = 101;
		int min = 0;

		comNo = (int) (Math.random() * 100 + 1);

		while (cnt !=6) {
			System.out.println("===================");
			System.out.println(cnt + "��° ��ȸ! ���ڸ� �Է��ϼ���");
			System.out.println("���ڸ� �Է��ϼ���");
			System.out.print(">>");
			user = scan.nextInt();

			if (cnt == 5) {
				System.out.println("5���� ��ȸ�� ��� ����ϼ̽��ϴ�.");
				System.out.println("���� : " + comNo);
				System.out.println("���� ���߱� ����!!");
			}
			if (user == comNo) {
				System.out.println("����!! " + cnt + "������ ������ϴ�.");
				break;
			}

			if (cnt == 0) {
				if (user > comNo) {
					System.out.println(user + "���� �۽��ϴ�.");
					cnt++;
					if (user < max) {
						max = user;
					}
					continue;
				} else {
					System.out.println(user + "���� Ů�ϴ�.");
					cnt++;
					if (user > min) {
						min = user;
					}
					continue;
				}
			}

			if (user >= max) {
				System.out.println("�߸��� ������ ���� �ԷµǾ����ϴ�.");
				System.out.println(min + "���� ũ��" + max + "���� �۽��ϴ�.");
				continue;
			} else if (user <= min) {
				System.out.println("�߸��� ������ ���� �ԷµǾ����ϴ�.");
				System.out.println(min + "���� ũ��" + max + "���� �۽��ϴ�.");
				continue;
			}

			if (user > comNo) {
				System.out.println(user + "���� �۽��ϴ�.");
				cnt++;
				if (user < max) {
					max = user;
				}
			} else {
				System.out.println(user + "���� Ů�ϴ�.");
				cnt++;
				if (user > min) {
					min = user;
				}
			}

		}
		
	}
	
	public boolean tryAgain() {
		int choice = 0;
		boolean res = true;
		
		System.out.println(">> �ٽ� ����?  1. REGAME    2. END");
		choice = scan.nextInt();
		if (choice == 2) {res =  false;}
		System.out.println("================================");;
		return res;
	}
}
