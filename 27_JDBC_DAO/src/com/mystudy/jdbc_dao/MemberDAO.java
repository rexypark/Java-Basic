package com.mystudy.jdbc_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DAO, Dao : Data Access Object / Database Access Object
//������(�����ͺ��̽�-DB)�� �����ؼ� CRUD�� ������ Ŭ����

//JDBC�� �̿��� DB ���α׷��� ���� ------------------
//0. JDBC ���̺귯�� ����ȯ�� ����(�����ο� ���)         >    JavaProject Build path���� jar odbc���
//1. JDBC ����̹� �ε�                                                             >   Class.forName(classname);
//2. DB����  - Connection ��ü ���� <-DriverManager    >   DriverManager.getConnection(URL, USER, PASSWORD);
//3. Statement�� ����(SQL�� ����)                     >   conn.prepareStatement(sql); (psmt)    /   pstmt.executeQuery();
//4. SQL ���� ����� ���� ó��                                                    > rs.getString(column_name)
// -SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
// -INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�                                                 > JDBC_Close.closeConnectionStmtRs(conn, pstmt, rs);
//============================================
public class MemberDAO {
	private static final String IP = "localhost";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	
	private static final String URL = "jdbc:oracle:thin:@"+ IP + ":1521:xe";
	private static final String USER = "mystudy";
	private static final String PASSWORD = "MYSTUDY";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//����̹� �ε�ó��
	//static �ʱ�ȭ ����
	static {
		try {
			//1. JDBC ����̹� �ε�
			Class.forName(DRIVER);
			System.out.println(">> JDBC ����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(">> JDBC ����̹� �ε� ����");
		}
		
		
		}
	
	//SELECT : ���̺� ��ü ������ ��ȸ - selectAll : List<MemberVO>
	//SELECT : �ϳ��� ������ ��ȸ(ID) - selectOne : MemberVO
	//SELECT : �ϳ��� ������ ��ȸ(VO) - selectOne : MemberVO
	//INSERT : VO ��ü�� �޾ �Է� - insertOne : int
	//UPDATE : VO ��ü�� �޾ ���� - updateOne : int
	//DELETE : VO ��ü�� �޾ ���� - deleteOne : int
	//DELETE : Ű��(id) �޾Ƽ� ���� - deleteOne : int
	
	//�α���ó�� : id, password ���� �޾Ƽ� ������ �����Ͱ� ������ true
	//	                ������ false����
	//boolean checkIdPassword(id,password)
	//---------------------------------------------------
	
	
	
	
	
	//SELECT : ���̺� ��ü ������ ��ȸ - selectAll : List<MemberVO>
	public List<MemberVO> selectAll() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		//2. DB����  - Connection ��ü ���� <-DriverManager
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//3. Statement�� ����(SQL�� ����)  
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ID, NAME, PASSWORD, PHONE, ADDRESS ");
			sql.append("FROM MEMBER ");
			sql.append("ORDER BY ID ");
			
			System.out.println("sql.toString() : " + sql.toString());
			pstmt = conn.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				/*
				MemberVO mvo = new MemberVO(
						rs.getString("ID"),
						rs.getString("NAME"),
						rs.getString("PASSWORD"),
						rs.getString("PHONE"),
						rs.getString("ADDRESS") );
				list.add(mvo);
				*/
				list.add(new MemberVO(rs.getString("ID"),
						rs.getString("NAME"),
						rs.getString("PASSWORD"),
						rs.getString("PHONE"),
						rs.getString("ADDRESS") ));
							
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//����� ��ü close
			JDBC_Close.closeConnectionStmtRs(conn, pstmt, rs);
			
		}
		
		
		
		return list;
	}
	
	//INSERT : VO ��ü�� �޾ �Է� - insertOne : int
	public int insertOne(MemberVO member) {
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL������ �ۼ��ؼ� Statement�� �����ϰ� sql�� ���� ��û
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO MEMBER");
			sql.append("     (ID, NAME, PASSWORD, PHONE, ADDRESS)");
			sql.append("VALUES(?,?,?,?,?) ");
			pstmt = conn.prepareStatement(sql.toString());
			
			//?(Q���ε�����)�� �����Ű��
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getPassword());
			pstmt.setString(4, member.getPhone());
			pstmt.setString(5, member.getAddress());
			
			System.out.println("sql.toString() : " + sql.toString());
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt);
		}
		return result;
	}

	
	//�α���ó�� : id, password ���� �޾Ƽ� ������ �����Ͱ� ������ true
	//	                ������ false����
	//boolean checkIdPassword(id,password)
	public boolean checkIdPassword(String id, String password) {
		boolean result = false;
		
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//3. Statement�� ����(SQL�� ����)  
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ID, NAME, PASSWORD, PHONE, ADDRESS ");
			sql.append("FROM MEMBER ");
			sql.append("WHERE ID = ? AND PASSWORD = ? ");
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			System.out.println("sql.toString() : " + sql.toString());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) { //�����Ͱ� ������
				System.out.println(">> " + id + " ������ ����");
				result = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//����� ��ü close
			JDBC_Close.closeConnectionStmtRs(conn, pstmt, rs);
			
		}
		
		return result;
	}

	
	public int insertMany(List<MemberVO> list) {
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			
			//SQL������ �ۼ��ؼ� Statement�� �����ϰ� sql�� ���� ��û
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO MEMBER");
			sql.append("     (ID, NAME, PASSWORD, PHONE, ADDRESS)");
			sql.append(" VALUES(?,?,?,?,?)");
			pstmt = conn.prepareStatement(sql.toString());
			
			conn.setAutoCommit(false);
			for (MemberVO member : list) {
			
				//?(Q���ε�����)�� �����Ű��
				pstmt.setString(1, member.getId());
				pstmt.setString(2, member.getName());
				pstmt.setString(3, member.getPassword());
				pstmt.setString(4, member.getPhone());
				pstmt.setString(5, member.getAddress());
				
				System.out.println("sql.toString() : " + sql.toString());
				result += pstmt.executeUpdate();
				/*
				try {
					result += pstmt.executeUpdate();
					System.out.println("> �Է¼��� : " + member.getId());
				} catch (SQLException e) {
					System.out.println("> �Է½��� : " + member.getId());
				}
				*/
			}
			conn.commit(); // �Էµ����� commitó��
			conn.setAutoCommit(true); // autocommit ���·� ��ȯ
		} catch (SQLException e) {
			try {
				result = 0;
				conn.rollback(); // ��ü������ �ѹ�ó��
				conn.setAutoCommit(true); // autocommit ���·� ��ȯ
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt);
		}
		
		return result;
	}

	
	//(�ǽ�) �ϰ� ���� : �������(list)�� �޾Ƽ� �ϰ� ���� ó�� 
	public int deleteList(List<MemberVO> list) {
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			
			//SQL������ �ۼ��ؼ� Statement�� �����ϰ� sql�� ���� ��û
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM MEMBER ");
			sql.append("WHERE NAME = ? ");
			pstmt = conn.prepareStatement(sql.toString());
			
			for (MemberVO member : list) {
			
				//?(Q���ε�����)�� �����Ű��
				pstmt.setString(1, member.getName());
				System.out.println("sql.toString() : " + sql.toString());
				result += pstmt.executeUpdate();
			}
		} catch (SQLException e) {
				e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt);
		}
		
		
		return result ;
	}
	
	
	
}
