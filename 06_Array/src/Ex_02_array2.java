
public class Ex_02_array2 {
	
	
	public static void main(String[] args) {
		
		// ���� : 1 ~ 10������ ���� �迭�� ����(�ݺ������)�ϰ�
		//		�迭�� �ִ� �����͸� ���
		// ��� ���� : ������[�ε�����ȣ] : ��
		
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = i+1;
			System.out.println("num[" + i + "]" + " : " + num[i]);
		}
		
		// 5���� ������ ���� (11 ~ 15) ���� �ϰ� ���
		
		int val = 11;
		for (int i = 0; i<num.length; i++) {
			num[i] = 0;
		}
		
		
		for (int i = 0; i <= 5; i++) {
			
			num[i] = val;
			val++;
			System.out.println("num[" + i + "]" + " : " + num[i]);
		}
		
		
		System.out.println();
		dispData(num);
		
		
	
	}
	static void dispData(int[] arr) { //�Ű����� int[] ���� ����
		System.out.println("=== �迭 ������ ��� ===");
		for (int i = 0; i<arr.length; i++) {
			System.out.println("[" + i + "]" + " : " + arr[i]);
		}
	}
	
}
