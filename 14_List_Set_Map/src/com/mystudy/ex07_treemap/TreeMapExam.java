package com.mystudy.ex07_treemap;

import java.util.TreeMap;

public class TreeMapExam {
	
	public static void main(String[] args) {
		// TreeMap : 키(key)값 중심으로 오름차순 정렬에서 저장
		TreeMap<String,Integer> tree = new TreeMap<>();
		
		// 문자열 오름차순 > 특수문자 > 숫자 > 대문자 > 소문자 > 한글 순서
		// 키값 오름차순 > 사람 이름순으로 오름차순 된다.
		tree.put("홍길동", 100);
		tree.put("김유신", new Integer(90));
		tree.put("강감찬", 87);
		tree.put("100", 87);
		tree.put("a", 87);
		tree.put("A", 87);
		tree.put("*", 87);
		
		System.out.println(tree);
		System.out.println("tree.isEmpty() : " + tree.isEmpty());
		System.out.println("tree.get(\"홍길동\") : " + tree.get("홍길동"));
		System.out.println("tree.containsKey(\"을지문덕\") : " + tree.containsKey("을지문덕"));
		System.out.println("tree.containsValue(88) : " + tree.containsValue(100));

		for (String key : tree.keySet()) {
			System.out.println("key : " + key + "\t value : " + tree.get(key));
		}
	}

}
