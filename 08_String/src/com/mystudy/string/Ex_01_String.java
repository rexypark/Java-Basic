package com.mystudy.string;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Ex_01_String { 
	public static void main(String[] args) {
		
	/* String Ŭ���� : ���ڿ� ����, ó���ϱ� ����Ŭ����
	 ������� 2����
	String str = "ȫ�⵿"; �⺻ ������ Ÿ�� ��� ������� ��� ����
	String str = new String("ȫ�浿);  // ��ü����(�ν��Ͻ�) ���� ���
		
	*/

	String str1 = "Java";
	String str2 = "World";
	String strObj = new String("Java"); // ��ü(�ν��Ͻ�) ����
	String strObj2 = new String("World"); // 
	System.out.println("str1 : " + str1);
	System.out.println("str2 : " + str2);
	
	String str11 = "Java";
	String str22 = "Java";
	System.out.println("===============");
	
	
	// == : ���� ������ ���� Ȯ��, ���ϰ�ü ����(��ü �ּҰ�) 
	System.out.println("str1 == str11 : " + (str1 == str11));
	

	System.out.println("--- str1 vs ��ü���� srtObj1 �� ---");
	
	System.out.println("str1 : " + str1);
	System.out.println("strObj1 : " + strObj);
	
	
	
	System.out.println("str1 == strObj : " + (str1 == strObj));
	
	System.out.println();
	// equals() : �����ϰ� �ִ� ��(data) ��(���ڿ� ��)
	// �ٸ� �ּҰ��� ���� ������ equals�� 
	System.out.println("--- equals()�� ---");
	System.out.println("str1.equals(str11) : " + str1.equals(str11));
	System.out.println("str1.equals(strObj) : " + str1.equals(strObj));
	
	
	System.out.println();
	System.out.println("--- equalsIgnoreCase() ---");
	// ���� ��ҹ��� �� 
	// �ΰ��� �����ɷ� equalsIgnoreCase
	String a = "A b C";
	String b = "A B C";
	String c = "a C b";
	System.out.println("a : " + a);
	System.out.println("b : " + b);
	System.out.println("a.equalsIgnoreCase(b) : " + a.equalsIgnoreCase(b));
	System.out.println("a.equalsIgnoreCase(c) : " + a.equalsIgnoreCase(c));
	
	System.out.println("=======================");
	String strObj3= new String("Java"); // �ٸ������� ����
	String strObj4= new String("Java");
	
	System.out.println(strObj3);
	
	// ���� �ּ� ����(������ ����)
	// ���� ����� �ּҰ��� ���� �Ҵ�Ǿ� �ּҰ��� ��������.
	strObj3 = strObj4;
	System.out.println("strObj3 = strObj4");
	System.out.println("strObj3 == strObj4 : " + (strObj3 == strObj4));
	
	System.out.println("========================");
	System.out.println();
	System.out.println("---- concat() ----");
	// ü�̴�(chainning) ���
	String h = "Hello ";
	String j = "Java ";
	String w = "World ";
	int i = 1;
	
	System.out.println(h+j+w);
	System.out.println(h.concat(j).concat(w));
	}
}
