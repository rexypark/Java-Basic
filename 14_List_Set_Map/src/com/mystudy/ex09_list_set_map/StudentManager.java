package com.mystudy.ex09_list_set_map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StudentManager extends StudentVO {
	/*  Map �� ����� ���� ó��
	1. 3���� �л�����Ÿ(����,����,����,����)�� 
	   StudentVO Ŭ������ �̿��ؼ� �����(�����ϰ�)
	   "ȫ�浿", 100, 90, 81
	   "�̼���", 95, 88, 92
	   "������", 90, 87, 77
	2. Map<String, StudentVO> Ÿ���� ����(map)�� �����ϰ�
	   key: �̸�, value: StudentVO
	3. map�� �ִ� ����Ÿ�� ����ؼ� ȭ�����
	     ����     ����   ����  ����    ����     ���
	   --------------------------
	     ȫ�浿  100  90  81  270  90.33
	   ...
	4. "ȫ�浿" �л���  �������� 88������ ����
	5. "ȫ�浿" �л��� ������ ȭ�� ���
	************************************/
	public static void main(String[] args) {
		
		// 3���� �л�����Ÿ(����,����,����,����)�� 
		// StudentVO Ŭ������ �̿��ؼ� �����(�����ϰ�)
		
		StudentVO std1 = new StudentVO("ȫ�浿", 100, 95, 81);
		StudentVO std2 = new StudentVO("�̼���", 95, 88, 92);
		StudentVO std3 = new StudentVO("������", 90, 87, 77);
		//ȫ�浿 �������� 88��
		StudentVO std4 = new StudentVO("ȫ�浿", 100, 95, 81);
		
		Map<String, StudentVO> map = new TreeMap<>();
		
		map.put(std1.getName(), std1);
		map.put(std2.getName(), std2);
		map.put(std3.getName(), std3);
		
		//====================================================
		
		//3. map�� �ִ� ����Ÿ�� ����ؼ� ȭ�����
		
		Set<String> keys = map.keySet();
		
		System.out.println("keys : " + keys);
		
		System.out.println("3. map�� �ִ� ����Ÿ�� ����ؼ� ȭ�����");
		System.out.println();
		System.out.println("�̸�" + "\t" + "����" + "\t"+ "����" + "\t" + "����" + "\t" + "����"  + "\t" + "���");
		System.out.println("---------------------------------------------");
		
//		for (String key : keys) {
//			
//			System.out.println(map.get(key).getName() + "\t" + 
//					   		   map.get(key).getKor() + "\t" + 
//					   		   map.get(key).getEng() + "\t" + 
//					   		   map.get(key).getMath() + "\t" + 
//							   map.get(key).getSum() + "\t" + 
//							   map.get(key).getAvg());
//		}
	
		for (String key : keys) {
			
			StudentVO vo = map.get(key);
			vo.printData();
			
		}
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println();
		
		
		
		// 4. "ȫ�浿" �л���  �������� 88������ ����
		// (1)replace
		map.replace("ȫ�浿", std4);
		// (2) StudentVO�� �ٲٱ�
		//map.get("ȫ�浿").setKor(88);
		
		//5. "ȫ�浿" �л��� ������ ȭ�� ���	
		System.out.println("5. \"ȫ�浿\" �л��� ������ ȭ�� ���");
		System.out.println();
		System.out.println("�̸�" + "\t" + "����" + "\t"+ "����" + "\t" + "����" + "\t" + "����"  + "\t" + "���");
		System.out.println("--------------------------------------------");
		map.get("ȫ�浿").printData();
	}
}
