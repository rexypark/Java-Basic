package com.mystudy.ojdbc2_statement;

import java.sql.*;

public class StudentManager_Delete {
	
	public static void main(String[] args) {
		//JDBC를 이용한 DB 프로그래밍 절차 ------------------
		//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)
		//1. JDBC 드라이버 로딩
		//2. DB연결  - Connection 객체 생성 <-DriverManager
		//3. Statement문 실행(SQL문 실행)
		//4. SQL 실행 결과에 대한 처리
		//   -SELECT : 조회(검색) 데이타 결과 값에 대한 처리
		//   -INSERT, UPDATE, DELETE : int값(건수) 처리
		//5. 클로징 처리에 의한 자원 반납
		//============================================
	
		
		//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)
		Connection conn = null;
		Statement stmt = null;
		
		
		try {
			//1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. DB연결  - Connection 객체 생성 <-DriverManager
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "mystudy";
			String password = "MYSTUDY";
			conn = DriverManager.getConnection(url,user,password);
			
			//3. Statement문 실행(SQL문 실행)
			//3-1. Connection 객체로 부터 Statement 객체생성
			stmt = conn.createStatement();
			
			//3.2. Statement 객체를 이용해서 SQL문 실행
			
			//(실습) 수정 : ID '2019001' 사람의 데이터 수정 처리
			// 이름 : 홍기정, 국어:99, 영어:88, 수학:77
			
			String sql = "";
			String id = "2019009";
			String name = "홍기정";
			int kor = 99;
			int eng = 88;
			int math = 77;
			int tot = 0;
			int avg = 0;
			
			sql +="DELETE FROM STUDENT ";
			sql +="WHERE ID = '" + id + "'";
			System.out.println("sql : " + sql);
			
			int rs = stmt.executeUpdate(sql); 
			System.out.println("count : " + rs);
		
			//4. SQL 실행 결과에 대한 처리
			//- SELECT : 조회(검색) 데이타 결과 값에 대한 처리

			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				stmt.close();
				conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
