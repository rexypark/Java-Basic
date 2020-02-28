package com.mystudy.jdbc_dao;

import java.util.ArrayList;
import java.util.List;

public class MemberDAO_Test {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.selectAll();
		//insert�� ������ ��ȸ
		for (MemberVO mvo : list) {
			System.out.println(mvo.toString());
		}
		
		MemberVO inMvo = new MemberVO("rexyNew", "�ڼ���", "asdfw1530", "010-5717-1668", "����Ư���û��");
		//inMvo ������ insert		
		dao.insertOne(inMvo);
		
		//insert�� ������ ��ȸ		
		list = dao.selectAll();
		for (MemberVO mvo : list) {
			System.out.println(mvo.toString());
		}
		
		boolean isExist = dao.checkIdPassword("rexyNew", "asdfw1530");
		if (isExist) {
			System.out.println("---> ȸ������ ���� - �α��� ����");
		}else {
			System.out.println("---> ȸ������ ���� - �α��� �Ұ�");
		}
		
		
		//�������� ������ �Է�(List�� �����ؼ�)
//		List<MemberVO> insertList = new ArrayList<MemberVO>();
//		insertList.add(new MemberVO("hong9", "ȫ�浿9","1111", "01043435930", "�о��"));
//		insertList.add(new MemberVO("hong10", "ȫ�浿10","5411", "01043465930", "â����"));
//		insertList.add(new MemberVO("hong9", "ȫ�浿9","1111", "01043435930", "�����"));
//		insertList.add(new MemberVO("hong12", "ȫ�浿12","1871", "01043435930", "���ؽ�"));
		
		dao.insertOne(new MemberVO("hong9", "ȫ�浿9","1111", "01043435930", "�о��"));
		dao.insertOne(new MemberVO("hong10", "ȫ�浿10","5411", "01043465930", "â����"));
		
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
		inDeleteList.add(new MemberVO("hong9", "ȫ�浿9","1111", "01043435930", "�о��"));
		inDeleteList.add(new MemberVO("hong10", "ȫ�浿10","5411", "01043465930", "â����"));
		
		
		int isCnt = dao.deleteList(inDeleteList);
		System.out.println(">> �ϰ��Է°Ǽ� : " + isCnt);
		
		list = dao.selectAll();
		for (MemberVO mvo : list) {
			System.out.println(mvo.toString());
		}
		
	}
}
