package com.mystudy.ex02_overrideing;

public class Animal {
	String name = "����"; //���� ����
	int legCnt;  //�ٸ� ����
	
	void eat() {
		System.out.println(">> �Դ´�");
	}
	
	void sleep() {
		
		System.out.println(">> �����ܴ�");
		
	}
	
	void sound() {
		System.out.println(">> ��������");
	}

	String getName() {

		return name;
	}
	
	
}
