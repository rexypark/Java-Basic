package com.mystudy.stringbuilder;

public class Ex_02_String_exam2 {

	public static void main(String[] args) {
	/* String 사용 실습
	문자열 : "홍길동","이순신","이순신","을지문덕","김유신","연개소문","Tom","TOM"
	1. 위의 문자열 값을 저장할 수 있는 문자열 배열(names) 변수를 선언하고 입력
	2. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력
	   출력 예) 홍길동,이순신,이순신,을지문덕....
	3. 배열에 있는 데이타의 첫 글자만 출력-구분자 콤마(,) 사용 한 라인에 출력
	   출력 예) 홍,이,이,을,김,연,T,T...
	4. 이름의 글자수가 4글자 이상인 이름을 검색해서 "인덱스번호:이름" 형태로 출력
	   예) 3:을지문덕
	5. 이름이 같은 데이터를 "인덱스번호:이름=인덱스번호:이름" 형태로 출력
	   예) 1:이순신=2:이순신
	(기타) 이름 비교시에는 대소문자 구분 없이 비교처리(Tom, TOM 은 같다)
	========================================================= */
	//"홍길동","이순신","이순신","을지문덕","김유신","연개소문","Tom","TOM"
	String[] names = {"홍길동","이순신","이순신","을지문덕",
			"김유신","연개소문","Tom","TOM"};
	
	//1 
	StringBuffer sb = new StringBuffer(""); 
	for (int i = 0; i < names.length; i++) {
		if (i == names.length - 1) {
			sb.append(names[i]);
			break;
		}
		sb.append(names[i] + ", ");
		
	}
	System.out.println(sb);
	System.out.println();
	
	//3 
	 
	for (int i = 0; i < names.length; i++) {
		if (i == names.length - 1) {
			System.out.print(names[i].substring(0,1));
			break;
		}
		System.out.print(names[i].substring(0,1) + ", ");
		
	}
	
	System.out.println();
	System.out.println();
	

	//4 	인덱스번호:이름
	for (int i = 0; i < names.length; i++) {
		
		if (names[i].length() == 4) {
		 
			System.out.println(i + ":" + names[i]);
		}
		 
	}
	
	System.out.println();
	//5 인덱스번호:이름=인덱스번호:이름
		
	for (int i = 0; i < names.length; i++) {
		for (int j = i + 1; j < names.length; j++)	
			if (names[i].equalsIgnoreCase(names[j]) && i != j) {
			 
				System.out.println(i + " : " + names[i] + " = " + j + " : " + names[j]);
			}
			 
		}
		
	
	
	}
}
