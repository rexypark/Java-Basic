package com.mystudy.ex05_hashset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam2 {

	public static void main(String[] args) {
		// 개선된 for문을 사용한 Map 데이터 조회
		int[] nums = {10,20,30,40};
		System.out.println(nums);
		System.out.println("-- 기본형태 for문 배열값 출력 ---");

		for (int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println();
		System.out.println("===================");
		System.out.println();
		
		
		System.out.println("-- 개선된 for문 배열값 출력 ---");
		for (int n : nums) {
			System.out.println(n);
		}
		
		ArrayList<String> str_nums = new ArrayList();
		ArrayList<Integer> int_nums = new ArrayList();
		
		str_nums.add("one");
		str_nums.add("two");
		str_nums.add("three");
		str_nums.add("four");
		str_nums.add("five");
		int_nums.add(1);
		int_nums.add(2);
		int_nums.add(3);
		int_nums.add(4);
		int_nums.add(5);
		
		int idx = 0;
		HashMap<Integer, String> map = new HashMap();
		for (Integer iN : int_nums) {
			map.put(iN, str_nums.get(idx));
			idx++;
		}
		System.out.println("map : " + map);
		System.out.println();
		System.out.println();
		
		//=================================
		// 전체 데이터 화면 출력
		// 출력 예) 키1-값1
		// 실습 keySet(), iterator 사용(while문 사용 방식)
		Set<Integer> keys = map.keySet();
		
		ArrayList<Integer> key_list = new ArrayList(keys);
		System.out.println(key_list);
		idx = 0;
		System.out.println();
		System.out.println(map);
		System.out.println("---  keySet()을 사용하여 key/value 출력  ---");
		System.out.println();
		for (Integer kl : key_list) {
			System.out.println("key : " + kl + "\t\t" + "value : " + map.get(kl));
		}
		
		System.out.println();
		System.out.println("---  iterator()을 사용하여 key/value 출력  ---");
		System.out.println();
		
		Iterator<Integer> ite = keys.iterator();
		while(ite.hasNext()) {
			Integer key = ite.next();
			String value = map.get(key);
			System.out.println("key : " + key + "\t\t" + "value : " + value);
		}
		
		
		//실습2 : keySet() 개선된 for문 사용
		System.out.println();
		System.out.println("---  keySet() 개선된 for문 사용  ---");
		System.out.println();
		
		for (Integer k : keys) {
			System.out.println("key : " + k + "\t\t" + "value : " + map.get(k));
			
		}
		
		
		// 1. entry Set을 만든다
		// Set<Entry<데이터타입1, 데이터타입2>> entrySet변수명 = hashMap.entrySet(); 
		// 2. entry Iterator를 만든다
		// Iterator<Entry<데이터타입1, 데이터타입2>> 변수명 = entrySet변수명.iterator();
		System.out.println();
		System.out.println("---  entrySet() key/value 출력  ---");
		System.out.println();
		Set<Entry<Integer, String>> entrySets = map.entrySet();

		
		Iterator<Entry<Integer, String>> entryIte = entrySets.iterator();
		while (entryIte.hasNext()) {
			Entry<Integer, String> key = entryIte.next();
			System.out.println("key : " + key.getKey() + "\t\t" + "value : " + key.getValue());
		}
		System.out.println();
		System.out.println("--- entrySet 개선된 for문 ---");
		System.out.println();
		
		for (Entry<Integer,String> entry : entrySets) {
			System.out.println("key : " + entry.getKey() + "\t\t" + "value : " + entry.getValue());
		}
		
	}
}


