package com.mystudy;

public class Ex_03_Method {

	public static void main(String[] args) { // from form 
		// 클래스명 변수명 = new 클래스명();
		Ex_03_Method ex03 = new Ex_03_Method();
		int num1 = 100;
		int num2 = 200;
		int sum = 0;
		int sub = 0;
		int devide = 0;
		sum = ex03.add(num1, num2);
		sub = ex03.sub(num1, num2);
		devide = ex03.devide(num1, num2);
		System.out.println("num1 + num2 = " + sum);
		System.out.println("num1 * num2 = " + sub);
		System.out.println("num1 / num2 = " + devide);
		
		
		
	}
	int add(int a, int b) {
		return a + b;
	}
	
	int sub(int a, int b) {
		return a * b;
	}
	int devide(int a, int b) {
		return a / b;
	}
}
