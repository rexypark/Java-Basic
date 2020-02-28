package com.mystudy.ex09_list_set_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class List_Set_Map {
	
	public static void main(String[] args) {
		// 1. List  사용
		// 이름등록 : 홍길동, 강감찬, 박나래, 이순신
		// - 출력 :    index : 이름(데이터)
		// - 수정 : 홍길동 - > 을지문덕
		
		ArrayList<String> name = new ArrayList<>();
		
		name.add("홍길동");
		name.add("강감찬");
		name.add("박나래");
		name.add("이순신");
		
		
		name.set(0, "을지문덕");
		int idx = 0;
		System.out.println("1. List사용");
		System.out.println("------------");
		System.out.println("idx    name");
		System.out.println("------------");
		for (String names : name) {
			System.out.println(idx + "   :  " + names);
			idx++;
		}
		
		System.out.println("============");
		System.out.println("============");
		
		
		// 2. Set 사용
		// - 이름등록 : 홍길동, 강감찬, 박나래, 이순신
		// - 출력 : 이름(오름차순, 가나다순) > TreeMap
		// - 수정 : 홍길동 > 을지문덕 
		Set<String> name2 = new TreeSet<>();
		name2.add("홍길동");
		name2.add("강감찬");
		name2.add("박나래");
		name2.add("이순신");
		
		//홍길동 > 을지문덕
		name2.remove("홍길동");
		name2.add("을지문덕");
		
		System.out.println();
		System.out.println("2. Set사용");
		System.out.println("> 이름 정렬");
		idx = 0;
		System.out.println("------------");
		System.out.println("idx    name");
		System.out.println("------------");
		for (String names : name2) {
			System.out.println(idx + "   :  " + names);
			idx++;
		}
		
		
		System.out.println("============");
		System.out.println("============");
		
		
		// 3. Map 사용
		// - k-v등록 : 1910-홍길동, 1920-강감찬, 1930-박나래, 1940-이순신
		// - 출력 : 이름(key 오름차순)
		// - 수정 : 홍길동 > 을지문덕 (key값 사용)
				
		
		
		TreeMap<Integer, String> name3 = new TreeMap();
		name3.put(1910, "홍길동");
		name3.put(1930, "박나래");
		name3.put(1920, "강감찬");
		name3.put(1940, "이순신");
		
		
		
		// 덮어쓰기(홍길동 > 을지문덕)
		//name3.put(1910,"을지문덕");
		//replace(key, value); > 해당 키값을 지정 value로 바꿔준다.
		
		name3.replace(1910, "을지문덕");

		System.out.println();
		
		Set<Integer> keys = name3.keySet();
		idx = 0;
		System.out.println(keys);
		
		System.out.println("3. Map사용");
		System.out.println("> key값 정렬");
		System.out.println("------------");
		System.out.println("years : name");
		System.out.println("------------");
		for(Integer key : keys) {
			String value = name3.get(key);
			System.out.println(key + "  : " + value);
		}
	}
	


}
