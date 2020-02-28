package com.mystudy.jdbc_crud;

import java.util.ArrayList;
import java.util.List;

public class StudentCRUD_Test {
	
	public static void main(String[] args) {
		String id ="2019001";
		String name = "손덕영";
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
//			System.out.printf("[ %s data 없음 ]", id);
//		}
		
		
		System.out.println("=====================");
		List<StudentVO> allList = crud.selectAll();
		System.out.println(allList);
		//모든 값 update
		for (StudentVO vv : allList) {
			crud.updateData(vv);
		}
		
//		System.out.println("=====================");

	  //데이터 insert
//	  crud.insertData(id, name, kor, eng, math, tot, avg);
	  //객체 insert
//	  StudentVO testVO = allList.get(allList.size()-1);
//	  crud.insertData(testVO);
		
	  //객체 StudentVO를 받아 해당 id 이외에 데이터를 수정
		
//	  crud.updateData(testVO);
		
//	  System.out.println("Update complete");
//	  crud.deleteData(testVO);
		
	}
}
