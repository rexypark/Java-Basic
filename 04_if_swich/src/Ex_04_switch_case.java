
public class Ex_04_switch_case {
	public static void main(String[] args) {
		//switch case문 : 동등 비교 구문
		/*
		 * 기준값에는 실수형 비교 안함
		 switch (기준값) {
		 case 비교값 :
		 	실행할 문장(들);
		 	break;
		 case 비교값2 :
		 	실행할 문장(들);
		 	break;
		 ...
		 default :
		 	실행할 문장(들);
		 	break;
		 }
		 */
		int month = 3;
		switch (month) {
		case 1 :
		case 3 :
		case 5 :
			System.out.println("31일 까지 있습니다.");
			break;
		case 2 :
			System.out.println("28일 까지 있습니다.");
			break;
		
		default :
			System.out.println("일치하는 값이 없습니다.");
			break;
		case 4 :
			System.out.println("31일 까지 있습니다.");
			break;	

			
		}
		System.out.println("switch 끝");
		System.out.println(month + "월은 31일까지 있습니다.");
		System.out.println( "===============");
		/* 경품추천 결과에 따라 상품 지급
		 1등 :  냉장고, 2등 : 김치냉장고, 3등 : 세탁기, 4등 : 청소기
		 등수에 해당하지 않으면(꽝인 경우) : 휴지
		 
		 
		 */
		String result = "1등";
		String gift = "";
		switch(result) {
		case "1등" :
			gift = "냉장고";
			break;
		case "2등" :
			gift = "김치냉장고";
			break;
		case "3등" :
			gift = "세탁기";
			break;
		case "4등" :
			gift = "청소기";
			break;
		default :
			gift = "휴지";
			break;
		}
		System.out.println("등수  :  " + result);
		System.out.println("추첨결과  :  " + gift);
	}
}
