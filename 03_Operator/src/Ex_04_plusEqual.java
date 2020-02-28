
public class Ex_04_plusEqual {

	public static void main(String[] args) {
		
		// 대입 연산자 : =, +=, =+, *=, /=, %=
		// 사용형태 : 저장할 변수명 대입 연산자 저장할 값(숫자) 또는 변수
		// 예) num += 2;

		int result = 0;
		
		System.out.println("result  = 0  : " + result);
		
		result += 15; // result = result + 15;
		System.out.println("result += 15 :  " + result);
		
		result += 15; // result = result + 15;
		System.out.println("result += 15 :  " + result);
		
		result -= 10; // result = result - 10;
		System.out.println("result -= 10 :  " + result);
		
		result *= 10; // result = result * 10;
		System.out.println("result *= 10 :  " + result);
		
		result /= 10; // result = result / 10;
		System.out.println("result /= 10 :  " + result);
		
		
		System.out.println();
		
		
		result = 10;
		System.out.println("result  :  " + result);
		result %= 3;
		System.out.println("result %= 3   :  " + result);
		
		int num1 = 10;
		int num2 = 20;
		result = 0;
		System.out.println("===============");
		
		System.out.println("num1  :  " + num1);
		System.out.println("num2  :  " + num2);
		System.out.println("result  :  " + result);
		
		System.out.println();
		
		result += num2;
		System.out.println("result += num2  :  " + result);
		
		result -= num2;
		System.out.println("result  -= num2  :  " + result);
		
		System.out.println("result  :  " + result);
		
		result += num1;
		System.out.println("result += num1  :  " + result);
		
		
	}
}
