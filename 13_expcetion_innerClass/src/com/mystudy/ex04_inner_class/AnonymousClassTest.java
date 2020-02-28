package com.mystudy.ex04_inner_class;

interface TestInter{
	int DATA = 100;
	void printData();
	
}

class TestInterImpl implements TestInter {
	public void printData() {
		System.out.println("printData() >>>> ������ �޼ҵ�");
	}
	
	
}

public class AnonymousClassTest {
	void TestInter () {
		//�͸�Ŭ���� : �̸��� ��� �̸� ���� �Ұ�
		(new TestInter() {
			public void printData() {
				System.out.println("�͸� ������");
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
