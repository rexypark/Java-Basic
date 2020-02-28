package com.mystudy.net_muliti;

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

public class TCPClientMulti {
	static int PORT = 10000; 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Socket socket = null;
		
		try {
			
			socket = new Socket("192.168.0.69", PORT);
			System.out.println("[ 클라이언트가 서버에 접속하였습니다.]");
			
			
			while (true) {
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				PrintWriter pw = new PrintWriter(os);
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				
				System.out.println("문자보내기");
				System.out.print(">>");
				String inTxt = scan.nextLine();
				pw.println(inTxt);
				pw.flush();
				if (inTxt.equals("exit")) break;
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
