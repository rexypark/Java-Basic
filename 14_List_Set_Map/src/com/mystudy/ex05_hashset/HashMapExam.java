package com.mystudy.ex05_hashset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {
	public static void main(String[] args) {
		//MAP	(인터페이스 : 키(KET),-값(value)쌍으로 데이터 관리
		// - 순서가 없다(단, TreeMap의 영어 key가 오름차순 정렬되어 저장
		// - 키(key) : 중복허용 안됨(중복값 없이 유일한 데이터)
		// - 값(value) : 중복허용
		HashMap<String,Integer> map = new HashMap();
		map.put("홍길동", 100);
		map.put("김유신", new Integer(100));
		map.put("강감찬", 88);
		map.put("계백", 58);
		map.put("홍길동", 71);
		
		
		
		System.out.println(map);
		
		
		HashMap<String,Integer> map2 = new HashMap();
		map2.put("일지매", 71);
		map2.put("전우치", 45);
		System.out.println(map2);
		map2.remove("전우치");
		System.out.println(map2);
		System.out.println(map.containsValue(100));
		//=========================================
		System.out.println("=== Map데이터 조회 ===");
		
		Set<String> keys = map.keySet();
		
		System.out.println("여기" + keys);
		
		ArrayList<String> keyList = new ArrayList(keys);
		int sumValues = 0;
		for (int i = 0; i < map.size(); i++) {
			sumValues += map.get(keyList.get(i));
		}
		
		
		
		System.out.println("키 목록 : " + keys);
		System.out.println("값 목록 : " + map.values());
		System.out.println("값 총합 : " + sumValues);
		
		
		
		//============================================
		//조회방법1 : keyset(), iterator() 사용
		Iterator<String> ite = keys.iterator();
		System.out.println(map.get(keyList.get(0)));
		while (ite.hasNext()) {
			String key = ite.next();
			Integer value = map.get(key);
			System.out.println("key : " + key + "\tvalue : " + value);
		}
		
		//조회방법 2 : entrySet() 사용
		System.out.println("----- entrySet() : key, value 추출");
		
		Set<Entry<String, Integer>> entrySets = map.entrySet();
		
		System.out.println(entrySets);
		
		
		
		Iterator<Entry<String, Integer>> entryIte = entrySets.iterator();
		while(entryIte.hasNext()) {
			Entry<String, Integer> entry = entryIte.next();
			System.out.println("key : " + entry.getKey() + "\tvalue : " + entry.getValue());
		}
		
		
//		Iterator<String> ite = keys.iterator();
//		
//		while(ite.hasNext()) {
//			String key = ite.next();
//			System.out.println(map.get(key));
//		}
		
	}
	
}
