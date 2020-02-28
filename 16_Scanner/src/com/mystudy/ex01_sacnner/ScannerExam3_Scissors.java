package com.mystudy.ex01_sacnner;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerExam3_Scissors {
	/*
	 * 
	 * Scanneer를 이용한 가위, 바위, 보 게임 컴퓨터와 함께 하는 가위, 바위, 보 게임 0. 컴퓨터가 가위, 바위 , 보를
	 * 선택(Math.random()) 1. 가위, 바위, 보 선택 메뉴 출력 2. 사람이 선택 값 입력 3. 결과 확인 후 승자, 패자 출력
	 * (반복) 게임 반복 진행 - 0 선택시 종료
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int choice, user, computer;
		int cnt = 0;
		String name;
		// 0 - 가위
		// 1 - 바위
		// 2 - 보
		Scanner scan = new Scanner(System.in);
		// ArrayList에 가위 바위 보 문자열 넣기
		ArrayList<String> sBox = new ArrayList();
		sBox.add("가위");
		sBox.add("바위");
		sBox.add("보");

		while (true) {
			System.out.println("===================================");
			System.out.println("가위바위보 게임을 하시겠습니까?" + "\n" + "1.게임 시작     2. 게임종료");
			System.out.print(">>");
			choice = scan.nextInt();
			scan.nextLine();

			if (choice == 1) {

				computer = (int) (Math.random() * 3) + 1;
				System.out.println();
				System.out.println("이름을 쓰세요");
				System.out.print(">>");
				name = scan.nextLine();

				System.out.println();
				System.out.println("선택하세요 가위 바위 보!!!");
				System.out.println("1. 가위    2. 바위    3. 보");
				System.out.print(">>");
				user = scan.nextInt();

				if (user == computer) {
					//
					System.out.println();
					System.out.println("비겼습니다 !");
					System.out.println("===================================");
					System.out.println(name + " : " + sBox.get(user - 1));
					System.out.println("computer : " + sBox.get(computer - 1));

				} else if (user == 1 && computer == 2 || user == 2 && computer == 3 || user == 3 && computer == 2) {
					System.out.println();
					System.out.println("컴퓨터가 이겼습니다!ㅠㅠ");
					System.out.println("===================================");
					System.out.println(name + " : " + sBox.get(user - 1));
					System.out.println("computer : " + sBox.get(computer - 1));

				} else {
					System.out.println();
					System.out.println(name + "님이 이겼습니다.");
					System.out.println("===================================");
					System.out.println(name + " : " + sBox.get(user - 1));
					System.out.println("computer : " + sBox.get(computer - 1));

				}
			} else {
				System.out.println("게임이 종료되었습니다.");
				break;
			}

		}

	}
}
