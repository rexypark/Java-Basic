package com.mystudy.ex01_ran_cal;

import java.util.Arrays;
import java.util.Random;

public class RandomExam2 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		for (int i = 0; i < 4; i++) {
			int randInt = rand.nextInt(6);
			System.out.print(randInt + " ");
		}
		
		
		System.out.println("------- Random nextBytes() -------");
		byte[] arrByte = new byte[10];
		System.out.println(Arrays.toString(arrByte));
		rand.nextBytes(arrByte);
		System.out.println(Arrays.toString(arrByte));
		System.out.println();
		
		
		System.out.println("--- Math.random() vs Random nextDouble() ---");
		for (int i = 0; i < 4; i++) {
			double mathRan = Math.random();  // 0 <= Math.random() < 1
			System.out.println("Math.random() : " +  mathRan);
			System.out.println("rand.nextDouble() : " + rand.nextDouble());
		}
		
	}
	
}
