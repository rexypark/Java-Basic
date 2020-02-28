
public class Ex_02 {

	
	public static void main(String[] args) {
		
		/* char 타입 데이터 저장할 수 있는 배열을 사용해서 
		     배열에 *를 저장하고, 배열에 있는 데이터를 사용해서
		     삼각형 모양으로 출력
		 	*
		 	**
		 	***
		 	****
		 	*****
		 	arr[5] 안에 {*,#,$,%,&}
		 	해당 삼각형 출력
		 */
		
		char arr[] = {'*', '#', '$', '%', '&'};
		
		for (int i = 0; i <= arr.length-1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[j] + " ");
			}System.out.println();
		
			
		}
		
	}
	
}
