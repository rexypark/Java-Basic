
public class Ex_02_for_sum {
	public static void main(String[] args) {
		//문제 1 : 1 - 10까지의 합계를 구하시오
		
		int sum =0;
		for (int i = 1; i <= 10; i++) {
			
			sum += i;
			
		}
		System.out.println("1 - 10까지의 합계  :  " + sum);
		System.out.println();
		System.out.println("==================");
		int sum1 =0;
		for (int i = 1; i <= 1000; i++) {
			
			sum1 += i;
			
		}
		System.out.println("1 - 1000까지의 합계  :  " + sum1);
		System.out.println("======================");
		
		// 문제 10부터 1까지의 숫자 출력(for문 사용)
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		// 문제 1부터 10까지의 짝수 숫자 출력(for문 사용)
		System.out.println("----------------");
		System.out.println("1-10숫자 중 짝수 출력");
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
//        다음방법			
//			int value = i*2;
//			if (value >= 10) {
//				System.out.println(value);
//			}
		}

		// 문제 1부터 10까지의 홀수 숫자 출력(for문 사용)
		System.out.println("----------------");
		System.out.println("1-10숫자 중 홀수 출력");
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
//	        다음방법			
//			int value =  2*i - 1;
//			if (value >= 10) {
//				System.out.println(value);
//			}
		}
	}
}
