package com.mystudy.ex09_list_set_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class List_Set_Map {
	
	public static void main(String[] args) {
		// 1. List  ���
		// �̸���� : ȫ�浿, ������, �ڳ���, �̼���
		// - ��� :    index : �̸�(������)
		// - ���� : ȫ�浿 - > ��������
		
		ArrayList<String> name = new ArrayList<>();
		
		name.add("ȫ�浿");
		name.add("������");
		name.add("�ڳ���");
		name.add("�̼���");
		
		
		name.set(0, "��������");
		int idx = 0;
		System.out.println("1. List���");
		System.out.println("------------");
		System.out.println("idx    name");
		System.out.println("------------");
		for (String names : name) {
			System.out.println(idx + "   :  " + names);
			idx++;
		}
		
		System.out.println("============");
		System.out.println("============");
		
		
		// 2. Set ���
		// - �̸���� : ȫ�浿, ������, �ڳ���, �̼���
		// - ��� : �̸�(��������, �����ټ�) > TreeMap
		// - ���� : ȫ�浿 > �������� 
		Set<String> name2 = new TreeSet<>();
		name2.add("ȫ�浿");
		name2.add("������");
		name2.add("�ڳ���");
		name2.add("�̼���");
		
		//ȫ�浿 > ��������
		name2.remove("ȫ�浿");
		name2.add("��������");
		
		System.out.println();
		System.out.println("2. Set���");
		System.out.println("> �̸� ����");
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
		
		
		// 3. Map ���
		// - k-v��� : 1910-ȫ�浿, 1920-������, 1930-�ڳ���, 1940-�̼���
		// - ��� : �̸�(key ��������)
		// - ���� : ȫ�浿 > �������� (key�� ���)
				
		
		
		TreeMap<Integer, String> name3 = new TreeMap();
		name3.put(1910, "ȫ�浿");
		name3.put(1930, "�ڳ���");
		name3.put(1920, "������");
		name3.put(1940, "�̼���");
		
		
		
		// �����(ȫ�浿 > ��������)
		//name3.put(1910,"��������");
		//replace(key, value); > �ش� Ű���� ���� value�� �ٲ��ش�.
		
		name3.replace(1910, "��������");

		System.out.println();
		
		Set<Integer> keys = name3.keySet();
		idx = 0;
		System.out.println(keys);
		
		System.out.println("3. Map���");
		System.out.println("> key�� ����");
		System.out.println("------------");
		System.out.println("years : name");
		System.out.println("------------");
		for(Integer key : keys) {
			String value = name3.get(key);
			System.out.println(key + "  : " + value);
		}
	}
	


}
