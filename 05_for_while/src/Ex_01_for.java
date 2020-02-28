
public class Ex_01_for {
	public static void main(String[] args){
		// 제어문 - 반복문(for, while, do ~ while)
		// for(초기값설정; 실행(종결)조건, 증감성정) {}
		// 실행(종결)조건 결과값이 true일 대 실행문 처리
		// for(; ;) { } // 무한 루프
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println("*");
		System.out.println("-----");


		for (int i = 1; i <= 5; i++ ) {
			System.out.print("*");
		}
	
		for (int i = 1; i <= 10; i++ ) {
			System.out.print("i");
		}
		// for 반복문 내의 실행문에서 반복 인자 값은 변경 자제(피해라)
		for (int i = 1; i<=10; i++) {
			System.out.println("반복인자 i : " + i);
			i++; // for문 내에서 반복인자 값 변경은 자제
			
		}
		
		System.out.println("--------");
		for (int i = 10; i>=1; i--) {
			System.out.println("반복인자 i : " + i);
		}
		
		for(int i = 1; i <=5; i++) {
			System.out.println("*****");
		}
		
			
	}
	
}
