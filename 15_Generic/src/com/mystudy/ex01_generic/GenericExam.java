package com.mystudy.ex01_generic;

class Box {
	Object obj; // �ʵ�(�ɹ�) ������ Ÿ�� Object
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
	
	// ���׸�(Generic) : �÷����� � ��ü��� �̷�������� ǥ���ϴ� ��üŸ���� �ǹ�
	// ���׸� ���� : <��ü�� �ڷ���>, <>
	// API -> <T> : ��ü�� �ڷ��� (Type)  //  <E> : �ϳ��� ���(�� ��ü �ϳ��� �ǹ�)[Element]
	//   > Map���� : <K,V> K�� key Ű��, V�� value�� 
	// ==========================================
	
	// �÷���(Collection) �����ӿ�ũ :  ��ü���� ��Ƽ� ó���� �� ������ �������̽��� Ŭ������ 
	//								����ؼ��۾�
	
	// Set<E>,List<E>, Queue<E>, Map<K, V>, Stack<E>
	public static void main(String[] args) {
		
	
		Box box = new Box();
		box.setObj("���ڿ� String");
		box.setObj(100);
		box.setObj(new Integer(1000));
		box.setObj(100);
		
		box.getObj();
		
		Integer integer = (int)box.getObj();
		System.out.println(integer);
	
		
		BoxG<String> boxG = new BoxG<String>();
		
		
		
	}
}
