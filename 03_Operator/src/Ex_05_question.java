
public class Ex_05_question {
	public static void main(String[] args) {
		// 조건연산자 or 삼항 연산자
		// 조건 ? 실행문 1  :  실행문  2;
		// 조건 ? true일때 실행문장 : false일때 실행문자
		// 조건이 true이면 실행문 1이 실행, false면 실행문 2가 실행된다.
		
		int num1 = 30;
		int num2 = 20;
		boolean isBig = true;
		
		isBig = num1>num2;
		System.out.println("num1 :  " + num1 + ", num2 :  " + num2);
		System.out.println("num1 > num2  :  "  + isBig);
		
		String str = (num1>num2) ? "num1이 크다"  : "num1이 크지 않다"  ;
		System.out.println("num1 > num2결과는 ?  " + str);
		
		if(num1>num2) {
			System.out.println("num1이 크다");
		}else {
			System.out.println("num2가 크다");
		}
		
	}
}
