
public class Ex_02_gt_lt {
	public static void main(String[] args) {
		// 비교 연산자 : >,<, <=,>=
		int a = 1;
		int b = 2;
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
// ctrl + alt 방향키 아래 > 해당줄 복사
// ctrl + d > 한줄 삭제
		
		System.out.println("==============");
		
		boolean power = true;
		System.out.println("power  :  " + power);
		power = !power;
		System.out.println("power  :  " + power);
		power = !power;
		System.out.println("power  :  " + power);

		
		
		System.out.println("==============");
		power = false;
		if (power) {
			System.out.println("power 값이 true : 전원ON 상태");
		}
		if (!power){
			System.out.println("power 값이 false : 전원OFF 상태");
		}
		
		
		
		
		
		
	}
}
