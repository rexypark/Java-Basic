
public class EceptionFinally {


	public static void main(String[] args) {
		// try ~ catch ~ finally
		System.out.println("-- main() 시작 --");
		int num = 20;
		int result = 0;
		try {
			System.out.println(">> try문 시작");

			num = 0;
			result = 100 / num;
			
			
			System.out.println(">> 연산처리 정상 종료");
			System.out.println(">> try문 시작");
			return; // return을 선언 해도 finally 는 실행 및 문제 발생 구문에서 종료
		//result / 0 > 0을 나누어 오류발생
		}catch(ArithmeticException e) {
			System.out.println(">>>> catch문 실행");
			System.out.println(e);
		}finally {
			System.out.println("***> finally : 항상실행(무조건)");
		}
		
		System.out.println();
		System.out.println("test() 실행 결과 : " + test());
		
		System.out.println("-- main() 종료 --");
	}
	
	static String test() {
		
		String result = "";
		int[] num = new int[3]; //인덱스 0, 1, 2
		
		try {
			int num1 = 100;
			int num2 = 0;
			num1 = num1 / num2;
			result = "<정상실행>";
			
		}catch(Exception e) { // 여기에서 예외처리
			result = "<예외발생> " + e.getMessage();
			
		}finally {
			System.out.println("***> finally : 항상실행(무조건)");	
		}
		
		return result;
	}
}
