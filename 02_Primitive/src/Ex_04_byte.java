
public class Ex_04_byte {
	public static void main(String[] args) {
		// ������ byte : ���� ���� 256 ����(-128 ~ 127)
		byte byte1  = 100;
		byte byte2 = 30;
		
		System.out.println("byte1 : "+byte1);
		System.out.println("byte2 : "+byte2);
		
		// ������ ���� �������(ǥ������) ����� ����ġ ���� ������ ���� ��
		byte byte3 = (byte)(byte1 + byte2);
		System.out.println("byte3 : " + byte3);
		
		System.out.println("Byte �ּҰ�");
		System.out.println(Byte.MIN_VALUE);
		System.out.println("Byte �ִ밪");
		System.out.println(Byte.MAX_VALUE);

	}

}





























