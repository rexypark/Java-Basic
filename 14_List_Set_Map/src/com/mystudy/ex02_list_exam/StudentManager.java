package com.mystudy.ex02_list_exam;

import java.util.ArrayList;
import java.util.Scanner;


// ArrayList<StudentVO>타입의 변수list에 저장


public class StudentManager{

	
	public static void main(String[] args) {
		
		String name = "";
		int kor,eng,math,sum;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList stdsGroup = new ArrayList();
		
		int memberNo = 3;
		for (int i = 0; i< memberNo; i++) {
		
			System.out.println("이름을 입력하세요");
			name = scan.nextLine();
			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();
			
			scan.nextLine(); //버퍼에러
			
			ArrayList stdInfo = new ArrayList();
			StudentVO std1 = new StudentVO(name,kor,eng,math);
			
			
			stdInfo.add(std1.getName());
			stdInfo.add(std1.getKor());
			stdInfo.add(std1.getEng());
			stdInfo.add(std1.getMath());
			
//			stdInfo.add(std1.sum());
//			stdInfo.add(std1.avg());
			
			
			stdsGroup.add(stdInfo);
			
			
		}
		
		System.out.println(stdsGroup);
		System.out.println();
		System.out.println();
		System.out.println("========================================================");
//		printData(stdsGroup);
		System.out.println("========================================================");
		
		
		
		
		
	}
	
//	static void printData(ArrayList arr) {
//		System.out.println("이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
//		
//		for (int i = 0; i<arr.size(); i++) {
//			int dim2size = ((ArrayList)(arr.get(0))).size();
//			for (int j = 0; j < dim2size; j++) {
//				System.out.print(((ArrayList)(arr.get(i))).get(j) + "\t");
//				
//			}System.out.println();
//		
//		}
//	}


}
