import java.util.Arrays;

public class Ex_05_ArraySelectionSort {
	public static void main(String[] args) {
		// �迭�� ����� ���� ����(�������� : ASC)
		// 20, 30, 50, 40, 10
		int[] num = {20, 30, 50, 40, 10};
	
		System.out.print("���� ������ : ");
		printData(num); // �޼ҵ� ȣ���ؼ� �迭 ������ Ȯ��
		System.out.println("---- ���Ľ��� ----");
		
		//ù��° �� �������� ���۾�(�ε��� 0 - �ε��� 1)
		
		if (num[0] > num[1]) {
			
			int temp = num[0]; // ���
			num[0] = num[1];
			num[1] = temp;
			
		}
		
		if(num[0] > num[2]) {

			int temp = 0;
			temp = num[0]; // ���
			num[0] = num[2];
			num[2] = temp;
		}

		if(num[0] > num[3]) {

			int temp = 0;
			temp = num[0]; // ���
			num[0] = num[3];
			num[3] = temp;
		}

		System.out.println(">> �ݺ������� ��ȯ");
		// ù��° ���� ���� - �ݺ������� ��ȯ(���ذ�0)
		for (int i = 1; i <= 4; i++) { 
			if(num[0] > num[i]) {
	
				int temp = num[0]; // ���
				num[0] = num[i];
				num[i] = temp;
			}printData(num);
		}
	
		
		System.out.println(">> �ݺ������� ��ȯ");
		// ù��° ���� ���� - �ݺ������� ��ȯ(���ذ�1)
		for (int i = 2; i <= 4; i++) { 
			if(num[1] > num[i]) {
	
				int temp = 0;
				temp = num[1]; // ���
				num[1] = num[i];
				num[i] = temp;
			}printData(num);
		}
	
		System.out.println(">> �ݺ������� ��ȯ");
		// ù��° ���� ���� - �ݺ������� ��ȯ(���ذ�1)
		for (int i = 3; i <= 4; i++) { 
			if(num[2] > num[i]) {
	
				int temp = 0;
				temp = num[2]; // ���
				num[2] = num[i];
				num[i] = temp;
			}printData(num);
		}
	
		System.out.println(">> �ݺ������� ��ȯ");
		// ù��° ���� ���� - �ݺ������� ��ȯ(���ذ�1)
		for (int i = 4; i <= 4; i++) { 
			if(num[3] > num[i]) {
	
				int temp = 0;
				temp = num[3]; // ���
				num[3] = num[i];
				num[i] = temp;
			}printData(num);
		}
		
		

		
		
		System.out.println("===========  ���� for������ ���� ==============");
		//4�� ���鼭
		for (int j = 0; j < num.length - 1; j++) {
			
			for (int i = j; i < num.length; i++) { 
				if(num[j] > num[i]) {
		
					int temp = num[j]; // ���
					num[j] = num[i];
					num[i] = temp;
				}
			}
			
		}printData(num);
	
		
		
		System.out.println("===== �������� ���� �Ϲ�ȭ =====");
		int[] nums = {30,20,50,40,10};
		System.out.println("���� �� : ");
		printData(nums);
		
	
		System.out.println("Arrays.sort(nums)");
		Arrays.sort(nums);
		printData(nums);
		
	
	}
	
	// �Լ� ���Ǵ� Ŭ���� ���� ���� ���տ��� ����
	static void printData(int[] arry) {
		
		for (int i = 0; i< arry.length; i++) {
			System.out.print(arry[i] + " ");
		}System.out.println();
		
	
	}
}