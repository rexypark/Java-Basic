
public class Ex_07_array_exam {

	public static void main(String[] args) {
		
		
		/*
		 문제1 : int 타입의 데이터 3개를 저장할 수 있는 배열(num1)에
			 1. 10,20,30, 숫자를 입력하고 화면출력
			 2. 세번째 데이터를 100으로 바꾸고 화면 출력
			
		 문제2 : num1과 크기가 같은 배열 num1Copy를 만들고
		 	   num1Copy에 num1의 데이터를 복사하고 화면 출력
		 (번외) 주소값 복사인지 물리적 데이터 복사인지도 확인
		 */
		
		int [] num1 = {10, 20, 30};
		num1[2] = 100;
		printData("num1 : ", num1);
		
		System.out.println();
		System.out.println("======= copy1 (clone) =======");
		int [] num1Copy = num1.clone();
		printData("num1 : ", num1);
		printData("num1Copy : ", num1Copy);
		System.out.println();
		System.out.println("======= 주소 값 =======");
		System.out.println(num1);
		System.out.println(num1Copy);
		
		System.out.println();
		System.out.println("======= copy2 (System.arraycopy) =======");
		int [] num1Copy2 = new int [num1.length];
		System.arraycopy(num1, 0, num1Copy2, 0, num1.length);
		printData("num1 : ", num1);
		printData("num1Copy2 : ", num1Copy2);
		
		System.out.println();
		System.out.println("======= 주소 값 =======");
		System.out.println(num1);
		System.out.println(num1Copy2);
		
		System.out.println();
		System.out.println("======= copy3 (배열 주소값 복사  > 변수저장) =======");
		int [] num1Copy3 = new int [num1.length];
		num1Copy3 = num1;
		printData("num1 : ", num1);
		printData("num1Copy3 : ", num1Copy3);
		
		System.out.println();
		System.out.println("======= 주소 값 =======");
		System.out.println(num1);
		System.out.println(num1Copy3);
		
		
	}
	
	
	static void printData(String name, int[] arry) {
		System.out.print(name + ": ");

		for (int i = 0; i< arry.length; i++) {
			System.out.print(arry[i] + " ");
		}System.out.println();
	}
	
}
