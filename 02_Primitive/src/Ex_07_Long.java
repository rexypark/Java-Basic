
public class Ex_07_Long {
	public static void main(String[] args) {
		// ������ long : 8 byte
		// ���� : ����� ū ��
		// long Ÿ�԰� ����� ǥ�� : ���� + L �Ǵ� l(���� ��ҹ��� ��)
		
		long num1 = 20000000000000L;
		short num2 = 2324;
		
		System.out.println(num1 + num2);
		
		System.out.println("Long�� �ִ� : " + Long.MAX_VALUE);
		System.out.println("Long�� �ּҰ� : " + Long.MIN_VALUE);
		
		System.out.println("===type ��ȯ");
		
		byte numByte = 100;
		short numShort = 3000;
		int numInt = 3000000;
		long numLong = 50000000000L;
		
		numByte = (byte)numShort;
		System.out.println(numByte);
			
	}
}



















/*

 	  k = 0
 	  n = 1
 	  h = 1
 	  k = k+1
 	  n = n+k
 	  h = h + n
 	  
 	  k > 9
 	  
 	  
 	  �Ǻ���ġ
 	  
 	  abs = 1
 	  n =2
 	  
 	  c  = a + b
 	  s = s + c
 	  n = n+1
 	  n<10
 	  a = b
 	  b = c
 	  
 	  10���� > 2����
 	  bin(10)
 	  s
 	  dec > 10���� ��
 	  mok > 
 	  nmg > 
 	  
 	  mok = int(dec/ 2)
 	  nmg = dec -mok*2
	  s = s + 1
	  bin(s) = nmg
	  mok = 0
	  dec = mok
	  
	  8������ 2������
	  
	  bin(100)
	  cnt �迭�� ��ġ
	  pal 8���� ��
	  mok �ڸ��� ���� �� ��
	  nmg �ڸ��� ���� �� ������
	  a �̾Ƴ� 8���� �ڸ����� a�� ġȯ�� �� 2������ ��ȯ
	  m2 2������ ��ȯ�� ��
	  n2 2���� ��ȯ�� ������
	  
	  
	


*/ 