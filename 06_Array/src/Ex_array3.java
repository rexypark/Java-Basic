import java.util.Random;

public class Ex_array3 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		for (int i =0; i < nums.length; i++) {
			nums[i] = i + 1;
//			System.out.println(nums[i]);
		}
		dispData(nums);
		
//		�迭�� �ִ� �� �� ¦���� ¦������ �ջ�(evenSum)
//		�迭�� �ִ� �� �� Ȧ���� ¦������ �ջ�(oddSum)
//		¦���հ�, Ȧ���հ� �� ���
		
		// ���
		// Ȧ�� �հ� : 
		// ¦�� �հ� : 
		System.out.println();
		//oAndESum() �޼ҵ� ����
		oAndESum(nums);
		
		// �� �� �� ��ȯ �޼ҵ� ����
		int num1 = 100;
		int num2 = 999;
		
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		 
		changeNum(num1, num2);
//		int tem = 0;
		
		// ====================================
		/* �ζ� ��ȣ �����
		1. int Ÿ���� ���� 45���� ���ڸ� ������ �迭 Ÿ�� ��������(balls)
		2. �ʱ�ȭ : 1 ~ 45������ ����(��ȣ)�� �Է�
		3. ���� ���� (����� ����)
		4. 6�� ��ȣ ����(�տ��� �������)
		*/
		//====================================

		int[] lottoBox = new int[45];
		
		// 2. �ʱ�ȭ : 1-45������ ����(��ȣ)�� �Է�
		for (int i = 0; i < lottoBox.length; i++) {
			lottoBox[i] = i+1;
			System.out.println(lottoBox[i]);
		}
		
		
		int rNum = (int)(Math.random()*45);
		System.out.println("������ 0 : " + lottoBox[0]+" , " + rNum + " : " + lottoBox[rNum]);
		
		
		//balls[0]  <-> balls[rNum]
		int tmp = 0;
		
		for (int i = 0; i<lottoBox.length; i++) {
			rNum = (int)(Math.random()*45);
			tmp = lottoBox[0];
			lottoBox[0] = lottoBox[rNum];
			lottoBox[rNum] = tmp;
			System.out.print(lottoBox[i] + " ");
		}
		
		
		System.out.println();
		
		for (int i = 0; i < lottoBox.length-1; i++) {
			
			System.out.println(lottoBox[i]);
		}
		
		
		//		
//		System.out.println(">>> �ζ� ��÷ ���");
//	    for (int i = 0; i < 6; i++) {
//	    	System.out.println(lottoBox[i]);
//	    }
		
		
		
		
	}
	
	
	static void dispData(int[] arr) { //�Ű����� int[] ���� ����
		System.out.println("=== �迭 ������ ��� ===");
		for (int i = 0; i<arr.length; i++) {
			System.out.println("[" + i + "]" + " : " + arr[i]);
		}
	}
	
	// ¦�� Ȧ�� �հ� ��ȯ�� �ִ� �޼ҵ�
	static void oAndESum(int[] arr) {
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) evenSum += arr[i];	
			if (arr[i] % 2 != 0) oddSum += arr[i];
		}
		System.out.println("Ȧ�� �հ� : " + oddSum + "\n" + "¦�� �հ� : " + evenSum);
		
	}
	
	
	static void changeNum(int a, int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("num1 : " + a + " num2 : " + b);
	}
	
	
	
}
