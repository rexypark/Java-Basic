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
			System.out.println(">> 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		//접속 명( 유저명)
		String user = "madang";
		//접속 비밀번호
		String pw = ""; //MYSTUDY
		
		Connection conn = null;		
		try {
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println(">> DB연결 성공");
		} catch (SQLException e) {
			System.out.println("[예외] DB연결 실패!!!");
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
