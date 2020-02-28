package com.mystduy.ex03_abstract_class;

/* 추상클래스 : abstract class
      구현메소드와 추상메소드가 함께 있는 클래스(추상메소드가 하나라도 있으면)
      추상클래스는 객체생성을 할 수 없다.
 
 */



abstract class Animal {
	String name = "동물"; //동물 종류
	int legCnt;  //다리 갯수
	
	void eat() {
		System.out.println(">> 먹는다");
	}
	
	void sleep() {
		
		System.out.println(">> 잠을잔다");
		
	}
	
	// 추상 클래스
	abstract void sound() ;
	


	
}
