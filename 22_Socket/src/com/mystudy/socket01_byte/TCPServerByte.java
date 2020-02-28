package com.mystudy.socket01_byte;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerByte {

	public static void main(String[] args) {
		
		//���� �� : Server Socket ��ü�� Ŭ���̾�Ʈ ������ ��ٸ�
		ServerSocket server = null;
		int port = 10000;
		
		try {
			//�����ʿ��� 10000�� ��Ʈ�� ���� ���񽺸� �Ϸ��� ���
			System.out.println("[����] ServerSocket ��ü ���� �� Ŭ���̾�Ʈ ���� �����");
			server = new ServerSocket(port);
			
			//�������� �ش� ��Ʈ�� ������ Ŭ���̾�Ʈ�� �������� ����	
			//���� Ŭ���̾�Ʈ ������ ��ٸ��� ��
			System.out.println("[����] ���� Ŭ���̾�Ʈ ������ ��ٸ��� ��");
			Socket socket = server.accept();
			
			
			//�߻� Ŭ���� ���� ���� ������ ������ inout ��Ʈ�� ��ü�� ���� �� �ִ�
			//���Ͽ��� Input, Output ��Ʈ�� ��ü ����
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			//Ŭ���̾�Ʈ���� ������ ������ �б�
			//�о�� ��
			// int readVal = is.read();
			//System.out.println("[����] Ŭ���̾�Ʈ�κ��� ���� �޼��� : " + (char)readVal);

			byte[] buf = new byte[100];
			is.read(buf);
			System.out.println("[����] �����޼���: " + new String(buf));
			
			//���� ����
			os.close();
			is.close();
			System.out.println(">> ���� ����");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
