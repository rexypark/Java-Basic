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
		System.out.println("=== main() ���� ===");
		
		new TCPServerMulti_InnerClass();
		
		System.out.println("=== main() �� ===");
	}
	
	TCPServerMulti_InnerClass(){
		serverStart();
	}
	private void serverStart() {
		ServerSocket server;
		System.out.println(">> �������� ��ü ����");
		try {
			server = new ServerSocket(10000);
			while(true) {
				System.out.println(">> ���� �����" + "192.168.0.100");
				Socket socket = server.accept();
				System.out.println(">> Ŭ���̾�Ʈ ����");
				System.out.println(">> Ŭ���̾�Ʈ �������� : " 
				+ socket.getInetAddress());
				
				
				//�������� ����ؼ� ����� ó��(���� Ŭ���� ���)
				SocketThread thr = new SocketThread(socket);
				thr.start();  // Thread�� ���۽�Ű�� ���� start() ȣ��
				System.out.println(">> " +  socket.getInetAddress() + "Thread ����");
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//����Ŭ���� : Socket�� ���޹޾� ������ �����ϴ� Ŭ����
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
				
				System.out.println(">> �б� ����");
				
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
