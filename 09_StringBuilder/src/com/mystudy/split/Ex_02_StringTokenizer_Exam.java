package com.mystudy.split;

import java.util.StringTokenizer;

public class Ex_02_StringTokenizer_Exam {
	public static void main(String[] args) {
		/* 문자열 다루기
		0.문자열 데이터
		  String str1 = "홍길동 이순신   이순신 Tom 홍길동";
		  String str2 = "    TOM    을지문덕 김유신 연개소문";
		1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로 만들고,
		2-1. sb의 문자열을 빈칸(" ")을 구분자로 잘라서(이름만 추출) 화면 출력(데이타확인)
		     (String.split() 또는 StringTokenizer 클래스 사용)
		      예) 홍길동 이순신 이순신 Tom 홍길동 TOM...
		2-2. 문자열을 저장할 수 있는 배열변수(names)에 저장
		3. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		      예) 홍길동,이순신,이순신,Tom,홍길동,TOM...   
		    append > stringbuilder의 변수값 출력
		    
		4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		      예) 홍,이,이,T,홍,T,을... 
		      
		5. 배열의 문자열중 이름의 글자수가 4 이상인 값을 "인덱스번호:이름" 출력
		      예) 인덱스번호:을지문덕
		********************************/
		String str1 = "홍길동 이순신   이순신 Tom 홍길동";
		String str2 = "    TOM    을지문덕 김유신 연개소문";
		
		//1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로 만들고,
		StringBuilder sb = new StringBuilder("");
		sb.append(str1).append(str2);
		
		System.out.println("== str1 + str2 ==");
		System.out.println(sb);
		
		
		// strToken에 sb(StringBuilder)를 " "로 split하여 StringTokenizer타입으로 변환하여 저장한다.
		StringTokenizer strToken = new StringTokenizer(sb.toString()," ");
		
		
		int strToken_len = strToken.countTokens();
		// names에 strToken의 크기만큼의 배열을 생성
		String [] names = new String[strToken_len];
		System.out.println();
		
		System.out.println("== StringTokeniser ==");
		// split한 데이터가 출력되고 names배열에 저장된다.
//		
//		while(strToken.hasMoreTokens()) {
//			System.out.print(strToken.nextToken() + " ");
//		}
//		System.out.println();
//		
		for (int i = 0; i < strToken_len; i++) { 
			String tempString = "";
			
			tempString = strToken.nextToken();
			System.out.print(tempString + " ");
			names[i] = tempString;
			
		}

	
		
		System.out.println();
		System.out.println();
		
		
		// sb, sb_FNam > 빈 StringBuilder 선언 (풀네임, 성)
		sb = new StringBuilder("");
		StringBuilder sb_FName = new StringBuilder("");
		System.out.println("== names Array ==");
		int idx = 0;
		for(String a : names) {
			//if (idx == 0) {System.out.print(", " + output)}
			
			if (idx == strToken_len-1) { 
				sb.append(a);
				sb_FName.append(names[idx].substring(0,1));
				break;
			}
			sb.append(a+", ");
			sb_FName.append(names[idx].substring(0,1) + ", ");
			idx++;
		}
		
		System.out.println("sb : " + sb);
		System.out.println("sb_FName : " + sb_FName);
		System.out.println();
		
		
		System.out.println("== 이름 4글자 이상 ==");
		idx = 0;
		for (String b : names) {
			
			if (b.length() == 4) {
				
				System.out.println(idx + " : " + b);
				
			}
			idx++;
			
		}
		
		System.out.println();
		
		System.out.println("=== split() ===");
		System.out.println();
		String str3 = "";
		str3 = str1 + str2;
		System.out.println(str3);
		System.out.println();
		String[] strArray = str3.split(" ");

		System.out.println();

		String[] strArrayPre = new String[strArray.length];
		
		idx = 0;
		for (String st1 : strArray) {
			if(!st1.equals("")) {
				strArrayPre[idx] = st1;
				idx++;
			}
		}
	
		
		for (String st2 : strArrayPre) {
			if (st2 != null) { 
			System.out.print(st2 + " ");
			}
		}
		
		
		
		
	}
}
