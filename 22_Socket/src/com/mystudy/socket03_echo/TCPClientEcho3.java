package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClientEcho3 {
	
	public static void main(String[] args) {
		/* 클라이언트측 : 서버소켓 사용해서 클라이언트 접속대기
		1. 소켓 사용해서 서버에 접속
		2. 서버에 접속하면
		2-1. 서버쪽으로 메세지 전송(쓰기, output)
		2-2. 서버쪽에서 보내온 메세지 받기(읽기, input)
		3. 받은 메세지 화면 출력
		*/
		
		Scanner scan = new Scanner(System.in);
		int port = 10000;
		System.out.println(">>클라이언트 시작");
		Socket socket = null;
		try {
				System.out.println("[현재 컴퓨터 IP] : " + InetAddress.getLocalHost());
				System.out.println(">> 서버에 접속");
				socket = new Socket(InetAddress.getLocalHost(), port);
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
			
				PrintWriter pw = new PrintWriter(os);
				
				//2-1. 서버쪽으로 메세지 전송(쓰기, output)
				System.out.println("서버로 전송 할 문자를 입력하세요");
				System.out.print(">>>");
				String inputTxt = scan.nextLine();
				pw.println(inputTxt);
				pw.flush();
				System.out.println(">> 메세지 전송 완료!");
				
				
				//2-2. 서버쪽에서 보내온 메세지 받기(읽기, input)
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				String readValC = br.readLine();
				
				//3. 받은 메세지 화면 출력
				System.out.println("[서버에서 받은 메세지] : " + readValC);
				
				
				br.close();
				isr.close();
				is.close();
				pw.close();
				os.close();
				
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(socket != null) socket.close();
					System.out.println(">>> 클라이언트 종료");
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
