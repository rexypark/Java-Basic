
public class MyExceptionTest {
	public static void main(String[] args) {
		System.out.println(">> main() 시작");
	
		//throw new MyException();
		
		try {
		firstMethod();
		} catch(MyException e) {
			System.out.println(">> main catch문 실행");
			System.out.println(">>오류메세지 : " + e.getMessage());
		}
		System.out.println(">> main() 종료");
	}
	
	
	
	static void firstMethod() throws MyException {
		System.out.println("=== firstMethod() 시작 ===");
		//throw new MyException();
		
		secondMethod();
		System.out.println("=== firstMethod() 종료 ===");
	}
									//(2)니꺼잖아
	static void secondMethod() throws MyException {
		System.out.println("--- secondMethod() 시작 ---");
		//(1)에러다!!!!
		throw new MyException(); // 예외발생
	}
	
	
}
