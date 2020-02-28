package com.mystudy.ex04_inner_class;

interface TestInter{
	int DATA = 100;
	void printData();
	
}

class TestInterImpl implements TestInter {
	public void printData() {
		System.out.println("printData() >>>> 구현한 메소드");
	}
	
	
}

public class AnonymousClassTest {
	void TestInter () {
		//익명클래스 : 이름이 없어서 이름 재사용 불가
		(new TestInter() {
			public void printData() {
				System.out.println("익명 데이터");
			}
		}).printData();
	}

	
	public static void main(String[] args) {
		TestInterImpl imp = new TestInterImpl();
		imp.printData();
		System.out.println("---------------");
		new TestInterImpl().printData();
		AnonymousClassTest an = new AnonymousClassTest();
		an.TestInter();
		
		
		
	}
}
