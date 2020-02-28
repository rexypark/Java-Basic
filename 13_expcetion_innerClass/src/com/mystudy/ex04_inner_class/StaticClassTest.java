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
	
	
	//static은 static method가 아니더라도 사용 할 수 있다. 
	//static간에 서로의 값들을 사용 할 수 있다.
	//static 내부 클래스(Inner Class중 static 클래스)
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
		
		//static 내부클래스의 static필드 변수사용
		int innerNum = StaticClassTest.Inner.d;
		//innerNum = StaticClassTest.Inner.e; //non-static
		
		//static 내부클래스의 non-static 필드, 메소드사용
		//내부클래스의 객체생성 후 사용
		StaticClassTest.Inner inner = new StaticClassTest.Inner();
	}
}
