
public class Ex_01_for {
	public static void main(String[] args){
		// ��� - �ݺ���(for, while, do ~ while)
		// for(�ʱⰪ����; ����(����)����, ��������) {}
		// ����(����)���� ������� true�� �� ���๮ ó��
		// for(; ;) { } // ���� ����
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println("*");
		System.out.println("-----");


		for (int i = 1; i <= 5; i++ ) {
			System.out.print("*");
		}
	
		for (int i = 1; i <= 10; i++ ) {
			System.out.print("i");
		}
		// for �ݺ��� ���� ���๮���� �ݺ� ���� ���� ���� ����(���ض�)
		for (int i = 1; i<=10; i++) {
			System.out.println("�ݺ����� i : " + i);
			i++; // for�� ������ �ݺ����� �� ������ ����
			
		}
		
		System.out.println("--------");
		for (int i = 10; i>=1; i--) {
			System.out.println("�ݺ����� i : " + i);
		}
		
		for(int i = 1; i <=5; i++) {
			System.out.println("*****");
		}
		
			
	}
	
}
