
public class Ex_05_short {
	public static void main(String[] args) {
		// ������ short : 2 byte(���� : 65536)
		short short1 = 20000;
		short short2 = 30000;
		System.out.println("short1 : " + short1);
		System.out.println("short2 : " + short2);
		
		short sum = (short)(short1+short2);
		System.out.println("sumShort�� : " + sum);

		int sumInt = short1 + short2;
		System.out.println("sumInt�� : " + sumInt);
		
		
		
		System.out.println("short�� �ִ� : " + Short.MAX_VALUE);
		System.out.println("short�� �ּҰ� : " + Short.MIN_VALUE);

	}
}



























