
public class Exception_throws {

	public static void main(String[] args) {
		
		// throws : ���ܸ� ���� ��(����, ����) ���
		// ���ܰ� �߻��� ������ ó������ �ʰ� ���ܸ� ������ �ٸ� ������ ó���ϵ��� ��
		// ȣ���� ������ ó���ϵ��� ���ܸ� ����
		System.out.println("--- main() ���� ---");
		
		int num1 = 100;
		int num2 = 0;
		int result = 0;
		
		System.out.println(">> ����ó�� ����");
		try {
			result = div(num1,num2);
		}catch(ArithmeticException e) {
			System.out.println("main() div()ó���� ���ܹ߻�");
		}
		System.out.println(">> ���� ��� : " + result);
		System.out.println("=====================");
		
		result = 0;
		try {
			result = divThrows(num1,num2);
		}catch(Exception e) {
			//���޹��� ���ܸ� ��Ƽ� ó��
		    System.out.println("main() divThrows ó���� ���ܹ߻� ~~~~");
		}
		System.out.println(">> ���� ��� : " + result);
		System.out.println("--- main() ���� ---");
		
	}
	
	//�޼ҵ� ���ο��� ����ó�� �� ���
	private static int div(int a, int b) {
		System.out.println("---->>  div() ����");
		int result = -999;
		try {
			result = a / b;
			
		}catch(ArithmeticException e) {
			System.out.println("[div���ܹ߻�] " + e.getMessage());
		}
		
		System.out.println("---->>  div() ��");
		return result;
	}
	
	
	// ���ܸ� ������ ���(throws ���)             ���๮�� ó���ϴٰ� ȣ���� ������ �ٽ� ������.
	static int divThrows(int num1, int num2) throws Exception {
		System.out.println("==> divThrows() ����");
		
		
		int result = -1;
		result = num1/num2;
		
		
		System.out.println("==> divThrows() ����");
		return result;
		
	}
		
	
	
	
}
