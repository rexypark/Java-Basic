package com.mystudy.ex04_interface;


//abstract은 추상화로 조건 없이 함수만 선언해도 오류가 발생하지 않는다.
public abstract class Animal implements I_Animal{
	@Override
	public void eat() {
		System.out.println(">> 먹는다");
	}
	
	@Override
	public void sleep() {
		System.out.println(">> 잠을 잔다");
	}
	
	@Override
	public abstract void sound();//선언만 하고 구현을 하지 않는 추상화
	
}
