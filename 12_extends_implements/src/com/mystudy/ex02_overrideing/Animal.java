package com.mystudy.ex02_overrideing;

public class Animal {
	String name = "동물"; //동물 종류
	int legCnt;  //다리 갯수
	
	void eat() {
		System.out.println(">> 먹는다");
	}
	
	void sleep() {
		
		System.out.println(">> 잠을잔다");
		
	}
	
	void sound() {
		System.out.println(">> 물음없음");
	}

	String getName() {

		return name;
	}
	
	
}
