package com.mystudy.ex01_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ���̺귯���� ArrayList��� Ŭ������ �־� ���� Ŭ�������� �������� �ϸ�
// �ش� ���̺귯���� ��� �� �� ����.
public class ArrayListExam {
	public static void main(String[] args) {
		//  List �迭 : ArrayList - �迭�� �Ӽ��� List �Ӽ��� ����
		// 	- List �������̽��� ��� ����(implements)�� Ŭ����
		//	- List �������̽��� ��� Ȯ��(extends)�ؼ� �������̽�
		
		//ArrayList ������ = new ArrayList();
		//����Ʈ����.add(val);
		//����Ʈ����.remove(val);   or   ����Ʈ����.remove(index, val);
		
		
		
		
		ArrayList list = new ArrayList();
		ArrayList list3 = new ArrayList();
		
		list.add(new Integer(5));
		list.add(1);
		
		list.add(new Integer(5));
		list.add(new Integer(6));
		
		System.out.println(list);
		System.out.println(list.size());
		
		// ���� ������ ���� �ٲٴ� ����
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		list.add(3,100);  // (a, b)  > a : �ε�����ġ / b : ���� ��
		System.out.println("3�� �ε����� 100 �߰� �� : " + list);
		
		list.set(3, 999); // �ش� �ε��� ��ġ�� ���� �����Ѵ�.
		System.out.println("3�� �ε����� 999 �߰� �� : " + list);
		
		System.out.println("remove(3) �� : " + list);
		list.remove(3);
		System.out.println("remove(3) �� : " + list);
		
//		list.remove(new Integer(5)); // ���� Integer 5 ��
//		list.remove(new Integer(5)); // ���� Integer 5 ��
		System.out.println(list); 
		
		Object object = list;
		
		System.out.println("0���� �ε��� �� " + object);
		System.out.println();

		
		System.out.println("-------------------------");
		ArrayList list2 = new ArrayList(list.subList(0,4));
		
		System.out.println("list2 : " + list2);
		System.out.println();
		
		System.out.println("---- Collections.sort() ----");
		System.out.println("list2 : " + list);
		Collections.sort(list2);
		System.out.println("list2 : " + list2);
		
		
		
		list2.add("B");
		list2.add("TEST");
		list3.add(list2);
		list3.add(list2);
		list3.add(list2);
		list3.add(list2);
		
		System.out.println(list3);
		Object list3Obj = list3.get(0);
		System.out.println(((ArrayList)list3Obj).get(0));
		
		System.out.println(list3Obj);
		
		System.out.println("list2 : " + list2);
		System.out.println("ù���� ������ ��ȸ : " + list2.get(0));
		System.out.println("ù���� ������ ��ȸ : " + list2.get(list2.size()-1));
		
		for (int i = 0; i < list2.size(); i++) {
			
			System.out.println(i + " - " + list2.get(i));
			
		}
		
		System.out.println();
		System.out.println();
		printData(list, list2);
		printData("list2", list2);
		printData("list3", list3);
		
	}	
	
	
	static void printData(List list1, List list2) {
		printData("list1", list1);
		printData("list2", list2);
		System.out.println();
		
		System.out.println("======================");
		//�ǽ� : �ݺ���(for)�� ����ؼ� list2�� �ִ� ��ü ������ ����
		
		System.out.println(list2);
		int sizeOflist = list2.size();
		for (int i = list2.size(); i>0; i--)
		{
			list2.remove(0);
			System.out.println(list2);
			System.out.println(list2.size());
		}
		System.out.println(list2);
		
		System.out.println("list2 : " + list2);
		System.out.println("==============");
		
	}
	
	
	
	
	
	
	static void printData(String title, List list) {
		// null ���� Ȯ��
		if (list == null || list.size() < 1) {
			System.out.println(title + " : null");
			return;
		}
		if (list.size() == 0) {  //null�� �ƴ����� �����Ͱ� ����?
			System.out.println(title + " : ������ �Ǽ� 0");
			return;
		}
		System.out.print(title + " : " + list.get(0));

		//size�� 1�̸� ����x
		for (int i = 1; i<list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
		
	}
}
