
public class Ex_06_array_copy {
	
	public static void main(String[] args) {
		// �迭 ����
		int [] num1 = new int[5];
		int [] num2 = new int[5];
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		num1[3] = 40;
		num1[4] = 50;
		printData(num1);
			
		
		System.out.println("==== �迭���� (���� ����) ====");
		// ���1 : �ּҰ� ����
		// �迭 ������ �ٸ� �������� �־��ָ� �ٸ� �������� ������ �ִ� �ּҰ��� �����Ͽ�
		// �迭�� ����ȴ�.
		// �ּҰ��� �����ϸ� ���� �� �ּҰ��� ���� ���� �ٲٸ�
		// �ּҰ��� ������ �ִ� �������� ��� ���� ���Ѵ�.
		num2 = num1;
		num2[0] = 999;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		printData(num1);
		printData("num1", num1);
	
		System.out.println("==== �迭�� ����(�������� ����/��������(deep copy)) ====");
		int [] num3 = new int[5];
		
		System.out.println(num3);
		System.out.println(num1);
		printData("num3", num3);
		printData("num1", num1);
		
		//�����ͺ��� : num1 <- num3
		for (int i = 0; i < num3.length; i++) {
			
			num3[i] = num1[i]; 
			
		}
		
		num1[0] = 888;
		
		System.out.println("===== �迭�� ���� �� =====");
		System.out.println("num3 �ּҰ� : " + num3);
		System.out.println("num1 �ּҰ� : " + num1);
		

		printData("num3", num3);
		printData("num1", num1);
		printData("num2", num2);
	
		
		num3[1] = 777;
	
		System.out.println("num3[1] = 777�� ���� ��");
		printData("num3", num3);
		printData("num1", num1);
		printData("num2", num2);
		
		System.out.println("============================");
		
		System.out.println("==== System.arrayCopy() ====");
		int[] num4 = new int [num1.length];
		
		// System.arraycopy(src, srcPos, dest, destPos, length);
		// System.arraycopy(�ҽ���ü, ������ġ, ���ü, ��������ġ, ũ��);
		// num3�� �����͸� num4�� ����
		//	            (������ �� ������, �ε��� ���� ��ġ, ���� �迭, ���� ��ġ, ũ��)
		printData("num4", num4);
		System.arraycopy(num3, 0, num4, 0, num4.length);
		
		System.out.println("==  Copy  ==");
		System.out.println();
		num4[num4.length-1] = 777;
		printData("num3", num3);
		printData("num4", num4);
		
		
		
		System.out.println("==========================");
		System.out.println("==== �迭��ü.clone() ���� ====");
		// �ּ� ���� �ٸ���.
		int[] num5 = num4.clone();
		
		System.out.println(num4);
		System.out.println(num5);
		printData("num4", num4);
		printData("num5", num5);
		
		
		
		
	}
	
	static void printData(int[] arry) {
		
		for (int i = 0; i< arry.length; i++) {
			System.out.print(arry[i] + " ");
		}System.out.println();
		
	
	}

	//�޼��� �����ε�(method overloading)
	static void printData(String name, int[] arry) {
		System.out.print(name + ": ");

		for (int i = 0; i< arry.length; i++) {
			System.out.print(arry[i] + " ");
		}System.out.println();
	}
	
}
