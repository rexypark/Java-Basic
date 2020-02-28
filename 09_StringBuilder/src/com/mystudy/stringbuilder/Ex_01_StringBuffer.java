package com.mystudy.stringbuilder;

public class Ex_01_StringBuffer {
	public static void main(String[] args) {
		// StringBuffer 클래스
		String str1 = "Hello";
		String str2 = new String("Hello");
		System.out.println(str1);
		
		System.out.println();
		
		// String 처럼  선언불가   ->  StringBuffer stb = "Java"(x) 
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
		
		// 문자열 뒤집기
		System.out.println("sb.reverse() : " + sb.reverse());
		System.out.println("sb.reverse() : " + sb.reverse());
		System.out.println();
		
		System.out.println("====== delete(), insert(), replace() ======");
		// sb = Java Hello
		
		// "Java "DELETE
		System.out.println(sb.delete(0, 5));
		System.out.println();
		
		
		//변수명.insert(삽입할 인덱스 번호, 삽입할 문자)
		System.out.println(sb.insert(0, "Java "));
		System.out.println();
		
		
		//변수명.replace(대체할 문자 시작인덱스, 대체할 마지막 문자 인덱스, 대체할 문자)
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

		// StringBuffer sb2 = new StringBuffer(정수값); 
		// > 파라메터에 정수값을 넣어주면 해당 정수값 크기의 String을 만들어 준다
		StringBuffer sb2 = new StringBuffer(100);
		System.out.println("sb2.capacity() : " + sb2.capacity());
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println();
		
		sb2.append("안녕하세요").append(" 반갑습니다!!");
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
		
		//append()는 삽입이 인덱스 제일 마지막에 삽입된다.
		System.out.println(("--- sb2 >> append() ---"));
		sb2.append(" 자바 공부중 ~~");
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
