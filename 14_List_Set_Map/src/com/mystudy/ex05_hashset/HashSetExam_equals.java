package com.mystudy.ex05_hashset;

import java.util.HashSet;

class Person 
	{
	String name;    // 이름
	int age;		// 나이
	String jumin;	// 주민번호
	
	
	public Person(String name, int age, String jumin) 
	{
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
	
	
	@Override
	public String toString() 
	{
		return "Person [name=" + name + ", age=" + age + ", jumin=" + jumin + "]\n";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	}


public class HashSetExam_equals {

	public static void main(String[] args) 
	
		{
		
		//set 중복데이터 하나만 저장
		// 참조형 데이터의 동일 데이터 여부는 equals 메소드 기저ㅜㄴ
		// equals 메소드를 재정의(override하고, hashCode() 함께 재정의
		// 비교순서 : HashSet
		HashSet set = new HashSet();
		set.add("ABC");
		set.add("ABC");
		set.add("XYZ");
		System.out.println(set);
	
		set.add(new Person("rex",30,"941123 - 3334232"));
		set.add(new Person("rex",29,"955555 - 3334232"));
		set.add(new Person("rex",18,"922222 - 3334232"));
		
		System.out.println(set);
		}
	
	
}
