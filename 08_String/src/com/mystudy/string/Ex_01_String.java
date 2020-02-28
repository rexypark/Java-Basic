package com.mystudy.string;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Ex_01_String { 
	public static void main(String[] args) {
		
	/* String 클래스 : 문자열 저장, 처리하기 좋은클래스
	 사용형식 2갸지
	String str = "홍기동"; 기본 데이터 타입 사용 방식으로 사용 가능
	String str = new String("홍길동);  // 객체생성(인스턴스) 생성 사용
		
	*/

	String str1 = "Java";
	String str2 = "World";
	String strObj = new String("Java"); // 객체(인스턴스) 생성
	String strObj2 = new String("World"); // 
	System.out.println("str1 : " + str1);
	System.out.println("str2 : " + str2);
	
	String str11 = "Java";
	String str22 = "Java";
	System.out.println("===============");
	
	
	// == : 동일 데이터 여부 확인, 동일객체 여부(객체 주소값) 
	System.out.println("str1 == str11 : " + (str1 == str11));
	

	System.out.println("--- str1 vs 객체생성 srtObj1 비교 ---");
	
	System.out.println("str1 : " + str1);
	System.out.println("strObj1 : " + strObj);
	
	
	
	System.out.println("str1 == strObj : " + (str1 == strObj));
	
	System.out.println();
	// equals() : 저장하고 있는 값(data) 비교(문자열 비교)
	// 다른 주소값을 가진 값들은 equals의 
	System.out.println("--- equals()비교 ---");
	System.out.println("str1.equals(str11) : " + str1.equals(str11));
	System.out.println("str1.equals(strObj) : " + str1.equals(strObj));
	
	
	System.out.println();
	System.out.println("--- equalsIgnoreCase() ---");
	// 영어 대소문자 비교 
	// 두개를 같은걸로 equalsIgnoreCase
	String a = "A b C";
	String b = "A B C";
	String c = "a C b";
	System.out.println("a : " + a);
	System.out.println("b : " + b);
	System.out.println("a.equalsIgnoreCase(b) : " + a.equalsIgnoreCase(b));
	System.out.println("a.equalsIgnoreCase(c) : " + a.equalsIgnoreCase(c));
	
	System.out.println("=======================");
	String strObj3= new String("Java"); // 다른번지로 저장
	String strObj4= new String("Java");
	
	System.out.println(strObj3);
	
	// 동일 주소 참조(데이터 공유)
	// 덮어 씌우면 주소값이 같게 할당되어 주소값이 같아진다.
	strObj3 = strObj4;
	System.out.println("strObj3 = strObj4");
	System.out.println("strObj3 == strObj4 : " + (strObj3 == strObj4));
	
	System.out.println("========================");
	System.out.println();
	System.out.println("---- concat() ----");
	// 체이닝(chainning) 기법
	String h = "Hello ";
	String j = "Java ";
	String w = "World ";
	int i = 1;
	
	System.out.println(h+j+w);
	System.out.println(h.concat(j).concat(w));
	}
}
