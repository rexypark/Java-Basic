
public class Ex_05_while {
	public static void main(String[] args) {
		/*
		 while (조건식) { 
			
			처리 할 실행문(들)
			
			}
		 
		 초기값 설정문;
		 do {  
		 반복인자에 대한 증감설정(선택적)
		 처리 할 실행문(들)
		 반복인자에 대한 증감설정(선택적)
			} while (조건식)
		*/
		
		//1-10까지 출력
		int i = 1;
		while (i <= 10) {
			
			System.out.print(i + " ");
			i++;
		}
		
//		while 무한 반복
		int num = 1;
		while (true) {
			System.out.println(num);
			num++;
			if(num == 100) break;
		}
		while (num <= 10) {
			num++;
			if (num == 5) continue; 
			// while 은 증감식 > 실행문 순으로 나열한다
			// 다음에 num++(x)
			// while 안에 continue문을 만나면 뒤에 
			// 나오는 식들은 실행 되지 않고 다시 반복된다.
		}
		
		System.out.println();
		System.out.println("----- do  ~  while -----");
		
		// 1- 10출력
		
		int doNum = 1;
		
		do {
			
			System.out.println(doNum);
			doNum++;
			
		} while (doNum <= 10);
		
		System.out.println("*********************");
		System.out.println();
		System.out.println("문제 : 1 - 10까지의 숫자 중 짝수만 출력 (while문을 사용)");
		// 문제 : 1 - 10까지의 숫자 중 짝수만 출력 (while문을 사용)
		int n = 1;
		while (n <= 10)
		{
			if(n%2 == 0) {
				System.out.println(n);
			}
			n++;
			
		}
		
		System.out.println();
		System.out.println("문제 : 1 - 10 까지의 합을 구하고 출력 (while문 사용)");
		// 문제 : 1 - 10 까지의 합을 구하고 출력 (while문 사용)
		
		int sum = 0;
		int num1 = 1;
		while(num1 <= 10) {
			sum += num1;
			num1++;
		}
		System.out.println(sum);
		
		
		
		
	
	}
}
