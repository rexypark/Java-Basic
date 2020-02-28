package com.mystudy.wrapper;

public class Ex_02_Wrapper_Character {
	public static void main(String[] args) {
		// Character Ŭ����

		char ch = 'a';
		char ch2 = 1;
		char ch3 = '��';
		// 
		System.out.println(Character.isAlphabetic(ch)); // true
		System.out.println(Character.isAlphabetic(ch2));// false 
		System.out.println(Character.isAlphabetic(ch3));// true
		
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		
		System.out.println(Character.isLetter(ch));     // isLetter �����ΰ� >  true
		System.out.println(Character.isDigit('1'));     // isDigit ����(char)�ΰ� >  true
		System.out.println(Character.isUpperCase('A')); // isUpperCase �빮���ΰ� > true
		System.out.println(Character.isLowerCase('A')); // isLowerCase �ҹ����ΰ� > false
		System.out.println(Character.isLowerCase('a')); // isLowerCase �ҹ����ΰ� > true
		System.out.println(Character.isWhitespace(' '));// isWhiteSpace �����ΰ� > true
		
		System.out.println("===================");
		char[] chs = {'��', 'a', ' ', 'A', '+', '0'};
		for (int i = 0; i < chs.length; i++) {
			System.out.print(chs[i] + " : ");
			if (Character.isDigit(chs[i])) {
				System.out.println("����");
			} 
			
							// isWhitespace �����ΰ�
			else if (Character.isWhitespace(chs[i])) {
				System.out.println("����");
							// isUpperCase �빮���ΰ�
			} else if (Character.isUpperCase(chs[i])) {
				System.out.println("�빮��");
				
							// isLowerCase �ҹ����ΰ�							
			} else if (Character.isLowerCase(chs[i])) {
				System.out.println("�ҹ���");
				
							// isLetter �����ΰ�
			} else if (Character.isLetter(chs[i])) {
				System.out.println("����");
				
							// isDefined �����ڵ��ΰ�
			} else if (Character.isDefined(chs[i])) {
				System.out.println("�����ڵ��Դϴ�.");
			}
			
		}
	}
}
