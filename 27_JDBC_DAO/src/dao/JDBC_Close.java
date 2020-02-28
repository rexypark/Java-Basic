package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Close {
	public static void closeConnStmtRs(Connection conn,
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
	
	
	
	public static void closeConnectionStmtRs(Connection conn, PreparedStatement pstmt, ResultSet rs) {
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
	
	//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�(��ü ���� ������ �������� ����)
	//static ����� .�� �̿��Ͽ� ��� �����ѵ�????
	//JDBC_Close.closeConnStmtRs(conn, pstmt, rs); �̷��� ��밡���ϴ� 
	//�ֳ��ϸ� ���θ޼ҵ尡 static�̴ϱ�
	
	public static void closeConnStmtRs(Connection conn,
			PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
	
	public static void closeConnStmt(Connection conn,
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
