package com.mystudy.string;

import java.util.Scanner;

public class Ex_03_String_Exam1 {

	public static void main(String[] args) {
		
		/*  
		 String Ŭ������ �޼ҵ带 ���
		 String str = "900108-11111112";
		 1. ��Ȯ�� �Էµ� ���������� Ȯ��
		  > ��ü �ڸ����� 14�ڸ�����
		  > -��ġ:7°���� Ȯ��
		 2. ������� ���(1~2��° : �⵵,3-4���� : ��, 5-6��° : ��
		  > 900108 - > 90�� 01�� 08�� ���� 98�� 1�� 8��
		 3. ����Ȯ��(8° ���ڰ� 1�� 3�̸� ���� 2�̿� 4�̸� ����)
		 4. ������ �� ����(�� : 1-12, �� : 1-31)
		  > Integer.parseIn
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("�ֹε�Ϲ�ȣ�� 90xxxx-1xxxxxxx�������� �Է��ϼ���");
		System.out.println(">>");
		String str = scan.nextLine();
		//�ڸ����� 14�ڸ�����
		
		
		String sex = null;
		int len = str.length();
		//-��ġ�� 7°�ڸ�����
		String barLoc = str.substring(6,7);
		
		//������� ���
		String year = str.substring(0,2);
		String month = str.substring(2,4);
		String day = str.substring(4,6);
		
		// ����Ȯ�� 1,3 ���� / 2,4 ����
		String sexNo = str.substring(7,8);
		
		// ��, �� ��ȿ���˻�

		
				
		while (true) {
			
			if (len != 14) {
				
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				System.out.println(">>");
				str = scan.nextLine();
				
			} else if (!barLoc.equals("-")) {
				
				System.out.println("�ֹε�� ������ ���� �ʽ��ϴ�. 93xxxx-1xxxxxx�������� �Է��ϼ���.");
				System.out.println(">>");
				str = scan.nextLine();
				
			} else if (!(Integer.parseInt(month)<13 && Integer.parseInt(month)>0 && Integer.parseInt(day)>0 && Integer.parseInt(day)<32)) {
				
				System.out.println("��¥ ������ ���� �ʽ��ϴ�. �ٽ��Է��ϼ���.");
				System.out.println(">>");
	
				str = scan.nextLine();
				// ����ϴ� ������ �ٽ� ������Ʈ ��������Ѵ�.
				month = str.substring(2,4);
				day = str.substring(4,6);
				
			} else {
				break;
			}
		}
		
		
		
		if (month.substring(0,1).equals("0")) month = month.substring(1,2);
		if (day.substring(0,1).equals("0")) day = day.substring(1,2);
		System.out.println(year + "�� " + month + "�� " + day + "��");
		
		if (Integer.parseInt(sexNo) == 1 || Integer.parseInt(sexNo) == 3) sex = "��";
		if (Integer.parseInt(sexNo) == 2 || Integer.parseInt(sexNo) == 4) sex = "��";
		System.out.println("������ ������ " + sex + "�Դϴ�");
		
		scan.close();
		
	}
}
