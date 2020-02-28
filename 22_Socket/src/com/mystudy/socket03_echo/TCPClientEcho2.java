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
		/* Ŭ���̾�Ʈ�� : �������� ����ؼ� Ŭ���̾�Ʈ ���Ӵ��
		1. ���� ����ؼ� ������ ����
		2. ������ �����ϸ�
		2-1. ���������� �޼��� ����(����, output)
		2-2. �����ʿ��� ������ �޼��� �ޱ�(�б�, input)
		3. ���� �޼��� ȭ�� ���
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
					System.out.println(">>> Ŭ���̾�Ʈ ����");
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		scan.close();
	}
}
