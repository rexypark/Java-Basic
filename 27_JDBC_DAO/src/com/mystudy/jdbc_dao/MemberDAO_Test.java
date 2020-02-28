package com.mystudy.jdbc_dao;

import java.util.ArrayList;
import java.util.List;

public class MemberDAO_Test {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.selectAll();
		//insert전 데이터 조회
		for (MemberVO mvo : list) {
			System.out.println(mvo.toString());
		}
		
		MemberVO inMvo = new MemberVO("rexyNew", "박성구", "asdfw1530", "010-5717-1668", "서울특별시사람");
		//inMvo 데이터 insert		
		dao.insertOne(inMvo);
		
		//insert후 데이터 조회		
		list = dao.selectAll();
		for (MemberVO mvo : list) {
			System.out.println(mvo.toString());
		}
		
		boolean isExist = dao.checkIdPassword("rexyNew", "asdfw1530");
		if (isExist) {
			System.out.println("---> 회원정보 있음 - 로그인 가능");
		}else {
			System.out.println("---> 회원정보 없음 - 로그인 불가");
		}
		
		
		//여러개의 데이터 입력(List를 전달해서)
//		List<MemberVO> insertList = new ArrayList<MemberVO>();
//		insertList.add(new MemberVO("hong9", "홍길동9","1111", "01043435930", "밀양시"));
//		insertList.add(new MemberVO("hong10", "홍길동10","5411", "01043465930", "창원시"));
//		insertList.add(new MemberVO("hong9", "홍길동9","1111", "01043435930", "마산시"));
//		insertList.add(new MemberVO("hong12", "홍길동12","1871", "01043435930", "진해시"));
		
		dao.insertOne(new MemberVO("hong9", "홍길동9","1111", "01043435930", "밀양시"));
		dao.insertOne(new MemberVO("hong10", "홍길동10","5411", "01043465930", "창원시"));
		
		System.out.println();
		System.out.println();
		System.out.println("hong9, hong10 INSERT");
		list = dao.selectAll();
		for (MemberVO mvo : list) {
			System.out.println(mvo.toString());
		}
		System.out.println();
		System.out.println();
		System.out.println("hong9, hong10 DELETE");
		
		List<MemberVO> inDeleteList = new ArrayList<MemberVO>();
		inDeleteList.add(new MemberVO("hong9", "홍길동9","1111", "01043435930", "밀양시"));
		inDeleteList.add(new MemberVO("hong10", "홍길동10","5411", "01043465930", "창원시"));
		
		
		int isCnt = dao.deleteList(inDeleteList);
		System.out.println(">> 일괄입력건수 : " + isCnt);
		
		list = dao.selectAll();
		for (MemberVO mvo : list) {
			System.out.println(mvo.toString());
		}
		
	}
}
