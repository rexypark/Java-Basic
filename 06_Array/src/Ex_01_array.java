
public class Ex_01_array {
	public static void main(String[] args) {
		
		/* �迭(Array) : ������ ������Ÿ���� �����͵���
		 				������ ���������� ���
		      �迭�� ���� : �ڷ���[] ������
		      ������ �� ���� : �迭������[�ε�����ȣ] = ��;
		   <�迭�� ���� �� ����>
		   1. �ڷ���[] ������ = new �ڷ���[����];
		      �ڷ��� ������[] = new �ڷ���[����] 
		   2. �ڷ���[] ������ = new �ڷ���[] {��1, ��2, ....., ��n};
		   3. �ڷ���[] ������ = {��1, ��2, ......, ��n}; // n���� ������� ����
		*/
//		1. �ڷ���[] ������ = new �ڷ���[����];
		int[] array1 = new int[10];
//		1_1. �ڷ��� ������[] = new �ڷ���[����]
		int array1_1[] = new int[10];
		System.out.println(array1);
		System.out.println(array1_1);
//		2. �ڷ���[] ������ = new �ڷ���[] {��1, ��2, ..... ��n} 
		int[] array2 = new int[] {1,2,3,4};
//		3. �ڷ���[] ������ = {��1, ��2, ... , ��n}
		int[] array3 = {1,2,3,4};
		System.out.println(array2);
		System.out.println(array3[1]);
		
		
		int sum = 0;
		for(int i = 0; i<=array2.length-1; i++) {
			sum += array2[i];
		}
		System.out.println("array2 �迭�� �հ� : " + sum);
		
		//=============================================
		//�迭�� ũ�� Ȯ��(��ȸ)
		System.out.println(array2.length);
		
		// ch �迭�� ���ĺ�('A' ~ 'Z') ������ �ڵ�ȭ
		
		char [] ch = new char[4];
		
		ch[0] = 'A' + 0;
		ch[1] = 'A' + 1;
		ch[2] = 'A' + 2;
		ch[3] = 'A' + 3;
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char)('A'+i);
			System.out.print(ch[i] +" ");
		}
		
		int[] num = new int[] {1,2,3,4};
	
	}
		
	}

