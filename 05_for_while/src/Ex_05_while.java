
public class Ex_05_while {
	public static void main(String[] args) {
		/*
		 while (���ǽ�) { 
			
			ó�� �� ���๮(��)
			
			}
		 
		 �ʱⰪ ������;
		 do {  
		 �ݺ����ڿ� ���� ��������(������)
		 ó�� �� ���๮(��)
		 �ݺ����ڿ� ���� ��������(������)
			} while (���ǽ�)
		*/
		
		//1-10���� ���
		int i = 1;
		while (i <= 10) {
			
			System.out.print(i + " ");
			i++;
		}
		
//		while ���� �ݺ�
		int num = 1;
		while (true) {
			System.out.println(num);
			num++;
			if(num == 100) break;
		}
		while (num <= 10) {
			num++;
			if (num == 5) continue; 
			// while �� ������ > ���๮ ������ �����Ѵ�
			// ������ num++(x)
			// while �ȿ� continue���� ������ �ڿ� 
			// ������ �ĵ��� ���� ���� �ʰ� �ٽ� �ݺ��ȴ�.
		}
		
		System.out.println();
		System.out.println("----- do  ~  while -----");
		
		// 1- 10���
		
		int doNum = 1;
		
		do {
			
			System.out.println(doNum);
			doNum++;
			
		} while (doNum <= 10);
		
		System.out.println("*********************");
		System.out.println();
		System.out.println("���� : 1 - 10������ ���� �� ¦���� ��� (while���� ���)");
		// ���� : 1 - 10������ ���� �� ¦���� ��� (while���� ���)
		int n = 1;
		while (n <= 10)
		{
			if(n%2 == 0) {
				System.out.println(n);
			}
			n++;
			
		}
		
		System.out.println();
		System.out.println("���� : 1 - 10 ������ ���� ���ϰ� ��� (while�� ���)");
		// ���� : 1 - 10 ������ ���� ���ϰ� ��� (while�� ���)
		
		int sum = 0;
		int num1 = 1;
		while(num1 <= 10) {
			sum += num1;
			num1++;
		}
		System.out.println(sum);
		
		
		
		
	
	}
}
