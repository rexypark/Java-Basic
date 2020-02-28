package com.mystudy.ojdbc2_statement;

import java.sql.*;

public class StudentManager_Select {
	
	public static void main(String[] args) {
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
		//0. JDBC ���̺귯�� ����ȯ�� ����(�����ο� ���)
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//1. JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. DB����  - Connection ��ü ���� <-DriverManager
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "mystudy";
			String password = "MYSTUDY";
			conn = DriverManager.getConnection(url,user,password);
			
			//3. Statement�� ����(SQL�� ����)
			//3-1. Connection ��ü�� ���� Statement ��ü����
			stmt = conn.createStatement();
			
			//3.2. Statement ��ü�� �̿��ؼ� SQL�� ����

			String sql = "";
			String id = "2019004";
			sql += "SELECT * ";
			sql += "FROM STUDENT ";
			sql += "WHERE ID = " + id;
//			sql += "WHERE ID = '" + id + "' ";
			System.out.println("sql : " + sql);
			
			
			rs = stmt.executeQuery(sql); 
			//4. SQL ���� ����� ���� ó��
			//   -SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��

			while (rs.next()) {
				String str = "";
				str += rs.getString(1) + "\t";
				str += rs.getString(2) + "\t";
				str += rs.getInt(3) + "\t";
				str += rs.getInt(4) + "\t";
				str += rs.getInt(5) + "\t";
				str += rs.getInt(6) + "\t";
				str += rs.getDouble(7) + "\t";
				System.out.println(str);
			}

			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (rs != null)rs.close();
				stmt.close();
				conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
