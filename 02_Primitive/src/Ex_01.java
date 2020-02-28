
public class Ex_01 {
	public static void main(String[] args) {
		System.out.println("계산결과 : "+1/2);
		System.out.println("계산결과 : "+(1+2));
		System.out.println("\\안녕하세요\\");
		//문자열 붙이기 연산자보다 곱하기 연산자가 우선이기 때문에
		// 문자열 + 정수*정수 = 문자열 + 정수*정수*
		
		System.out.println("홍길동님\n반갑습니다.");
		System.out.println("홍길동님\t반갑습니다.");
	
		
		String str1 = "Rexy";
		System.out.println(str1);
		String str2 = "반갑습니다";
	    System.out.println(str1+"님 "+str2);
	}

}


/** 문서작성용 주석 */
/* 명명규칙(반드시 지킬 것)
 	- 영문대소문자, 숫자, 특수문자(_,$) 사용
    - 대소문자 구분 사용, 길이제한 없음
 	- (Hello, HELLO, HeLLo - 3가지 이름 / 대소문자 다름에 따라 다름)
 	- 예약어(키워드) 사용안됨
 	- 길이제한 없음
 	- 숫자로 시작 안됨(01Ex 안됨)
 	
 	명명규칙(개발자 간의 약속)
 	- 클래스(인터페이스)명의 첫글자는 대문자로 한다.
 	- 복합단어(두가지 단어가 합해진 단어)인 경우 
 	  첫글자를 대문자로 작성(HelloWorld)
 	- 변수명, 메소드명의 시작은 소문자로 시작한다.
 	- 상수명은 전체 대문자로 작성하고 복합어의 구분은언더바(_)
 	  사용(PI, MAX_NUMBER)
 	 
 	 - 변수(variable)의 선언
 	 - 데이터 타입 변수명;
 	 
 	 
 	  
 */

 