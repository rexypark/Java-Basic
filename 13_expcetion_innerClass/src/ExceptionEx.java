
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
		
		System.out.println("[예외발생 메세지] : " + ex.getMessage());
		ex.printStackTrace();
		
	}catch(RuntimeException ex) {
		
		
	}catch (Exception ex) {
		
		System.out.println("[예외발생] : 0으로 나누려 했습니다.");
		
	}finally {//정상실행, 예외발생 모든 경우에 무조건 실행되는 구문

	
	}
	System.out.println("== main() 종료 ==");
	}
}
