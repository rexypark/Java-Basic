package com.mystudy.ex02_overrideing;

public class TypeTest {
	
	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Pig pig = new Pig();
		
		an.eat();
		an.sleep();
		
		cat.eat();
		cat.sleep();

		
		System.out.println("--- sound() 메소드 호출 ---");
		sound(cat);
		sound(dog);
		sound(pig);
		sound(an);
	
		System.out.println("==========");
	
		System.out.println(pig.name);
		an = pig;
		System.out.println(an.name);
		
		System.out.println("=== an <- Animal ==");
		an = new Animal();
		System.out.println("an.name : " + an.name);
		System.out.println("an.getName() : " + an.getName());
		
		System.out.println("an <- Pig");
		an = new Pig();
		System.out.println("an.name : " + an.name + " Animal 타입에 있는 필드 값 읽음");
		System.out.println("an.getName() : " + an.getName() + " <- Pig에 있는 메소드가 실행됨");
		
	}
		
	
	
	private static void sound(Animal animal) {
		animal.sound();
	}
	
	
	
	//메소드 오버로딩(overLoading)
	
//	private static void sound(Cat cat) {
//		//instanceof 사용 - 타입확인 후 해당타입
//		cat.sound();
//	}
//	
//	private static void sound(Dog dog) {
//		//instanceof 사용 - 타입확인 후 해당타입
//		dog.sound();
//	}
	
	
//	private static void sound(Animal animal) {
//		if (animal instanceof Cat) ((Cat)animal).sound();
//		if (animal instanceof Dog) ((Dog)animal).sound();
//		if (animal instanceof Pig) ((Pig)animal).sound();
//		
//	}
	
	
}
