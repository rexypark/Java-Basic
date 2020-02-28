package com.mystudy.socket04_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketImplFactory;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClientEchoWhile {
	static int PORT = 10000; 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Socket socket = null;
		
		try {
			
			socket = new Socket(InetAddress.getLocalHost(), PORT);
			System.out.println("[ Ŭ���̾�Ʈ�� ������ �����Ͽ����ϴ�.]");
			
			
			while (true) {
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				PrintWriter pw = new PrintWriter(os);
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				
				System.out.println("���ں�����");
				System.out.print(">>");
				String inTxt = scan.nextLine();
				pw.println(inTxt);
				pw.flush();
				if (inTxt.equals("exit")) break;
				
				String readVal = br.readLine();
				System.out.println("[ From Server ] : " + readVal);
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
				
				try {
					if (socket != null) {
						socket.close();
						System.out.println("[ Client Closed]");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
		
		scan.close();
		
	}
}
