package com.mystudy.ex03.sungjuk;

public class SungjukTest {
	public static void main(String [] args) {
		//StudentVO 타입의 데이터 1개 생성 후 국어점수, 영어점수 변경
		System.out.println("--- main() 시작 ---");
		StudentVO std = new StudentVO("rexypark", 100,90,80);
		System.out.println(std.toString());
		
		try {
		std.setEng(999);
		} catch(SungJukProcessException e) {
			System.out.println("[예외발생] : " + e.getMessage());
		}
		System.out.println(std.toString());
		
		System.out.println("--- main() 종료 ---");
		
		
		
	}
}
