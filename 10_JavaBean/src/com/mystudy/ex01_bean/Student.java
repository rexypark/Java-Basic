package com.mystudy.ex01_bean;
/*	자바빈(Java Bean)
 	- 멤버변수(property)의 접근제한자(제어자) private 선언
 	- 멤버변수(property) 마다 get/set 메소드를 제공
 	- get/set 메소드는 public으로 선언
 	- get 메소드는 파라미터가 없고, set메소드는 하나이상의 파라미터 존재
 	- 필드명의 첫글자를 대문자로 설정
 	- 외부에서 멤버변수(property)접근시에는 get/set 메소드를 통해 접근(사용)
 	
 	
 	set메소드
 	public void setName(데이터타입 파라미터명) {
 		this.name = name
 	}
 	
 	get메소드
 	public 데이터타입 getName() {
		return this.name;
	}
 	
 	
 */


public class Student {
	//private를 선언하면 Student클래스에서 밖에 사용 안됨
	private String name; //이름
	private String num;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	
	//생성자 영역 ----------------------------
	public Student() {
		//super : 부모클래스(super 클래스)를 의미
		//super() : 부모클래스의 기본 생성자 호출
		super(); //생략하면 컴파일러가 자동으로 삽입해서 처리
	}
	
	public Student(String name) {
	  //super(); 맨 첫줄에 생략됨 - 부모 클래스의 생성자 호출 
		this.name = name;
	}
	
	public Student(String name, int kor, int eng, int math) {
		
		// 현재 객체의 생성자 호출(String 데이터 하나 전달)
		// 생성자 재사용
		this(name);
//		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeAvg();
		
	}
	
	
	
	//메소드영역-----------------------------

	//this >> 위에 선언된 변수를 가리킴
	//set에서는 this가 필수로 들어가야 함 / get에서는 필수는 아님
	//명칭 : set메소드. setter, set property
	public void setName(String name) {
		this.name = name;
	}
	
	//명칭 : get메소드, getter, get property
	public String getName() {
		return this.name;
	}
	
	
	
	
	public void num(String num) {
		this.num = num;
	}
	
	public String num2() {
		return this.num;
	}
	
	
	
	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
		
			this.kor = kor;
		
		}else {
			System.out.println("잘못된 점수입니다.");
		}
	}
	
	public int getKor() {
		return this.kor;
	}
	
	
	public void setEng(int eng) {
		if (eng >= 0 && eng <= 100) {
		
			this.eng = eng;
		
		}else {
			System.out.println("잘못된 점수입니다.");
		}
	}
	
	public int getEng() {
		return this.eng;
	}
	
	
	
	public void setMath(int math) {
		if (math >= 0 && math <= 100) {
		
			this.math = math;
		
		}else {
			System.out.println("잘못된 점수입니다.");
		}
	}
	
	public int getMath() {
		return this.math;
	}
	
	
	
	
	public int getTot() {
		return this.tot;
	}

	
	
	// 연산 식을 쓴다면 기본적으로 해당 값을 호출하는 기본 get메서드를 입력하고
	// 다른 메서드에 연산식을 삽입하고 해당 값에 연산식을 넣는다
	// 연산 메서드 > 출력메서드 입력
	
	
	
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	public void computeTot() {
		this.tot = kor + eng + math; 
	}
	
	// 연산이 있는 경우 문제가 생길 위험이 높다
	// 선택적으로 setter 제공 안함
	public void setAvg(double avg) {
		
		this.avg =avg;
	}

//	public void setAvg(double avg) {
//		this.avg = avg / 3.0;
//	}
	
	public double getAvg() {
		
		return this.avg;
	}
	
	public void computeAvg() {
		computeTot();
		this.avg = tot/3;
		
	}
	
	
}
