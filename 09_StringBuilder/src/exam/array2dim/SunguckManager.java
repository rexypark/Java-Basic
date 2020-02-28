package exam.array2dim;

import java.util.Scanner;
import java.lang.Math;

public class SunguckManager {
	static double KOR, ENG, MATH, AVG, SUM;
	
	public static void main(String[] args) {
			//2차원 배열을 사용한 성적 처리
			//실습문제. 
			//  국어, 영어, 수학 점수 3개를 저장한 2차원 배열(sungjuk) 만들고
			//  성적을 입력하고 개인별 총점과 평균을 계산 하여 화면에 데이터 출력
			/*
				국어\t영어 수학  총점     평균
				--------------------------
				100  90  80  270   90.0
				100  90  81  271   90.33
				100  90  80  270   90.0
				--------------------------
			*/
		
//		a b c sum arv
//	   11 12 13 14 15
//	   21 22 23 24 25
//	   31 32 33 34 35
		
		
		Scanner scan = new Scanner(System.in);
		double [][] sungjuk = new double [3][5];
		
			for (int i = 0; i < sungjuk.length; i++) {
				System.out.println((i+1) + "번째" + "국어 영어 수학 점수를 입력하세요.");
				double kor,eng,math;
				kor = scan.nextInt();
				eng = scan.nextInt();
				math = scan.nextInt();
				
				putData(kor, eng, math);
				AVG = avg(KOR,ENG,MATH);
				SUM = sum(KOR,ENG,MATH);
				System.out.println(KOR + " " + ENG + " " + MATH + " " + AVG + " " + SUM);
				sungjuk[i][0] = KOR;
				sungjuk[i][1] = ENG;
				sungjuk[i][2] = MATH;
				sungjuk[i][3] = AVG;
				sungjuk[i][4] = SUM;
			}
			System.out.println();
			System.out.println("국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t");
			for (int i = 0; i < sungjuk.length; i++) {
				for (int j = 0; j < sungjuk[i].length; j++) {
					System.out.print(sungjuk[i][j] + "\t");
				}System.out.println();
			}
		
		scan.close();
		
	}
	static void putData(double a, double b, double c){
		KOR = a;
		ENG = b;
		MATH = c;
	}
	
	static double avg(double a, double b, double c) {
		
		return Math.round(((((a+b+c)/3)*100.0)/100.0));
		
		
	}
	static double sum(double a, double b, double c) {
		
		return a+b+c;
		
	}
}
