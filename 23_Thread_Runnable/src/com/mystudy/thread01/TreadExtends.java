package com.mystudy.thread01;

class ThreadParent extends Thread {
	void print() {
		System.out.println("나는 theadTest 클래스의 Parent 클래스");
	}
}



// Thread로 동작 할 수 있는 class
// Thread 클리스를 상속 확장(extends)에서 만들기
class ThreadTest extends ThreadParent {
	int num = 10;
	ThreadTest() {}
	ThreadTest(int num) {
		this.num = num;
	}

	@Override
	
	// Thread 클래스의 run() 메소드를 오버라이딩(overriding)해서
	// Thread로 하려는 작업을 작성 처리
	public void run() {
		super.run();
		System.out.println(">>> run() 시작");
		
		for (int i = 1; i <= num; i++) {
			System.out.println(this.getName() + " : " + i);
				
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(">>> run() 끝");
		
	}
}

public class TreadExtends {
	
	public static void main(String[] args) {
		System.out.println("=== main() 시작 ===");
		
		
		ThreadTest th1 = new ThreadTest();
		th1.run(); // 단순 메소드 호출
		th1.start();// 쓰레드로 동작시키려면 start >> run만 실행
		
		ThreadTest th2 = new ThreadTest(3);
		th2.run();
		th2.start();
		
		
		
		System.out.println("=== main() 끝 ===");
	}
}
