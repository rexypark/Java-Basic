package com.mystudy.ex02_overrideing;

public class Cat extends Animal{
	
	/*
	�޼ҵ� �������̵�(method overriding)
	��Ӱ��� Ȯ�� ,extends�� �ִ� Ŭ��������
	����(�θ�)Ÿ�Կ� �ִ� �޼ҵ带 ����(�ڳ�)Ÿ�� Ŭ�������� ������
	- ������ �����ϰ�, ��ɸ� �ٸ��� ����
	- ������ : ����Ÿ��, �޼ҵ��, ������Ͱ� ����(Ÿ��, ����, ���� ��ġ)
	���������ڴ� ����Ÿ�Կ��� ������ �ͺ��� �۰� ��������
	(�� : �θ�Ŭ���� public - �ڳ� public�� ����
		  �θ�Ŭ���� protected - �ڳ� public, protected ����
		  �θ�Ŭ���� default - �ڳ� public, protected, default ����
		  �θ�Ŭ���� private - �ڳ� private�� ����)
	*/
	@Override
	void sound() {
		System.out.println(">> �߿�~ �߿�");
	}

}
