package com.mystudy.ex01_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 라이브러리에 ArrayList라는 클래스가 있어 만약 클래스명을 동명으로 하면
// 해당 라이브러리를 사용 할 수 없다.
public class ArrayListExam {
	public static void main(String[] args) {
		//  List 계열 : ArrayList - 배열의 속성과 List 속성을 가짐
		// 	- List 인터페이스를 상속 구현(implements)한 클래스
		//	- List 인터페이스를 상속 확장(extends)해서 인터페이스
		
		//ArrayList 변수명 = new ArrayList();
		//리스트변수.add(val);
		//리스트변수.remove(val);   or   리스트변수.remove(index, val);
		
		
		
		
		ArrayList list = new ArrayList();
		ArrayList list3 = new ArrayList();
		
		list.add(new Integer(5));
		list.add(1);
		
		list.add(new Integer(5));
		list.add(new Integer(6));
		
		System.out.println(list);
		System.out.println(list.size());
		
		// 값의 정렬을 서로 바꾸는 형태
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		list.add(3,100);  // (a, b)  > a : 인덱스위치 / b : 넣을 값
		System.out.println("3번 인덱스에 100 추가 후 : " + list);
		
		list.set(3, 999); // 해당 인덱스 위치의 값을 수정한다.
		System.out.println("3번 인덱스에 999 추가 후 : " + list);
		
		System.out.println("remove(3) 전 : " + list);
		list.remove(3);
		System.out.println("remove(3) 후 : " + list);
		
//		list.remove(new Integer(5)); // 숫자 Integer 5 후
//		list.remove(new Integer(5)); // 숫자 Integer 5 후
		System.out.println(list); 
		
		Object object = list;
		
		System.out.println("0번의 인덱스 값 " + object);
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
		System.out.println("첫번재 데이터 조회 : " + list2.get(0));
		System.out.println("첫번재 데이터 조회 : " + list2.get(list2.size()-1));
		
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
		//실습 : 반복문(for)을 사용해서 list2에 있는 전체 데이터 삭제
		
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
		// null 여부 확인
		if (list == null || list.size() < 1) {
			System.out.println(title + " : null");
			return;
		}
		if (list.size() == 0) {  //null은 아니지만 데이터가 없음?
			System.out.println(title + " : 데이터 건수 0");
			return;
		}
		System.out.print(title + " : " + list.get(0));

		//size가 1이면 동작x
		for (int i = 1; i<list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
		
	}
}
