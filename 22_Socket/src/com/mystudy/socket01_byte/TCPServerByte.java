package com.mystudy.socket01_byte;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerByte {

	public static void main(String[] args) {
		
		//서버 측 : Server Socket 객체가 클라이언트 접속을 기다림
		ServerSocket server = null;
		int port = 10000;
		
		try {
			//서버쪽에서 10000번 포트를 열고 서비스를 하려고 대기
			System.out.println("[서버] ServerSocket 객체 생성 후 클라이언트 접속 대기중");
			server = new ServerSocket(port);
			
			//서버에서 해당 포트로 접속한 클라이언트의 소켓정보 추출	
			//서버 클라이언트 접속을 기다리는 중
			System.out.println("[서버] 서버 클라이언트 접속을 기다리는 중");
			Socket socket = server.accept();
			
			
			//추상 클래스 직접 새로 만들진 않지만 inout 스트림 객체를 담을 수 있다
			//소켓에서 Input, Output 스트림 객체 생성
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			//클라이언트에서 보내온 데이터 읽기
			//읽어온 값
			// int readVal = is.read();
			//System.out.println("[서버] 클라이언트로부터 받은 메세지 : " + (char)readVal);

			byte[] buf = new byte[100];
			is.read(buf);
			System.out.println("[서버] 받은메세지: " + new String(buf));
			
			//서버 종료
			os.close();
			is.close();
			System.out.println(">> 서버 종료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
