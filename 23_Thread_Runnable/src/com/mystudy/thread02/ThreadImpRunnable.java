package com.mystudy.thread02;


class ThreadParent {
	void print() {
		System.out.println("���� thread Ŭ������ ParentŬ����");
	}
}

class ThreadImp extends ThreadParent implements Runnable {
	@Override
	public void run() {
		super.print();
		System.out.println("ThreadImp.run() : Runnable �������̽� ����");
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			
		}
		
	}
	
}



public class ThreadImpRunnable {

	public static void main(String[] args) {
		System.out.println("==== main() ���� ====");
		
		Thread thMain = Thread.currentThread();
		System.out.println(thMain.toString());
		
		
		//Runnable �������̽��� ������ ��ü�� ������� ����Ϸ���
		//Thread Ŭ������ �����ڿ� Runnable ���� ��ü�� �����ؼ� ����
		ThreadImp thIpm = new ThreadImp();
		
		
		//ThreadImp ��ü�� Thread ��ü ������ ����
		Thread th = new Thread(thIpm);
		th.start();
		
		System.out.println("==== main() ���� ====");
	}

	
}
