
public class Ex_04_break_countiue {
	public static void main(String[] args) {
		// 제어 명령문 : break, countiue
		// break : 반복문을 중단 시키고 빠져나감
		// continue : 계속 진행 (다음 반복 처리로 진행)
		// 반복문의 맨 끝으로 이동
		
		// 문제 : 1 - 10까지 출력하되 8은 출력하지 말것
		for (int i = 1;  i <= 10; i++) {
			
			if (i == 8) continue;
				System.out.println(i);
			
		}
		
		System.out.println("====break====");
		// 1~10까지 출력 중 7인 경우 처리 중단
		for (int i = 1; i <=10; i++) {
			
			if (i==7) {
				break;
			}
			System.out.println(i);
			
		}
		
	}
}
