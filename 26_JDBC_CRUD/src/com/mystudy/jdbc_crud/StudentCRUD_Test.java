package com.mystudy.jdbc_crud;

import java.util.ArrayList;
import java.util.List;

public class StudentCRUD_Test {
	
	public static void main(String[] args) {
		String id ="2019001";
		String name = "�մ���";
		int kor = 90;
		int eng = 85;
		int math = 77;
		int tot = 0;
		double avg = 0;
		StudentCRUD crud = new StudentCRUD();
//		crud.dispData("2019011");
//		System.out.println("===================");
//		StudentVO vo = crud.selectId(id);
//		if (vo != null) {
//			System.out.println(vo.getName());
//		} else {
//			System.out.printf("[ %s data ���� ]", id);
//		}
		
		
		System.out.println("=====================");
		List<StudentVO> allList = crud.selectAll();
		System.out.println(allList);
		//��� �� update
		for (StudentVO vv : allList) {
			crud.updateData(vv);
		}
		
//		System.out.println("=====================");

	  //������ insert
//	  crud.insertData(id, name, kor, eng, math, tot, avg);
	  //��ü insert
//	  StudentVO testVO = allList.get(allList.size()-1);
//	  crud.insertData(testVO);
		
	  //��ü StudentVO�� �޾� �ش� id �̿ܿ� �����͸� ����
		
//	  crud.updateData(testVO);
		
//	  System.out.println("Update complete");
//	  crud.deleteData(testVO);
		
	}
}
