package com.mystudy;

// 클래스 접근제한 : public, public선언 없음(default)
public class Ex_02_class {
	int num = 111; // 초기값 생성 기능
	
	// 클래스가 로딩이 될 때
	// static이 붙은 것들은 사용이 가능해진다
	// static이 붙지 않은 것들은 객체 생성을 했을 때
	// 그때 만들어진다.
	// >> static을 선언되어진 것 부터 사용 할 수 있다.
	
	static int staticNum = 222;
	
	Ex_02_class() {} //기본생성자
	
	public static void main(String[] args) {
		//로컬변수(지역변수)
		int num1 = 200;
		int num2 = 100;
		int result = 0;
		result = num1 = num2;
		
		System.out.println(result);
		
		System.out.println("===========");
		result = add(num1,num2);
		System.out.println("result : " + result);
		System.out.println("staticNum : " + staticNum);
		
	  // static 영역에서 non-static 영역을 다이렉트로 접근못함
	  //System.out.println("num : " + num);
      //System.out.println("sub : " + sub(num1,num2));
	  //-----------------------------------
	  /*
	   객체생성(인스턴트 생성, 인스턴트 화 한다)
	   클래스타입명 변수명;
	   변수명 = new 클래스명();
	   */
		
		Ex_02_class ex01;
		ex01 = new Ex_02_class();
		int a = ex01.num;
		
		//static 메소드에서 non-static 메소드 또는 필드(인스턴스변수) 사용
		//생성된 객체(인스턴스)를 통해서만 사용 가능
		System.out.println("ex01.num : " + a);
		
		ex01.num = 1000;
		System.out.println("ex01.num : " + ex01.num);
		
		int subResult = ex01.sub(num1, num2);
		System.out.println("ex01.sub(num1, num2) : " + subResult);
		
		
	}
	
	/*
	 메소드 형태
	 void 메소드명() {}
	 void 메소드명(파라미터타입 변수명, ....)
	 리턴(데이터)타입 메소드명() {}
	 리턴타입 메소드명(파라미터타입 변수명, ...)
	 */
	
	// void는 리턴할 값이 없을 때 사용
	// 데이터 타입 선언은 해당 데이터 타입 리턴이 되어야함
	static int add(int a, int b) {
		return a+b;
	}
	
	int sub(int a, int b) {
		return a+b;
		
	}
	
}






