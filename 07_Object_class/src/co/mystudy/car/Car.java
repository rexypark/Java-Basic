package co.mystudy.car;
/*
 자동차 클래스
 - 속성(변수) : 차랑명, 모델명, 차량색, 차량길이, 차량폭(너비)
 - 기능(메소드) : 앞으로 이동, 정지 , 뒤로이동, 차량정보확인
 */


public class Car {
	//필드변수(속성) : 멤버변수, 인스턴스변수
	String name = "마이카";
	String model;
	String color;
	
	final int CAR_LENGTH = 400;
	final int CAR_WIDTH = 200;
	
	boolean existAirbag; //어에백 존재 여부
	// 생성자 : 리턴타입 없음
	// 클래스명 () {} - 기본생성자
	// 클래스명 (매개변수, ....) {}
	// 필드 작업의 초기화
	
	Car () {
		model = "드림카";
		color = "무지개색";
		
	}
	
	
	Car(String n, String m, String c) {
		
		name = n;
		model = m;
		color = c;
		
		
	}
	
	
	void run(int speed) {
		System.out.println(">>앞으로 이동 " + speed + "속도로 이동");
	}
	void stop() {
		System.out.println("멈춤(stop)");
	}
	void back() {
		System.out.println(">>뒤로 이동");
	}
	void dispData() {
		System.out.println("=== 자동차 정보 ==");
		System.out.println("자동차 이름 : " + name);
		System.out.println("모델명 : " + model);
		System.out.println("색상명 : " + color);
		System.out.println("차량 길이: " + CAR_LENGTH);
		System.out.println("차량 폭: " + CAR_WIDTH);
		System.out.println("에어백 유무 : " + existAirbag);
	}
	
}

