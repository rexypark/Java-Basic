
public class Ex_03_char {

	public static void main(String[] args) {
		// 문자형(char) : 2 byte 사용, 문자 1글자 저장(0 ~ 65535)
		// 자바 문자처리 방식은 유니코드(Unicode) 형태
		char char1 = 'A'; // "A"는 문자열(String), 'A'는 문자(char)
		System.out.println("char1 :   " + char1);
		System.out.println("char1 다음 문자 : " + (char1 + 1)); // (char1 + 1)은 int 타입으로 바뀌어 'A'값은 65 , + 1 = 66으로 출력된다.
		System.out.println("char1 다음 문자 : " + (char)(char1 + 1));
		
		char char2 = '한';
		System.out.println("char2 : " + char2);
		
		char char3 = '\uAC00';  // 유니코드 표기 방식
		System.out.println("char3 : " + char3);
		
		char1 = (char)(char1 + 1); // char <- int
		System.out.println(char1);
		
		
	}
}























