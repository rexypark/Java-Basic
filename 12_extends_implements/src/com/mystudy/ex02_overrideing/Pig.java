package com.mystudy.ex02_overrideing;

public class Pig extends Animal {
	String name = "µÅÁö";
	
	void sound() {
		System.out.println(">> ²Ü~ ²Ü");
	}
	
	@Override
	String getName() {
		
		// return super.name > ºÎ¸ğ nameÀÌ Ãâ·Â
		return name;
	}
	
}
