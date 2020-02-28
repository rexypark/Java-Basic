
public class EceptionFinally {


	public static void main(String[] args) {
		// try ~ catch ~ finally
		System.out.println("-- main() ���� --");
		int num = 20;
		int result = 0;
		try {
			System.out.println(">> try�� ����");

			num = 0;
			result = 100 / num;
			
			
			System.out.println(">> ����ó�� ���� ����");
			System.out.println(">> try�� ����");
			return; // return�� ���� �ص� finally �� ���� �� ���� �߻� �������� ����
		//result / 0 > 0�� ������ �����߻�
		}catch(ArithmeticException e) {
			System.out.println(">>>> catch�� ����");
			System.out.println(e);
		}finally {
			System.out.println("***> finally : �׻����(������)");
		}
		
		System.out.println();
		System.out.println("test() ���� ��� : " + test());
		
		System.out.println("-- main() ���� --");
	}
	
	static String test() {
		
		String result = "";
		int[] num = new int[3]; //�ε��� 0, 1, 2
		
		try {
			int num1 = 100;
			int num2 = 0;
			num1 = num1 / num2;
			result = "<�������>";
			
		}catch(Exception e) { // ���⿡�� ����ó��
			result = "<���ܹ߻�> " + e.getMessage();
			
		}finally {
			System.out.println("***> finally : �׻����(������)");	
		}
		
		return result;
	}
}
