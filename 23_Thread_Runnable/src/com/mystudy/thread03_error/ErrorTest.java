package com.mystudy.thread03_error;

public class ErrorTest {
	public static void main(String[] args) {
		
		
		System.out.println("=== main() 시작 ===");
		ATM_Error bank = new ATM_Error();
		System.out.println("은행잔고 : " + bank.money);
		
		
		Thread th1 = new Thread(bank, "ATM-1");
		Thread th2 = new Thread(bank, "ATM-2");
		Thread th3 = new Thread(bank, "ATM-3");
		th1.start();
		th2.start();
		th3.start();
		
		
		
		System.out.println("=== main() 끝 ===");
	}
}
