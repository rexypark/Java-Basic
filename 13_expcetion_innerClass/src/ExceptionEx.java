
public class ExceptionEx {

	
	public static void main(String[] args) {
	int num = 100;
	int num1 = 0;
	int num2 = 30; 
	int result = 0;
	
	try {
		
		result = num/num1;
		System.out.println("result : " + result);
		
	}catch(ArithmeticException ex) {
		
		System.out.println("[���ܹ߻� �޼���] : " + ex.getMessage());
		ex.printStackTrace();
		
	}catch(RuntimeException ex) {
		
		
	}catch (Exception ex) {
		
		System.out.println("[���ܹ߻�] : 0���� ������ �߽��ϴ�.");
		
	}finally {//�������, ���ܹ߻� ��� ��쿡 ������ ����Ǵ� ����

	
	}
	System.out.println("== main() ���� ==");
	}
}
