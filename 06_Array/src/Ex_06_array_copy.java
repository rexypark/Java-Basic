
public class Ex_06_array_copy {
	
	public static void main(String[] args) {
		// 배열 복사
		int [] num1 = new int[5];
		int [] num2 = new int[5];
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		num1[3] = 40;
		num1[4] = 50;
		printData(num1);
			
		
		System.out.println("==== 배열복사 (얕은 복사) ====");
		// 방법1 : 주소값 복사
		// 배열 변수에 다른 변수값을 넣어주면 다른 변수값이 가지고 있는 주소값을 저장하여
		// 배열이 복사된다.
		// 주소값을 복사하면 복사 된 주소값에 대한 값을 바꾸면
		// 주소값을 가지고 있는 변수들은 모두 값이 변한다.
		num2 = num1;
		num2[0] = 999;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		printData(num1);
		printData("num1", num1);
	
		System.out.println("==== 배열값 복사(물리적인 복사/깊은복사(deep copy)) ====");
		int [] num3 = new int[5];
		
		System.out.println(num3);
		System.out.println(num1);
		printData("num3", num3);
		printData("num1", num1);
		
		//데이터복사 : num1 <- num3
		for (int i = 0; i < num3.length; i++) {
			
			num3[i] = num1[i]; 
			
		}
		
		num1[0] = 888;
		
		System.out.println("===== 배열값 복사 후 =====");
		System.out.println("num3 주소값 : " + num3);
		System.out.println("num1 주소값 : " + num1);
		

		printData("num3", num3);
		printData("num1", num1);
		printData("num2", num2);
	
		
		num3[1] = 777;
	
		System.out.println("num3[1] = 777로 변경 후");
		printData("num3", num3);
		printData("num1", num1);
		printData("num2", num2);
		
		System.out.println("============================");
		
		System.out.println("==== System.arrayCopy() ====");
		int[] num4 = new int [num1.length];
		
		// System.arraycopy(src, srcPos, dest, destPos, length);
		// System.arraycopy(소스객체, 시작위치, 대상객체, 대상시작위치, 크기);
		// num3의 데이터를 num4에 복사
		//	            (복사해 올 데이터, 인덱스 시작 위치, 담을 배열, 시작 위치, 크기)
		printData("num4", num4);
		System.arraycopy(num3, 0, num4, 0, num4.length);
		
		System.out.println("==  Copy  ==");
		System.out.println();
		num4[num4.length-1] = 777;
		printData("num3", num3);
		printData("num4", num4);
		
		
		
		System.out.println("==========================");
		System.out.println("==== 배열객체.clone() 복사 ====");
		// 주소 값이 다르다.
		int[] num5 = num4.clone();
		
		System.out.println(num4);
		System.out.println(num5);
		printData("num4", num4);
		printData("num5", num5);
		
		
		
		
	}
	
	static void printData(int[] arry) {
		
		for (int i = 0; i< arry.length; i++) {
			System.out.print(arry[i] + " ");
		}System.out.println();
		
	
	}

	//메서드 오버로딩(method overloading)
	static void printData(String name, int[] arry) {
		System.out.print(name + ": ");

		for (int i = 0; i< arry.length; i++) {
			System.out.print(arry[i] + " ");
		}System.out.println();
	}
	
}
