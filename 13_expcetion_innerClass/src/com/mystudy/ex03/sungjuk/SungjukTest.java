package com.mystudy.ex03.sungjuk;

public class SungjukTest {
	public static void main(String [] args) {
		//StudentVO Ÿ���� ������ 1�� ���� �� ��������, �������� ����
		System.out.println("--- main() ���� ---");
		StudentVO std = new StudentVO("rexypark", 100,90,80);
		System.out.println(std.toString());
		
		try {
		std.setEng(999);
		} catch(SungJukProcessException e) {
			System.out.println("[���ܹ߻�] : " + e.getMessage());
		}
		System.out.println(std.toString());
		
		System.out.println("--- main() ���� ---");
		
		
		
	}
}
