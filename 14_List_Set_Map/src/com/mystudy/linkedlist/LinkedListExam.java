package com.mystudy.linkedlist;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExam {


	public static void main(String[] args) {
		
	
	LinkedList<String> list = new LinkedList();
	list.add("È«±æµ¿");
	list.add("È«±æµ¿");
	list.add("±èÀ¯½Å");
	System.out.println(list);
	System.out.println(list.get(0));
	System.out.println("----------------");
	
	String str = "È«±æµ¿,±èÀ¯½Å,À»Áö¹®´ö,À»Áö¹®´ö";
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
	
	
	
	//[½Ç½À] À»Áö¹®´ö -> À»Áö¹®´ö2º¯°æÃ³¸®
	
	System.out.println("index : " +list.indexOf("À»Áö¹®´ö"));
	
	System.out.println("º¯°æ Àü list : " + list);
	
	for (int i = 0; i < list.size(); i++) {
		
		//if(list.get(i).equals("À»Áö¹®´ö")) 
		if (list.get(i).equals("À»Áö¹®´ö")) list.set(i, "À»Áö¹®´ö2");
		
	}
	 
	System.out.println("------- À»Áö¹®´ö to À»Áö¹®´ö2 -------");
	System.out.println("º¯°æ ÈÄ list : " + list);
	
	
	
	}
	
}

