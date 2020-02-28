package com.mystudy.sqld_cbt;

import java.util.Scanner;

public class CBT_Main {
	
	public static void main(String[] args) {
		String user_id = "";
		String user_name = "";
		String user_pw = "";
		String user_phone = "";  
		String user_email = "";
		
		
		Scanner scan = new Scanner(System.in);
		UserDAO userDao = new UserDAO();
		
		
		while (true) {
			
			int choice = 0;
			
			System.out.println("SQLD CBT ���α׷�");
			System.out.println("SQLD_CBTȸ���̽ʴϱ�?");
			System.out.println("1. �α���   2. ȸ������");
			choice = scan.nextInt();
			if(choice == 1) {
				//���� ����
				scan.nextLine();
				while (true) {
					System.out.println("�α���");
					System.out.print("ID �Է� >>");
					user_id = scan.nextLine();
					System.out.print("PW �Է� >>");
					user_pw = scan.nextLine();
					
					if(userDao.checkIdPassword(user_id, user_pw)) {
						System.out.println("log In �Ϸ�!");
						UserVO logUser = userDao.userInfo;
						
						//���̵�, �̸�, �α��� ����  USER_LOG���̺� insert
						UserLogDAO.userLog(logUser.getUser_id(), logUser.getUser_name(), "�α���");
						break;
					} else {
						System.out.println("log In ����!");
						System.out.println("�ٽ� �Է��ϼ���.");
					}
				}
			} else if(choice == 2) {
				while (true) {
					System.out.println("ȸ������");
					while (true) {
						//���ۿ���
						scan.nextLine();
						
						System.out.print("����� ID �Է� >>");
						user_id = scan.nextLine();
						//UserDAO�� �ִ� checkId�޼��带 ���� ID �ߺ� �˻�
						if(userDao.checkId(user_id)) {
							System.out.println("�ٽ� �Է��� �ּ���");
						}else {
							break;
						}
					}
					System.out.print("����� �̸� �Է� >>");
					user_name = scan.nextLine();
					System.out.print("����� ��й�ȣ �Է� >>");
					user_id = scan.nextLine();
					System.out.print("����� ��ȭ �Է� >>");
					user_phone = scan.nextLine();
					System.out.print("����� �̸��� �Է� >>");
					user_email = scan.nextLine();
					
					boolean inUserData = userDao.signUp(user_id, user_name, user_pw, user_phone, user_email);
					
					//scan�� insert
					if(inUserData = true) {
						System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
						//���̵�, �̸�, �α��� ����  USER_LOG���̺� insert
						UserLogDAO.userLog(userDao.userInfo.getUser_id(), userDao.userInfo.getUser_name(), "�α���");
						break;
					} else {
						System.out.println("ȸ������ ���������� ���� �ʾҽ��ϴ�.");
						System.out.println("�ٽ� �Է����ּ���");
					}
				
				} 
			}//choice == 2
			break;
		 }//��ü while��
		
		}//main
		
	
	
	
	
		
//		public static void logIn() {
//			
//			while (true) {
//				System.out.println("�α���");
//				System.out.print("ID �Է� >>");
//				user_id = scan.nextLine();
//				System.out.print("PW �Է� >>");
//				user_pw = scan.nextLine();
//				
//				if(userDao.checkIdPassword(user_id, user_pw)) {
//					System.out.println("log In �Ϸ�!");
//					break;
//				} else {
//					System.out.println("log In ����!");
//					System.out.println("�ٽ� �Է��ϼ���.");
//				}
//		}
//		
//		
//	}
	
}
