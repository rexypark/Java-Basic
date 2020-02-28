
public class Ex_07_array_exam {

	public static void main(String[] args) {
		
		
		/*
		 ����1 : int Ÿ���� ������ 3���� ������ �� �ִ� �迭(num1)��
			 1. 10,20,30, ���ڸ� �Է��ϰ� ȭ�����
			 2. ����° �����͸� 100���� �ٲٰ� ȭ�� ���
			
		 ����2 : num1�� ũ�Ⱑ ���� �迭 num1Copy�� �����
		 	   num1Copy�� num1�� �����͸� �����ϰ� ȭ�� ���
		 (����) �ּҰ� �������� ������ ������ ���������� Ȯ��
		 */
		
		int [] num1 = {10, 20, 30};
		num1[2] = 100;
		printData("num1 : ", num1);
		
		System.out.println();
		System.out.println("======= copy1 (clone) =======");
		int [] num1Copy = num1.clone();
		printData("num1 : ", num1);
		printData("num1Copy : ", num1Copy);
		System.out.println();
		System.out.println("======= �ּ� �� =======");
		System.out.println(num1);
		System.out.println(num1Copy);
		
		System.out.println();
		System.out.println("======= copy2 (System.arraycopy) =======");
		int [] num1Copy2 = new int [num1.length];
		System.arraycopy(num1, 0, num1Copy2, 0, num1.length);
		printData("num1 : ", num1);
		printData("num1Copy2 : ", num1Copy2);
		
		System.out.println();
		System.out.println("======= �ּ� �� =======");
		System.out.println(num1);
		System.out.println(num1Copy2);
		
		System.out.println();
		System.out.println("======= copy3 (�迭 �ּҰ� ����  > ��������) =======");
		int [] num1Copy3 = new int [num1.length];
		num1Copy3 = num1;
		printData("num1 : ", num1);
		printData("num1Copy3 : ", num1Copy3);
		
		System.out.println();
		System.out.println("======= �ּ� �� =======");
		System.out.println(num1);
		System.out.println(num1Copy3);
		
		
	}
	
	
	static void printData(String name, int[] arry) {
		System.out.print(name + ": ");

		for (int i = 0; i< arry.length; i++) {
			System.out.print(arry[i] + " ");
		}System.out.println();
	}
	
}
