package com.mystudy.ex04_printf;

import java.util.Calendar;

public class Printf_Exam {
	
	
	public static void main(String[] args) {
		//printf() 메소드
		int a = 20;
		long b = 300000000000L;
		float c = 34.95f;
		double d = 4.4927;
		char e = 'A';
		String f = "Hello~~~";
		boolean g = false;
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.printf("%tF", today);
		System.out.println();
		System.out.println(">>" + a + " " + b + " " + c + " " + d + 
				 		   " " + e +  " " + f + " " + g);
		
		/* []는 생략가능
		 
		 %[인덱스]$[-][크기] : %, 형식문자 필수 작성
		 - 정렬은 기본적으로 우측 정렬
		 - 좌측정렬 사용은 마이너스 부호
		d > int, long
		f > float, double
		c > char
		s > String
		g > boolean
		 */
		
		System.out.println("???");
		System.out.printf("%n");
		System.out.println("???");
		System.out.printf("\\ %% %n \n");
		System.out.printf("%d %d %f %f \n", a, b, c, d);
		System.out.printf("%c %s %b %n", e, f, g);
		
		
		// %[인덱스]$[-][크기] : %, 형식문자 필수 작성
		System.out.println("=== 인덱스 사용예 ===");
		
		//[주의] 인덱스 적용하면 데이터 매칭에서 제외됨
		System.out.println("int 66" + "\t" + "int 66" + "\t" +"char 66" + "\t" + "indexing String rexypark" +"");
		System.out.printf("%1$d \t %1$d \t %c \t %4$s \n", 66, 'Z', "Hellow~~~", "rexypark");
		
		System.out.println();
		System.out.println("=== 실수형 데이터 표시 ===");
		System.out.printf("%f %1$a  %1$e %1$e %1$g \n", 65.43445345);
		System.out.println(1231234123);
		System.out.printf("%1$-10.1f \n", 65.8475685);
		
		System.out.println();
		System.out.println("=== 날짜 관련 ===");
		System.out.printf("%1$ty/%1$tm/%1$td \n", today);
		System.out.printf("%1$tF \n", today);
		System.out.printf("%1$tI/%1$tM/%1$tS \n", today); // 시분초
		
		System.out.println("=== 폭(width) 지정 ===");
		System.out.printf("%1$-20f \n", 5678.123456789);
		System.out.printf("%10s %10d %10d %10d \n","홍길동", 100,90,81);
		
		
	}
}
