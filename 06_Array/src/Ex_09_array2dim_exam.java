
public class Ex_09_array2dim_exam {
	public static void main(String[] args) {
	/*
	 (실습) 2차원 배열
	 int[][] num2dim = {{10,20},{30,40},{50,60}}
	 Q1. 2차원 배열인 num2dim의 값을 화면애 출력 : 100 20 30....
	 Q2. num2dim의 세번째 값인 30을 100으로 변경하고 화면 출력
	 Q3. num2dim의 크기만큼 num2copy 배열변수를 선언하고 num2dim의 값을
	          복사한 후 num2dim의 값을 화면 출력
	 
	  */
		
//     Q1
		System.out.println("Q1. == 2차원 배열 출력 ==");
		int[][] num2dim = {{10,20},{30,40},{50,60}};
		System.out.print("num2dim : ");

		for (int i = 0; i < num2dim.length; i++) {
			for (int j = 0; j < num2dim[0].length; j++) {
				System.out.print(num2dim[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println();
		
		
//		Q2
		System.out.println("Q2. == 30 -> 100으로 변환 ==");
		num2dim[1][0] = 100;
		System.out.print("num2dim : ");

		for (int i = 0; i < num2dim.length; i++) {
			for (int j = 0; j < num2dim[0].length; j++) {
				System.out.print(num2dim[i][j] + " ");
			}
		}
		
		System.out.println();
		System.out.println();
//		Q3 2차원 배열 복사
		
		System.out.println("Q3. == 복사 배열 출력 ==");
		int [][] num2copy = new int [num2dim.length][num2dim[0].length];
		for (int i = 0; i < num2copy.length; i++) {
			
			num2copy[i] = num2dim[i].clone();
			
		}
		
		
		
		System.out.print("num2dim : ");

		for (int i = 0; i < num2dim.length; i++) {
			for (int j = 0; j < num2dim[0].length; j++) {
				System.out.print(num2dim[i][j] + " ");
			}
		}
		
		System.out.println();
		System.out.println();

		System.out.print("num2copy : ");

		for (int i = 0; i < num2copy.length; i++) {
			for (int j = 0; j < num2copy[0].length; j++) {
				System.out.print(num2copy[i][j] + " ");
			}
		}
		
		
	}

}
