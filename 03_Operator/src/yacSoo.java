import java.util.Scanner;

public class yacSoo {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("수를 입력하시오. ");
		System.out.println(">");
		int num = scan.nextInt();
		int l = 0;
		int [] a;
		a = new int [10];
		for(int j=1; j<=num; j++) {
			if(num%j == 0) {
				l++;
				a[l] = j;
			}				
			
		}
		
		for(int i=1;i<l; i++) {
			System.out.println(a[i]);	
		}
		scan.close();		
	}
}
