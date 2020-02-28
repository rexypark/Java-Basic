
public class Ex_08_array2dim {
	public static void main(String[] args) {
		
		// 2차원 배열 선언 및 객체 생성
		// 타입[][] 변수명 = new 타입[크기값][크기값];
		// 타입 변수명[][] = new 타입[크기값][크기값];
		// 타입[][] 변수명 = {{..},{..},..,..,{..}};
		int [][] num1 = new int[5][5];
		int num2 [][] = new int[5][5];
		int num3 [][] = { {1,2,3,4,5},
				          {1,2,3,4,5},
						  {1,2,3,4,5},
						  {1,2,3,4,5},
						  {1,2,3,4,5} };
		
		for (int i = 0; i < num3.length; i++) {
			for (int j = 0; j < num3[0].length; j++) {
				
				System.out.print(num3[i][j] + " ");
				
			}System.out.println();
		}
		
		
		
		
				
	}
}
