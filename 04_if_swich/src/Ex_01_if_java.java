import java.util.Scanner;

public class Ex_01_if_java {

	public static void main(String[] args) {
		/* 제어문 - 분기문(비교문) : if 문
		if(조건문) { 
			실행할 문장(들); <- 조건문의 결과가 참(true)일 때
		}
		*/
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(">> 비교작업 전");
		if(num1 < num2) {
			System.out.println("num1이 num2보다 작다.");
		}
		System.out.println(">> 비교작업 후");
		
		System.out.println("---------------------------");
		/* 점수에 대한 평가 결과 출력
		 90 ~ 100 : 우수
		 80 ~ 89 : 양호
		 70 ~ 79 : 보통
		 60 ~ 69 : 부족
		 0 ~ 59 : 재평가
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력 하세요");
		System.out.println(">");
		int score = scan.nextInt();
		System.out.println("---- 평가결과 ----");
		System.out.println();
		System.out.println("점수 : " + score);
		
		if(score>=90 && score <= 100) {
			System.out.println("평가결과 : 우수");
		}else if(score >=80) {
			System.out.println("평가결과 : 양호");
		}else if(score >=70) {
			System.out.println("평가결과 : 보통");
		}else if(score >=60) {
			System.out.println("평가결과 : 부족");
		}else {
			System.out.println("평가결과 : 재평가");
		}
		
		System.out.println(">> 성적처리 끝");
		
		
		
		scan.close();	
	}
	
}
