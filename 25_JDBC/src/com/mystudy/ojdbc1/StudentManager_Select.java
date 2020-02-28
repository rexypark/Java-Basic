package com.mystudy.ojdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentManager_Select {

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
		//1. JDBC 드라이버 로딩
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//2. DB연결  - Connection 객체 생성 <-DriverManager
		//DriverManager.getConnection(url, user, password);
		//주소                                                                              orca SID
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		//접속 명( 유저명)
		String user = "mystudy";
		//접속 비밀번호
		String pw = "MYSTUDY"; //MYSTUDY
		
		Connection conn = null;		
		try {
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println(">> DB연결 성공");
		} catch (SQLException e) {
			System.out.println("[예외] DB연결 실패!!!");
			e.printStackTrace();
		}
		
		//3. Statement문 실행(SQL문 실행)  주로 preparedstatement사용
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			
			//SQL문장 준비하고 실행
			String sql = "";
			sql += "SELECT *";
			sql += " FROM STUDENT ";
			sql += " ORDER BY NAME ";
			
			//4. SQL 실행 결과에 대한 처리
			//   -SELECT : 조회(검색) 데이타 결과 값에 대한 처리
			//   -INSERT, UPDATE, DELETE : int값(건수) 처리
			rs = stmt.executeQuery(sql);
			System.out.println(">> SELECT 결과 처리");
			//다음데이터가 있나?
			System.out.println();
			System.out.println("ID" + "\t" + "이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
			while (rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int math = rs.getInt("math");
				int tot = rs.getInt("tot");
				double avg = rs.getInt("avg");
				System.out.println(id + "\t" + name +"\t" + kor+ "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 5. 클로징 처리에 의한 자원 반납(객체생성 순서와 역순으로 진행)
		try {
			if (rs != null)rs.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			stmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
