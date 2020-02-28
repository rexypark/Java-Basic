package com.mystudy.ex04_interface;

public class TypeTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		
		eat(cat);
//		sound(cat);
		Animal an = new Cat();
		sound(an);
		
		
	}

	//인터페이스 타입으로 데이터를 변경
	static void sound(I_Animal animal) {
		animal.sound();
	}
	
	static void eat(I_Animal animal) {
		animal.eat();
	}
	
}
