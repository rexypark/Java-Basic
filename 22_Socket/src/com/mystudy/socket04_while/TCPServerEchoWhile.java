package com.mystudy.socket04_while;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerEchoWhile {
	static int PROT = 10000;
	
	public static void main(String[] args) {
		
		//ServerSocket 클래스 객채 생성
		ServerSocket server;
		try {
			
			//서버 소켓에 포트를 가진 클래스 생성
			server = new ServerSocket(PROT);
	
			//서버 권한을 허용하는 소캣 클래스 객체 생성
			Socket socket = null;
			System.out.println(">>서버대기중");
			socket = server.accept();
			System.out.println(">>서버에 접속하였습니다.");
			
			
			
			while (true) {
				//IO를 위한 inOut Stream // Reader // Writer 객체클래스들 생성
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				PrintWriter pw = new PrintWriter(os);
				
				//서버이므로 먼저 읽는 
				String readVal = br.readLine();
				System.out.println("[From Client] : " + readVal);
				if(readVal == null) {
					System.out.println("[ Server closed ]");
					break;
				}
				
				pw.println(readVal);
				pw.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
}
