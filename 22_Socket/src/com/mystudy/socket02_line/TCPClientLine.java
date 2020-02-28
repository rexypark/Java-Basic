package com.mystudy.socket02_line;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientLine {

	public static void main(String[] args) {
		System.out.println(">>> 클라이언트 시작");
		
		//0. 사용할 Socket 변수 선언
		Socket socket = null;
		
		
		try {
			System.out.println("현재 컴퓨터IP : " + InetAddress.getLocalHost());
			System.out.println(">> 서버에 접속 ~~");
			//1. Socket 생성 : 접속할 IP주소, 포트 정보로 서버에 접속
			socket = new Socket(InetAddress.getLocalHost(),10000);
		
			//2. 소켓으로 부터 in, out 생성
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
//			OutputStreamWriter osw = new OutputStreamWriter(os);
			//PrintWriter는 byte타입, file, outputstream, 문자 다받을 수 있음
			//버퍼쓸 필요 x
			PrintWriter pw = new PrintWriter(os);
			
			//3. 읽음(in) 데이터가 있으면 읽고(read)
			//구현 안함
			
			
			//4. 전송할 (out) 데이터가 있으면 쓰고(write)
			
			String msg = "전원이 켜졌습니다.";
			pw.println(msg);
			pw.flush(); //버퍼에 있는 내용을 강제로 출력(전송)
			System.out.println(">> 메세지 전송 완료!");
			//5. stream / writer 자연 종료
			os.close();
			pw.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(">>> 클라이언트 종료");
	}
}
