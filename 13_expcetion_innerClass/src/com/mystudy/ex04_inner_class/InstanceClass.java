package com.mystudy.ex04_inner_class;

class A {
	
}




public class InstanceClass {
	//�ʵ�
	int a = 100;
	private int b = 10;
	static int c = 200;
	int sum = 0;
	
	
	
	//�޼ҵ�
	void sum() {
		sum = a+b;
	}

	
	//����Ŭ���� : �ν��Ͻ� ����Ŭ����
	class Inner {
		int in = 100;
		void printData() {
		System.out.println("int a : " + a);
		System.out.println("int b : " + b);
		System.out.println("static c : " + c);
		sum();
		System.out.println("sum : " + sum);
		
		System.out.println("����Ŭ���� �ʵ� in : " +in);
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		InstanceClass out = new InstanceClass();
		System.out.println("�ʵ庯�� : " + out.a);
		
		System.out.println("---- ����Ŭ����(�ν��Ͻ�Ŭ����) ��� ----");
		//����Ŭ������ �ִ� printData() ����
		//����Ŭ������ ��ü�� �����ϱ� ���ؼ���
		// �ܺ�Ŭ������ �����ϰ� �׾ȿ� ���Ӱ� ��ü�� �������Ѵ�.
		// �Ϲ� Ŭ�����̱� ������ ��ü�� ����� ����ؾ� �Ѵ�.
		InstanceClass.Inner inner = new InstanceClass().new Inner();
		inner.printData();		
	}
}
