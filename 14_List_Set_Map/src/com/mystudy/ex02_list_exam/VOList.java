package com.mystudy.ex02_list_exam;

import java.util.ArrayList;

public class VOList {

	
	public static void main(String[] args) {
		
		ArrayList<StudentVO> arr = new ArrayList<StudentVO>();
		
		
		arr.add(new StudentVO("이순신", 100, 90, 81));
		arr.add(new StudentVO("홍길동", 90, 60, 91));
		arr.add(new StudentVO("광개토", 89, 76, 71));
		
		System.out.println();
		
		
//		Object obj = arr.get(0);
		StudentVO vo1 = (StudentVO)arr.get(0);
		
		
		vo1.getName();
		System.out.println(arr.get(0).toString());
		
		
		System.out.println("============================================");
		System.out.println();
		
		arr.get(0).printData();
		
		System.out.println();
		System.out.println("============================================");
		
		System.out.println();
		
		System.out.println("이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
//		StudentVO tmp=(StudentVO)(arr.get(i));		
		for (int i = 0; i < arr.size(); i++) {

			arr.get(i).printData();
			
		}
		System.out.println("============================================");
		
		//개선된 for문 사용
		System.out.println("개선된 for문 사용");
		System.out.println();
		for(Object obj : arr) {
			StudentVO svo = (StudentVO)obj;
			svo.printData();
		}
		
			
			
	}


}
