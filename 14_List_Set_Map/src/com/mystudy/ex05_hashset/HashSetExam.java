package com.mystudy.ex05_hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		//HashSet : Set �������̽��� ������ ����ü
		//HashSet<String> set = new HashSet<String>();
		
		//�������̽� Ÿ�Ժ��� <- �������̽��� ������ Ŭ������ ��ü(�ν��Ͻ�)
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("3");
		set.add("2");
		//�ߺ��� ���x
		set.add("ȫ�浿");
		set.add("ȫ�浿");
		set.add("1");
		System.out.println(set);
		//����
		set.remove("1");
		//�� ��ȿ�� Ȯ��
		System.out.println(set.contains("1"));
		System.out.println(set.contains("2"));
		//setũ�� Ȯ��
		System.out.println("set size : "+ set.size());
		
		
		System.out.println(set.toString());
		System.out.println(set);
		
		set.add("������");
		set.add("��������");
		set.add("ȫ�淡");
		System.out.println(set);
		
		Iterator ite = set.iterator();
		
		ArrayList<String> list = new ArrayList<String>();
		
		while(ite.hasNext()) {
			list.add((String)ite.next());
		}
		System.out.println("this is list.");
		System.out.println(list);
		System.out.println();
		
		
		//�ǽ�(����)  :  ������ -> ������(����ó��)
		System.out.println("�ǽ�(����)  :  ������ -> ������(����ó��)");
		System.out.println("=============================================");
		System.out.println("set ���� �� : " + set);
		
		if (set.contains("������")==true) {
			set.remove("������");
			set.add("������");
		}else {
			System.out.println("Data is not in this container!");
		}
		
		System.out.println("set ���� �� : " + set);
		
		
		
	}
}
