
public class Ex_08_array2dim {
	public static void main(String[] args) {
		
		// 2���� �迭 ���� �� ��ü ����
		// Ÿ��[][] ������ = new Ÿ��[ũ�Ⱚ][ũ�Ⱚ];
		// Ÿ�� ������[][] = new Ÿ��[ũ�Ⱚ][ũ�Ⱚ];
		// Ÿ��[][] ������ = {{..},{..},..,..,{..}};
		int [][] num1 = new int[5][5];
		int num2 [][] = new int[5][5];
		int num3 [][] = { {1,2,3,4,5},
				          {1,2,3,4,5},
						  {1,2,3,4,5},
						  {1,2,3,4,5},
						  {1,2,3,4,5} };
		
		for (int i = 0; i < num3.length; i++) {
			for (int j = 0; j < num3[0].length; j++) {
				
				System.out.print(num3[i][j] + " ");
				
			}System.out.println();
		}
		
		
		
		
				
	}
}
