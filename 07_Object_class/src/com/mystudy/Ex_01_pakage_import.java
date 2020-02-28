/*
	pakage선언문 : 선택항목이지만 기본적으로 사용
	패키지 구문 : java 파일의 맨 앞쪽(윗쪽)에 위치하여 한번만 작성
	자바(class) 파일의 위치를 나타냄
	일반적인 작성 규칙 : 회사의 도메인명을 반대로 사용
	작성예 ) com.bitcamp
 */
package com.mystudy;

//import 선언문 : 선택항목이지만 일반적으로 사용
//클래스의 위치를 명시적으로 지정하는 역할
//(java.lang 패키지 이외의 패키지에 있는 타입 사용시)
import java.util.Scanner;

//클래스 선언문 : 필수 항목
public class Ex_01_pakage_import {
	
	public static void main(String[] args) {
		System.out.println("Hello World~");
		java.util.Scanner scan = new Scanner(System.in);
		System.out.println(">> 인사말 : ");
		String hello = scan.nextLine();
		System.out.println(">> 인사말 : " + hello);
		
		
	}
}

