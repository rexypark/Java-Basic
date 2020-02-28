package com.mystudy.ex01_ran_cal;

import java.util.Calendar;
import java.util.Random;

public class RandomExam3 {
	public static void main(String[] args) {
		// 실습 > 오늘 당신의 행운 지수 알아보기(0~100)
		// Math.random(), Random 사용해서 행운지수 값 만들기
		// 실행결과
		// 2019년 10월 23일 당신의 행운지수(0~100)은 77입니다.
		
		
		Random rand = new Random();
		int luckNum_Random = rand.nextInt(101);
		int luckNum_Math = (int)(Math.random()*101);
				
		//년, 월, 일 구하기
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);

		
		
		System.out.println("Random 사용");
		System.out.println("-------------------------------");
		System.out.println(year + "년 " + month + " 월" + date + "일");
		System.out.println("당신의 행운지수(0 ~ 100)은 " + luckNum_Random + "입니다.");
		
		System.out.println();
		System.out.println();
		
		System.out.println("Math.random 사용");
		System.out.println("-------------------------------");
		System.out.println(year + "년 " + month + "월 " + date + "일");
		System.out.println("당신의 행운지수(0 ~ 100)은 " + luckNum_Math + "입니다.");
		
		
	}
}
