
public class Ex_for_gugudan2 {
	public static void main(String[] args) {
		
		/* 구구단 2-9출력
		 2*1 = 2      3*1 = 3 .... 9*1 = 9
		  .
		  .
		  .
		 2*9 = 18.....3*9 = 27 ....9*9 = 81 
		 */
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if (j*i > 9) {
					System.out.print(j + " x "+ i + " = " + j*i + "    ");
				} else {
					System.out.print(j + " x "+ i + " =  " + j*i + "    ");
				}
			};
			System.out.println();
			System.out.println();
		}
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				
					System.out.print(j + " x "+ i + " = " + j*i + "\t");
			
			}
			System.out.println();
			System.out.println();
		}
		
		
	}
}
