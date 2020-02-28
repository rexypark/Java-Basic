import java.util.Arrays;

public class Ex_05_ArraySelectionSort {
	public static void main(String[] args) {
		// 배열에 저장된 숫자 정렬(오름차순 : ASC)
		// 20, 30, 50, 40, 10
		int[] num = {20, 30, 50, 40, 10};
	
		System.out.print("원본 데이터 : ");
		printData(num); // 메소드 호출해서 배열 데이터 확인
		System.out.println("---- 정렬시작 ----");
		
		//첫번째 값 기준으로 비교작업(인덱스 0 - 인덱스 1)
		
		if (num[0] > num[1]) {
			
			int temp = num[0]; // 백업
			num[0] = num[1];
			num[1] = temp;
			
		}
		
		if(num[0] > num[2]) {

			int temp = 0;
			temp = num[0]; // 백업
			num[0] = num[2];
			num[2] = temp;
		}

		if(num[0] > num[3]) {

			int temp = 0;
			temp = num[0]; // 백업
			num[0] = num[3];
			num[3] = temp;
		}

		System.out.println(">> 반복문으로 전환");
		// 첫번째 값을 기준 - 반복문으로 전환(기준값0)
		for (int i = 1; i <= 4; i++) { 
			if(num[0] > num[i]) {
	
				int temp = num[0]; // 백업
				num[0] = num[i];
				num[i] = temp;
			}printData(num);
		}
	
		
		System.out.println(">> 반복문으로 전환");
		// 첫번째 값을 기준 - 반복문으로 전환(기준값1)
		for (int i = 2; i <= 4; i++) { 
			if(num[1] > num[i]) {
	
				int temp = 0;
				temp = num[1]; // 백업
				num[1] = num[i];
				num[i] = temp;
			}printData(num);
		}
	
		System.out.println(">> 반복문으로 전환");
		// 첫번째 값을 기준 - 반복문으로 전환(기준값1)
		for (int i = 3; i <= 4; i++) { 
			if(num[2] > num[i]) {
	
				int temp = 0;
				temp = num[2]; // 백업
				num[2] = num[i];
				num[i] = temp;
			}printData(num);
		}
	
		System.out.println(">> 반복문으로 전환");
		// 첫번째 값을 기준 - 반복문으로 전환(기준값1)
		for (int i = 4; i <= 4; i++) { 
			if(num[3] > num[i]) {
	
				int temp = 0;
				temp = num[3]; // 백업
				num[3] = num[i];
				num[i] = temp;
			}printData(num);
		}
		
		

		
		
		System.out.println("===========  이중 for문으로 변경 ==============");
		//4번 돌면서
		for (int j = 0; j < num.length - 1; j++) {
			
			for (int i = j; i < num.length; i++) { 
				if(num[j] > num[i]) {
		
					int temp = num[j]; // 백업
					num[j] = num[i];
					num[i] = temp;
				}
			}
			
		}printData(num);
	
		
		
		System.out.println("===== 오름차순 정렬 일반화 =====");
		int[] nums = {30,20,50,40,10};
		System.out.println("정렬 전 : ");
		printData(nums);
		
	
		System.out.println("Arrays.sort(nums)");
		Arrays.sort(nums);
		printData(nums);
		
	
	}
	
	// 함수 정의는 클래스 선언 다음 집합에서 진행
	static void printData(int[] arry) {
		
		for (int i = 0; i< arry.length; i++) {
			System.out.print(arry[i] + " ");
		}System.out.println();
		
	
	}
}