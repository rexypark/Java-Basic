
public class Ex_01_array {
	public static void main(String[] args) {
		
		/* 배열(Array) : 동일한 데이터타입의 데이터들을
		 				동일한 변수명으로 사용
		      배열의 선언 : 자료형[] 변수명
		      변수에 값 저장 : 배열변수명[인덱스번호] = 값;
		   <배열의 선언 및 생성>
		   1. 자료형[] 변수명 = new 자료형[갯수];
		      자료형 변수명[] = new 자료형[갯수] 
		   2. 자료형[] 변수명 = new 자료형[] {값1, 값2, ....., 값n};
		   3. 자료형[] 변수명 = {값1, 값2, ......, 값n}; // n개의 저장공간 생성
		*/
//		1. 자료형[] 변수명 = new 자료형[갯수];
		int[] array1 = new int[10];
//		1_1. 자료형 변수명[] = new 자료형[갯수]
		int array1_1[] = new int[10];
		System.out.println(array1);
		System.out.println(array1_1);
//		2. 자료형[] 변수명 = new 자료형[] {값1, 값2, ..... 값n} 
		int[] array2 = new int[] {1,2,3,4};
//		3. 자료형[] 변수명 = {값1, 값2, ... , 값n}
		int[] array3 = {1,2,3,4};
		System.out.println(array2);
		System.out.println(array3[1]);
		
		
		int sum = 0;
		for(int i = 0; i<=array2.length-1; i++) {
			sum += array2[i];
		}
		System.out.println("array2 배열의 합계 : " + sum);
		
		//=============================================
		//배열의 크기 확인(조회)
		System.out.println(array2.length);
		
		// ch 배열에 알파벳('A' ~ 'Z') 저장방식 자동화
		
		char [] ch = new char[4];
		
		ch[0] = 'A' + 0;
		ch[1] = 'A' + 1;
		ch[2] = 'A' + 2;
		ch[3] = 'A' + 3;
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char)('A'+i);
			System.out.print(ch[i] +" ");
		}
		
		int[] num = new int[] {1,2,3,4};
	
	}
		
	}

