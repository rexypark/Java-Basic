
public class Ex_09_Double {

	public static void main(String[] args) {
		// 실수형 double
		// 표시 형식 : 숫자.숫자 / 숫자.숫자 + D 또는 d
		double d1 = 1.1;
		double d2 = 1.123456789092831231231238D;
		
		System.out.println("double 1.1 : " + d1);
		System.out.println("double 1.123456789091231232838 : " + d2);
		
		System.out.println("3.4d + 3.4d : " + (3.4d+3.4d));
		System.out.println("======================");
		
		float f1 = 3.4f;
		double d3 = 2.3d;
		d1 = f1;

		f1 = (float)d3;
		
		// 정수형 <-> 실수형 : 자동형 변환 결정 여부는 표현범위
		// int, long, -> float, double : 자동 형변환 가능하나 하지 말것
		
	}
}
