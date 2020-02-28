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

		
		System.out.println("--- sound() �޼ҵ� ȣ�� ---");
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
		System.out.println("an.name : " + an.name + " Animal Ÿ�Կ� �ִ� �ʵ� �� ����");
		System.out.println("an.getName() : " + an.getName() + " <- Pig�� �ִ� �޼ҵ尡 �����");
		
	}
		
	
	
	private static void sound(Animal animal) {
		animal.sound();
	}
	
	
	
	//�޼ҵ� �����ε�(overLoading)
	
//	private static void sound(Cat cat) {
//		//instanceof ��� - Ÿ��Ȯ�� �� �ش�Ÿ��
//		cat.sound();
//	}
//	
//	private static void sound(Dog dog) {
//		//instanceof ��� - Ÿ��Ȯ�� �� �ش�Ÿ��
//		dog.sound();
//	}
	
	
//	private static void sound(Animal animal) {
//		if (animal instanceof Cat) ((Cat)animal).sound();
//		if (animal instanceof Dog) ((Dog)animal).sound();
//		if (animal instanceof Pig) ((Pig)animal).sound();
//		
//	}
	
	
}
