package com.mystudy.ex03_vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		// Vector 클래스 : List 계열
		Vector<String> v = new Vector<String>(5); // 저장용량 5
												 // 저장용량 default 10
		v.add("1");  //index : 0
		v.add("2");  //index : 1
		v.add("3");  //index : 2
		
		System.out.println(v);
		
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		
		String temp = v.toString();
		System.out.println("v.toString() : " + temp);
		
		System.out.println("--- remove() --- 실행 후");
		v.remove(2);
		System.out.println(v);
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());

		v.addElement("a");
		System.out.println(v);
		
		v.addElement("bb");
		System.out.println(v);
		
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		
		System.out.println();
		
		v.trimToSize();
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		v.set(2, "CCC");
		
		System.out.println(v);
		
		System.out.println("---- 객체복사 clone() ----");
		
		Vector<String> v2 = (Vector<String>)v.clone();
		
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2);
	
		
		
		System.out.println("--- v2.clear() 실행 후 ---");
		v2.clear();
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2);
		
		
		System.out.println();		
		System.out.println("==========================");
		Enumeration<String> enu = v.elements();
		
		// 값들이 있는 지 True // False
		while(enu.hasMoreElements()) {
			String str = enu.nextElement();
			System.out.println(str);
		}System.out.println(v);
		
		System.out.println("===== Iterator 활용 조회");
		Iterator lte = v.iterator();
		while (lte.hasNext()) {
			String str = (String) lte.next();
			System.out.println("ite.next : " + str);
		}
		
		System.out.println("ite.next : " + lte.hasNext());
		
	}
	
	
	
	
	
	
	
	
}
