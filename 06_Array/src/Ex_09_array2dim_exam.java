
public class Ex_09_array2dim_exam {
	public static void main(String[] args) {
	/*
	 (�ǽ�) 2���� �迭
	 int[][] num2dim = {{10,20},{30,40},{50,60}}
	 Q1. 2���� �迭�� num2dim�� ���� ȭ��� ��� : 100 20 30....
	 Q2. num2dim�� ����° ���� 30�� 100���� �����ϰ� ȭ�� ���
	 Q3. num2dim�� ũ�⸸ŭ num2copy �迭������ �����ϰ� num2dim�� ����
	          ������ �� num2dim�� ���� ȭ�� ���
	 
	  */
		
//     Q1
		System.out.println("Q1. == 2���� �迭 ��� ==");
		int[][] num2dim = {{10,20},{30,40},{50,60}};
		System.out.print("num2dim : ");

		for (int i = 0; i < num2dim.length; i++) {
			for (int j = 0; j < num2dim[0].length; j++) {
				System.out.print(num2dim[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println();
		
		
//		Q2
		System.out.println("Q2. == 30 -> 100���� ��ȯ ==");
		num2dim[1][0] = 100;
		System.out.print("num2dim : ");

		for (int i = 0; i < num2dim.length; i++) {
			for (int j = 0; j < num2dim[0].length; j++) {
				System.out.print(num2dim[i][j] + " ");
			}
		}
		
		System.out.println();
		System.out.println();
//		Q3 2���� �迭 ����
		
		System.out.println("Q3. == ���� �迭 ��� ==");
		int [][] num2copy = new int [num2dim.length][num2dim[0].length];
		for (int i = 0; i < num2copy.length; i++) {
			
			num2copy[i] = num2dim[i].clone();
			
		}
		
		
		
		System.out.print("num2dim : ");

		for (int i = 0; i < num2dim.length; i++) {
			for (int j = 0; j < num2dim[0].length; j++) {
				System.out.print(num2dim[i][j] + " ");
			}
		}
		
		System.out.println();
		System.out.println();

		System.out.print("num2copy : ");

		for (int i = 0; i < num2copy.length; i++) {
			for (int j = 0; j < num2copy[0].length; j++) {
				System.out.print(num2copy[i][j] + " ");
			}
		}
		
		
	}

}
