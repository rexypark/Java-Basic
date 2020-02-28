package com.mystudy.socket03_echo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerEcho2 {

	public static void main(String[] args) {
		/* 서버측 : 서버소켓 사용해서 클라이언트 접속대기
		1. 서버소켓 사용해서 클라이언트 접속대기
		2. 클라이언트가 접속하면
		2-1. 클라이언트로 부터 메세지를 받고,(읽기, Input)
			 > 받은메세지 화면 출력
		2-2. 받은 메세지를 클라이언트에게 다시 전송(쓰기, Output)
		3. 클라이언트에게 보낸 메세지 출력
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("[ 서버 시작 ]");
		ServerSocket server = null;
		int port = 10000;
		
		
		
		try {

			server = new ServerSocket(port);
			Socket socket = server.accept();
			System.out.println(">>서버 접속");
			
			while (true) {
				
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			
			String readVal = br.readLine();
			System.out.println("[클라이언트에서 받은 메세지] : " + readVal);
			
			
			
			if(readVal == null) {
				System.out.println("[서버] closed by client");
				break;
			}
			
			PrintWriter pw = new PrintWriter(os);
			
			pw.write(readVal);
			pw.flush();
			
//			System.out.println("[서버 종료]");			
			
//			pw.close();
//			os.close();
//			br.close();
//			isr.close();
//			is.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
