package com.mystudy.thread03_error;

class ATM_Error implements Runnable {
	int money;
	
	ATM_Error() {}
	ATM_Error(int money) {
		this.money = money;
	}
	
	// �Ա�
	void add (int money) {
		this.money += money;
		
		System.out.println(Thread.currentThread() + 
				" �Ա� : " + money + ", �����ܾ� : " + this.money);
	}
	//���
	void out (int money) {
		this.money -= money;

		System.out.println(Thread.currentThread() + 
				" ��� : " + money + ", �����ܾ� : " + this.money);
	}
	
	void bankSleep(int millisecond) {
		try {
			Thread.currentThread().sleep(millisecond);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		add(1000);
		bankSleep(1000);
		out(500);
		bankSleep(1000);
		out(300);
		bankSleep(1000);
		out(200);
	}
	
}




public class ATM_Thread_Error {
	public static void main(String[] args) {
		
	}
}
