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
		
		//ServerSocket Ŭ���� ��ä ����
		ServerSocket server;
		try {
			
			//���� ���Ͽ� ��Ʈ�� ���� Ŭ���� ����
			server = new ServerSocket(PROT);
	
			//���� ������ ����ϴ� ��Ĺ Ŭ���� ��ü ����
			Socket socket = null;
			System.out.println(">>���������");
			socket = server.accept();
			System.out.println(">>������ �����Ͽ����ϴ�.");
			
			
			
			while (true) {
				//IO�� ���� inOut Stream // Reader // Writer ��üŬ������ ����
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				PrintWriter pw = new PrintWriter(os);
				
				//�����̹Ƿ� ���� �д� 
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
