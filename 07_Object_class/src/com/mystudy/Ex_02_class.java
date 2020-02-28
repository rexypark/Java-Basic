package com.mystudy;

// Ŭ���� �������� : public, public���� ����(default)
public class Ex_02_class {
	int num = 111; // �ʱⰪ ���� ���
	
	// Ŭ������ �ε��� �� ��
	// static�� ���� �͵��� ����� ����������
	// static�� ���� ���� �͵��� ��ü ������ ���� ��
	// �׶� ���������.
	// >> static�� ����Ǿ��� �� ���� ��� �� �� �ִ�.
	
	static int staticNum = 222;
	
	Ex_02_class() {} //�⺻������
	
	public static void main(String[] args) {
		//���ú���(��������)
		int num1 = 200;
		int num2 = 100;
		int result = 0;
		result = num1 = num2;
		
		System.out.println(result);
		
		System.out.println("===========");
		result = add(num1,num2);
		System.out.println("result : " + result);
		System.out.println("staticNum : " + staticNum);
		
	  // static �������� non-static ������ ���̷�Ʈ�� ���ٸ���
	  //System.out.println("num : " + num);
      //System.out.println("sub : " + sub(num1,num2));
	  //-----------------------------------
	  /*
	   ��ü����(�ν���Ʈ ����, �ν���Ʈ ȭ �Ѵ�)
	   Ŭ����Ÿ�Ը� ������;
	   ������ = new Ŭ������();
	   */
		
		Ex_02_class ex01;
		ex01 = new Ex_02_class();
		int a = ex01.num;
		
		//static �޼ҵ忡�� non-static �޼ҵ� �Ǵ� �ʵ�(�ν��Ͻ�����) ���
		//������ ��ü(�ν��Ͻ�)�� ���ؼ��� ��� ����
		System.out.println("ex01.num : " + a);
		
		ex01.num = 1000;
		System.out.println("ex01.num : " + ex01.num);
		
		int subResult = ex01.sub(num1, num2);
		System.out.println("ex01.sub(num1, num2) : " + subResult);
		
		
	}
	
	/*
	 �޼ҵ� ����
	 void �޼ҵ��() {}
	 void �޼ҵ��(�Ķ����Ÿ�� ������, ....)
	 ����(������)Ÿ�� �޼ҵ��() {}
	 ����Ÿ�� �޼ҵ��(�Ķ����Ÿ�� ������, ...)
	 */
	
	// void�� ������ ���� ���� �� ���
	// ������ Ÿ�� ������ �ش� ������ Ÿ�� ������ �Ǿ����
	static int add(int a, int b) {
		return a+b;
	}
	
	int sub(int a, int b) {
		return a+b;
		
	}
	
}






