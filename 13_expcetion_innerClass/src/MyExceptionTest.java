
public class MyExceptionTest {
	public static void main(String[] args) {
		System.out.println(">> main() ����");
	
		//throw new MyException();
		
		try {
		firstMethod();
		} catch(MyException e) {
			System.out.println(">> main catch�� ����");
			System.out.println(">>�����޼��� : " + e.getMessage());
		}
		System.out.println(">> main() ����");
	}
	
	
	
	static void firstMethod() throws MyException {
		System.out.println("=== firstMethod() ���� ===");
		//throw new MyException();
		
		secondMethod();
		System.out.println("=== firstMethod() ���� ===");
	}
									//(2)�ϲ��ݾ�
	static void secondMethod() throws MyException {
		System.out.println("--- secondMethod() ���� ---");
		//(1)������!!!!
		throw new MyException(); // ���ܹ߻�
	}
	
	
}
