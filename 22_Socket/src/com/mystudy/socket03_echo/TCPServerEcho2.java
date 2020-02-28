package com.mystudy.socket03_echo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerEcho2 {

	public static void main(String[] args) {
		/* ������ : �������� ����ؼ� Ŭ���̾�Ʈ ���Ӵ��
		1. �������� ����ؼ� Ŭ���̾�Ʈ ���Ӵ��
		2. Ŭ���̾�Ʈ�� �����ϸ�
		2-1. Ŭ���̾�Ʈ�� ���� �޼����� �ް�,(�б�, Input)
			 > �����޼��� ȭ�� ���
		2-2. ���� �޼����� Ŭ���̾�Ʈ���� �ٽ� ����(����, Output)
		3. Ŭ���̾�Ʈ���� ���� �޼��� ���
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("[ ���� ���� ]");
		ServerSocket server = null;
		int port = 10000;
		
		
		
		try {

			server = new ServerSocket(port);
			Socket socket = server.accept();
			System.out.println(">>���� ����");
			
			while (true) {
				
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			
			String readVal = br.readLine();
			System.out.println("[Ŭ���̾�Ʈ���� ���� �޼���] : " + readVal);
			
			
			
			if(readVal == null) {
				System.out.println("[����] closed by client");
				break;
			}
			
			PrintWriter pw = new PrintWriter(os);
			
			pw.write(readVal);
			pw.flush();
			
//			System.out.println("[���� ����]");			
			
//			pw.close();
//			os.close();
//			br.close();
//			isr.close();
//			is.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
