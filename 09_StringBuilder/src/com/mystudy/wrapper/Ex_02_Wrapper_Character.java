package com.mystudy.wrapper;

public class Ex_02_Wrapper_Character {
	public static void main(String[] args) {
		// Character 클래스

		char ch = 'a';
		char ch2 = 1;
		char ch3 = 'ㅎ';
		// 
		System.out.println(Character.isAlphabetic(ch)); // true
		System.out.println(Character.isAlphabetic(ch2));// false 
		System.out.println(Character.isAlphabetic(ch3));// true
		
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		
		System.out.println(Character.isLetter(ch));     // isLetter 문자인가 >  true
		System.out.println(Character.isDigit('1'));     // isDigit 숫자(char)인가 >  true
		System.out.println(Character.isUpperCase('A')); // isUpperCase 대문자인가 > true
		System.out.println(Character.isLowerCase('A')); // isLowerCase 소문자인가 > false
		System.out.println(Character.isLowerCase('a')); // isLowerCase 소문자인가 > true
		System.out.println(Character.isWhitespace(' '));// isWhiteSpace 공백인가 > true
		
		System.out.println("===================");
		char[] chs = {'한', 'a', ' ', 'A', '+', '0'};
		for (int i = 0; i < chs.length; i++) {
			System.out.print(chs[i] + " : ");
			if (Character.isDigit(chs[i])) {
				System.out.println("숫자");
			} 
			
							// isWhitespace 공백인가
			else if (Character.isWhitespace(chs[i])) {
				System.out.println("공백");
							// isUpperCase 대문자인가
			} else if (Character.isUpperCase(chs[i])) {
				System.out.println("대문자");
				
							// isLowerCase 소문자인가							
			} else if (Character.isLowerCase(chs[i])) {
				System.out.println("소문자");
				
							// isLetter 문자인가
			} else if (Character.isLetter(chs[i])) {
				System.out.println("문자");
				
							// isDefined 유니코드인가
			} else if (Character.isDefined(chs[i])) {
				System.out.println("유니코드입니다.");
			}
			
		}
	}
}
