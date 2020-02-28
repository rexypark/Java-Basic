package com.mystudy.split;

import java.util.StringTokenizer;

public class Ex_01_StringTokenizer {

	public static void main(String[] args) { 
	//	StringTokenizer st = new StringTokenizer("this is a test");
	//    while (st.hasMoreTokens()) {
	//        System.out.println(st.nextToken());
	//    }
	//hasMoreTokens 토큰이 더있는지 물음
	
	//String.split() vs StringTokenizer
	// split 하게 되면 배열 타입을 반환한다.
	System.out.println("==== split() ====");
	String str = new String("사과,배,복숭아,,포도");
	String[] strSplit = str.split(",");
	System.out.println("strSplit의 크기 : " + strSplit.length);
	System.out.println();
	for (int i = 0; i < strSplit.length; i++) {
		System.out.println("-"+strSplit[i]+"-");
		}
	System.out.println();
	
	// 개선된 for문(다른언어 : forEach문)
	// for(데이터타입 변수명 : 집합객체) {}
	// 
	System.out.println("==== 개선된 for문 ====");
	String str3 = "";
	
	
	for(String str2 : strSplit) {
		str3 += str2;
		System.out.println(str2);
	}
	System.out.println(str3);
	
	
	int idx = 0;
	for (String str2 : strSplit) {
		
		System.out.println(idx + " " + str2);
		idx++;
	}
	
	
	
	// str : 사과,배,복숭아,,포도
	// split으로 슬라이싱 했을 때는 스페이스가 없는 데이터에도 
	// 잘라 데이터를 카운팅 했지만 
	// StringTokenizer에서는 스페이스가 아닌 아무데이터가 없는 경우
	// 해당 데이터는 사용 되지 않는다.
	System.out.println("==== StringTokenizer 사용 ====");
	System.out.println("str : " + str);
	StringTokenizer stn = new StringTokenizer(str,",");
	
	System.out.println("stn.countTokens() : " + stn.countTokens());
	System.out.println("stn.countTokens() : " + stn.countTokens());
	System.out.println();
	System.out.println(stn.hasMoreTokens());
	
	while(stn.hasMoreTokens()) {
		String token = stn.nextToken();
		System.out.println("-" + token + "-");
		
	}
	System.out.println("==== for문 사용 토큰값 조회 ====");
	stn = new StringTokenizer(str,",");
	
	
	int tokenNo = stn.countTokens();
	System.out.println("저장된 토큰 갯수 : " + stn.countTokens());
	for(int i = 0; i < stn.countTokens(); i++) {
		
		String token = stn.nextToken();
		System.out.println((i+1) + " : " + token);
		
	}
	
	System.out.println(stn.nextToken());
	System.out.println(stn.nextToken());
	System.out.println(stn);
	
	// 주의사항 : 2개 이상의 토큰을 한번에 사용하지 말것
	// 
	
	}
}
