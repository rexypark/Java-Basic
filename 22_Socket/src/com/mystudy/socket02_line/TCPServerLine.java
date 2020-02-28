package com.mystudy.socket02_line;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerLine {
	
	public static void main(String[] args) {
		System.out.println(">>> 서버 시작");
		ServerSocket server = null;
		
		try {
			
			System.out.println(">> 서버(ServerSocket) 대기중 ~~~");
			//1. ServerSocket 객체 생성 - 대기 할 포트번호 (port) 지정
			server = new ServerSocket(10000);
			
			//2. ServerSocket 대기중 접속한 Socket과 연결할 Socket 객체 생성
			Socket socket = server.accept();
			System.out.println(">> 클라이언트 접속");
			
			//3. Socket으로 부터 InputStream, OutputStream 객체 생성
			OutputStream os = socket.getOutputStream();
			InputStream is = socket.getInputStream();
			
			//InputStream ===> Reader 타입 변경
			//문자 단위 처리를 위한 reader 선언
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			
			//4. 받은 메세지가 있으면 읽기
			String readVal = br.readLine();
			System.out.println("[서버 받은 메세지] : " + readVal);
			
			
			//5. 보낼 메세지가 있으면 쓰기
			//구현안함
			
			
			//6. 자원 반납 (close)
			br.close();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
// 받은 메세지를 다시 되돌려 주는 것
// 