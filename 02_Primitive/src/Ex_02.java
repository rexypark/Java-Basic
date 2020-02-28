
public class Ex_02 {
	
	public static void main(String[] args) {
		//boolean : true, false 값을 가짐(논리형)
		// 타입변수명 = 초기값;
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println("------------------");
		bool1 = false;
		if(bool1) { //bool1의 값이 true이면 해당 식 실행
			System.out.println("bool1이 \"true\"여서 실행");
		}else {
			System.out.println("bool1이 \"false\"여서 실행");
		}
	}
}


















