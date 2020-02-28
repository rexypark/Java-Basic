package com.mystudy.ojdbc3_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentManager_Update {
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

		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
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
			//(�ǽ�) PreparedStatement���
			//������� : ID - '2019001' �����ͼ���
			//�̸� : ȫ�浿, ����:100, ����:90, ����:81
			
			String sql ="";
			sql += "UPDATE STUDENT ";
			sql += "SET NAME = ?, KOR = ?, ENG = ?, MATH = ?";
			sql += "WHERE ID = ? ";

			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(���ε庯��) ��ġ�� �� ����
			String id = "2019001";
			String name = "ȫ�浿";
			int kor = 90;
			int eng = 100;
			int math = 80;
			int tot = 0;
			int avg = 0;
			pstmt.setString(1, name);
			pstmt.setInt(2, kor);
			pstmt.setInt(3, eng);
			pstmt.setInt(4, math);
			pstmt.setString(5, id);

			//3-3. Statement(PreparedStatement) ����
			int rs = pstmt.executeUpdate();
			System.out.println("������ ó�� Ƚ�� : " + rs);
			//4. SQL ���� ����� ���� ó��
			//   -SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
			
		
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				pstmt.close();
				conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
