package com.mystudy.ex01_generic;

class Box {
	Object obj; // 필드(맴버) 변수의 타입 Object
	void setObj(Object obj) {
		this.obj = obj;
	}
	
	Object getObj() {
		return obj;
	}
	
}


class BoxG<T> {
	T obj;
	void setObj(T obj) { }
	T getobj() {return this.obj; }
}



public class GenericExam {
	
	// 제네릭(Generic) : 컬렉션이 어떤 객체들로 이루어졌는지 표시하는 객체타입을 의미
	// 제네릭 형태 : <객체의 자료형>, <>
	// API -> <T> : 객체의 자료형 (Type)  //  <E> : 하나의 요소(즉 객체 하나를 의미)[Element]
	//   > Map형식 : <K,V> K는 key 키값, V는 value값 
	// ==========================================
	
	// 컬렉션(Collection) 프레임워크 :  객체들을 모아서 처리할 때 정해진 인터페이스와 클래스를 
	//								사용해서작업
	
	// Set<E>,List<E>, Queue<E>, Map<K, V>, Stack<E>
	public static void main(String[] args) {
		
	
		Box box = new Box();
		box.setObj("문자열 String");
		box.setObj(100);
		box.setObj(new Integer(1000));
		box.setObj(100);
		
		box.getObj();
		
		Integer integer = (int)box.getObj();
		System.out.println(integer);
	
		
		BoxG<String> boxG = new BoxG<String>();
		
		
		
	}
}
