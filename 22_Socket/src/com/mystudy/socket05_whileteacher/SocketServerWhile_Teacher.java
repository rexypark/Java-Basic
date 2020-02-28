package com.mystudy.socket05_whileteacher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerWhile_Teacher {
	
	
	public static void main(String[] args) {
		
	
		ServerSocket server = null;
		Socket socket = null;
		
		InputStream is = null;
		OutputStream os= null;
		BufferedReader br= null;
		PrintWriter pw= null;
		
		
		try {
			server = new ServerSocket(10000);
			socket = server.accept();
			
			System.out.println(">> 클라이언트 접속됨");
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//바이트(byte) 처리계열을 문자(char) 처리계열로 전환
			InputStreamReader isr = new InputStreamReader(is);
			
			//버퍼(사용으로 편리하게 라인 단위 입출력)
			br = new BufferedReader(isr);
			pw = new PrintWriter(os);
			
			//=================================================
			//읽고 쓰기 반복
			System.out.println(">> 데이터 읽기");
			while (true) {
				String readVal = br.readLine();
				System.out.println("[ From Client ] : " + readVal);
				
				pw.println(readVal);
				pw.flush();
			
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(pw !=null) pw.close();
			if(br !=null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		System.out.println("서버 종료");
		
	}
}
