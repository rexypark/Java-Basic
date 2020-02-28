
public class Ex_04_byte {
	public static void main(String[] args) {
		// 정수형 byte : 정수 숫자 256 종류(-128 ~ 127)
		byte byte1  = 100;
		byte byte2 = 30;
		
		System.out.println("byte1 : "+byte1);
		System.out.println("byte2 : "+byte2);
		
		// 연산결과 값이 저장범위(표현범위) 벗어나면 예상치 못한 쓰레기 값이 됨
		byte byte3 = (byte)(byte1 + byte2);
		System.out.println("byte3 : " + byte3);
		
		System.out.println("Byte 최소값");
		System.out.println(Byte.MIN_VALUE);
		System.out.println("Byte 최대값");
		System.out.println(Byte.MAX_VALUE);

	}

}





























