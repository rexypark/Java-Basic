
public class Ex_03_for {
	public static void main(String[] args) {
		// 문제 : 1- 10 2의 배수 출력
		//  2로 나누어 나머지가 0인 숫자는 2의 배수
		
		System.out.println("1부터 10까지의 2의 배수");
		System.out.println("--------------------------");
		
		for (int i = 1; i<=10; i++) {
			
			if (i % 2 == 0) {
				System.out.println(i);
			}
			
		}
		System.out.println("***************************");
		System.out.println();
		
		
		// 문제 : 1-10의 숫자 중 3의 배수
		
		System.out.println("1부터 10까지의 3의 배수");
		System.out.println("--------------------------");
		
		for (int i = 1; i<=10; i++) {
			
			if (i % 3 == 0) {
				System.out.println(i);
			}
			
		}
		System.out.println("***************************");
		System.out.println();
		
		
		// 문제 : 900에서 1000까지 17의 배수인 숫자 출력
		
		
		System.out.println("900부터 1000까지의 17의 배수");
		System.out.println("--------------------------");
		for (int i = 900; i<=1000; i++) {
			
			if (i % 17 == 0) {
				System.out.println(i);
			}
			
		}
		
		System.out.println("***************************");
		System.out.println();
		
		
		//2000 - 30000까지 숫자 중 79의 배수인 숫자를 출력
		System.out.println("2000부터 30000까지의 17의 배수");
		System.out.println("--------------------------");
		for (int i = 2000; i<=30000; i++) {
			
			if (i % 79 == 0) {
				System.out.println(i);
			}
			
		}
		

	}
}
