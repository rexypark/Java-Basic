import java.util.Scanner;

public class Ex_homeWork {
	public static void main(String[] args) {
		/* ���� 1. ���� 3���� ���� ū ���� ���Ͻÿ�
		 
		 <���> 
		 ���� ū �� : ����ū��
		 ���� ���� �� : �������� ��
		 *********************************
		 ���� 2.���� 5�� �� ���� ū ���� ���Ͻÿ�.
		 <���>
		 ���� ū �� :
		 ���� ���� �� : 
		 �Ļ�ð� 6�� 40�б���
		 ��� ���� 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		// �ʱ� ������ max�� min ���� �� ��
		// Integer.MIN_VALUE�� �ʱⰪ�� �����Ͽ� MAX�� ���ϰų�
		// Integer.MAX_VALUE�� MIN�� ���ϴ� ���� ������ ����.
		System.out.println("ù��° ���� �Է��ϼ���");
		int n1 = scan.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���");
		int n2 = scan.nextInt();
		System.out.println("����° ���� �Է��ϼ���");
		int n3 = scan.nextInt();
		
		int mx = 0;
		int mn = 0;
		
		
		if (n1 >= n2 && n1 >= n3 ) {
			mx = n1;
		} else if ( n2 >= n1 && n2 >= n3) {
			mx = n2;
		} else {
			mx = n3;
		}
		
		
		if (n1 <= n2 && n1 <= n3 ) {
			mn = n1;
		} else if ( n2 <= n1 && n2 <= n3) {
			mn = n2;
		} else {
			mn = n3;
		}
		
		System.out.println("--���ڸ� �� �� ���--");
		System.out.println("1) " + n1 + "  2) " + n2 + "  3) " + n3);
		System.out.println("���� ū �� : " + mx);
		System.out.println("���� ���� �� : " + mn);
		
		System.out.println("**********************" );
		

		
		
		
		
		System.out.println("ù��° ���� �Է��ϼ���");
		int num1 = scan.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���");
		int num2 = scan.nextInt();
		System.out.println("����° ���� �Է��ϼ���");
		int num3 = scan.nextInt();
		System.out.println("�׹�° ���� �Է��ϼ���");
		int num4 = scan.nextInt();
		System.out.println("�ټ���° ���� �Է��ϼ���");
		int num5 = scan.nextInt();
		
		
		int max = 0;
		int max2 = 0;
		int min = 0;
		int min2 = 0;
		
		
		if (num1 >= num2 && num1 >= num3 ) {
			max = num1;
		} else if ( num2 >= num1 && num2 >= num3) {
			max = num2;
		} else {
			max = num3;
		}
		
		if (num4 >= num5) {
			max2 = num4;
		} else if (num5 >= num4) {
			max2 = num5;
		}
		if (max < max2) {
			max = max2;
		}
		
		
		
		
		
		if (num1 <= num2 && num1 <= num3 ) {
			min = num1;
		} else if ( num2 <= num1 && num2 <= num3) {
			min = num2;
		} else {
			min = num3;
		}
		
		if (num4 <= num5) {
			min2 = num4;
		} else if (num5 <= num4) {
			min2 = num5;
		}
		if (min > min2) {
			min = min2;
		}
		
		
//		if (n1 < max) max = n1;
//		if (n2 < max) max = n2; 
//		if (n3 < max) max = n3;
		
		
		
		
		System.out.println("--�ټ��ڸ� �� �� ���--");
		System.out.println("1) " + num1 + "  2) " + num2 + "  3) " + num3+ "  4) " + num4+ "  5) " + num5);
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ���� �� : " + min);
		
		
		
	}
}




















//if(max < num2) {
//	max = num2;
//if (max < num3) {
//	max = num3;
//}else if (max < num4) {
//	max = num4;
//}else if (max < num5)
//	max = num5;
//}
//
//if(min > num2) {
//	min = num2;
//if (min > num3) {
//	min = num3;
//}else if (min > num4) {
//	min = num4;
//}else if (min > num5)
//	min = num5;
//}
//




