package com.mystudy.ex02_overrideing;

public class Pig extends Animal {
	String name = "����";
	
	void sound() {
		System.out.println(">> ��~ ��");
	}
	
	@Override
	String getName() {
		
		// return super.name > �θ� name�� ���
		return name;
	}
	
}
