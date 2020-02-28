import java.util.Random;

public class Ex_array3 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		for (int i =0; i < nums.length; i++) {
			nums[i] = i + 1;
//			System.out.println(nums[i]);
		}
		dispData(nums);
		
//		배열에 있는 값 중 짝수는 짝수끼리 합산(evenSum)
//		배열에 있는 값 중 홀수는 짝수끼리 합산(oddSum)
//		짝수합계, 홀수합계 값 출력
		
		// 출력
		// 홀수 합계 : 
		// 짝수 합계 : 
		System.out.println();
		//oAndESum() 메소드 실행
		oAndESum(nums);
		
		// 두 수 값 변환 메소드 실행
		int num1 = 100;
		int num2 = 999;
		
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		 
		changeNum(num1, num2);
//		int tem = 0;
		
		// ====================================
		/* 로또 번호 만들기
		1. int 타입의 숫자 45개의 숫자를 저장할 배열 타입 변수선언(balls)
		2. 초기화 : 1 ~ 45까지의 숫자(번호)를 입력
		3. 많이 섞고 (충분히 많이)
		4. 6개 번호 추출(앞에서 순서대로)
		*/
		//====================================

		int[] lottoBox = new int[45];
		
		// 2. 초기화 : 1-45까지의 숫자(번호)를 입력
		for (int i = 0; i < lottoBox.length; i++) {
			lottoBox[i] = i+1;
			System.out.println(lottoBox[i]);
		}
		
		
		int rNum = (int)(Math.random()*45);
		System.out.println("변경전 0 : " + lottoBox[0]+" , " + rNum + " : " + lottoBox[rNum]);
		
		
		//balls[0]  <-> balls[rNum]
		int tmp = 0;
		
		for (int i = 0; i<lottoBox.length; i++) {
			rNum = (int)(Math.random()*45);
			tmp = lottoBox[0];
			lottoBox[0] = lottoBox[rNum];
			lottoBox[rNum] = tmp;
			System.out.print(lottoBox[i] + " ");
		}
		
		
		System.out.println();
		
		for (int i = 0; i < lottoBox.length-1; i++) {
			
			System.out.println(lottoBox[i]);
		}
		
		
		//		
//		System.out.println(">>> 로또 추첨 결과");
//	    for (int i = 0; i < 6; i++) {
//	    	System.out.println(lottoBox[i]);
//	    }
		
		
		
		
	}
	
	
	static void dispData(int[] arr) { //매개변수 int[] 전달 받음
		System.out.println("=== 배열 데이터 출력 ===");
		for (int i = 0; i<arr.length; i++) {
			System.out.println("[" + i + "]" + " : " + arr[i]);
		}
	}
	
	// 짝수 홀수 합계 반환해 주는 메소드
	static void oAndESum(int[] arr) {
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) evenSum += arr[i];	
			if (arr[i] % 2 != 0) oddSum += arr[i];
		}
		System.out.println("홀수 합계 : " + oddSum + "\n" + "짝수 합계 : " + evenSum);
		
	}
	
	
	static void changeNum(int a, int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("num1 : " + a + " num2 : " + b);
	}
	
	
	
}
