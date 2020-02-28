
public class Ex_03_AND_OR_NOT {
	public static void main(String[] args) {
		// 논리연산자 : && ( AND )       || ( OR )        !=(NOT)
		// 논리연산자(&&,||)의 좌/우에는 true/false값이 와야한다.
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1>num2 && num1< num2);
		System.out.println(num1<num2 && num1 < num2);
		System.out.println(num1>num2 || num1 < num2);
		System.out.println(num1<num2 || num1 < num2);
		boolean bool1 = false;
		boolean bool2 = true;
		
		System.out.println("---------");
		boolean result = (num1 < num2) && bool1;
		System.out.println(num1 + "  <  " + num2 + "  &&   " + bool1 + "  :  " + result);
		System.out.println("---------");
		
		System.out.println("false || true : " + (false||true));
		System.out.println("----(  ||  )----");
		
		result = num1 > num2 || bool2;
		System.out.println("num > num2  ||  bool2  :  "+bool2 );
		
		System.out.println("----(NOT)----");
		System.out.println("!true :  " + !true);
		result = !(num1 > num2 || bool2);
		
		System.out.println("!(num1 > num2 || bool2)  :  " + result);
 
		
		
	}
}
