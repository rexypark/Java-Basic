package com.mystudy.ex01_bean;

public class StudentMain {

	public static void main(String[] args) {
		
		Student std = new Student();
		
		//set���� �� ����
		std.setName("rexypark");
		
		
		//class��.getName()���� set�� ������ �� ȣ��
		System.out.println(std.getName());
		
		// �ٸ� �޼ҵ�����ε� get/set�� ����������
		// ��������� get/set���� ��Ÿ���� ǥ���Ѵ�.
		// get/set�ڿ� �̸��� �ʵ���� �ձ��ڸ� �빮�ڷ� �Ͽ� ������ش�.
		std.num("nu23");
		System.out.println(std.num2());
		System.out.println();
		
		//--------------------------------
		// ���ο��� �غ����� �����ϴ°� ���� Ŭ�����ȿ��� ó���� ���� ���°�
		// ȿ�����̱� ������ Ŭ�������� ��ó���� ���� ���� ���������� �Ѵ�.
		// ���� �߸��� �� �ĺ��� �����ϴ�
		//std.kor = 100;
		//System.out.println(std.kor);
		//stu.setKor(100)
		//System.out.println(std.getKor());
		
		
		
		std.setKor(85);
		System.out.println("���� ������ " + std.getKor() + "�� �Դϴ�.");
		
		
		std.setEng(95);
		System.out.println("���� ������ " + std.getEng() + "�� �Դϴ�.");
		
		
		std.setMath(100);
		System.out.println("���� ������ " + std.getMath() + "�� �Դϴ�.");
		
		//���� setTot
		std.computeAvg();
		int tot = std.getTot();
		System.out.println("�� ������ " + tot + "�� �Դϴ�");
		
		
		//��� setAvg
		std.setAvg(tot/3);
		double avg = std.getAvg();
		
		
		System.out.println("��� ������ " + String.format("%.2f", avg) + "�� �Դϴ�");
		System.out.println(avg);
		
		
		//====================================
		Student std2 = new Student("������", 10, 20,30);
		
		System.out.println("���� ������ " + std2.getKor() + "�� �Դϴ�.");
		
		System.out.println("���� ������ " + std2.getEng() + "�� �Դϴ�.");
		
		System.out.println("���� ������ " + std2.getMath() + "�� �Դϴ�.");
		
		System.out.println("�� ������ " + std2.getTot() + "�� �Դϴ�");

		System.out.println("��� ������ " + String.format("%.2f", std2.getAvg()) + "�� �Դϴ�");
		System.out.println();
		System.out.println(std2.toString());
		
	}
}
