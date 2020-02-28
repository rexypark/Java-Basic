package com.mystudy.sqld_cbt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

//DAO, Dao : Data Access Object / Database Access Object
//������(�����ͺ��̽�-DB)�� �����ؼ� CRUD�� ������ Ŭ����
public class UserLogDAO {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@192.168.0.69:1521:xe";
	private static final String USER = "SQLD_CBT";
	private static final String PASSWORD = "sqld";

	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	
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
	
	//ȸ������, ����, ���� Event log method
	public static int userLog(String id, String name, String act) {
		int result = 0;
		try {
			//DB���� - Connection ��ü ����(DB�� �����)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL������ �ۼ��ؼ� Statement�� �����ϰ� SQL�� ���� ��û
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO USER_LOG ");
			sql.append("(L_USER_ID, L_USER_NAME, USER_ACT, USER_TIME) ");
			sql.append("VALUES (?, ?, ?, "
					+ "(TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'))) ");
			pstmt = conn.prepareStatement(sql.toString());
				
			// ? (���ε�����)�� �� ��Ī ��Ű��
			int idx = 1;
			pstmt.setString(idx++, id);        //ȸ�� ���̵�                    (L_USER_ID)
			pstmt.setString(idx++, name);      //ȸ�� �̸�                       (L_USER_NAME)
			pstmt.setString(idx++, act);       //ȸ������, ����, ����    (USER_ACT)
			
			//SQL ���� ��û
			result = pstmt.executeUpdate();
			
			//���� �ϸ� 3ȸ retry �Ѵ�.
			for (int i = 0; i < 3; i++) {
				if(result == 0) {
					result += pstmt.executeUpdate();
				}else {
					break;
				}
			}
	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);		
		}
		
		return result;
	}// userLog End

}
