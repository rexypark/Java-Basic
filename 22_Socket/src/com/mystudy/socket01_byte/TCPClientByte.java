package com.mystudy.socket01_byte;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClientByte {
	
	public static void main(String[] args) {
		
	// 클라이언트 : Socket 이용해서 서버에 접속(서버IP 주소, 서버포트번호 필요)
		Socket socket = null;
		int port = 10000;
		try {
				socket = new Socket("127.0.0.1", port);
				System.out.println(">> 서버 연결 성공~~~");
				
				// 생성된 Socket 객체로 부터 InputOutput Stream 생성
				// 서버쪽으로 부터 읽고 쓸 수 있는 객체 생성
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				// OutputStream 이용해서 서버쪽으로 쓰기
				//System.out.println(">> 서버쪽으로 문자 'A' 보내기");
				System.out.println(">> 서버쪽으로 문자 보내기");
				//os.write(문자배열);
				
				byte[] buf = "안녕하세요~ 반갑습니다".getBytes();
				os.write(buf);
				
				
				
				
				os.close();
				is.close();
			
				System.out.println(">>>> 클라이언트 종료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
