
public class Ex_05_short {
	public static void main(String[] args) {
		// 정수형 short : 2 byte(갯수 : 65536)
		short short1 = 20000;
		short short2 = 30000;
		System.out.println("short1 : " + short1);
		System.out.println("short2 : " + short2);
		
		short sum = (short)(short1+short2);
		System.out.println("sumShort값 : " + sum);

		int sumInt = short1 + short2;
		System.out.println("sumInt값 : " + sumInt);
		
		
		
		System.out.println("short의 최댓값 : " + Short.MAX_VALUE);
		System.out.println("short의 최소값 : " + Short.MIN_VALUE);

	}
}



























