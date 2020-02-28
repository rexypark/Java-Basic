package com.mystudy.ex05_hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		//HashSet : Set 인터페이스를 구현한 구현체
		//HashSet<String> set = new HashSet<String>();
		
		//인터페이스 타입변수 <- 인터페이스를 구현한 클래스의 객체(인스턴스)
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("3");
		set.add("2");
		//중복값 허용x
		set.add("홍길동");
		set.add("홍길동");
		set.add("1");
		System.out.println(set);
		//삭제
		set.remove("1");
		//값 유효성 확인
		System.out.println(set.contains("1"));
		System.out.println(set.contains("2"));
		//set크기 확인
		System.out.println("set size : "+ set.size());
		
		
		System.out.println(set.toString());
		System.out.println(set);
		
		set.add("김유신");
		set.add("을지문덕");
		set.add("홍경래");
		System.out.println(set);
		
		Iterator ite = set.iterator();
		
		ArrayList<String> list = new ArrayList<String>();
		
		while(ite.hasNext()) {
			list.add((String)ite.next());
		}
		System.out.println("this is list.");
		System.out.println(list);
		System.out.println();
		
		
		//실습(수정)  :  김유신 -> 강감찬(변경처리)
		System.out.println("실습(수정)  :  김유신 -> 강감찬(변경처리)");
		System.out.println("=============================================");
		System.out.println("set 수정 전 : " + set);
		
		if (set.contains("김유신")==true) {
			set.remove("김유신");
			set.add("강감찬");
		}else {
			System.out.println("Data is not in this container!");
		}
		
		System.out.println("set 수정 후 : " + set);
		
		
		
	}
}
