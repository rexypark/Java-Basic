
public class Ex_02 {

	
	public static void main(String[] args) {
		
		/* char Ÿ�� ������ ������ �� �ִ� �迭�� ����ؼ� 
		     �迭�� *�� �����ϰ�, �迭�� �ִ� �����͸� ����ؼ�
		     �ﰢ�� ������� ���
		 	*
		 	**
		 	***
		 	****
		 	*****
		 	arr[5] �ȿ� {*,#,$,%,&}
		 	�ش� �ﰢ�� ���
		 */
		
		char arr[] = {'*', '#', '$', '%', '&'};
		
		for (int i = 0; i <= arr.length-1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[j] + " ");
			}System.out.println();
		
			
		}
		
	}
	
}
