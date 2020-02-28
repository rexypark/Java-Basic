package com.mystudy.sqld_cbt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Admin_DAO {

	//DAO, Dao : Data Access Object / Database Access Object
	//������(�����ͺ��̽�-DB)�� �����ؼ� CRUD�� ������ Ŭ����

	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@192.168.0.69:1521:xe";
	private static final String USER = "SQLD_CBT";
	private static final String PASSWORD = "sqld";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	Scanner scan = new Scanner(System.in);
	
	//����̹� �ε� ó��
	//static �ʱ�ȭ ���� (JVM�� ����� �� �� ���� ����ȴ�.)
	static{
		try {
			Class.forName(DRIVER);
			System.out.println(">> JDBC Driver Loading Success");
		} catch (ClassNotFoundException e) {
			System.out.println("[���ܹ߻�] JDBC Driver Loading Fail");
			
		}
	}
	
	
	
	//1.���� ������ ����
	
	
	
	//2.��ü ȸ������ list
	public void userListAll(List<MemberVO> list) {
		 System.out.println("|=======================================================================|");
		 System.out.println("| Index |    User ID    |   Name   |  Password  |   Phone   |   E-Mail  |");
		for (MemberVO mvo : list) {
			System.out.println("|   " + mvo.getSeqnum() + "\t  " + mvo.getId() + "\t   " + mvo.getName() + "\t  " 
		                            + mvo.getPassword() +
					                 mvo.getPhone() + mvo.getEmail());
		}
				
		
	}
	
	
	//3.��� ��������
	
	

	public List<MemberVO> selectAll() {
		List<MemberVO> list = new ArrayList<>();
		
		//DB���� - Connection ��ü ����(DB�� �����)
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//PreparedStatement ��ü �����ϰ� SQL�� ����
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * ");
			sql.append("FROM USER_INFO ");
			sql.append("ORDER BY USER_SEQNUM");
		
			pstmt = conn.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
				
			//SQL�� ���� ����� ���� ó��
			while (rs.next()) {
				list.add(new MemberVO(						  
									  rs.getString("USER_ID"),
									  rs.getString("USER_NAME"),
									  rs.getString("USER_PW"),
									  rs.getString("USER_PHONE"),
									  rs.getString("USER_EMAIL"),
									  rs.getString("USER_SEQNUM")));
			}
			System.out.println("list data check : " + list.size());
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//��밴ü close
			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		}

		return list;
	}//selectAll End
	
	
}
