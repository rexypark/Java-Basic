package com.mystudy.ex01_generic;


class BoxT<T> {
	T obj;
	void setObj(T obj) { this.obj = obj; }
	T getObj() { return this.obj; }
}


public class GenerricWhleCard {
	public static void main(String[] args) {
		
		// 제네릭 (Generic) : 와일드카드(Whildcard - 대표문자)
		// 1. <?> : 모든타입(객체) 자료형에 대한 대표문자를 의미
		// 2. <? extends 자료형> : 자료형을 상속받은 하위클래스(sub), 클래스타입사용
		// 3. <? super 자료형> : 자료형의 상위클래스(super) 타입 사용
		//------------------
		
		BoxT<String> box1 = new BoxT<>();
		box1.setObj("문자열");
		
		
		BoxT<String> box2 = new BoxT<>();
		box2.setObj("100");
		
		System.out.println("----------------------------------");
		BoxT<?> box3 = new BoxT<String>();
		box3 = new BoxT<Integer>();
		box3 = new BoxT<StringBuilder>();
		
		//<? exteds 자료형> : 자료형 포함 sub타입 (extends 한 타입들 사용 가능)
		BoxT<? extends Number> box10 = null;
		box10 = new BoxT<Number>();
		box10 = new BoxT<Integer>();
		box10 = new BoxT<Double>();
//		box10 = new BoxT<String>();
		
		// --------------------------------
		BoxT<? super Number> box20 = null;
		box20 = new BoxT<Number>();
		box20 = new BoxT<Object>();
		
		
		
		
	}
}
