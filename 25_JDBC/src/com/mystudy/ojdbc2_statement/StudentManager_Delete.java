package com.mystudy.ojdbc2_statement;

import java.sql.*;

public class StudentManager_Delete {
	
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
			
			//(�ǽ�) ���� : ID '2019001' ����� ������ ���� ó��
			// �̸� : ȫ����, ����:99, ����:88, ����:77
			
			String sql = "";
			String id = "2019009";
			String name = "ȫ����";
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
