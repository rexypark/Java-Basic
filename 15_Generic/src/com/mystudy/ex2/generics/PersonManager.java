package com.mystudy.ex2.generics;

import java.util.ArrayList;

public class PersonManager {
	public static void main(String[] args) {
		ArrayList<PersonVO> list = new ArrayList<>();
		
		PersonVO person = new PersonVO("ȫ�浿", 24);
		
		list.add(person);
		list.add(new PersonVO("������", 18));
		System.out.println(list);
		
		
		for (PersonVO p : list) {
			
			String name = p.getName();
			int age = p.getAge();
			
			System.out.println("�̸�  :" + name + ", ���� : " + age);
		}
		
	}

}
