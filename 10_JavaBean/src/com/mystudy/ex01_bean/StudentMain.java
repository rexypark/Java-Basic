package com.mystudy.ex01_bean;

public class StudentMain {

	public static void main(String[] args) {
		
		Student std = new Student();
		
		//set으로 값 저장
		std.setName("rexypark");
		
		
		//class명.getName()으로 set로 저장한 값 호출
		System.out.println(std.getName());
		
		// 다른 메소드명으로도 get/set이 가능하지만
		// 통상적으로 get/set으로 나타내어 표기한다.
		// get/set뒤에 이름은 필드명의 앞글자를 대문자로 하여 만들어준다.
		std.num("nu23");
		System.out.println(std.num2());
		System.out.println();
		
		//--------------------------------
		// 메인에서 해변수를 저장하는것 보다 클래스안에서 처리한 값을 내는게
		// 효율적이기 때문에 클래스에서 전처리를 다한 값을 내보내도록 한다.
		// 또한 잘못된 값 식별에 유용하다
		//std.kor = 100;
		//System.out.println(std.kor);
		//stu.setKor(100)
		//System.out.println(std.getKor());
		
		
		
		std.setKor(85);
		System.out.println("국어 점수는 " + std.getKor() + "점 입니다.");
		
		
		std.setEng(95);
		System.out.println("영어 점수는 " + std.getEng() + "점 입니다.");
		
		
		std.setMath(100);
		System.out.println("수학 점수는 " + std.getMath() + "점 입니다.");
		
		//총합 setTot
		std.computeAvg();
		int tot = std.getTot();
		System.out.println("총 점수는 " + tot + "점 입니다");
		
		
		//평균 setAvg
		std.setAvg(tot/3);
		double avg = std.getAvg();
		
		
		System.out.println("평균 점수는 " + String.format("%.2f", avg) + "점 입니다");
		System.out.println(avg);
		
		
		//====================================
		Student std2 = new Student("김유신", 10, 20,30);
		
		System.out.println("국어 점수는 " + std2.getKor() + "점 입니다.");
		
		System.out.println("영어 점수는 " + std2.getEng() + "점 입니다.");
		
		System.out.println("수학 점수는 " + std2.getMath() + "점 입니다.");
		
		System.out.println("총 점수는 " + std2.getTot() + "점 입니다");

		System.out.println("평균 점수는 " + String.format("%.2f", std2.getAvg()) + "점 입니다");
		System.out.println();
		System.out.println(std2.toString());
		
	}
}
