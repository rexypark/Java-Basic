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
		
		
		// CarŸ�Կ� �ڳ�Ÿ������
		System.out.println("== CarŸ�Կ� �ڳ�Ÿ�� ���� ��� ==");
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
		
		
		System.out.println("=== Car Ÿ�Կ� ����� ��ü�� Ÿ�� Ȯ�� ===");
		carTemp = new Car();
		carTemp = am;
		carTemp = fe;
		
		
		
		//instanceof
		
		System.out.println("======ObjectŸ���ΰ��=====");
		if(carTemp instanceof Object) {
			System.out.println("Object�Դϴ�");
		}
		
		
		
		
		
		System.out.println("======CŸ���ΰ��=====");
		if(carTemp instanceof Car) {
			carTemp.drive();
			carTemp.stop();
		}
		
		System.out.println("======AmbulanceŸ���ΰ��=====");
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
		System.out.println("::: Car Ÿ���Դϴ� ");
		typeCheck(am);
		
		System.out.println();
		
	}
	
	
	
	
	// �޼����� �����ε�
	static void typeCheck(Car car) {
		System.out.println("::: Car �Դϴ� ~~~~");
		
		
	}
	
	static void typeCheck(Ambulance ab) {
		System.out.println("::: Car �Դϴ� ~~~~");
		
	}

	static void typeCheck(FireEngine fe) {
		System.out.println("::: Car �Դϴ� ~~~~");
		
	}

	
	
/*
	static void typeCheck(Car carTemp) {
		System.out.println("::: Car Ƽ���Դϴ� ----------");
		carTemp.drive();
		carTemp.stop();
		
		//Ÿ��Ȯ�� �� ó��
		if (carTemp instanceof Ambulance) {
			System.out.println("::: Ambulance Ÿ���Դϴ�");
			((Ambulance)Car).siren();
		}
	}
*/	
	
}
