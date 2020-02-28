package com.mystudy.ex01_instanceof;

public class CarTest {
	public static void main(String[] args) {
		
		//Car
		System.out.println("== Car ==");
		Car car = new Car();
		car.drive();
		car.stop();
		System.out.println();
		
		
		//Ambulance
		System.out.println("== Ambulance ==");
		Ambulance am = new Ambulance();
		am.drive();
		am.stop();
		am.siren();
		System.out.println();
		
		
		// FireEngine
		System.out.println("== FireEngine ==");
		FireEngine fe = new FireEngine();
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
		System.out.println();
		
		
		// Car타입에 자녀타입저장
		System.out.println("== Car타입에 자녀타입 저장 사용 ==");
		Car carTemp = new Car();
		carTemp.drive();
		carTemp.stop();
		System.out.println();
		
		
		// Car <- Ambulance
		System.out.println("Car <- Ambulance");
		carTemp = am;
		carTemp.drive();
		carTemp.stop();
		System.out.print("((Ambulance)carTemp).siren() : ");
		((Ambulance)carTemp).siren();
		System.out.println();
		
		
		//Car <- FireEngine
		System.out.println("Fe <- Car <- Am");
		carTemp = fe;
		System.out.print("((FireEngine)carTemp).siren() : ");
		((FireEngine)carTemp).siren();
		System.out.print("((FireEngine)carTemp).water() : ");
		((FireEngine)carTemp).water();
		
		
		System.out.println("=== Car 타입에 저장된 객체의 타입 확인 ===");
		carTemp = new Car();
		carTemp = am;
		carTemp = fe;
		
		
		
		//instanceof
		
		System.out.println("======Object타입인경우=====");
		if(carTemp instanceof Object) {
			System.out.println("Object입니다");
		}
		
		
		
		
		
		System.out.println("======C타입인경우=====");
		if(carTemp instanceof Car) {
			carTemp.drive();
			carTemp.stop();
		}
		
		System.out.println("======Ambulance타입인경우=====");
		if(carTemp instanceof Ambulance) {
			
			carTemp.drive();
			carTemp.stop();
			((Ambulance)carTemp).siren();
			
		}
		if(carTemp instanceof FireEngine) {
			((FireEngine)carTemp).siren();
			((FireEngine)carTemp).water();
		}
		
		System.out.println("==================");
		System.out.println("::: Car 타입입니다 ");
		typeCheck(am);
		
		System.out.println();
		
	}
	
	
	
	
	// 메서드의 오버로딩
	static void typeCheck(Car car) {
		System.out.println("::: Car 입니다 ~~~~");
		
		
	}
	
	static void typeCheck(Ambulance ab) {
		System.out.println("::: Car 입니다 ~~~~");
		
	}

	static void typeCheck(FireEngine fe) {
		System.out.println("::: Car 입니다 ~~~~");
		
	}

	
	
/*
	static void typeCheck(Car carTemp) {
		System.out.println("::: Car 티입입니다 ----------");
		carTemp.drive();
		carTemp.stop();
		
		//타입확인 후 처리
		if (carTemp instanceof Ambulance) {
			System.out.println("::: Ambulance 타입입니다");
			((Ambulance)Car).siren();
		}
	}
*/	
	
}
