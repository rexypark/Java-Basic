package com.mystudy.ex04_interface;


//abstract�� �߻�ȭ�� ���� ���� �Լ��� �����ص� ������ �߻����� �ʴ´�.
public abstract class Animal implements I_Animal{
	@Override
	public void eat() {
		System.out.println(">> �Դ´�");
	}
	
	@Override
	public void sleep() {
		System.out.println(">> ���� �ܴ�");
	}
	
	@Override
	public abstract void sound();//���� �ϰ� ������ ���� �ʴ� �߻�ȭ
	
}
