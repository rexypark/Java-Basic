package com.mystudy.socket02_line;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerLine {
	
	public static void main(String[] args) {
		System.out.println(">>> ���� ����");
		ServerSocket server = null;
		
		try {
			
			System.out.println(">> ����(ServerSocket) ����� ~~~");
			//1. ServerSocket ��ü ���� - ��� �� ��Ʈ��ȣ (port) ����
			server = new ServerSocket(10000);
			
			//2. ServerSocket ����� ������ Socket�� ������ Socket ��ü ����
			Socket socket = server.accept();
			System.out.println(">> Ŭ���̾�Ʈ ����");
			
			//3. Socket���� ���� InputStream, OutputStream ��ü ����
			OutputStream os = socket.getOutputStream();
			InputStream is = socket.getInputStream();
			
			//InputStream ===> Reader Ÿ�� ����
			//���� ���� ó���� ���� reader ����
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			
			//4. ���� �޼����� ������ �б�
			String readVal = br.readLine();
			System.out.println("[���� ���� �޼���] : " + readVal);
			
			
			//5. ���� �޼����� ������ ����
			//��������
			
			
			//6. �ڿ� �ݳ� (close)
			br.close();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
// ���� �޼����� �ٽ� �ǵ��� �ִ� ��
// 