package com.mystudy.socket01_byte;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClientByte {
	
	public static void main(String[] args) {
		
	// Ŭ���̾�Ʈ : Socket �̿��ؼ� ������ ����(����IP �ּ�, ������Ʈ��ȣ �ʿ�)
		Socket socket = null;
		int port = 10000;
		try {
				socket = new Socket("127.0.0.1", port);
				System.out.println(">> ���� ���� ����~~~");
				
				// ������ Socket ��ü�� ���� InputOutput Stream ����
				// ���������� ���� �а� �� �� �ִ� ��ü ����
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				// OutputStream �̿��ؼ� ���������� ����
				//System.out.println(">> ���������� ���� 'A' ������");
				System.out.println(">> ���������� ���� ������");
				//os.write(���ڹ迭);
				
				byte[] buf = "�ȳ��ϼ���~ �ݰ����ϴ�".getBytes();
				os.write(buf);
				
				
				
				
				os.close();
				is.close();
			
				System.out.println(">>>> Ŭ���̾�Ʈ ����");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
