package com.mystudy.jdbc_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//JDBC�� �̿��� DB ���α׷��� ���� ------------------
//0. JDBC ���̺귯�� ����ȯ�� ����(�����ο� ���)
//1. JDBC ����̹� �ε�
//2. DB����  - Connection ��ü ���� <-DriverManager
//3. Statement�� ����(SQL�� ����)
//4. SQL ���� ����� ���� ó��
//   -SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
//   -INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
//============================================

public class StudentCRUD {
	
	final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	final String user = "mystudy";
	final String password = "MYSTUDY";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//����̹� �ε�
	public StudentCRUD() {
		try {
			//1. JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			
		} catch (ClassNotFoundException e) {
			System.out.println(">>����̹� �ε� ����");
			e.printStackTrace();
		}
	}

	
	//Student ���̺� �ִ� 1���� ������ ��ȸ�ؼ� ȭ�� ǥ��
	//ID���� �����ϸ� ������ �����ͼ� ȭ�鿡 ǥ��
	public void dispData(String id) {
		
		//2. DB����  - Connection ��ü ���� <-DriverManager
		try {
				conn = DriverManager.getConnection(url,user,password);
				
				//3. Statement�� ����(SQL�� ����)
				String sql = "";
				sql += "SELECT * ";
				sql += "FROM STUDENT ";
				sql += "WHERE ID = ? ";
				
				//3-1 PreparedStatement ��ü ���� <- Connection ��ü�� ����
				pstmt = conn.prepareStatement(sql);
				
				//3-2. ?(���ε� ����)�� �� ����
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				//4. SQL ���� ����� ���� ó��
				//   -SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
				//   -INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
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
					System.out.println("[ " + id + " data ���� ]");
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
	
	
	//�ϳ��� �����͸� ��ȸ�ؼ� VO�� �����ؼ� ����
	public StudentVO selectId(String id) {
		//DB �����ϰ� SQL�� �����ؼ� ������� stu������ ����		
		StudentVO stu = null;
		//2. DB����  - Connection ��ü ���� <-DriverManager
		try {
			conn = DriverManager.getConnection(url,user,password);
			
			//3. Statement�� ����(SQL�� ����)
			String sql = "";
			sql += "SELECT * ";
			sql += "FROM STUDENT ";
			sql += "WHERE ID = ? ";
			
			//3-1 PreparedStatement ��ü ���� <- Connection ��ü�� ����
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(���ε� ����)�� �� ����
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
		
			//4. SQL �������� ���� ó��
			if (rs.next()) {//�����Ͱ� ������
				//StudentVO Ÿ���� stu ������ ��ȸ ������ ����
				stu = new StudentVO(id, rs.getString("NAME"), rs.getInt("KOR"), rs.getInt("ENG"), rs.getInt("MATH"), rs.getInt("TOT"), rs.getDouble("AvG"));
			} else {
				System.out.println("[ " + id + " data ���� ]");
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
	
	
	//��ü ������ ��ȸ�ؼ� ArrayList�� ��Ƽ� ����
	//�ϳ��� �����͸� StudentVO�� ���, VO�� ArrayList�� ��Ƽ� ����
	public List<StudentVO> selectAll() {
		ArrayList<StudentVO> list = new ArrayList<>();
		
		//2. DB����  - Connection ��ü ���� <-DriverManager
		try {
				conn = DriverManager.getConnection(url,user,password);
				
				//3. Statement�� ����(SQL�� ����)
				String sql = "";
				sql += "SELECT * ";
				sql += "FROM STUDENT ";
				sql += "ORDER BY ID";
				
				//3-1 PreparedStatement ��ü ���� <- Connection ��ü�� ����
				pstmt = conn.prepareStatement(sql);
				
				//3-2. ?(���ε� ����)�� �� ����
				rs = pstmt.executeQuery();
			//4. ����� ���� ó��
			while(rs.next()) {
				//DB������ �ϳ��� StudentVO�� ���� + ����Ʈ�� �߰�
				StudentVO vo = new StudentVO(rs.getString("ID"), rs.getString("NAME"), rs.getInt("KOR"), rs.getInt("ENG"), rs.getInt("MATH"), rs.getInt("TOT"), rs.getDouble("AVG"));
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	//DB�� ������ �Է�(INSERT)
	public int insertData(String id, String name, int kor, int eng, int math, int tot, double avg) {
		int cnt = 0;

		try {
			//(�ǽ�) DB�����ϰ� ���޹��� ������ DB�� �Է� ó�� 
			conn = DriverManager.getConnection(url,user,password);
			
			//3. Statement�� ����(SQL�� ����)
			//3-1. Connection ��ü�� ���� Statement ��ü����
			String sql ="";
			sql += "INSERT INTO STUDENT  ";
			sql += "VALUES(?,?,?,?,?,?,?)";
	
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(���ε庯��) ��ġ�� �� ����
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, kor);
			pstmt.setInt(4, eng);
			pstmt.setInt(5, math);
			pstmt.setInt(6, tot);
			pstmt.setDouble(7, avg);
			
			//3-3. Statement(PreparedStatement) ����
			cnt = pstmt.executeUpdate();
			System.out.println("������ ó�� Ƚ�� : " + cnt);
		} catch (SQLException e) {
			System.out.println("[ �����߻� ]");
			
			e.printStackTrace();
		} finally {
			closeConnStmtRs(conn, pstmt);
			
		}
		
		return cnt;
	}
		
	
	//DB�� ������ �Է�(INSERT) : StudentVO Ÿ�� �� ���޹޾� �Է� ó��
	public int insertData(StudentVO stu) {
		int cnt = 0;
		//(�ǽ�) DB�����ϰ� ���޹��� ������ DB�� �Է� ó�� 
			try {
				conn = DriverManager.getConnection(url,user,password);
				
				//3. Statement�� ����(SQL�� ����)
				//3-1. Connection ��ü�� ���� Statement ��ü����
				String sql ="";
				sql += "INSERT INTO STUDENT  ";
				sql += "VALUES(?,?,?,?,?,?,?)";
	
				pstmt = conn.prepareStatement(sql);
				
				//3-2. ?(���ε庯��) ��ġ�� �� ����
				pstmt.setString(1, stu.getId());
				pstmt.setString(2, stu.getName());
				pstmt.setInt(3, stu.getKor());
				pstmt.setInt(4, stu.getEng());
				pstmt.setInt(5, stu.getMath());
				pstmt.setInt(6, stu.getTot());
				pstmt.setDouble(7, stu.getAvg());
				
				//3-3. Statement(PreparedStatement) ����
				cnt = pstmt.executeUpdate();
				System.out.println("������ ó�� Ƚ�� : " + cnt);
			} catch (SQLException e) {
				System.out.println("[ �����߻� ]");
				
				e.printStackTrace();
			}  finally {
				closeConnStmtRs(conn, pstmt);
				
			}
			
		return cnt;
	}
		
	
	//����(UPDATE) : StudentVO �����͸� �޾Ƽ� ����(ID�� ������ ��� ������ ����)
	//ID ������ ã�Ƽ� ����ó��	
	public int updateData(StudentVO stu) {
		int result = 0;
		
		try {
				conn = DriverManager.getConnection(url,user,password);
				
				//3. Statement�� ����(SQL�� ����)
				//3-1. Connection ��ü�� ���� Statement ��ü����
				String sql ="";
				sql += "UPDATE STUDENT  ";
				sql += "SET TOT = ?, AVG = ?";
				sql += "WHERE ID = ?";
	
				pstmt = conn.prepareStatement(sql);
				
				//3-2. ?(���ε庯��) ��ġ�� �� ����
				pstmt.setInt(1, stu.getTot());
				pstmt.setDouble(2, stu.getAvg());
				pstmt.setString(3, stu.getId());
				
				
				//3-3. Statement(PreparedStatement) ����
				result = pstmt.executeUpdate();
				System.out.println("������ ó�� Ƚ�� : " + result);
			} catch (SQLException e) {
				System.out.println("[ �����߻� ]");
				
				e.printStackTrace();
			} finally {
				closeConnStmtRs(conn, pstmt);
				
			}
		
		return result;
	}
	
	
	//����(DELETE) : ID���� ���޹޾� ������ ����
	public int deleteData(String id) {
		int result = 0;
		
		try {
				conn = DriverManager.getConnection(url,user,password);
				
				//3. Statement�� ����(SQL�� ����)
				//3-1. Connection ��ü�� ���� Statement ��ü����
				String sql ="";
				sql += "DELETE FROM STUDENT  ";
				sql += "WHERE ID = ?";
	
				pstmt = conn.prepareStatement(sql);
				
				//3-2. ?(���ε庯��) ��ġ�� �� ����
				pstmt.setString(1, id);
				
				//3-3. Statement(PreparedStatement) ����
				result = pstmt.executeUpdate();
				System.out.println("������ ó�� Ƚ�� : " + result);
			} catch (SQLException e) {
				System.out.println("[ �����߻� ]");
				
				e.printStackTrace();
			} finally {
				closeConnStmtRs(conn, pstmt);
			}
		return result;
	}

	
	//����(DELETE) : StudentVO Ÿ�� ���� ���޹޾� ID������ ������ ����
	public int deleteData(StudentVO stu) {
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(url,user,password);
			
			//3. Statement�� ����(SQL�� ����)
			//3-1. Connection ��ü�� ���� Statement ��ü����
			String sql ="";
			sql += "DELETE FROM STUDENT  ";
			sql += "WHERE ID = ?";
	
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(���ε庯��) ��ġ�� �� ����
			pstmt.setString(1, stu.getId());
			
			//3-3. Statement(PreparedStatement) ����
			result = pstmt.executeUpdate();
			System.out.println("������ ó�� Ƚ�� : " + result);
		} catch (SQLException e) {
			System.out.println("[ �����߻� ]");
			
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
