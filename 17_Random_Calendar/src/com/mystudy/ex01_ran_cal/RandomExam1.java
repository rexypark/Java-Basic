package com.mystudy.ex01_ran_cal;

import java.util.Random;

public class RandomExam1 {
	
	public static void main(String[] args) {
		/* Random : 난수(임의의 수)를 생성하는 클래스
		정수추출 : nextInt() - int 타입의 난수 발생
				nextInt(10) - 0~9범위의 정수형 난수 발생
				nextLong() - long 타입의 난수 발생
				
		실수추출 : nextFloat() - 실수형 float 타입 난수 발생
				nextDouble() - 실수형 double 타입의 난수 발생
		논리형 추출 : nextBoolean() - true, false 둘 중 하나 발생
		*/
		
		 Random rand = new Random();
//		 for (int i = 0; i < 4; i++) {
//			 System.out.println(rand.nextBoolean());
//		 }
		 
		 System.out.println("-----------nextInt()------------");
		 for (int i = 0; i < 100; i++) {
			 System.out.println((int)(Math.random()*101));
		 }
		 
//		 System.out.println("-----------nextFloat()------------");
//		 for (int i = 0; i < 4; i++) {
//			 System.out.println(rand.nextFloat());
//		 }
//		 
//		 System.out.println("-----------nextDouble()------------");
//		 for (int i = 0; i < 4; i++) {
//			 System.out.println(rand.nextDouble());
//		 }
	} 
}
