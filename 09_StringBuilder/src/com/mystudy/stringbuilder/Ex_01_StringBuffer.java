package com.mystudy.stringbuilder;

public class Ex_01_StringBuffer {
	public static void main(String[] args) {
		// StringBuffer Ŭ����
		String str1 = "Hello";
		String str2 = new String("Hello");
		System.out.println(str1);
		
		System.out.println();
		
		// String ó��  ����Ұ�   ->  StringBuffer stb = "Java"(x) 
		StringBuffer sb = new StringBuffer("Java");
		System.out.println("sb : " + sb);
		System.out.println("sb.toString() : " + sb.toString());
		
		// capacity()
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println("sb.length() : " + sb.length());
		System.out.println();
		
		
		System.out.println("sb.append()");
		System.out.println("------------------");
		
		sb.append(" Hello");
		System.out.println("sb : " +sb);
		System.out.println();
		
		// ���ڿ� ������
		System.out.println("sb.reverse() : " + sb.reverse());
		System.out.println("sb.reverse() : " + sb.reverse());
		System.out.println();
		
		System.out.println("====== delete(), insert(), replace() ======");
		// sb = Java Hello
		
		// "Java "DELETE
		System.out.println(sb.delete(0, 5));
		System.out.println();
		
		
		//������.insert(������ �ε��� ��ȣ, ������ ����)
		System.out.println(sb.insert(0, "Java "));
		System.out.println();
		
		
		//������.replace(��ü�� ���� �����ε���, ��ü�� ������ ���� �ε���, ��ü�� ����)
		System.out.println(sb.replace(0, 5, "Rexypark "));
		System.out.println();
		
		System.out.println(sb.insert(0, "How have you been? "));
		
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println("sb.length() : " + sb.length());
		System.out.println();
		
		
		//===================================
		System.out.println(("trimToSize()"));
		sb.trimToSize();
		
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println("sb.length() : " + sb.length());
		System.out.println();
		
		System.out.println("==================================");
		System.out.println();

		// StringBuffer sb2 = new StringBuffer(������); 
		// > �Ķ���Ϳ� �������� �־��ָ� �ش� ������ ũ���� String�� ����� �ش�
		StringBuffer sb2 = new StringBuffer(100);
		System.out.println("sb2.capacity() : " + sb2.capacity());
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println();
		
		sb2.append("�ȳ��ϼ���").append(" �ݰ����ϴ�!!");
		System.out.println("sb2 : " + sb2);
		System.out.println();
		System.out.println("sb2.capacity() : " + sb2.capacity());
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println();
		
		System.out.println(("--- sb2 >> trimToSize() ---"));
		sb2.trimToSize();
		
		System.out.println("sb2.capacity() : " + sb2.capacity());
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println();
		
		//append()�� ������ �ε��� ���� �������� ���Եȴ�.
		System.out.println(("--- sb2 >> append() ---"));
		sb2.append(" �ڹ� ������ ~~");
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.capacity() : " + sb2.capacity());
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println();
		
		System.out.println("--- sb2 >> setLength() ---");
		sb2.setLength(5);
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.capacity() : " + sb2.capacity());
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println();
	
		
	}
}
