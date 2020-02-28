package com.mystudy.ex03_scanner_bank;

import java.util.Scanner;

/*
[실습] 은행의 ATM
1. 입금 2. 출금 3. 통장확인 0. 종료
----------------------------
계좌를 하나 만들고 입금/출금/통장확인 작업을 처리

*/

/* *********************
>> 어서오세요
------------------------
1.입금  2.출금  3.통장확인  0.종료
------------------------
>>작업선택 : 1
>>입금액 : 10000
::통장금액 : 10000원

------------------------
1.입금  2.출금  3.통장확인  0.종료
------------------------
>>작업선택 : 2
>>출금액 : 5000
::통장금액 : 5000원

------------------------
1.입금  2.출금  3.통장확인  0.종료
------------------------
>>작업선택 : 3
::통장금액 : 5000원

------------------------
1.입금  2.출금  3.통장확인  0.종료
------------------------
>>작업선택 : 0
>>작업을 종료했습니다.
******************************/

public class BankATM {
	private int money, empMoney;
	private int choice = -1;
	private Scanner scan = new Scanner(System.in);

	public void startBank() {

		System.out.println(">> 어서오세요");

		while (true) {
			System.out.println("------------------------");
			System.out.println("1.입금    2.출금    3.통장확인   0.종료");
			System.out.println("------------------------");
			System.out.print("작업선택 : ");

			choiceMenu();
			if (!bankATM()) {
				System.out.println("종료합니다.");
				break;
			}
			if (choice == 1) {
				inputMoney();
			} else if (choice == 2) {
				outPutMoney();
			} else if (choice == 3) {
				amountMoney();
			}
		}
	}

	private boolean bankATM() {
		boolean res = true;
		if (choice == 0) {
			res = false;
		}
		return res;
	}

	private void choiceMenu() {

		while (true) {
			try {
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice > 3) {
					System.out.println("잘못된 값이 입력되었습니다. \n다시 입력해주세요");
					choice = Integer.parseInt(scan.nextLine());
				} else {
					choiceMenu();
					}
				break;
			} catch (NumberFormatException e) {
				System.out.println("잘못 눌럿");
			}
		}
	}

	private void outPutMoney() {
		while (true) {
			System.out.print(">>출금액 : ");
			try {
				empMoney = Integer.parseInt(scan.nextLine());
				if (empMoney > money) {
					System.out.println("잔액부족으로 출금 불가");
					amountMoney();
				} else {
					money -= empMoney;
					amountMoney();
				}

				break;
			} catch (NumberFormatException e) {
				System.out.println("예외발생");
			}

		}
	}

	private void inputMoney() {
		while (true) {
			System.out.println(">>입금액 : ");
			try {
				empMoney = Integer.parseInt(scan.nextLine());
				money += empMoney;
				amountMoney();
				break;
			} catch (NumberFormatException e) {
				System.out.println("예외발생");
			}

		}
	}

	private void amountMoney() {
		System.out.println(": : 통장금액 : " + money + "원");
	}
}
