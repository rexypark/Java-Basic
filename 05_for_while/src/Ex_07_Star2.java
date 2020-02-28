
public class Ex_07_Star2 {
	public static void main(String[] args) {
		/* º°Âï±â Á÷°¢ »ï°¢Çü
		 *
		 **
		 ***
		 ****
		 *****
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("==========");
		
		/*
		 *****
		 ****
		 ***
		 **
		 *
		 */
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("======");
		/*
		    * 
		   ** 
		  *** 
		 ****
		*****
		 */
		
		for (int i = 1; i <=5; i++) {
			for (int k = 1; k <= 5-i; k++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		System.out.println("==========");
		
	 	/*
	        *****
	 	     ****
		      ***
	           **
		        */
		
		
		System.out.println("==========");
		for (int i = 5; i >=1; i--) {
			for (int k = 1; k <= 5-i; k++) {
				System.out.print(" ");
			}
			   
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==========");
		
		/*
		    *
		   ***
		  *****
	  	 *******
		********* 
		 */
		//1, 3, 5, 7
		//4,3,2,1,0
		//1,2,3,4,5
		/*
		     *
		    **
		   ***
		  ****
		 *****
		*/
		for (int i = 1; i <= 5; i++) {
			
			for (int k = 1; k <= (5-i); k++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= (2*i -1); j++) {
				System.out.print("*");
			}
			System.out.println();
				
		}
		
		System.out.println();
		
		for (int i =1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		int sumNum = 1;
		for (int i =1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(sumNum + " ");
				sumNum++;
			}
			System.out.println();
		}
		
		
	}
}
