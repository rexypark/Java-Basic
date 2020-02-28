package com.mystudy.ex03_scanner_bank;

import java.util.Scanner;

/*
[�ǽ�] ������ ATM
1. �Ա� 2. ��� 3. ����Ȯ�� 0. ����
----------------------------
���¸� �ϳ� ����� �Ա�/���/����Ȯ�� �۾��� ó��

*/

/* *********************
>> �������
------------------------
1.�Ա�  2.���  3.����Ȯ��  0.����
------------------------
>>�۾����� : 1
>>�Աݾ� : 10000
::����ݾ� : 10000��

------------------------
1.�Ա�  2.���  3.����Ȯ��  0.����
------------------------
>>�۾����� : 2
>>��ݾ� : 5000
::����ݾ� : 5000��

------------------------
1.�Ա�  2.���  3.����Ȯ��  0.����
------------------------
>>�۾����� : 3
::����ݾ� : 5000��

------------------------
1.�Ա�  2.���  3.����Ȯ��  0.����
------------------------
>>�۾����� : 0
>>�۾��� �����߽��ϴ�.
******************************/

public class BankATM {
	private int money, empMoney;
	private int choice = -1;
	private Scanner scan = new Scanner(System.in);

	public void startBank() {

		System.out.println(">> �������");

		while (true) {
			System.out.println("------------------------");
			System.out.println("1.�Ա�    2.���    3.����Ȯ��   0.����");
			System.out.println("------------------------");
			System.out.print("�۾����� : ");

			choiceMenu();
			if (!bankATM()) {
				System.out.println("�����մϴ�.");
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
					System.out.println("�߸��� ���� �ԷµǾ����ϴ�. \n�ٽ� �Է����ּ���");
					choice = Integer.parseInt(scan.nextLine());
				} else {
					choiceMenu();
					}
				break;
			} catch (NumberFormatException e) {
				System.out.println("�߸� ����");
			}
		}
	}

	private void outPutMoney() {
		while (true) {
			System.out.print(">>��ݾ� : ");
			try {
				empMoney = Integer.parseInt(scan.nextLine());
				if (empMoney > money) {
					System.out.println("�ܾ׺������� ��� �Ұ�");
					amountMoney();
				} else {
					money -= empMoney;
					amountMoney();
				}

				break;
			} catch (NumberFormatException e) {
				System.out.println("���ܹ߻�");
			}

		}
	}

	private void inputMoney() {
		while (true) {
			System.out.println(">>�Աݾ� : ");
			try {
				empMoney = Integer.parseInt(scan.nextLine());
				money += empMoney;
				amountMoney();
				break;
			} catch (NumberFormatException e) {
				System.out.println("���ܹ߻�");
			}

		}
	}

	private void amountMoney() {
		System.out.println(": : ����ݾ� : " + money + "��");
	}
}
