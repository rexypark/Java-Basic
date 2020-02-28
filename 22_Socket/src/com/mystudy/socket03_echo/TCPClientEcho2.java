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

public class TCPClientEcho2 {
	
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
		Socket socket = null;

		
		
		try {
			
				InetAddress ip = InetAddress.getLocalHost();
				socket = new Socket(ip, port);
				
			
				while (true) {
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
			
				
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
			
				
				
				System.out.print(">>>");
				String inputTxt = scan.nextLine();
				
				
				if("exit".equals(inputTxt)) break;
				
				
				String receiveData = br.readLine();
				PrintWriter pw = new PrintWriter(os);
				pw.println(receiveData);
				pw.flush();
				
				System.out.println("<<" + receiveData);
				
				}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
				try {
					if(socket != null) socket.close();
					System.out.println(">>> 클라이언트 종료");
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		scan.close();
	}
}
