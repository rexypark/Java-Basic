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
		/* Ŭ���̾�Ʈ�� : �������� ����ؼ� Ŭ���̾�Ʈ ���Ӵ��
		1. ���� ����ؼ� ������ ����
		2. ������ �����ϸ�
		2-1. ���������� �޼��� ����(����, output)
		2-2. �����ʿ��� ������ �޼��� �ޱ�(�б�, input)
		3. ���� �޼��� ȭ�� ���
		*/
		
		Scanner scan = new Scanner(System.in);
		int port = 10000;
		System.out.println(">>Ŭ���̾�Ʈ ����");
		Socket socket = null;
		try {
				System.out.println("[���� ��ǻ�� IP] : " + InetAddress.getLocalHost());
				System.out.println(">> ������ ����");
				socket = new Socket(InetAddress.getLocalHost(), port);
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
			
				PrintWriter pw = new PrintWriter(os);
				
				//2-1. ���������� �޼��� ����(����, output)
				System.out.println("������ ���� �� ���ڸ� �Է��ϼ���");
				System.out.print(">>>");
				String inputTxt = scan.nextLine();
				pw.println(inputTxt);
				pw.flush();
				System.out.println(">> �޼��� ���� �Ϸ�!");
				
				
				//2-2. �����ʿ��� ������ �޼��� �ޱ�(�б�, input)
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				String readValC = br.readLine();
				
				//3. ���� �޼��� ȭ�� ���
				System.out.println("[�������� ���� �޼���] : " + readValC);
				
				
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
					System.out.println(">>> Ŭ���̾�Ʈ ����");
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
