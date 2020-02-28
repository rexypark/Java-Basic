package com.mystudy.ex01_sacnner;

import java.util.Scanner;

public class ScannerExam_guess_number {

	// 컴퓨터가 1 ~ 100사이의 숫자를 정하면
	// 선택기회 5회
	// 컴퓨터숫자 : 70 math.random()
	// 사람이 선택한 숫자(80) 작다 메세지 출력

	public static void main(String[] args) {

		GuessNumGame game = new GuessNumGame();

		while (true) {
			game.gameStrat();
			if (!game.tryAgain()) {
				System.out.println("게임이 종료되었습니다.");
				System.out.println("이용해 주셔서 감사합니다 :)");
				break;
			}

		}
	}
}

// if (user == empInt || user < empInt || user > empInt) {
//
// System.out.println("잘못된 번호를 입력하였습니다. 패널티 cnt + 1");
// continue;
// }
//
//
// if (user == empInt || user < empInt || user > empInt) {
//
// System.out.println("잘못된 번호를 입력하였습니다. 패널티 cnt + 1");
// continue;
// }
//
// empInt = user;