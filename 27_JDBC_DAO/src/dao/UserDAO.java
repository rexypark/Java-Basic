package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.UserVO;

public class UserDAO {

	private static final String IP = "localhost";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	
	private static final String URL = "jdbc:oracle:thin:@"+ IP + ":1521:xe";
	private static final String USER = "SQLD_CBT";
	private static final String PASSWORD = "sqld";
	
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	public static UserVO userInfo;
	
	static {
		try {
			//1. JDBC ����̹� �ε�
			Class.forName(DRIVER);
			System.out.println(">> JDBC ����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(">> JDBC ����̹� �ε� ����");
		}
		
		
		}
	
	
	//�α��� ID/PW üũ
	//DB���� ID�� PW�� ������ �α��� ����
	//���� �� true ����
	//true�̸� userLog id, name, act(����)
	public boolean checkIdPassword(String id, String password) {
		boolean result = false;
		
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			
			//DB���� ID�� PW�� �Բ� ������ �α��� ����
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * ");
			sql.append("FROM USER_INFO ");
			sql.append("WHERE USER_ID = ? AND USER_PW = ? ");
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			
			// rs�� �ش� �����Ͱ� ���� result > true
			// userInfo�� ������ select�� ��� �÷��� �����͵��� ����
			if(rs.next()) {
				result = true;
				userInfo = new UserVO(rs.getString("USER_ID"), 
								  	 rs.getString("USER_NAME"), 
									 rs.getString("USER_PW"), 
									 rs.getString("USER_PHONE"), 
									 rs.getString("USER_EMAIL"),
									 "0");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//����� ��ü close
			JDBC_Close.closeConnectionStmtRs(conn, pstmt, rs);
			
		}
		//result true or false��ȯ
		return result;
	}

	
	
	// User�� �ִ� ��� �����͸� ���
	public List<UserVO> selectUserAll() {
		List<UserVO> list = new ArrayList<>();
		
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
				list.add(new UserVO(rs.getString("USER_ID"), 
								    rs.getString("USER_NAME"), 
								    rs.getString("USER_PW"), 
								    rs.getString("USER_PHONE"), 
								    rs.getString("USER_EMAIL"),
								    "0"));
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


	
	// ���̵� �Է��ϸ� userInfo�� �ش� ������ ��� ������ 
	// �� UserVO��ü�� �����Ѵ�.
	public UserVO selectUser(String id) {
		
		//DB���� - Connection ��ü ����(DB�� �����)
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//PreparedStatement ��ü �����ϰ� SQL�� ����
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * ");
			sql.append("FROM USER_INFO ");
			sql.append("WHERE USER_ID = ?");

			pstmt.setString(1, id); 
			
			pstmt = conn.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			
			//SQL�� ���� ����� ���� ó��
			while (rs.next()) {
				userInfo = new UserVO(rs.getString("USER_ID"), 
								      rs.getString("USER_NAME"), 
								      rs.getString("USER_PW"), 
								      rs.getString("USER_PHONE"), 
								      rs.getString("USER_EMAIL"),
								      "0");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//��밴ü close
			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		}
		return userInfo;
	}//selectAll End
	
	
	// ȸ������ �� ���̵��� �ߺ��� �˻��Ѵ�.
	// ��� ���̵� �߿� �Է� ���� id�� DB�� �ִ��� Ȯ��
	// ������ true�� ���� ������ false
	public static boolean checkId(String id) {
		boolean result = false;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * ");
			sql.append("FROM USER_INFO ");
			sql.append("WHERE USER_ID = ?");
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println(">> " + id + "������� ���̵��Դϴ�.");
				result = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnectionStmtRs(conn, pstmt, rs);
		}
		
		return result;
	}
	
	// **ȸ������ ���� �Է� �޼���
	// UserVO��ü�� ������ DB�� �ش� ���� ���� �Է�
	// LOG > true�̸� userLog id, name, act(ȸ������)
	// �����ϸ� result 1�� ��ȯ
	// user������ �Է� �޾� 
	public boolean signUp(String user_id, String user_name, String user_pw, String user_phone, String user_email) {
		boolean signUpcmpt = false;
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			
			//SQL������ �ۼ��ؼ� Statement�� �����ϰ� sql�� ���� ��û
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO USER_INFO");
			sql.append("     (SELECT USER_ID, USER_NAME, USER_PW, USER_PHONE, USER_EMAIL,USER_SEQNUM) ");
			sql.append("VALUES(?,?,?,?,?,SEQ_USER_INFO.NEXTVAL) "); 
			pstmt = conn.prepareStatement(sql.toString());
			System.out.println(user_id + " " + user_name + " " + user_pw + " " + user_phone + " " + user_email);
			//?(Q���ε�����)�� �����Ű��
			pstmt.setString(1, user_id);
			pstmt.setString(2, user_name);
			pstmt.setString(3, user_pw);
			pstmt.setString(4, user_phone);
			pstmt.setString(5, user_email);
			
			System.out.println("sql.toString() : " + sql.toString());
			result = pstmt.executeUpdate();
			
			// ���� insert �Ǹ� 
			// ���ϰ� signUpcmpt�� true
			if (result == 1) {
				System.out.println(user_id + " " + user_name + " " + user_pw + " " + user_phone + " " + user_email + "if");
				userInfo = new UserVO(rs.getString("USER_ID"), 
								      rs.getString("USER_NAME"), 
								      rs.getString("USER_PW"), 
								      rs.getString("USER_PHONE"), 
								      rs.getString("USER_EMAIL"),
								      "0");
				signUpcmpt = true;
				}
							 	  
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt);
		}
		
		//inputUserInfo insert������ �Ǿ����� true
		
		return signUpcmpt;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
