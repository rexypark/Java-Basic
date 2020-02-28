package com.mystudy.sqld_cbt;


public class UserVO {
		//DB�� MEMBER�� ���̺�� ������ ���� �ʵ� ����
		//ID, NAME, PASSWORD, PHONE, ADDRESS
		private String user_id;
		private String user_name;
		private String user_pw;
		private String user_phone;
		private String user_email;
		
		
		public UserVO(String user_id, String user_name, String user_pw, String user_phone, String user_email) {
			super();
			this.user_id = user_id;
			this.user_name = user_name;
			this.user_pw = user_pw;
			this.user_phone = user_phone;
			this.user_email = user_email;
		}

		public String getUser_id() {
			return user_id;
		}

		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}

		public String getUser_name() {
			return user_name;
		}

		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}

		public String getUser_pw() {
			return user_pw;
		}

		public void setUser_pw(String user_pw) {
			this.user_pw = user_pw;
		}

		public String getUser_phone() {
			return user_phone;
		}

		public void setUser_phone(String user_phone) {
			this.user_phone = user_phone;
		}

		public String getUser_email() {
			return user_email;
		}

		public void setUser_email(String user_email) {
			this.user_email = user_email;
		}

		@Override
		public String toString() {
			return "UserVO [user_id=" + user_id + ", user_name=" + user_name + ", user_pw=" + user_pw + ", user_phone="
					+ user_phone + ", user_email=" + user_email + "]";
		}
		
		
		
		
}
