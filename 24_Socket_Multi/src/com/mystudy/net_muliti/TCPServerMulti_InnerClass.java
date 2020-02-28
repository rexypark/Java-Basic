package com.mystudy.net_muliti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerMulti_InnerClass {

	public static void main(String[] args) {
		System.out.println("=== main() 시작 ===");
		
		new TCPServerMulti_InnerClass();
		
		System.out.println("=== main() 끝 ===");
	}
	
	TCPServerMulti_InnerClass(){
		serverStart();
	}
	private void serverStart() {
		ServerSocket server;
		System.out.println(">> 서버소켓 객체 생성");
		try {
			server = new ServerSocket(10000);
			while(true) {
				System.out.println(">> 서버 대기중" + "192.168.0.100");
				Socket socket = server.accept();
				System.out.println(">> 클라이언트 접속");
				System.out.println(">> 클라이언트 접속정보 : " 
				+ socket.getInetAddress());
				
				
				//소켓정보 사용해서 입출력 처리(내부 클래스 사용)
				SocketThread thr = new SocketThread(socket);
				thr.start();  // Thread로 동작시키기 위해 start() 호출
				System.out.println(">> " +  socket.getInetAddress() + "Thread 생성");
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//내부클래스 : Socket을 전달받아 쓰래드 생성하는 클래스
	class SocketThread extends Thread{
		Socket socket;
		SocketThread(Socket socket){
			this.socket = socket;
			}
		
		@Override
		public void run() {
			System.out.printf(">>>> %s Thread Start : \n", socket.getInetAddress());
			InputStream is = null;
			OutputStream os = null;
			
			InputStreamReader isr = null;
			BufferedReader br = null;
			
			try {
				is = socket.getInputStream();
				os = socket.getOutputStream();
				
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);
				
				System.out.println(">> 읽기 시작");
				
				while(true) {
					String readVal = br.readLine();
					if (readVal == null || readVal.equals("exit")) {
						break;
					}
					System.out.printf("%s >>" + readVal + "\n", socket.getInetAddress());
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				System.out.println("[ Client Closed ]");
				
				try {
					if (br != null) {
						br.close();
						os.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}
	
}
