
public class Ex_02_gt_lt {
	public static void main(String[] args) {
		// �� ������ : >,<, <=,>=
		int a = 1;
		int b = 2;
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
// ctrl + alt ����Ű �Ʒ� > �ش��� ����
// ctrl + d > ���� ����
		
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
			System.out.println("power ���� true : ����ON ����");
		}
		if (!power){
			System.out.println("power ���� false : ����OFF ����");
		}
		
		
		
		
		
		
	}
}
