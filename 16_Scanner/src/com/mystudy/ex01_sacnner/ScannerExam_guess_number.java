package com.mystudy.ex01_sacnner;

import java.util.Scanner;

public class ScannerExam_guess_number {

	// ��ǻ�Ͱ� 1 ~ 100������ ���ڸ� ���ϸ�
	// ���ñ�ȸ 5ȸ
	// ��ǻ�ͼ��� : 70 math.random()
	// ����� ������ ����(80) �۴� �޼��� ���

	public static void main(String[] args) {

		GuessNumGame game = new GuessNumGame();

		while (true) {
			game.gameStrat();
			if (!game.tryAgain()) {
				System.out.println("������ ����Ǿ����ϴ�.");
				System.out.println("�̿��� �ּż� �����մϴ� :)");
				break;
			}

		}
	}
}

// if (user == empInt || user < empInt || user > empInt) {
//
// System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �г�Ƽ cnt + 1");
// continue;
// }
//
//
// if (user == empInt || user < empInt || user > empInt) {
//
// System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �г�Ƽ cnt + 1");
// continue;
// }
//
// empInt = user;