
// 예외 만들기 : Exception 클래스를 상속받아 만들기
public class MyException extends Exception{
	//생성자
	public MyException() {
		//수퍼(부모)클래스의 생성자 호출(예외메세지)
		//(3) 이거때매그래
		super(">> 잘못 했잖아 ㅡㅡ");
		
	}

}
