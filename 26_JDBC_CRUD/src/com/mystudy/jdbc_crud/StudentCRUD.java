package com.mystudy.jdbc_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

public class StudentCRUD {
	
	final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	final String user = "mystudy";
	final String password = "MYSTUDY";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//드라이버 로딩
	public StudentCRUD() {
		try {
			//1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
		} catch (ClassNotFoundException e) {
			System.out.println(">>드라이버 로딩 실패");
			e.printStackTrace();
		}
	}

	
	//Student 테이블에 있는 1개의 데이터 조회해서 화면 표시
	//ID값을 전달하면 데이터 가져와서 화면에 표시
	public void dispData(String id) {
		
		//2. DB연결  - Connection 객체 생성 <-DriverManager
		try {
				conn = DriverManager.getConnection(url,user,password);
				
				//3. Statement문 실행(SQL문 실행)
				String sql = "";
				sql += "SELECT * ";
				sql += "FROM STUDENT ";
				sql += "WHERE ID = ? ";
				
				//3-1 PreparedStatement 객체 생성 <- Connection 객체로 부터
				pstmt = conn.prepareStatement(sql);
				
				//3-2. ?(바인드 변수)에 값 설정
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				//4. SQL 실행 결과에 대한 처리
				//   -SELECT : 조회(검색) 데이타 결과 값에 대한 처리
				//   -INSERT, UPDATE, DELETE : int값(건수) 처리
				if(rs.next()) {
					String str = "";
					str += rs.getString(1) + "\t";
					str += rs.getString(2) + "\t";
					str += rs.getInt(3) + "\t";
					str += rs.getInt(4) + "\t";
					str += rs.getInt(5) + "\t";
					str += rs.getInt(6) + "\t";
					str += rs.getDouble(7) + "\t";
					
					System.out.println(str);
				} else {
					System.out.println("[ " + id + " data 없음 ]");
				}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (rs != null)rs.close();
				pstmt.close();
				conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	//하나의 데이터를 조회해서 VO에 저장해서 리턴
	public StudentVO selectId(String id) {
		//DB 연결하고 SQL문 실행해서 결과값을 stu변수에 저장		
		StudentVO stu = null;
		//2. DB연결  - Connection 객체 생성 <-DriverManager
		try {
			conn = DriverManager.getConnection(url,user,password);
			
			//3. Statement문 실행(SQL문 실행)
			String sql = "";
			sql += "SELECT * ";
			sql += "FROM STUDENT ";
			sql += "WHERE ID = ? ";
			
			//3-1 PreparedStatement 객체 생성 <- Connection 객체로 부터
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(바인드 변수)에 값 설정
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
		
			//4. SQL 실행결과에 대한 처리
			if (rs.next()) {//데이터가 있으면
				//StudentVO 타입의 stu 변수에 조회 데이터 저장
				stu = new StudentVO(id, rs.getString("NAME"), rs.getInt("KOR"), rs.getInt("ENG"), rs.getInt("MATH"), rs.getInt("TOT"), rs.getDouble("AvG"));
			} else {
				System.out.println("[ " + id + " data 없음 ]");
			}
		} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				closeConnectionStmtRs(conn, pstmt, rs);
			}
		
		return stu;
	}
	
	private void closeConnectionStmtRs(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) rs.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try { 
			pstmt.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		try { 
			conn.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	//전체 데이터 조회해서 ArrayList에 담아서 리턴
	//하나의 데이터를 StudentVO에 담고, VO를 ArrayList에 담아서 리턴
	public List<StudentVO> selectAll() {
		ArrayList<StudentVO> list = new ArrayList<>();
		
		//2. DB연결  - Connection 객체 생성 <-DriverManager
		try {
				conn = DriverManager.getConnection(url,user,password);
				
				//3. Statement문 실행(SQL문 실행)
				String sql = "";
				sql += "SELECT * ";
				sql += "FROM STUDENT ";
				sql += "ORDER BY ID";
				
				//3-1 PreparedStatement 객체 생성 <- Connection 객체로 부터
				pstmt = conn.prepareStatement(sql);
				
				//3-2. ?(바인드 변수)에 값 설정
				rs = pstmt.executeQuery();
			//4. 결과에 대한 처리
			while(rs.next()) {
				//DB데이터 하나를 StudentVO에 저장 + 리스트에 추가
				StudentVO vo = new StudentVO(rs.getString("ID"), rs.getString("NAME"), rs.getInt("KOR"), rs.getInt("ENG"), rs.getInt("MATH"), rs.getInt("TOT"), rs.getDouble("AVG"));
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	//DB에 데이터 입력(INSERT)
	public int insertData(String id, String name, int kor, int eng, int math, int tot, double avg) {
		int cnt = 0;

		try {
			//(실습) DB연결하고 전달받은 값으로 DB에 입력 처리 
			conn = DriverManager.getConnection(url,user,password);
			
			//3. Statement문 실행(SQL문 실행)
			//3-1. Connection 객체로 부터 Statement 객체생성
			String sql ="";
			sql += "INSERT INTO STUDENT  ";
			sql += "VALUES(?,?,?,?,?,?,?)";
	
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(바인드변수) 위치에 값 대입
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, kor);
			pstmt.setInt(4, eng);
			pstmt.setInt(5, math);
			pstmt.setInt(6, tot);
			pstmt.setDouble(7, avg);
			
			//3-3. Statement(PreparedStatement) 실행
			cnt = pstmt.executeUpdate();
			System.out.println("데이터 처리 횟수 : " + cnt);
		} catch (SQLException e) {
			System.out.println("[ 오류발생 ]");
			
			e.printStackTrace();
		} finally {
			closeConnStmtRs(conn, pstmt);
			
		}
		
		return cnt;
	}
		
	
	//DB에 데이터 입력(INSERT) : StudentVO 타입 값 전달받아 입력 처리
	public int insertData(StudentVO stu) {
		int cnt = 0;
		//(실습) DB연결하고 전달받은 값으로 DB에 입력 처리 
			try {
				conn = DriverManager.getConnection(url,user,password);
				
				//3. Statement문 실행(SQL문 실행)
				//3-1. Connection 객체로 부터 Statement 객체생성
				String sql ="";
				sql += "INSERT INTO STUDENT  ";
				sql += "VALUES(?,?,?,?,?,?,?)";
	
				pstmt = conn.prepareStatement(sql);
				
				//3-2. ?(바인드변수) 위치에 값 대입
				pstmt.setString(1, stu.getId());
				pstmt.setString(2, stu.getName());
				pstmt.setInt(3, stu.getKor());
				pstmt.setInt(4, stu.getEng());
				pstmt.setInt(5, stu.getMath());
				pstmt.setInt(6, stu.getTot());
				pstmt.setDouble(7, stu.getAvg());
				
				//3-3. Statement(PreparedStatement) 실행
				cnt = pstmt.executeUpdate();
				System.out.println("데이터 처리 횟수 : " + cnt);
			} catch (SQLException e) {
				System.out.println("[ 오류발생 ]");
				
				e.printStackTrace();
			}  finally {
				closeConnStmtRs(conn, pstmt);
				
			}
			
		return cnt;
	}
		
	
	//수정(UPDATE) : StudentVO 데이터를 받아서 수정(ID를 제외한 모든 데이터 수정)
	//ID 값으로 찾아서 수정처리	
	public int updateData(StudentVO stu) {
		int result = 0;
		
		try {
				conn = DriverManager.getConnection(url,user,password);
				
				//3. Statement문 실행(SQL문 실행)
				//3-1. Connection 객체로 부터 Statement 객체생성
				String sql ="";
				sql += "UPDATE STUDENT  ";
				sql += "SET TOT = ?, AVG = ?";
				sql += "WHERE ID = ?";
	
				pstmt = conn.prepareStatement(sql);
				
				//3-2. ?(바인드변수) 위치에 값 대입
				pstmt.setInt(1, stu.getTot());
				pstmt.setDouble(2, stu.getAvg());
				pstmt.setString(3, stu.getId());
				
				
				//3-3. Statement(PreparedStatement) 실행
				result = pstmt.executeUpdate();
				System.out.println("데이터 처리 횟수 : " + result);
			} catch (SQLException e) {
				System.out.println("[ 오류발생 ]");
				
				e.printStackTrace();
			} finally {
				closeConnStmtRs(conn, pstmt);
				
			}
		
		return result;
	}
	
	
	//삭제(DELETE) : ID값을 전달받아 데이터 삭제
	public int deleteData(String id) {
		int result = 0;
		
		try {
				conn = DriverManager.getConnection(url,user,password);
				
				//3. Statement문 실행(SQL문 실행)
				//3-1. Connection 객체로 부터 Statement 객체생성
				String sql ="";
				sql += "DELETE FROM STUDENT  ";
				sql += "WHERE ID = ?";
	
				pstmt = conn.prepareStatement(sql);
				
				//3-2. ?(바인드변수) 위치에 값 대입
				pstmt.setString(1, id);
				
				//3-3. Statement(PreparedStatement) 실행
				result = pstmt.executeUpdate();
				System.out.println("데이터 처리 횟수 : " + result);
			} catch (SQLException e) {
				System.out.println("[ 오류발생 ]");
				
				e.printStackTrace();
			} finally {
				closeConnStmtRs(conn, pstmt);
			}
		return result;
	}

	
	//삭제(DELETE) : StudentVO 타입 값을 전달받아 ID값으로 데이터 삭제
	public int deleteData(StudentVO stu) {
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(url,user,password);
			
			//3. Statement문 실행(SQL문 실행)
			//3-1. Connection 객체로 부터 Statement 객체생성
			String sql ="";
			sql += "DELETE FROM STUDENT  ";
			sql += "WHERE ID = ?";
	
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(바인드변수) 위치에 값 대입
			pstmt.setString(1, stu.getId());
			
			//3-3. Statement(PreparedStatement) 실행
			result = pstmt.executeUpdate();
			System.out.println("데이터 처리 횟수 : " + result);
		} catch (SQLException e) {
			System.out.println("[ 오류발생 ]");
			
			e.printStackTrace();
		}  finally {
			closeConnStmtRs(conn, pstmt);
		}
		
		return result;
	}
		
	
	private void closeConnStmtRs(Connection conn,
			PreparedStatement pstmt) {
		try {
			if (pstmt != null) pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	

}
