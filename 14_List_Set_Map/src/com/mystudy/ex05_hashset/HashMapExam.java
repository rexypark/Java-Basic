package com.mystudy.ex05_hashset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {
	public static void main(String[] args) {
		//MAP	(�������̽� : Ű(KET),-��(value)������ ������ ����
		// - ������ ����(��, TreeMap�� ���� key�� �������� ���ĵǾ� ����
		// - Ű(key) : �ߺ���� �ȵ�(�ߺ��� ���� ������ ������)
		// - ��(value) : �ߺ����
		HashMap<String,Integer> map = new HashMap();
		map.put("ȫ�浿", 100);
		map.put("������", new Integer(100));
		map.put("������", 88);
		map.put("���", 58);
		map.put("ȫ�浿", 71);
		
		
		
		System.out.println(map);
		
		
		HashMap<String,Integer> map2 = new HashMap();
		map2.put("������", 71);
		map2.put("����ġ", 45);
		System.out.println(map2);
		map2.remove("����ġ");
		System.out.println(map2);
		System.out.println(map.containsValue(100));
		//=========================================
		System.out.println("=== Map������ ��ȸ ===");
		
		Set<String> keys = map.keySet();
		
		System.out.println("����" + keys);
		
		ArrayList<String> keyList = new ArrayList(keys);
		int sumValues = 0;
		for (int i = 0; i < map.size(); i++) {
			sumValues += map.get(keyList.get(i));
		}
		
		
		
		System.out.println("Ű ��� : " + keys);
		System.out.println("�� ��� : " + map.values());
		System.out.println("�� ���� : " + sumValues);
		
		
		
		//============================================
		//��ȸ���1 : keyset(), iterator() ���
		Iterator<String> ite = keys.iterator();
		System.out.println(map.get(keyList.get(0)));
		while (ite.hasNext()) {
			String key = ite.next();
			Integer value = map.get(key);
			System.out.println("key : " + key + "\tvalue : " + value);
		}
		
		//��ȸ��� 2 : entrySet() ���
		System.out.println("----- entrySet() : key, value ����");
		
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
