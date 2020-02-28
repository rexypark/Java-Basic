package com.mystudy.ex09_list_set_map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StudentManager extends StudentVO {
	/*  Map 을 사용한 성적 처리
	1. 3명의 학생데이타(성명,국어,영어,수학)를 
	   StudentVO 클래스를 이용해서 만들고(저장하고)
	   "홍길동", 100, 90, 81
	   "이순신", 95, 88, 92
	   "김유신", 90, 87, 77
	2. Map<String, StudentVO> 타입의 변수(map)에 저장하고
	   key: 이름, value: StudentVO
	3. map에 있는 데이타를 사용해서 화면출력
	     성명     국어   영어  수학    총점     평균
	   --------------------------
	     홍길동  100  90  81  270  90.33
	   ...
	4. "홍길동" 학생의  국어점수 88점으로 수정
	5. "홍길동" 학생의 정보를 화면 출력
	************************************/
	public static void main(String[] args) {
		
		// 3명의 학생데이타(성명,국어,영어,수학)를 
		// StudentVO 클래스를 이용해서 만들고(저장하고)
		
		StudentVO std1 = new StudentVO("홍길동", 100, 95, 81);
		StudentVO std2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO std3 = new StudentVO("김유신", 90, 87, 77);
		//홍길동 국어점수 88점
		StudentVO std4 = new StudentVO("홍길동", 100, 95, 81);
		
		Map<String, StudentVO> map = new TreeMap<>();
		
		map.put(std1.getName(), std1);
		map.put(std2.getName(), std2);
		map.put(std3.getName(), std3);
		
		//====================================================
		
		//3. map에 있는 데이타를 사용해서 화면출력
		
		Set<String> keys = map.keySet();
		
		System.out.println("keys : " + keys);
		
		System.out.println("3. map에 있는 데이타를 사용해서 화면출력");
		System.out.println();
		System.out.println("이름" + "\t" + "국어" + "\t"+ "영어" + "\t" + "수학" + "\t" + "총점"  + "\t" + "평균");
		System.out.println("---------------------------------------------");
		
//		for (String key : keys) {
//			
//			System.out.println(map.get(key).getName() + "\t" + 
//					   		   map.get(key).getKor() + "\t" + 
//					   		   map.get(key).getEng() + "\t" + 
//					   		   map.get(key).getMath() + "\t" + 
//							   map.get(key).getSum() + "\t" + 
//							   map.get(key).getAvg());
//		}
	
		for (String key : keys) {
			
			StudentVO vo = map.get(key);
			vo.printData();
			
		}
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println();
		
		
		
		// 4. "홍길동" 학생의  국어점수 88점으로 수정
		// (1)replace
		map.replace("홍길동", std4);
		// (2) StudentVO를 바꾸기
		//map.get("홍길동").setKor(88);
		
		//5. "홍길동" 학생의 정보를 화면 출력	
		System.out.println("5. \"홍길동\" 학생의 정보를 화면 출력");
		System.out.println();
		System.out.println("이름" + "\t" + "국어" + "\t"+ "영어" + "\t" + "수학" + "\t" + "총점"  + "\t" + "평균");
		System.out.println("--------------------------------------------");
		map.get("홍길동").printData();
	}
}
