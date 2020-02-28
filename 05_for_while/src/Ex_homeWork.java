import java.util.Scanner;

public class Ex_homeWork {
	public static void main(String[] args) {
		/* 문제 1. 숫자 3개중 가장 큰 수를 구하시오
		 
		 <결과> 
		 가장 큰 수 : 가장큰수
		 가장 작은 수 : 가장작은 수
		 *********************************
		 문제 2.문자 5개 중 가장 큰 수를 구하시오.
		 <결과>
		 가장 큰 수 :
		 가장 작은 수 : 
		 식사시간 6시 40분까지
		 퇴실 찍을 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		// 초기 값으로 max나 min 값을 할 때
		// Integer.MIN_VALUE로 초기값을 설정하여 MAX를 구하거나
		// Integer.MAX_VALUE로 MIN을 구하는 것이 문제가 없다.
		System.out.println("첫번째 수를 입력하세요");
		int n1 = scan.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int n2 = scan.nextInt();
		System.out.println("세번째 수를 입력하세요");
		int n3 = scan.nextInt();
		
		int mx = 0;
		int mn = 0;
		
		
		if (n1 >= n2 && n1 >= n3 ) {
			mx = n1;
		} else if ( n2 >= n1 && n2 >= n3) {
			mx = n2;
		} else {
			mx = n3;
		}
		
		
		if (n1 <= n2 && n1 <= n3 ) {
			mn = n1;
		} else if ( n2 <= n1 && n2 <= n3) {
			mn = n2;
		} else {
			mn = n3;
		}
		
		System.out.println("--세자리 비교 값 결과--");
		System.out.println("1) " + n1 + "  2) " + n2 + "  3) " + n3);
		System.out.println("가장 큰 수 : " + mx);
		System.out.println("가장 작은 수 : " + mn);
		
		System.out.println("**********************" );
		

		
		
		
		
		System.out.println("첫번째 수를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int num2 = scan.nextInt();
		System.out.println("세번째 수를 입력하세요");
		int num3 = scan.nextInt();
		System.out.println("네번째 수를 입력하세요");
		int num4 = scan.nextInt();
		System.out.println("다섯번째 수를 입력하세요");
		int num5 = scan.nextInt();
		
		
		int max = 0;
		int max2 = 0;
		int min = 0;
		int min2 = 0;
		
		
		if (num1 >= num2 && num1 >= num3 ) {
			max = num1;
		} else if ( num2 >= num1 && num2 >= num3) {
			max = num2;
		} else {
			max = num3;
		}
		
		if (num4 >= num5) {
			max2 = num4;
		} else if (num5 >= num4) {
			max2 = num5;
		}
		if (max < max2) {
			max = max2;
		}
		
		
		
		
		
		if (num1 <= num2 && num1 <= num3 ) {
			min = num1;
		} else if ( num2 <= num1 && num2 <= num3) {
			min = num2;
		} else {
			min = num3;
		}
		
		if (num4 <= num5) {
			min2 = num4;
		} else if (num5 <= num4) {
			min2 = num5;
		}
		if (min > min2) {
			min = min2;
		}
		
		
//		if (n1 < max) max = n1;
//		if (n2 < max) max = n2; 
//		if (n3 < max) max = n3;
		
		
		
		
		System.out.println("--다섯자리 비교 값 결과--");
		System.out.println("1) " + num1 + "  2) " + num2 + "  3) " + num3+ "  4) " + num4+ "  5) " + num5);
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + min);
		
		
		
	}
}




















//if(max < num2) {
//	max = num2;
//if (max < num3) {
//	max = num3;
//}else if (max < num4) {
//	max = num4;
//}else if (max < num5)
//	max = num5;
//}
//
//if(min > num2) {
//	min = num2;
//if (min > num3) {
//	min = num3;
//}else if (min > num4) {
//	min = num4;
//}else if (min > num5)
//	min = num5;
//}
//




