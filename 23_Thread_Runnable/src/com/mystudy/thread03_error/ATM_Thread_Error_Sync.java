package com.mystudy.thread03_error;

class ATM_Error_Sync implements Runnable {
	int money;
	
	ATM_Error_Sync() {}
	ATM_Error_Sync(int money) {
		this.money = money;
	}
	

	// synchronized ���� : �޼ҵ尡 ����Ǵ� ���� ����ȭ ó��
	// �ϳ��� �����尡 �޼ҵ带 ����ϰ� �ִ� ���� ������ ����
	// �ٸ� �����忡�� ����Ϸ��� �� �� �����°� ��(�ʵ尪�� ���� ����ȭ)
	// �Ա�
	synchronized void add (int money) {
		this.money += money;
		
		System.out.println(Thread.currentThread() + 
				" �Ա� : " + money + ", �����ܾ� : " + this.money);
	}
	
	//���
	synchronized void out (int money) {
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




public class ATM_Thread_Error_Sync {
	public static void main(String[] args) {
		
		
	}
}
