package com.mystduy.ex03_abstract_class;

/* �߻�Ŭ���� : abstract class
      �����޼ҵ�� �߻�޼ҵ尡 �Բ� �ִ� Ŭ����(�߻�޼ҵ尡 �ϳ��� ������)
      �߻�Ŭ������ ��ü������ �� �� ����.
 
 */



abstract class Animal {
	String name = "����"; //���� ����
	int legCnt;  //�ٸ� ����
	
	void eat() {
		System.out.println(">> �Դ´�");
	}
	
	void sleep() {
		
		System.out.println(">> �����ܴ�");
		
	}
	
	// �߻� Ŭ����
	abstract void sound() ;
	


	
}
