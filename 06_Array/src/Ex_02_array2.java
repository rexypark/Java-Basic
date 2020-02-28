
public class Ex_02_array2 {
	
	
	public static void main(String[] args) {
		
		// 문제 : 1 ~ 10까지의 수를 배열에 저장(반복문사용)하고
		//		배열에 있는 테이터를 출력
		// 출력 형태 : 변수명[인덱스번호] : 값
		
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = i+1;
			System.out.println("num[" + i + "]" + " : " + num[i]);
		}
		
		// 5개의 데이터 저장 (11 ~ 15) 저장 하고 출력
		
		int val = 11;
		for (int i = 0; i<num.length; i++) {
			num[i] = 0;
		}
		
		
		for (int i = 0; i <= 5; i++) {
			
			num[i] = val;
			val++;
			System.out.println("num[" + i + "]" + " : " + num[i]);
		}
		
		
		System.out.println();
		dispData(num);
		
		
	
	}
	static void dispData(int[] arr) { //매개변수 int[] 전달 받음
		System.out.println("=== 배열 데이터 출력 ===");
		for (int i = 0; i<arr.length; i++) {
			System.out.println("[" + i + "]" + " : " + arr[i]);
		}
	}
	
}
