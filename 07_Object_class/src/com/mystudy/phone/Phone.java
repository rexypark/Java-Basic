package com.mystudy.phone;


//생성자
//가. 기본생성자(default Constructor)
public class Phone extends Object{
	
	String name;  //모델명
	String phoneNo;  //번호
	int hsize = 138;    //LCD유무
	int vsize = 67;    //
	boolean hasLCD = true;
	
	
	Phone(){};
	
	Phone(String name, String phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	
	//나. 파라미터값 : 모델명, 타입
//	Phone(String n, String pN) {
//			
//			name = n;
//			phoneNo = pN;
//			
//		}
//	
	//다. 파라미터값 : 모델명, 타입, LCD유무
	Phone(String n, String pN, boolean lcd) {
		
		name = n;
		phoneNo = pN;
		hasLCD = true;
	}
	
	

	// 가. 전화걸기 : call
	// 1) 화면출력: "전화걸기" 
	void call() {
		System.out.println("전화걸기");
	}
	
	// 나. 전화받기 : receiveCall
	// 1) 화면출력: "전화받기" 
	void receiveCall() {
		System.out.println("전화받기");
	}
	
	// 다. 메시지 보내기 : sendSms
	// 1) 메시지를 String 타입으로 받아서 보냅니다
	// 2) 화면출력: "[메시지전송]" + 메시지내용(전달받은메시지) 
	void sendSms(String txt) {
		System.out.println("[메세지전송]");
		System.out.println(txt);
	}
	// 라. 메시지 받기 : receiveSms
	// 1) 받은 메시지를 String 타입으로 돌려줍니다.(return)
	// 2) 화면출력: "[메시지수신]" + 받은메시지

	void receiveSms(String txt) {
		System.out.println("[메세지수신]");
		System.out.println(txt);
	}
	
	
	@Override
	public String toString() {
		return "Phone [name=" + name + ", phoneNo=" + phoneNo + ", hsize=" + hsize + ", vsize=" + vsize + ", hasLCD="
				+ hasLCD + "]";
	}


	String receiveSMS(String msg) {
		return msg;
	}
	
	//마. 전화기 정보 확인 : viewInfo
	void viewInfo() {
		if (hasLCD == true) {
			
		}
		System.out.println("모델명 : " + name);
		System.out.println("전화번호 : " + phoneNo);
		System.out.println("가로크기 : " + hsize);
		System.out.println("세로크기 : " + vsize);
		if (hasLCD == true) {
			System.out.println("LCD유무 : " + "있음");	
		}else {
			System.out.println("LCD유무 : " + "없음");
		}
		
	}
	
	
	
}
