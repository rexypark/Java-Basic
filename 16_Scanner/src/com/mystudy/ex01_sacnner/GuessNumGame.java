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
			System.out.println(cnt + "번째 기회! 숫자를 입력하세요");
			System.out.println("숫자를 입력하세요");
			System.out.print(">>");
			user = scan.nextInt();

			if (cnt == 5) {
				System.out.println("5번의 기회를 모두 사용하셨습니다.");
				System.out.println("정답 : " + comNo);
				System.out.println("숫자 맞추기 실패!!");
			}
			if (user == comNo) {
				System.out.println("성공!! " + cnt + "번만에 맞췄습니다.");
				break;
			}

			if (cnt == 0) {
				if (user > comNo) {
					System.out.println(user + "보다 작습니다.");
					cnt++;
					if (user < max) {
						max = user;
					}
					continue;
				} else {
					System.out.println(user + "보다 큽니다.");
					cnt++;
					if (user > min) {
						min = user;
					}
					continue;
				}
			}

			if (user >= max) {
				System.out.println("잘못된 범위의 값이 입력되었습니다.");
				System.out.println(min + "보다 크고" + max + "보다 작습니다.");
				continue;
			} else if (user <= min) {
				System.out.println("잘못된 범위의 값이 입력되었습니다.");
				System.out.println(min + "보다 크고" + max + "보다 작습니다.");
				continue;
			}

			if (user > comNo) {
				System.out.println(user + "보다 작습니다.");
				cnt++;
				if (user < max) {
					max = user;
				}
			} else {
				System.out.println(user + "보다 큽니다.");
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
		
		System.out.println(">> 다시 도전?  1. REGAME    2. END");
		choice = scan.nextInt();
		if (choice == 2) {res =  false;}
		System.out.println("================================");;
		return res;
	}
}
