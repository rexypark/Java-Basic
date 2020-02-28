package com.mystudy.ojdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MadangSelect {
	
	public static void main(String[] args) {
	
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> ����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		//���� ��( ������)
		String user = "madang";
		//���� ��й�ȣ
		String pw = ""; //MYSTUDY
		
		Connection conn = null;		
		try {
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println(">> DB���� ����");
		} catch (SQLException e) {
			System.out.println("[����] DB���� ����!!!");
			e.printStackTrace();
		}
		
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			stmt = conn.createStatement();
			
			String sql = "";
			sql += "SELECT BOOKNAME, PRICE";
			sql += "FROM BOOK;";

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
