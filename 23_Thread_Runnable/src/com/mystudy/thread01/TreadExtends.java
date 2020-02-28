package com.mystudy.thread01;

class ThreadParent extends Thread {
	void print() {
		System.out.println("���� theadTest Ŭ������ Parent Ŭ����");
	}
}



// Thread�� ���� �� �� �ִ� class
// Thread Ŭ������ ��� Ȯ��(extends)���� �����
class ThreadTest extends ThreadParent {
	int num = 10;
	ThreadTest() {}
	ThreadTest(int num) {
		this.num = num;
	}

	@Override
	
	// Thread Ŭ������ run() �޼ҵ带 �������̵�(overriding)�ؼ�
	// Thread�� �Ϸ��� �۾��� �ۼ� ó��
	public void run() {
		super.run();
		System.out.println(">>> run() ����");
		
		for (int i = 1; i <= num; i++) {
			System.out.println(this.getName() + " : " + i);
				
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(">>> run() ��");
		
	}
}

public class TreadExtends {
	
	public static void main(String[] args) {
		System.out.println("=== main() ���� ===");
		
		
		ThreadTest th1 = new ThreadTest();
		th1.run(); // �ܼ� �޼ҵ� ȣ��
		th1.start();// ������� ���۽�Ű���� start >> run�� ����
		
		ThreadTest th2 = new ThreadTest(3);
		th2.run();
		th2.start();
		
		
		
		System.out.println("=== main() �� ===");
	}
}
