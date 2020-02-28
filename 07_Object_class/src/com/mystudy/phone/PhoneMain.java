package com.mystudy.phone;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	
Phone myPhone = new Phone("iPhone", "01057171668");
	
	System.out.println(myPhone.name);
	Phone myPhone2 = new Phone("iPhone", "01057171668",true);
	System.out.println(myPhone2.name);
	
	
	
	System.out.println("=======================");
	System.out.println("1. ��ȭ�ɱ�    2. ��ȭ�ޱ�    3. ���ں�����");
    System.out.println("4. ��������   5. ��������   0. ����");
    System.out.print(" >> ");
    
	int num = scan.nextInt();
	while (true) {
		if (num == 1) {
			// ��ȭ�ɱ� ��ư
			System.out.println();
			myPhone.call();
			System.out.println();
			
			System.out.println("=======================");
			System.out.println("1. ��ȭ�ɱ�    2. ��ȭ�ޱ�    3. ���ں�����");
		    System.out.println("4. ��������   5. ��������   0. ����");
			System.out.print(" >> ");
		    num = scan.nextInt();
			
			
			
		} else if (num == 2) { 
			// ��ȭ�ޱ� ��ư
			System.out.println();
			myPhone.receiveCall();
			System.out.println();
			
			System.out.println("=======================");
			System.out.println("1. ��ȭ�ɱ�    2. ��ȭ�ޱ�    3. ���ں�����");
		    System.out.println("4. ��������   5. ��������   0. ����");
		    System.out.print(" >> ");
		    num = scan.nextInt();
		    
		    
		} else if (num == 3) {
			// �������� ���� �� ���
			
			System.out.println();
			System.out.println("���� ���ڸ� �Է��ϼ���.");
			System.out.print(">>");
			scan.nextLine();
			String txt = scan.nextLine();
			myPhone.sendSms(txt);
			System.out.println();
			
			
			System.out.println("=======================");
			System.out.println("1. ��ȭ�ɱ�    2. ��ȭ�ޱ�    3. ���ں�����");
		    System.out.println("4. ��������   5. ��������   0. ����");
		    System.out.print(" >> ");
		    num = scan.nextInt();
		    
		
		} else if (num == 4) {
			
			// �������� ���� �� ���
			System.out.println();
			System.out.println("�������ں���");
			System.out.print(">>");
			scan.nextLine();
			String txtRec = scan.nextLine();
			myPhone.receiveSms(txtRec);
			System.out.println();
			
			
			System.out.println("=======================");
			System.out.println("1. ��ȭ�ɱ�    2. ��ȭ�ޱ�    3. ���ں�����");
		    System.out.println("4. ��������   5. ��������   0. ����");
		    System.out.print(" >> ");
		    
		    num = scan.nextInt();
			
		} else if (num == 5) {
			
			System.out.println();
			// ���� ���
			myPhone.viewInfo();
			
			System.out.println();
			System.out.println("=======================");
			System.out.println("1. ��ȭ�ɱ�    2. ��ȭ�ޱ�    3. ���ں�����");
		    System.out.println("4. ��������   5. ��������   0. ����");
		    System.out.print(" >> ");
		    num = scan.nextInt();
			
			
		} else if (num == 0){
			System.out.println("����");
			break;
		}
		
		
	}
	
	
	
//	// ������ �ٸ� �ּҰ� Ȯ��
//	System.out.println(myPhone);
//	System.out.println(myPhone2);
//	System.out.println();
	

	
	
	
	scan.close();
	
	
	}
	
}
