
public class Ex_02_for_sum {
	public static void main(String[] args) {
		//���� 1 : 1 - 10������ �հ踦 ���Ͻÿ�
		
		int sum =0;
		for (int i = 1; i <= 10; i++) {
			
			sum += i;
			
		}
		System.out.println("1 - 10������ �հ�  :  " + sum);
		System.out.println();
		System.out.println("==================");
		int sum1 =0;
		for (int i = 1; i <= 1000; i++) {
			
			sum1 += i;
			
		}
		System.out.println("1 - 1000������ �հ�  :  " + sum1);
		System.out.println("======================");
		
		// ���� 10���� 1������ ���� ���(for�� ���)
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		// ���� 1���� 10������ ¦�� ���� ���(for�� ���)
		System.out.println("----------------");
		System.out.println("1-10���� �� ¦�� ���");
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
//        �������			
//			int value = i*2;
//			if (value >= 10) {
//				System.out.println(value);
//			}
		}

		// ���� 1���� 10������ Ȧ�� ���� ���(for�� ���)
		System.out.println("----------------");
		System.out.println("1-10���� �� Ȧ�� ���");
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
//	        �������			
//			int value =  2*i - 1;
//			if (value >= 10) {
//				System.out.println(value);
//			}
		}
	}
}
