package com.mystudy.ex07_treemap;

import java.util.TreeMap;

public class TreeMapExam {
	
	public static void main(String[] args) {
		// TreeMap : Ű(key)�� �߽����� �������� ���Ŀ��� ����
		TreeMap<String,Integer> tree = new TreeMap<>();
		
		// ���ڿ� �������� > Ư������ > ���� > �빮�� > �ҹ��� > �ѱ� ����
		// Ű�� �������� > ��� �̸������� �������� �ȴ�.
		tree.put("ȫ�浿", 100);
		tree.put("������", new Integer(90));
		tree.put("������", 87);
		tree.put("100", 87);
		tree.put("a", 87);
		tree.put("A", 87);
		tree.put("*", 87);
		
		System.out.println(tree);
		System.out.println("tree.isEmpty() : " + tree.isEmpty());
		System.out.println("tree.get(\"ȫ�浿\") : " + tree.get("ȫ�浿"));
		System.out.println("tree.containsKey(\"��������\") : " + tree.containsKey("��������"));
		System.out.println("tree.containsValue(88) : " + tree.containsValue(100));

		for (String key : tree.keySet()) {
			System.out.println("key : " + key + "\t value : " + tree.get(key));
		}
	}

}
