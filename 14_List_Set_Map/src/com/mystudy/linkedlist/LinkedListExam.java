package com.mystudy.linkedlist;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExam {


	public static void main(String[] args) {
		
	
	LinkedList<String> list = new LinkedList();
	list.add("ȫ�浿");
	list.add("ȫ�浿");
	list.add("������");
	System.out.println(list);
	System.out.println(list.get(0));
	System.out.println("----------------");
	
	String str = "ȫ�浿,������,��������,��������";
	String[] strs = str.split(",");
	System.out.println();
	System.out.println(Arrays.toString(strs));
	
	System.out.println();
	for (int i = 0; i < strs.length; i++) {
		
		list.add(strs[i]);
		
	}

	Collections.reverse(list);
	System.out.println(list);
	

	Collections.sort(list);
	System.out.println(list);
	
	System.out.println();
		
	//--------------------------------------
	
	
	
	//[�ǽ�] �������� -> ��������2����ó��
	
	System.out.println("index : " +list.indexOf("��������"));
	
	System.out.println("���� �� list : " + list);
	
	for (int i = 0; i < list.size(); i++) {
		
		//if(list.get(i).equals("��������")) 
		if (list.get(i).equals("��������")) list.set(i, "��������2");
		
	}
	 
	System.out.println("------- �������� to ��������2 -------");
	System.out.println("���� �� list : " + list);
	
	
	
	}
	
}

