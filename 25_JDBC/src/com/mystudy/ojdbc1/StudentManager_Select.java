package com.mystudy.ojdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
		//1. JDBC ����̹� �ε�
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> ����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//2. DB����  - Connection ��ü ���� <-DriverManager
		//DriverManager.getConnection(url, user, password);
		//�ּ�                                                                              orca SID
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		//���� ��( ������)
		String user = "mystudy";
		//���� ��й�ȣ
		String pw = "MYSTUDY"; //MYSTUDY
		
		Connection conn = null;		
		try {
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println(">> DB���� ����");
		} catch (SQLException e) {
			System.out.println("[����] DB���� ����!!!");
			e.printStackTrace();
		}
		
		//3. Statement�� ����(SQL�� ����)  �ַ� preparedstatement���
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			
			//SQL���� �غ��ϰ� ����
			String sql = "";
			sql += "SELECT *";
			sql += " FROM STUDENT ";
			sql += " ORDER BY NAME ";
			
			//4. SQL ���� ����� ���� ó��
			//   -SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
			//   -INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
			rs = stmt.executeQuery(sql);
			System.out.println(">> SELECT ��� ó��");
			//���������Ͱ� �ֳ�?
			System.out.println();
			System.out.println("ID" + "\t" + "�̸�" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "���");
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
		
		// 5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�(��ü���� ������ �������� ����)
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
