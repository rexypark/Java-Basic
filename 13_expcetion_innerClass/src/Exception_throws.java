
public class Exception_throws {

	public static void main(String[] args) {
		
		// throws : 예외를 던질 때(위임, 전가) 사용
		// 예외가 발생한 곳에서 처리하지 않고 예외를 던져서 다른 곳에서 처리하도록 함
		// 호출한 곳에서 처리하도록 예외를 던짐
		System.out.println("--- main() 시작 ---");
		
		int num1 = 100;
		int num2 = 0;
		int result = 0;
		
		System.out.println(">> 연산처리 시작");
		try {
			result = div(num1,num2);
		}catch(ArithmeticException e) {
			System.out.println("main() div()처리시 예외발생");
		}
		System.out.println(">> 연산 결과 : " + result);
		System.out.println("=====================");
		
		result = 0;
		try {
			result = divThrows(num1,num2);
		}catch(Exception e) {
			//전달받은 예외를 잡아서 처리
		    System.out.println("main() divThrows 처리시 예외발생 ~~~~");
		}
		System.out.println(">> 연산 결과 : " + result);
		System.out.println("--- main() 종료 ---");
		
	}
	
	//메소드 내부에서 예외처리 한 경우
	private static int div(int a, int b) {
		System.out.println("---->>  div() 시작");
		int result = -999;
		try {
			result = a / b;
			
		}catch(ArithmeticException e) {
			System.out.println("[div예외발생] " + e.getMessage());
		}
		
		System.out.println("---->>  div() 끝");
		return result;
	}
	
	
	// 예외를 던지는 경우(throws 사용)             실행문을 처리하다가 호출한 곳으로 다시 던진다.
	static int divThrows(int num1, int num2) throws Exception {
		System.out.println("==> divThrows() 시작");
		
		
		int result = -1;
		result = num1/num2;
		
		
		System.out.println("==> divThrows() 종료");
		return result;
		
	}
		
	
	
	
}
