package com.mystudy.ex01_ran_cal;

import java.util.Calendar;
import java.util.Random;

public class RandomExam3 {
	public static void main(String[] args) {
		// �ǽ� > ���� ����� ��� ���� �˾ƺ���(0~100)
		// Math.random(), Random ����ؼ� ������� �� �����
		// ������
		// 2019�� 10�� 23�� ����� �������(0~100)�� 77�Դϴ�.
		
		
		Random rand = new Random();
		int luckNum_Random = rand.nextInt(101);
		int luckNum_Math = (int)(Math.random()*101);
				
		//��, ��, �� ���ϱ�
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);

		
		
		System.out.println("Random ���");
		System.out.println("-------------------------------");
		System.out.println(year + "�� " + month + " ��" + date + "��");
		System.out.println("����� �������(0 ~ 100)�� " + luckNum_Random + "�Դϴ�.");
		
		System.out.println();
		System.out.println();
		
		System.out.println("Math.random ���");
		System.out.println("-------------------------------");
		System.out.println(year + "�� " + month + "�� " + date + "��");
		System.out.println("����� �������(0 ~ 100)�� " + luckNum_Math + "�Դϴ�.");
		
		
	}
}
