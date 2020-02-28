package com.mystudy.ex04_inner_class;

public class StaticClassTest {
	int a = 10;
	private int b = 100;
	
	
	static int c = 200;
	static int sum = 0;
	static int sNum1 = 20;
	static int sNum2 = 20;
	
	static void sum() {
		sum = Inner.d + sNum1;
		System.out.println(sum);
	}
	
	
	//static�� static method�� �ƴϴ��� ��� �� �� �ִ�. 
	//static���� ������ ������ ��� �� �� �ִ�.
	//static ���� Ŭ����(Inner Class�� static Ŭ����)
	static class Inner{
		static int d = 1000;
		int e = 2000;
		void printData() {
//			System.out.println("int a : " + a); //a : non-static
//			System.out.println("private int b : " + b); //b : non-static
		}
	}
	
	
	
	public static void main(String[] args) {
		int num = Inner.d;
		StaticClassTest.sum();
		System.out.println(num);
		
		//static ����Ŭ������ static�ʵ� �������
		int innerNum = StaticClassTest.Inner.d;
		//innerNum = StaticClassTest.Inner.e; //non-static
		
		//static ����Ŭ������ non-static �ʵ�, �޼ҵ���
		//����Ŭ������ ��ü���� �� ���
		StaticClassTest.Inner inner = new StaticClassTest.Inner();
	}
}
