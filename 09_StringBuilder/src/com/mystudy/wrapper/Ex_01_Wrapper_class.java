package com.mystudy.wrapper;

public class Ex_01_Wrapper_class {

	public static void main(String[] args) {
		
		// Wrapper class : �⺻ ������ Ÿ���� Ŭ���� Ÿ�Ե��� ��Ī
		// �⺻������ Ÿ�� : ��ü �ҹ���, char, int ....
		// boolean, char, byte, short, int, long, float, double
		// Wrapper class : �⺻������Ÿ���� ù���ڸ� �빮�ڷ� �ۼ�
		// ����  >>> char -> Character, int -> Integer
		// Boolean, Character, Byte, Short, Integer, Long, Float, Double
		
		int num = 100;
		System.out.println("num : " + num);
		
		// Integer intNum; -> ��밡��
		Integer intNum = new Integer(100);
		System.out.println("intNum : " + intNum);
		intNum = new Integer("100");
		System.out.println("intNum : " + intNum);
		if(num == intNum) {
			System.out.println("����");
		}
		
		// ����ȯ
		num = intNum; // int > Integer
		intNum = 900; // Integer > int
		
		System.out.println("num : "  + num);
		System.out.println("intNum : "  + intNum);
		
		System.out.println("���� int �ִ밪 : " + Integer.MAX_VALUE);
		System.out.println("���� int �ּҰ� : " + Integer.MIN_VALUE);
		
		
		num = Integer.parseInt("999"); //int <- String
		intNum = Integer.valueOf("999"); //int <- String
		
		System.out.println("num + 1 : "  + (num + 1));
		System.out.println("intNum + 1 : "  + (intNum + 1));
		
		System.out.println("---- Boolean ----");
		Boolean bool = true;
		bool = new Boolean(true);
		bool = new Boolean("true");
		System.out.println("bool : " + true);
		if(bool) {
			System.out.println("bool ���� boolean true");
		}
		
		bool = new Boolean("true1");
		System.out.println("bool : " + bool);
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		System.out.println("------- String -> Boolean --------");
		
		bool = Boolean.valueOf("true");
		System.out.println("Boolean.valueOf(\"true\") : " + bool);
		bool = Boolean.valueOf("TrUe");
		System.out.println("Boolean.valueOf(\"TrUe\") : " + bool);
		
		
		Float f = 10.5f;
		f = new Float(12.5f);
		f = new Float("12.5f");
		System.out.println(new Float("12.5f"));
		
		
		
	}
}
