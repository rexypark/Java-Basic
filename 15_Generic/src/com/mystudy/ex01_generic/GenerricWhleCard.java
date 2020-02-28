package com.mystudy.ex01_generic;


class BoxT<T> {
	T obj;
	void setObj(T obj) { this.obj = obj; }
	T getObj() { return this.obj; }
}


public class GenerricWhleCard {
	public static void main(String[] args) {
		
		// ���׸� (Generic) : ���ϵ�ī��(Whildcard - ��ǥ����)
		// 1. <?> : ���Ÿ��(��ü) �ڷ����� ���� ��ǥ���ڸ� �ǹ�
		// 2. <? extends �ڷ���> : �ڷ����� ��ӹ��� ����Ŭ����(sub), Ŭ����Ÿ�Ի��
		// 3. <? super �ڷ���> : �ڷ����� ����Ŭ����(super) Ÿ�� ���
		//------------------
		
		BoxT<String> box1 = new BoxT<>();
		box1.setObj("���ڿ�");
		
		
		BoxT<String> box2 = new BoxT<>();
		box2.setObj("100");
		
		System.out.println("----------------------------------");
		BoxT<?> box3 = new BoxT<String>();
		box3 = new BoxT<Integer>();
		box3 = new BoxT<StringBuilder>();
		
		//<? exteds �ڷ���> : �ڷ��� ���� subŸ�� (extends �� Ÿ�Ե� ��� ����)
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
