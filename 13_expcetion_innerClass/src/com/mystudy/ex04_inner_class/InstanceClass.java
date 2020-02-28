package com.mystudy.ex04_inner_class;

class A {
	
}




public class InstanceClass {
	//필드
	int a = 100;
	private int b = 10;
	static int c = 200;
	int sum = 0;
	
	
	
	//메소드
	void sum() {
		sum = a+b;
	}

	
	//내부클래스 : 인스턴스 내부클래스
	class Inner {
		int in = 100;
		void printData() {
		System.out.println("int a : " + a);
		System.out.println("int b : " + b);
		System.out.println("static c : " + c);
		sum();
		System.out.println("sum : " + sum);
		
		System.out.println("내부클래스 필드 in : " +in);
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		InstanceClass out = new InstanceClass();
		System.out.println("필드변수 : " + out.a);
		
		System.out.println("---- 내부클래스(인스턴스클래스) 사용 ----");
		//내부클래스에 있는 printData() 실행
		//내부클래스의 객체를 생성하기 위해서는
		// 외부클래스를 정의하고 그안에 새롭게 객체를 만들어야한다.
		// 일반 클래스이기 때문에 객체를 만들고 사용해야 한다.
		InstanceClass.Inner inner = new InstanceClass().new Inner();
		inner.printData();		
	}
}
