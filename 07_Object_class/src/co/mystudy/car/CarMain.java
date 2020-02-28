package co.mystudy.car;

public class CarMain {
	
	public static void main(String[] args) {
		//Car 클래스를 이용해서 객체(인스턴스) 생성
		Car car1 = new Car();
		System.out.println("자동차 이름 : " + car1.name);
		System.out.println("모델명 : " + car1.model);
		System.out.println("차량색 : " + car1.color);
		System.out.println("길이 : " + car1.CAR_LENGTH);
		System.out.println("너비 : " + car1.CAR_WIDTH);
		//boolean 초기값 false
		System.out.println("에어백 유무 : " + car1.existAirbag);
		
		car1.name = "rexyCar";
		car1.existAirbag = true;
		System.out.println("car name : " + car1.name);
		System.out.println("Airbag : " + car1.existAirbag);
		
		System.out.println();
		// car1.CAR_WIDTH = 400;  // final 변수는 변형 불가
		System.out.println("==== 기능 사용(테스트) ====");
		System.out.println();
		
		car1.run(70);
		car1.stop();
		car1.back();
		System.out.println();
		car1.dispData();
		
		System.out.println();
		
		System.out.println("==== car2 생성 ====");
		Car car2 = new Car("rexypark", "쏘쓰", "남색");
		car2.dispData(); // 두번째 만든 차량
		System.out.println();
		car1.dispData(); // 첫번째 만든 차량
		
		System.out.println("car1 : " + car1);
		System.out.println("car2 : " + car2);
		car2 = car1; //동일 객체 
		System.out.println("car1 : " + car1);
		System.out.println("car2 : " + car2);
		
		
	}
}
