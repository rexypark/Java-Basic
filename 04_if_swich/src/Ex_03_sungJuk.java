import java.util.Scanner;

public class Ex_03_sungJuk {
	
	public static void main(String[] args) {
		/* (실습) 성적처리
		 국어(kor), 영어(eng), 수학(math) 점수 입력 받기
		 총점(tot) = 국어 + 영어 + 수학
		 평균(avg) = 총점 / 3
		------------------------
		평가 : 평균점수를 기준으로 평가
		 90 ~ 100 : A
		 80 ~ 89 : B
		 70 ~ 79 : C
		 60 ~ 69 : D
		 0 ~ 59 : F 재수강
		 =================
		 출력형태
		 국어 : 100
		 영어 : 90
		 수학 : 80
		 -----------
		 총점 : 270
		 평균 : 
		 <평가결과>
		 
		 *********************
		 
		 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요 : ");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요 : ");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요 : ");
		int math = scan.nextInt();
		
		int sum = kor + eng + math;
		int avg = sum / 3;
		String grade;
		if (avg >= 90 && avg <= 100) {
			grade = "A";
		} else if (avg>=80) {
			grade = "B";
		} else if (avg>=70) {
			grade = "C";
		} else if (avg>=60) {
			grade = "D";
		} else {
			grade = "F 재수강";
		}
		
		System.out.println("90 ~ 100 : A");
		System.out.println("80 ~ 89 : B");
		System.out.println("70 ~ 79 : C");
		System.out.println("60 ~ 69 : D");
		System.out.println("0 ~ 59 : F 재수강");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("--------------");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("<평가결과>");
		System.out.println(grade);
		System.out.println("******************");
		
		scan.close();	
	
	}
	
}

