package com.mystudy.ex01_ran_cal;

import java.util.Random;

public class RandomExam1 {
	
	public static void main(String[] args) {
		/* Random : ����(������ ��)�� �����ϴ� Ŭ����
		�������� : nextInt() - int Ÿ���� ���� �߻�
				nextInt(10) - 0~9������ ������ ���� �߻�
				nextLong() - long Ÿ���� ���� �߻�
				
		�Ǽ����� : nextFloat() - �Ǽ��� float Ÿ�� ���� �߻�
				nextDouble() - �Ǽ��� double Ÿ���� ���� �߻�
		���� ���� : nextBoolean() - true, false �� �� �ϳ� �߻�
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
