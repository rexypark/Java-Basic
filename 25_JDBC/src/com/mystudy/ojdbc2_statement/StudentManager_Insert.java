package com.mystudy.ojdbc2_statement;

import java.sql.*;

public class StudentManager_Insert {
	
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
			String id = "2019006";
			String name = "������";
			int kor = 100;
			int eng = 100;
			int math = 100;
			int tot = 0;
			int avg = 0;
			
			sql += "INSERT INTO STUDENT ";
			sql += "VALUES('"+ id + "', '" + name + "'," + kor + "," + eng + "," + 
							   math + "," + tot + "," + avg+ ")";
//			sql += "WHERE ID = '" + id + "' ";
			System.out.println("sql : " + sql);
			
			int rs = stmt.executeUpdate(sql); 
			System.out.println("count : " + rs);
		
			//4. SQL ���� ����� ���� ó��
			//- SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��

			
			
			
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
